package mojang;

import java.util.Random;

public class qk extends pb {

   protected qk(int var1, int var2, acn var3) {
      super(var1, var3);
      this.bN = var2;
      this.a(true);
      float var4 = 0.2F;
      this.a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
   }

   protected qk(int var1, int var2) {
      this(var1, var2, acn.j);
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return super.e(var1, var2, var3, var4) && this.f_(var1.a(var2, var3 - 1, var4));
   }

   protected boolean f_(int var1) {
      return var1 == u.bO || var1 == v.bO || var1 == aA.bO;
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      this.h(var1, var2, var3, var4);
   }

   public void a(xd var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(xd var1, int var2, int var3, int var4) {
      if(!this.g(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.e(var2, var3, var4), 0);
         var1.g(var2, var3, var4, 0);
      }

   }

   public boolean g(xd var1, int var2, int var3, int var4) {
      return (var1.n(var2, var3, var4) >= 8 || var1.m(var2, var3, var4)) && this.f_(var1.a(var2, var3 - 1, var4));
   }

   public wu c(xd var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 1;
   }
}
