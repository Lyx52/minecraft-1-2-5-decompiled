package mojang;

import org.lwjgl.opengl.GL11;

class qh extends iff {

   // $FF: synthetic field
   final acp a;


   public qh(acp var1) {
      super(var1.p, var1.q, var1.r, 32, var1.r - 64, 36);
      this.a = var1;
   }

   protected int a() {
      return acp.a(this.a).size();
   }

   protected void a(int var1, boolean var2) {
      acp.a(this.a, var1);
      boolean var3 = acp.b(this.a) >= 0 && acp.b(this.a) < this.a();
      acp.c(this.a).h = var3;
      acp.d(this.a).h = var3;
      acp.e(this.a).h = var3;
      if(var2 && var3) {
         acp.b(this.a, var1);
      }

   }

   protected boolean b_(int var1) {
      return var1 == acp.b(this.a);
   }

   protected int b() {
      return acp.a(this.a).size() * 36;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, adz var5) {
      oa var6 = (oa)acp.a(this.a).get(var1);
      synchronized(acp.g()) {
         if(acp.n() < 5 && !var6.f) {
            var6.f = true;
            var6.e = -2L;
            var6.d = "";
            var6.c = "";
            acp.o();
            (new by(this, var6)).start();
         }
      }

      this.a.b(this.a.u, var6.a, var2 + 2, var3 + 1, 16777215);
      this.a.b(this.a.u, var6.d, var2 + 2, var3 + 12, 8421504);
      this.a.b(this.a.u, var6.c, var2 + 215 - this.a.u.a(var6.c), var3 + 12, 8421504);
      this.a.b(this.a.u, var6.b, var2 + 2, var3 + 12 + 11, 3158064);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.p.p.b(this.a.p.p.b("/gui/icons.png"));
      String var9 = "";
      byte var7;
      int var8;
      if(var6.f && var6.e != -2L) {
         var7 = 0;
         boolean var12 = false;
         if(var6.e < 0L) {
            var8 = 5;
         } else if(var6.e < 150L) {
            var8 = 0;
         } else if(var6.e < 300L) {
            var8 = 1;
         } else if(var6.e < 600L) {
            var8 = 2;
         } else if(var6.e < 1000L) {
            var8 = 3;
         } else {
            var8 = 4;
         }

         if(var6.e < 0L) {
            var9 = "(no connection)";
         } else {
            var9 = var6.e + "ms";
         }
      } else {
         var7 = 1;
         var8 = (int)(System.currentTimeMillis() / 100L + (long)(var1 * 2) & 7L);
         if(var8 > 4) {
            var8 = 8 - var8;
         }

         var9 = "Polling..";
      }

      this.a.b(var2 + 205, var3, 0 + var7 * 10, 176 + var8 * 8, 10, 8);
      byte var10 = 4;
      if(this.k >= var2 + 205 - var10 && this.l >= var3 - var10 && this.k <= var2 + 205 + 10 + var10 && this.l <= var3 + 8 + var10) {
         acp.a(this.a, var9);
      }

   }
}
