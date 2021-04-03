import java.io.DataInputStream;
import java.io.DataOutputStream;

public class lj extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public lj() {}

   public lj(bz var1) {
      this.a = var1.f;
      this.b = gk.c(var1.o * 32.0D);
      this.c = gk.c(var1.p * 32.0D);
      this.d = gk.c(var1.q * 32.0D);
      this.e = var1.h();
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeShort(this.e);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 18;
   }
}
