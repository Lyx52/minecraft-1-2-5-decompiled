package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class abj extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.e = var1.readByte();
         this.b = var1.readInt();
         this.c = var1.readByte();
         this.d = var1.readInt();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeByte(this.e);
         var1.writeInt(this.b);
         var1.writeByte(this.c);
         var1.writeInt(this.d);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 14;
   }
}
