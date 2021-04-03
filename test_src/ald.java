import java.io.DataInput;
import java.io.DataOutput;

public class ald extends gh {

   public String a;


   public ald(String var1) {
      super(var1);
   }

   public ald(String var1, String var2) {
      super(var1);
      this.a = var2;
      if(var2 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) {
      var1.writeUTF(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readUTF();
   }

   public byte a() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.a;
   }

   public gh b() {
      return new ald(this.c(), this.a);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         ald var2 = (ald)var1;
         return this.a == null && var2.a == null || this.a != null && this.a.equals(var2.a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a.hashCode();
   }
}
