import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ej extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readByte() & 255;
      this.e = var1.readInt();
      this.b = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.c);
      var1.writeByte(this.d & 255);
      var1.writeInt(this.e);
      var1.writeInt(this.b);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 20;
   }
}
