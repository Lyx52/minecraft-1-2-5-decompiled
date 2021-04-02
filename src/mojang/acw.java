package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class acw extends abs {

   public int a;


   public acw() {}

   public acw(int var1) {
      this.a = var1;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public int a() {
      return 4;
   }
}
