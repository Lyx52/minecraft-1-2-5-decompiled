import java.io.DataInputStream;
import java.io.DataOutputStream;

public class zm extends abs {

   public int a;


   public zm() {}

   public zm(int var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 2;
   }
}
