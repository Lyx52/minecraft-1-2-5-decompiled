import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aip extends abs {

   public int a;
   public byte b;
   public byte c;
   public byte d;
   public byte e;
   public byte f;
   public boolean g = false;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
