import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jl extends abs {

   public int a;
   public int b;
   public int c;


   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeShort(this.c);
   }

   public int a() {
      return 5;
   }
}
