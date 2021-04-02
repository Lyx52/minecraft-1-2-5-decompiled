package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fu extends abs {

   public int a;
   public int b;
   public aan c;


   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readByte();
         this.b = var1.readShort();
         this.c = this.b(var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeByte(this.a);
         var1.writeShort(this.b);
         this.a(this.c, var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public int a() {
      return 8;
   }
}
