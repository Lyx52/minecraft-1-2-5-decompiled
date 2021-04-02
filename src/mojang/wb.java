package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wb extends abs {

   public int a;
   public byte b;
   public byte c;
   public short d;


   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.readByte();
         this.c = var1.readByte();
         this.d = var1.readShort();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeByte(this.b);
         var1.writeByte(this.c);
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
