package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class mf extends gh {

   public byte a;


   public mf(String var1) {
      super(var1);
   }

   public mf(String var1, byte var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeByte(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readByte();
   }

   public byte a() {
      return (byte)1;
   }

   public String toString() {
      return "" + this.a;
   }

   public gh b() {
      return new mf(this.c(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         mf var2 = (mf)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a;
   }
}
