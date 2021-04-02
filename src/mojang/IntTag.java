package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class IntTag extends BaseTag {

   public int value;


   public IntTag(String var1) {
      super(var1);
   }

   public IntTag(String name, int value) {
      super(name);
      this.value = value;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeInt(this.value);
   }

   void read(DataInput dataInt) throws IOException {
      this.value = dataInt.readInt();
   }

   public byte a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.value;
   }

   public BaseTag b() {
      return new IntTag(this.getTag(), this.value);
   }

   public boolean equals(Object tag) {
      if(super.equals(tag)) {
         IntTag var2 = (IntTag)tag;
         return this.value == var2.value;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.value;
   }
}
