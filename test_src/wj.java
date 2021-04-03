import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wj extends abs {

   public String a;
   public boolean b;
   public int c;


   public void a(DataInputStream var1) {
      this.a = a(var1, 16);
      this.b = var1.readByte() != 0;
      this.c = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      a(this.a, var1);
      var1.writeByte(this.b?1:0);
      var1.writeShort(this.c);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length() + 2 + 1 + 2;
   }
}
