package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class lh extends abs {

   public int a;
   public int b;


   public lh() {}

   public lh(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws IOException {
      this.a = var1.readByte();
      this.b = var1.readByte();
   }

   public void a(DataOutputStream var1) throws IOException {
      var1.writeByte(this.a);
      var1.writeByte(this.b);
   }

   public int a() {
      return 2;
   }
}
