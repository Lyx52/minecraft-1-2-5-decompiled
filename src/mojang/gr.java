package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gr extends abs {

   public int a;
   public int b;
   public String c;
   public int d;


   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readByte() & 255;
         this.b = var1.readByte() & 255;
         this.c = a(var1, 32);
         this.d = var1.readByte() & 255;
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeByte(this.a & 255);
         var1.writeByte(this.b & 255);
         a(this.c, var1);
         var1.writeByte(this.d & 255);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public int a() {
      return 3 + this.c.length();
   }
}
