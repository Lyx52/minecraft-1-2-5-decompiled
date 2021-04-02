package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class zm extends abs {

   public int a;


   public zm() {}

   public zm(int var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readShort();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeShort(this.a);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 2;
   }
}
