package mojang;

import java.util.ArrayList;
import java.util.List;
import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class wg extends oo {

   private List a = new ArrayList();
   private Minecraft b;


   public wg(Minecraft var1) {
      this.b = var1;
   }

   public void a() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         hv var2 = (hv)this.a.get(var1);
         var2.a();
         var2.a(this);
         if(var2.h) {
            this.a.remove(var1--);
         }
      }

   }

   public void a(float var1) {
      this.b.p.b(this.b.p.b("/mojang/gui/particles.png"));

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         hv var3 = (hv)this.a.get(var2);
         int var4 = (int)(var3.c + (var3.a - var3.c) * (double)var1 - 4.0D);
         int var5 = (int)(var3.d + (var3.b - var3.d) * (double)var1 - 4.0D);
         float var6 = (float)(var3.r + (var3.n - var3.r) * (double)var1);
         float var7 = (float)(var3.o + (var3.k - var3.o) * (double)var1);
         float var8 = (float)(var3.p + (var3.l - var3.p) * (double)var1);
         float var9 = (float)(var3.q + (var3.m - var3.q) * (double)var1);
         GL11.glColor4f(var7, var8, var9, var6);
         this.b(var4, var5, 40, 0, 8, 8);
      }

   }
}
