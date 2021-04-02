package mojang;

import java.util.List;
import org.lwjgl.opengl.GL11;
class cn extends iff {

   // $FF: synthetic field
   final em a;


   public cn(em var1) {
      super(em.a(var1), var1.q, var1.r, 32, var1.r - 55 + 4, 36);
      this.a = var1;
   }

   protected int a() {
      List var1 = em.b(this.a).texturePackManager.b();
      return var1.size();
   }

   protected void a(int var1, boolean var2) {
      List var3 = em.c(this.a).texturePackManager.b();

      try {
         em.d(this.a).texturePackManager.setTexturePack((Resource)var3.get(var1));
         em.e(this.a).p.b();
      } catch (Exception var5) {
         em.f(this.a).texturePackManager.setTexturePack((Resource)var3.get(0));
         em.g(this.a).p.b();
      }

   }

   protected boolean b_(int var1) {
      List var2 = em.h(this.a).texturePackManager.b();
      return em.i(this.a).texturePackManager.resource == var2.get(var1);
   }

   protected int b() {
      return this.a() * 36;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, Tessalator var5) {
      Resource var6 = (Resource)em.j(this.a).texturePackManager.b().get(var1);
      var6.c(em.k(this.a));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var5.b();
      var5.c(16777215);
      var5.a((double)var2, (double)(var3 + var4), 0.0D, 0.0D, 1.0D);
      var5.a((double)(var2 + 32), (double)(var3 + var4), 0.0D, 1.0D, 1.0D);
      var5.a((double)(var2 + 32), (double)var3, 0.0D, 1.0D, 0.0D);
      var5.a((double)var2, (double)var3, 0.0D, 0.0D, 0.0D);
      var5.a();
      this.a.b(em.l(this.a), var6.a, var2 + 32 + 2, var3 + 1, 16777215);
      this.a.b(em.m(this.a), var6.b, var2 + 32 + 2, var3 + 12, 8421504);
      this.a.b(em.n(this.a), var6.c, var2 + 32 + 2, var3 + 12 + 10, 8421504);
   }
}
