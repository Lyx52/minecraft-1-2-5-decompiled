import java.io.DataInputStream;
import java.io.DataOutputStream;

public class afd extends abs {

   public static int b = 119;
   public String a;


   public afd() {}

   public afd(String var1) {
      if(var1.length() > b) {
         var1 = var1.substring(0, b);
      }

      this.a = var1;
   }

   public void a(DataInputStream var1) {
      this.a = a(var1, b);
   }

   public void a(DataOutputStream var1) {
      a(this.a, var1);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 2 + this.a.length() * 2;
   }

}
