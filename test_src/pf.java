import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class pf extends abs {

   public int a;
   private List b;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = aim.a(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      aim.a(this.b, var1);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }

   public List b() {
      return this.b;
   }
}
