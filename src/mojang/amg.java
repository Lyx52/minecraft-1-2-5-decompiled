package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class amg extends abs {

   public String a;


   public amg() {}

   public amg(String var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) {
      try {
         this.a = a(var1, 256);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         a(this.a, var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length();
   }
}
