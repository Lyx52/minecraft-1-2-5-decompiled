package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ih extends abs {

   public float a;
   public int b;
   public int c;


   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readFloat();
      this.c = var1.readShort();
      this.b = var1.readShort();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeFloat(this.a);
      var1.writeShort(this.c);
      var1.writeShort(this.b);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
