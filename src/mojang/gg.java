package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gg extends abs {

   public double a;
   public double b;
   public double c;
   public double d;
   public float e;
   public float f;
   public boolean g;
   public boolean h;
   public boolean i;


   public gg() {}

   public gg(boolean var1) {
      this.g = var1;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) throws IOException {
      try {
         this.g = var1.read() != 0;
      } catch (IOException ioException) {
         ioException.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) throws IOException {
      try {
         var1.write(this.g?1:0);
      } catch (IOException ioException) {
         ioException.printStackTrace();
      }
   }

   public int a() {
      return 1;
   }
}
