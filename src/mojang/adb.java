package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class adb extends gh {

   public long a;


   public adb(String var1) {
      super(var1);
   }

   public adb(String var1, long var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeLong(this.a);
   }

   void a(DataInput var1) throws IOException {
      this.a = var1.readLong();
   }

   public byte a() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.a;
   }

   public gh b() {
      return new adb(this.c(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         adb var2 = (adb)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ (int)(this.a ^ this.a >>> 32);
   }
}
