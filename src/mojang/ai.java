package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ai extends abs {

   public short a;
   public short b;
   public byte[] c;


   public ai() {
      this.q = true;
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readShort();
         this.b = var1.readShort();
         this.c = new byte[var1.readByte() & 255];
         var1.readFully(this.c);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeShort(this.a);
         var1.writeShort(this.b);
         var1.writeByte(this.c.length);
         var1.write(this.c);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.c.length;
   }
}
