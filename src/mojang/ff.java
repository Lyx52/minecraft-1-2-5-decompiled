package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ff extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public aan e;


   public ff() {}

   public ff(int var1, int var2, int var3, int var4, aan var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.read();
         this.c = var1.readInt();
         this.d = var1.read();
         this.e = this.b(var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.write(this.b);
         var1.writeInt(this.c);
         var1.write(this.d);
         this.a(this.e, var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 15;
   }
}
