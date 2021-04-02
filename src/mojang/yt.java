package mojang;

import org.lwjgl.opengl.GL11;

public class yt extends um {

   private vl a = new vl();


   public yt() {
      this.g = 0.5F;
   }

   public void a(nn var1, double var2, double var4, double var6, float var8, float var9) {
      System.out.println("ABF > NN");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/mojang/terrain.png");
      pb var10 = pb.m[((abf)var1).a];
      xd var11 = ((abf)var1).n();
      GL11.glDisable(2896);
      if(var10 == pb.bK) {
         this.a.a = var11;
         adz var12 = adz.a;
         var12.b();
         var12.b((double)((float)(-gk.c(var1.o)) - 0.5F), (double)((float)(-gk.c(var1.p)) - 0.5F), (double)((float)(-gk.c(var1.q)) - 0.5F));
         this.a.b(var10, gk.c(var1.o), gk.c(var1.p), gk.c(var1.q));
         var12.b(0.0D, 0.0D, 0.0D);
         var12.a();
      } else {
         this.a.a(var10, var11, gk.c(var1.o), gk.c(var1.p), gk.c(var1.q));
      }

      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }
}
