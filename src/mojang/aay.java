package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class aay extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public byte h;
   private aim i;
   private List j;


   public aay() {}

   public aay(Mob var1) {
      this.a = var1.f;
      this.b = (byte) EntityManager.getIDByClass(var1);
      this.c = Utils.c(var1.o * 32.0D);
      this.d = Utils.c(var1.p * 32.0D);
      this.e = Utils.c(var1.q * 32.0D);
      this.f = (byte)((int)(var1.u * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.v * 256.0F / 360.0F));
      this.h = (byte)((int)(var1.bf * 256.0F / 360.0F));
      this.i = var1.y();
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.readByte() & 255;
         this.c = var1.readInt();
         this.d = var1.readInt();
         this.e = var1.readInt();
         this.f = var1.readByte();
         this.g = var1.readByte();
         this.h = var1.readByte();
         this.j = aim.a(var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeByte(this.b & 255);
         var1.writeInt(this.c);
         var1.writeInt(this.d);
         var1.writeInt(this.e);
         var1.writeByte(this.f);
         var1.writeByte(this.g);
         var1.writeByte(this.h);
         this.i.a(var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 20;
   }

   public List b() {
      return this.j;
   }
}
