package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ds extends abs {

   public int a;
   public int b;
   public float c;


   public void a(DataInputStream var1) {
      try {
         this.a = var1.readShort();
         this.b = var1.readShort();
         this.c = var1.readFloat();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeShort(this.a);
         var1.writeShort(this.b);
         var1.writeFloat(this.c);
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
