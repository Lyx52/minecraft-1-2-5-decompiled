package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class BaseTag {

   private String nbt_tag;


   abstract void write(DataOutput dataOut) throws IOException;

   abstract void read(DataInput dataInt) throws IOException;

   public abstract byte a();

   protected BaseTag(String nbt_tag) {
      if(nbt_tag == null) {
         this.nbt_tag = "";
      } else {
         this.nbt_tag = nbt_tag;
      }

   }

   public BaseTag setTag(String tag) {
      if(tag == null) {
         this.nbt_tag = "";
      } else {
         this.nbt_tag = tag;
      }

      return this;
   }

   public String getTag() {
      return this.nbt_tag == null ? "" : this.nbt_tag;
   }

   public static BaseTag readTag(DataInput dataInput) throws IOException {
      byte data = dataInput.readByte();
      if(data == 0) {
         return new EndTag();
      } else {
         String utfString = dataInput.readUTF();
         BaseTag readTag = createTag(data, utfString);
         readTag.read(dataInput);
         return readTag;
      }
   }

   public static void writeTag(BaseTag tag, DataOutput dataOutput) throws IOException {
      dataOutput.writeByte(tag.a());
      if(tag.a() != 0) {
         dataOutput.writeUTF(tag.getTag());
         tag.write(dataOutput);
      }
   }

   public static BaseTag createTag(byte value, String name) {
      switch(value) {
      case 0:
         return new EndTag();
      case 1:
         return new ByteTag(name);
      case 2:
         return new ShortTag(name);
      case 3:
         return new IntTag(name);
      case 4:
         return new LongTag(name);
      case 5:
         return new FloatTag(name);
      case 6:
         return new DoubleTag(name);
      case 7:
         return new ByteArrayTag(name);
      case 8:
         return new StringTag(name);
      case 9:
         return new ListTag(name);
      case 10:
         return new CompundTag(name);
      case 11:
         return new IntArrayTag(name);
      default:
         return null;
      }
   }

   public static String getTagType(byte value) {
      switch(value) {
      case 0:
         return "TAG_End";
      case 1:
         return "TAG_Byte";
      case 2:
         return "TAG_Short";
      case 3:
         return "TAG_Int";
      case 4:
         return "TAG_Long";
      case 5:
         return "TAG_Float";
      case 6:
         return "TAG_Double";
      case 7:
         return "TAG_Byte_Array";
      case 8:
         return "TAG_String";
      case 9:
         return "TAG_List";
      case 10:
         return "TAG_Compound";
      case 11:
         return "TAG_Int_Array";
      default:
         return "UNKNOWN";
      }
   }

   public abstract BaseTag b();

   public boolean equals(Object tag) {
      if(tag != null && tag instanceof BaseTag) {
         BaseTag otherTag = (BaseTag)tag;
         return this.a() != otherTag.a()?false:((this.nbt_tag != null || otherTag.nbt_tag == null) && (this.nbt_tag == null || otherTag.nbt_tag != null)?this.nbt_tag == null || this.nbt_tag.equals(otherTag.nbt_tag):false);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.nbt_tag.hashCode() ^ this.a();
   }
}
