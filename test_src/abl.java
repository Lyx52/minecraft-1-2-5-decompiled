import java.io.DataInputStream;
import java.io.DataOutputStream;

public class abl extends abs {

   public int a;
   public aan[] b;


   public void a(DataInputStream var1) {
      this.a = var1.readByte();
      short var2 = var1.readShort();
      this.b = new aan[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.b[var3] = this.b(var1);
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b.length);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.a(this.b[var2], var1);
      }

   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 3 + this.b.length * 5;
   }
}
