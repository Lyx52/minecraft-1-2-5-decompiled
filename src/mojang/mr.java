package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class mr extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;


   public mr() {}

   public mr(nn var1) {
      this.a = var1.f;
      this.b = gk.c(var1.o * 32.0D);
      this.c = gk.c(var1.p * 32.0D);
      this.d = gk.c(var1.q * 32.0D);
      this.e = (byte)((int)(var1.u * 256.0F / 360.0F));
      this.f = (byte)((int)(var1.v * 256.0F / 360.0F));
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.readInt();
         this.c = var1.readInt();
         this.d = var1.readInt();
         this.e = (byte)var1.read();
         this.f = (byte)var1.read();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeInt(this.b);
         var1.writeInt(this.c);
         var1.writeInt(this.d);
         var1.write(this.e);
         var1.write(this.f);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 34;
   }
}
