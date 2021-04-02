package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ByteTag extends BaseTag {

   public byte a;


   public ByteTag(String var1) {
      super(var1);
   }

   public ByteTag(String var1, byte var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeByte(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      this.a = dataInt.readByte();
   }

   public byte a() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.a;
   }

   public BaseTag b() {
      return new ByteTag(this.getTag(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         ByteTag var2 = (ByteTag)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a;
   }
}
