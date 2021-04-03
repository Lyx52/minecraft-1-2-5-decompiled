import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ahc extends abs {

   public int a;
   public int b;
   public boolean c;


   public ahc() {
      this.q = false;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.read() != 0;
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.write(this.c?1:0);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 9;
   }
}
