
public class xl extends agy {

   protected xl(int var1, int var2) {
      super(var1, var2, acn.d);
   }

   public int a_(int var1) {
      return this.bN + (var1 == 1?1:0);
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      if(var1.e(var2, var3, var4) == 0) {
         return false;
      } else {
         this.h(var1, var2, var3, var4);
         return true;
      }
   }

   public void f(xd var1, int var2, int var3, int var4, int var5) {
      if(!var1.F) {
         dk var6 = (dk)var1.b(var2, var3, var4);
         if(var6 != null) {
            var6.a = var5;
            var6.j();
            var1.f(var2, var3, var4, 1);
         }
      }
   }

   public void h(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         dk var5 = (dk)var1.b(var2, var3, var4);
         if(var5 != null) {
            int var6 = var5.a;
            if(var6 != 0) {
               var1.g(1005, var2, var3, var4, 0);
               var1.a((String)null, var2, var3, var4);
               var5.a = 0;
               var5.j();
               var1.f(var2, var3, var4, 0);
               float var8 = 0.7F;
               double var9 = (double)(var1.r.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
               double var11 = (double)(var1.r.nextFloat() * var8) + (double)(1.0F - var8) * 0.2D + 0.6D;
               double var13 = (double)(var1.r.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
               fq var15 = new fq(var1, (double)var2 + var9, (double)var3 + var11, (double)var4 + var13, new aan(var6, 1, 0));
               var15.c = 10;
               var1.a((nn)var15);
            }
         }
      }
   }

   public void b_(xd var1, int var2, int var3, int var4) {
      this.h(var1, var2, var3, var4);
      super.b_(var1, var2, var3, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.F) {
         super.a(var1, var2, var3, var4, var5, var6, 0);
      }
   }

   public kw u_() {
      return new dk();
   }
}
