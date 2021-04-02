package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class iy extends abs {

   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public int h;


   public iy() {}

   public iy(Player var1) {
      this.a = var1.f;
      this.b = var1.aA;
      this.c = Utils.c(var1.o * 32.0D);
      this.d = Utils.c(var1.p * 32.0D);
      this.e = Utils.c(var1.q * 32.0D);
      this.f = (byte)((int)(var1.u * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.v * 256.0F / 360.0F));
      aan var2 = var1.ap.b();
      this.h = var2 == null?0:var2.c;
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = a(var1, 16);
         this.c = var1.readInt();
         this.d = var1.readInt();
         this.e = var1.readInt();
         this.f = var1.readByte();
         this.g = var1.readByte();
         this.h = var1.readShort();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         a(this.b, var1);
         var1.writeInt(this.c);
         var1.writeInt(this.d);
         var1.writeInt(this.e);
         var1.writeByte(this.f);
         var1.writeByte(this.g);
         var1.writeShort(this.h);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 28;
   }
}
