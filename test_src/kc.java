import java.io.DataInputStream;
import java.io.DataOutputStream;

public class kc extends abs {

   public int a;
   public int b;


   public kc() {}

   public kc(nn var1, int var2) {
      this.a = var1.f;
      this.b = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
