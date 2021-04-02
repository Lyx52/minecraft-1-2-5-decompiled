package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class wz extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;


   public wz() {}

   public wz(BaseEntity var1) {
      this.a = var1.f;
      this.b = Utils.c(var1.o * 32.0D);
      this.c = Utils.c(var1.p * 32.0D);
      this.d = Utils.c(var1.q * 32.0D);
      if(var1 instanceof d) {
         this.e = 1;
      }

   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.e = var1.readByte();
         this.b = var1.readInt();
         this.c = var1.readInt();
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
         var1.writeInt(this.c);
         var1.writeInt(this.d);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 17;
   }
}
