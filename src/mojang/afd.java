package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

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
      try {
         this.a = a(var1, b);
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
      return 2 + this.a.length() * 2;
   }

}
