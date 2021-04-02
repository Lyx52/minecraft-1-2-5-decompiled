package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class kx extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public WorldGeneratorTypes e;


   public kx() {}

   public kx(int var1, byte var2, WorldGeneratorTypes var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
      this.d = var5;
      this.e = var3;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.readByte();
         this.d = var1.readByte();
         this.c = var1.readShort();
         String var2 = a(var1, 16);
         this.e = WorldGeneratorTypes.getGenerator(var2);
         if(this.e == null) {
            this.e = WorldGeneratorTypes.defaultWorld;
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeByte(this.b);
         var1.writeByte(this.d);
         var1.writeShort(this.c);
         a(this.e.a(), var1);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public int a() {
      return 8 + this.e.a().length();
   }
}
