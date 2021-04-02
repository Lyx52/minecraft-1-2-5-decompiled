package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ahl extends gh {

   public double a;


   public ahl(String var1) {
      super(var1);
   }

   public ahl(String var1, double var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeDouble(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readDouble();
   }

   public byte a() {
      return (byte)6;
   }

   public String toString() {
      return "" + this.a;
   }

   public gh b() {
      return new ahl(this.c(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         ahl var2 = (ahl)var1;
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
