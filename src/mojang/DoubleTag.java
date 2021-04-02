package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class DoubleTag extends BaseTag {

   public double a;


   public DoubleTag(String var1) {
      super(var1);
   }

   public DoubleTag(String var1, double var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeDouble(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      this.a = dataInt.readDouble();
   }

   public byte a() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.a;
   }

   public BaseTag b() {
      return new DoubleTag(this.getTag(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         DoubleTag var2 = (DoubleTag)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.a);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }
}
