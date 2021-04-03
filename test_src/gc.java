import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class gc extends gh {

   public int[] a;


   public gc(String var1) {
      super(var1);
   }

   public gc(String var1, int[] var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.writeInt(this.a[var2]);
      }

   }

   void a(DataInput var1) {
      int var2 = var1.readInt();
      this.a = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = var1.readInt();
      }

   }

   public byte a() {
      return (byte)11;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }

   public gh b() {
      int[] var1 = new int[this.a.length];
      System.arraycopy(this.a, 0, var1, 0, this.a.length);
      return new gc(this.c(), var1);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         gc var2 = (gc)var1;
         return this.a == null && var2.a == null || this.a != null && this.a.equals(var2.a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.a);
   }
}
