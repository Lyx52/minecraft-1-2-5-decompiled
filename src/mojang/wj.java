package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wj extends abs {

   public String a;
   public boolean b;
   public int c;


   public void a(DataInputStream var1) {
      try {
         this.a = a(var1, 16);
         this.b = var1.readByte() != 0;
         this.c = var1.readShort();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         a(this.a, var1);
         var1.writeByte(this.b?1:0);
         var1.writeShort(this.c);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return this.a.length() + 2 + 1 + 2;
   }
}
