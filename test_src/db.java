import java.io.DataInputStream;
import java.io.DataOutputStream;

public class db extends abs {

   public int a;
   public aan b;


   public db() {}

   public db(int var1, aan var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = this.b(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      this.a(this.b, var1);
   }

   public int a() {
      return 8;
   }
}
