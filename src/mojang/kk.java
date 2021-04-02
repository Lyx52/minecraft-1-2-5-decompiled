package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class kk extends abs {

   public int a;
   public int b;


   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.b = var1.readByte();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         var1.writeByte(this.b);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public int a() {
      return 6;
   }
}
