import java.io.DataInputStream;
import java.io.DataOutputStream;

public class hc extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public hc() {}

   public hc(int var1, int var2, int var3, int var4, int var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void a(DataInputStream var1) {
      this.e = var1.read();
      this.a = var1.readInt();
      this.b = var1.read();
      this.c = var1.readInt();
      this.d = var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.write(this.e);
      var1.writeInt(this.a);
      var1.write(this.b);
      var1.writeInt(this.c);
      var1.write(this.d);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 11;
   }
}
