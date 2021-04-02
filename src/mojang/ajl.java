package mojang;

import java.util.Random;

class ajl extends up {

   private ajl() {}

   public void a(Random var1, int var2, int var3, int var4, boolean var5) {
      if(!var5) {
         this.a = 0;
         this.b = 0;
      } else {
         this.a = pb.bm.bO;
         float var6 = var1.nextFloat();
         if(var6 < 0.2F) {
            this.b = 2;
         } else if(var6 < 0.5F) {
            this.b = 1;
         } else if(var6 < 0.55F) {
            this.a = pb.bl.bO;
            this.b = 2;
         } else {
            this.b = 0;
         }
      }

   }

   // $FF: synthetic method
   ajl(as var1) {
      this();
   }
}
