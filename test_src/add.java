import java.io.DataInputStream;
import java.io.DataOutputStream;

public class add extends abs {

   public int a;


   public add() {}

   public add(int var1) {
      this.a = var1;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      this.a = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.a);
   }

   public int a() {
      return 1;
   }
}
