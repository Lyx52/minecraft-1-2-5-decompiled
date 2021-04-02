package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ShortTag extends BaseTag {

   public short a;


   public ShortTag(String var1) {
      super(var1);
   }

   public ShortTag(String var1, short var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeShort(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      this.a = dataInt.readShort();
   }

   public byte a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.a;
   }

   public BaseTag b() {
      return new ShortTag(this.getTag(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         ShortTag var2 = (ShortTag)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a;
   }
}
