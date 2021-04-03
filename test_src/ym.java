import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ym extends abs {

   public boolean a = false;
   public boolean b = false;
   public boolean c = false;
   public boolean d = false;


   public ym() {}

   public ym(qu var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readBoolean();
      this.b = var1.readBoolean();
      this.c = var1.readBoolean();
      this.d = var1.readBoolean();
   }

   public void a(DataOutputStream var1) {
      var1.writeBoolean(this.a);
      var1.writeBoolean(this.b);
      var1.writeBoolean(this.c);
      var1.writeBoolean(this.d);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 1;
   }
}
