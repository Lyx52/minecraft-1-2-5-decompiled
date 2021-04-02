package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ait extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;


   public ait() {
      this.q = true;
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readInt();
      this.b = var1.readShort();
      this.c = var1.readInt();
      this.d = var1.readByte();
      this.e = var1.readInt();
      this.f = var1.readInt();
      this.g = var1.readInt();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
      var1.writeInt(this.c);
      var1.writeByte((byte)this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.f);
      var1.writeInt(this.g);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 25;
   }
}
