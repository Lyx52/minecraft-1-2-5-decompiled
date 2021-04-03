import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gg extends abs {

   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;


   public gg() {}

   public gg(boolean var1) {
      this.g = var1;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      this.g = var1.read() != 0;
   }

   public void a(DataOutputStream var1) {
      var1.write(this.g?1:0);
   }

   public int a() {
      return 1;
   }
}
