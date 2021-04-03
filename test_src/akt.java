import java.io.DataInputStream;
import java.io.DataOutputStream;

public class akt extends abs {

   public int a;
   public int b;
   public byte[] c;
   public int d;
   private static byte[] e = new byte[0];


   public akt() {
      this.q = true;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.d = var1.readShort() & '\uffff';
      int var2 = var1.readInt();
      if(var2 > 0) {
         this.c = new byte[var2];
         var1.readFully(this.c);
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeShort((short)this.d);
      if(this.c != null) {
         var1.writeInt(this.c.length);
         var1.write(this.c);
      } else {
         var1.writeInt(0);
      }

   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 10 + this.d * 4;
   }

}
