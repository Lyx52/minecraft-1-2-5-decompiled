import java.io.DataInput;
import java.io.DataOutput;

public class afn extends gh {

   public int a;


   public afn(String var1) {
      super(var1);
   }

   public afn(String var1, int var2) {
      super(var1);
      this.a = var2;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readInt();
   }

   public byte a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.a;
   }

   public gh b() {
      return new afn(this.c(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         afn var2 = (afn)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a;
   }
}
