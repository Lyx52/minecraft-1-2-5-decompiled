package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ow extends gh {

   public short a;


   public ow(String var1) {
      super(var1);
   }

   public ow(String var1, short var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeShort(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readShort();
   }

   public byte a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.a;
   }

   public gh b() {
      return new ow(this.c(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         ow var2 = (ow)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a;
   }
}
