package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class zl extends gh {

   public byte[] a;


   public zl(String var1) {
      super(var1);
   }

   public zl(String var1, byte[] var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) throws IOException {
      var1.writeInt(this.a.length);
      var1.write(this.a);
   }

   void a(DataInput var1) throws IOException {
      int var2 = var1.readInt();
      this.a = new byte[var2];
      var1.readFully(this.a);
   }

   public byte a() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }

   public gh b() {
      byte[] var1 = new byte[this.a.length];
      System.arraycopy(this.a, 0, var1, 0, this.a.length);
      return new zl(this.c(), var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1)?Arrays.equals(this.a, ((zl)var1).a):false;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.a);
   }
}
