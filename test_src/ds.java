import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ds extends abs {

   public int a;
   public int b;
   public float c;


   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = var1.readShort();
      this.c = var1.readFloat();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      var1.writeShort(this.b);
      var1.writeFloat(this.c);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
