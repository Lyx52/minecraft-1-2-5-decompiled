package mojang;

import java.awt.image.BufferedImage;

public class mp {

   public BufferedImage a;
   public xd b;
   public int c;
   public int d;
   public boolean e = false;
   public boolean f = false;
   public int g = 0;
   public boolean h = false;


   public mp(xd var1, int var2, int var3) {
      this.b = var1;
      this.a(var2, var3);
   }

   public void a(int var1, int var2) {
      this.e = false;
      this.c = var1;
      this.d = var2;
      this.g = 0;
      this.h = false;
   }

   public void a(xd var1, int var2, int var3) {
      this.b = var1;
      this.a(var2, var3);
   }
}
