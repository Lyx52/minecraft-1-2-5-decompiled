import java.io.DataInputStream;
import java.io.DataOutputStream;

public class vv extends abs {

   public int a;
   public int b;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
