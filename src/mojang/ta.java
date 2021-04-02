package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ta extends abs {

   public int a;
   public int b;
   public int c;
   public int d;


   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.readShort();
         this.c = var1.readShort();
         this.d = var1.readShort();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeShort(this.b);
         var1.writeShort(this.c);
         var1.writeShort(this.d);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
