package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class kn extends abs {

   public int a;
   public short b;
   public boolean c;


   public kn() {}

   public kn(int var1, short var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readByte();
         this.b = var1.readShort();
         this.c = var1.readByte() != 0;
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeByte(this.a);
         var1.writeShort(this.b);
         var1.writeByte(this.c?1:0);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public int a() {
      return 4;
   }
}
