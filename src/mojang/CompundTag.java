package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CompundTag extends BaseTag {

   private Map compundData = new HashMap();


   public CompundTag() {
      super("");
   }

   public CompundTag(String var1) {
      super(var1);
   }

   void write(DataOutput dataOut) {
      Iterator var2 = this.compundData.values().iterator();

      while(var2.hasNext()) {
         BaseTag var3 = (BaseTag)var2.next();
         try {
            BaseTag.writeTag(var3, dataOut);
         } catch (IOException e) {
            e.printStackTrace();
         }
      }

      try {
         dataOut.writeByte(0);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   void read(DataInput dataInt) {
      this.compundData.clear();

      BaseTag newTag;
      try {
         while ((newTag = BaseTag.readTag(dataInt)).a() != 0) {
            this.compundData.put(newTag.getTag(), newTag);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

   public Collection getValues() {
      return this.compundData.values();
   }

   public byte a() {
      return (byte)10;
   }

   public void addBaseTag(String key, BaseTag value) {
      this.compundData.put(key, value.setTag(key));
   }

   public void addByte(String var1, byte value) {
      this.compundData.put(var1, new ByteTag(var1, value));
   }

   public void addShort(String key, short value) {
      this.compundData.put(key, new ShortTag(key, value));
   }

   public void addInt(String key, int value) {
      this.compundData.put(key, new IntTag(key, value));
   }

   public void addLong(String key, long value) {
      this.compundData.put(key, new LongTag(key, value));
   }

   public void addFloat(String key, float value) {
      this.compundData.put(key, new FloatTag(key, value));
   }

   public void addDouble(String key, double value) {
      this.compundData.put(key, new DoubleTag(key, value));
   }

   public void addString(String key, String value) {
      this.compundData.put(key, new StringTag(key, value));
   }

   public void addByteArray(String key, byte[] value) {
      this.compundData.put(key, new ByteArrayTag(key, value));
   }

   public void addIntArray(String key, int[] value) {
      this.compundData.put(key, new IntArrayTag(key, value));
   }

   public void addCompundTag(String key, CompundTag value) {
      this.compundData.put(key, value.setTag(key));
   }

   public void addBoolean(String key, boolean value) {
      this.addByte(key, (byte)(value?1:0));
   }

   public BaseTag getBaseTag(String key) {
      return (BaseTag)this.compundData.get(key);
   }

   public boolean containsKey(String key) {
      return this.compundData.containsKey(key);
   }

   public byte getByte(String key) {
      return !this.compundData.containsKey(key)?0:((ByteTag)this.compundData.get(key)).a;
   }

   public short getShort(String key) {
      return !this.compundData.containsKey(key) ? 0 : ((ShortTag)this.compundData.get(key)).a;
   }

   public int getInt(String key) {
      return !this.compundData.containsKey(key) ? 0 : ((IntTag)this.compundData.get(key)).value;
   }

   public long getLong(String key) {
      return !this.compundData.containsKey(key) ? 0L : ((LongTag)this.compundData.get(key)).a;
   }

   public float getFloat(String key) {
      return !this.compundData.containsKey(key) ? 0.0F : ((FloatTag)this.compundData.get(key)).a;
   }

   public double getDouble(String key) {
      return !this.compundData.containsKey(key) ? 0.0D : ((DoubleTag)this.compundData.get(key)).a;
   }

   public String getString(String key) {
      return !this.compundData.containsKey(key) ? "" : ((StringTag)this.compundData.get(key)).a;
   }

   public byte[] getByteArray(String key) {
      return !this.compundData.containsKey(key) ? new byte[0] : ((ByteArrayTag)this.compundData.get(key)).a;
   }

   public int[] getIntArray(String key) {
      return !this.compundData.containsKey(key) ? new int[0] : ((IntArrayTag)this.compundData.get(key)).a;
   }

   public CompundTag getCompundTag(String key) {
      return !this.compundData.containsKey(key) ? new CompundTag(key) : (CompundTag)this.compundData.get(key);
   }

   public ListTag getListTag(String key) {
      return !this.compundData.containsKey(key) ? new ListTag(key) : (ListTag)this.compundData.get(key);
   }

   public boolean getBoolean(String key) {
      return this.getByte(key) != 0;
   }

   public String toString() {
      return "" + this.compundData.size() + " entries";
   }

   public BaseTag b() {
      CompundTag newTag = new CompundTag(this.getTag());
      Iterator keys = this.compundData.keySet().iterator();

      while(keys.hasNext()) {
         String nextKey = (String)keys.next();
         newTag.addBaseTag(nextKey, ((BaseTag)this.compundData.get(nextKey)).b());
      }

      return newTag;
   }

   public boolean equals(Object tag) {
      if(super.equals(tag)) {
         CompundTag var2 = (CompundTag)tag;
         return this.compundData.entrySet().equals(var2.compundData.entrySet());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.compundData.hashCode();
   }
}
