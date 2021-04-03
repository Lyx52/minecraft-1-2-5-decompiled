package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class fv extends aar {

   private vl a;


   public void a(kw var1, double var2, double var4, double var6, float var8) {
      System.out.println("OU > KW");
      pb var9 = pb.m[((ou)var1).a()];
      if(var9 != null && ((ou)var1).a(var8) < 1.0F) {
         Tessalator var10 = Tessalator.tessalatorInstance;
         this.a("/mojang/terrain.png");
         tf.a();
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         if(Minecraft.t()) {
            GL11.glShadeModel(7425);
         } else {
            GL11.glShadeModel(7424);
         }

         var10.b();
         var10.b((double)((float)var2 - (float)var1.j + ((ou)var1).b(var8)), (double)((float)var4 - (float)var1.k + ((ou)var1).c(var8)), (double)((float)var6 - (float)var1.l + ((ou)var1).d(var8)));
         var10.a(1, 1, 1);
         if(var9 == pb.aa && ((ou)var1).a(var8) < 0.5F) {
            this.a.a(var9, var1.j, var1.k, var1.l, false);
         } else if(((ou)var1).f() && !((ou)var1).d()) {
            pb.aa.e(((abc)var9).v());
            this.a.a(pb.aa, var1.j, var1.k, var1.l, ((ou)var1).a(var8) < 0.5F);
            pb.aa.v();
            var10.b((double)((float)var2 - (float)var1.j), (double)((float)var4 - (float)var1.k), (double)((float)var6 - (float)var1.l));
            this.a.d(var9, var1.j, var1.k, var1.l);
         } else {
            this.a.a(var9, var1.j, var1.k, var1.l);
         }

         var10.b(0.0D, 0.0D, 0.0D);
         var10.a();
         tf.b();
      }

   }

   public void a(World var1) {
      this.a = new vl(var1);
   }
}
