import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jf extends abs {

   public String a;


   public jf() {}

   public jf(String var1) {
      this.a = var1;
   }

   public jf(String var1, String var2, int var3) {
      this.a = var1 + ";" + var2 + ":" + var3;
   }

   public void a(DataInputStream var1) {
      this.a = a(var1, 64);
   }

   public void a(DataOutputStream var1) {
      a(this.a, var1);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.a.length() + 4;
   }
}
