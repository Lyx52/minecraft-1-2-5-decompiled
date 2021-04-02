package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class us extends abs {

   public static final String[] a = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
   public int b;
   public int c;


   public void a(DataInputStream var1) {
      try {
         this.b = var1.readByte();
         this.c = var1.readByte();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeByte(this.b);
         var1.writeByte(this.c);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 2;
   }

}
