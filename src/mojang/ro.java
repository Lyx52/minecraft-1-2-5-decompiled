package mojang;

import java.util.Random;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class ro extends vp {

   private static final int l = dp.a * 24 - 112;
   private static final int m = dp.b * 24 - 112;
   private static final int n = dp.c * 24 - 77;
   private static final int o = dp.d * 24 - 77;
   protected int a = 256;
   protected int b = 202;
   protected int c = 0;
   protected int d = 0;
   protected double e;
   protected double f;
   protected double h;
   protected double i;
   protected double j;
   protected double k;
   private int w = 0;
   private alf x;


   public ro(alf var1) {
      this.x = var1;
      short var2 = 141;
      short var3 = 141;
      this.e = this.h = this.j = (double)(dp.f.a * 24 - var2 / 2 - 12);
      this.f = this.i = this.k = (double)(dp.f.b * 24 - var3 / 2);
   }

   public void c() {
      this.s.clear();
      this.s.add(new z(1, this.q / 2 + 24, this.r / 2 + 74, 80, 20, cy.a("mojang.gui.done")));
   }

   protected void a(abp var1) {
      if(var1.f == 1) {
         this.p.a((vp)null);
         this.p.g();
      }

      super.a(var1);
   }

   protected void a(char var1, int var2) {
      if(var2 == this.p.A.s.d) {
         this.p.a((vp)null);
         this.p.g();
      } else {
         super.a(var1, var2);
      }

   }

   public void a(int var1, int var2, float var3) {
      if(Mouse.isButtonDown(0)) {
         int var4 = (this.q - this.a) / 2;
         int var5 = (this.r - this.b) / 2;
         int var6 = var4 + 8;
         int var7 = var5 + 17;
         if((this.w == 0 || this.w == 1) && var1 >= var6 && var1 < var6 + 224 && var2 >= var7 && var2 < var7 + 155) {
            if(this.w == 0) {
               this.w = 1;
            } else {
               this.h -= (double)(var1 - this.c);
               this.i -= (double)(var2 - this.d);
               this.j = this.e = this.h;
               this.k = this.f = this.i;
            }

            this.c = var1;
            this.d = var2;
         }

         if(this.j < (double)l) {
            this.j = (double)l;
         }

         if(this.k < (double)m) {
            this.k = (double)m;
         }

         if(this.j >= (double)n) {
            this.j = (double)(n - 1);
         }

         if(this.k >= (double)o) {
            this.k = (double)(o - 1);
         }
      } else {
         this.w = 0;
      }

      this.k();
      this.b(var1, var2, var3);
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.d();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   public void a() {
      this.e = this.h;
      this.f = this.i;
      double var1 = this.j - this.h;
      double var3 = this.k - this.i;
      if(var1 * var1 + var3 * var3 < 4.0D) {
         this.h += var1;
         this.i += var3;
      } else {
         this.h += var1 * 0.85D;
         this.i += var3 * 0.85D;
      }

   }

   protected void d() {
      int var1 = (this.q - this.a) / 2;
      int var2 = (this.r - this.b) / 2;
      this.u.b("Achievements", var1 + 15, var2 + 5, 4210752);
   }

   protected void b(int var1, int var2, float var3) {
      int var4 = gk.c(this.e + (this.h - this.e) * (double)var3);
      int var5 = gk.c(this.f + (this.i - this.f) * (double)var3);
      if(var4 < l) {
         var4 = l;
      }

      if(var5 < m) {
         var5 = m;
      }

      if(var4 >= n) {
         var4 = n - 1;
      }

      if(var5 >= o) {
         var5 = o - 1;
      }

      int var6 = this.p.p.b("/mojang/terrain.png");
      int var7 = this.p.p.b("/mojang/achievement/bg.png");
      int var8 = (this.q - this.a) / 2;
      int var9 = (this.r - this.b) / 2;
      int var10 = var8 + 16;
      int var11 = var9 + 17;
      this.g = 0.0F;
      GL11.glDepthFunc(518);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      GL11.glEnable(3553);
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      this.p.p.b(var6);
      int var12 = var4 + 288 >> 4;
      int var13 = var5 + 288 >> 4;
      int var14 = (var4 + 288) % 16;
      int var15 = (var5 + 288) % 16;
      Random var21 = new Random();

      int var22;
      int var24;
      int var25;
      int var26;
      for(var22 = 0; var22 * 16 - var15 < 155; ++var22) {
         float var23 = 0.6F - (float)(var13 + var22) / 25.0F * 0.3F;
         GL11.glColor4f(var23, var23, var23, 1.0F);

         for(var24 = 0; var24 * 16 - var14 < 224; ++var24) {
            var21.setSeed((long)(1234 + var12 + var24));
            var21.nextInt();
            var25 = var21.nextInt(1 + var13 + var22) + (var13 + var22) / 2;
            var26 = pb.E.bN;
            if(var25 <= 37 && var13 + var22 != 35) {
               if(var25 == 22) {
                  if(var21.nextInt(2) == 0) {
                     var26 = pb.aw.bN;
                  } else {
                     var26 = pb.aN.bN;
                  }
               } else if(var25 == 10) {
                  var26 = pb.H.bN;
               } else if(var25 == 8) {
                  var26 = pb.I.bN;
               } else if(var25 > 4) {
                  var26 = pb.t.bN;
               } else if(var25 > 0) {
                  var26 = pb.v.bN;
               }
            } else {
               var26 = pb.z.bN;
            }

            this.b(var10 + var24 * 16 - var14, var11 + var22 * 16 - var15, var26 % 16 << 4, var26 >> 4 << 4, 16, 16);
         }
      }

      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glDisable(3553);

      int var27;
      int var30;
      for(var22 = 0; var22 < dp.e.size(); ++var22) {
         aeb var33 = (aeb)dp.e.get(var22);
         if(var33.c != null) {
            var24 = var33.a * 24 - var4 + 11 + var10;
            var25 = var33.b * 24 - var5 + 11 + var11;
            var26 = var33.c.a * 24 - var4 + 11 + var10;
            var27 = var33.c.b * 24 - var5 + 11 + var11;
            boolean var28 = this.x.a(var33);
            boolean var29 = this.x.b(var33);
            var30 = Math.sin((double)(System.currentTimeMillis() % 600L) / 600.0D * 3.141592653589793D * 2.0D) > 0.6D?255:130;
            int var31 = -16777216;
            if(var28) {
               var31 = -9408400;
            } else if(var29) {
               var31 = '\uff00' + (var30 << 24);
            }

            this.a(var24, var26, var25, var31);
            this.b(var26, var25, var27, var31);
         }
      }

      aeb var32 = null;
      tw var34 = new tw();
      tf.c();
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);

      int var39;
      int var40;
      for(var24 = 0; var24 < dp.e.size(); ++var24) {
         aeb var35 = (aeb)dp.e.get(var24);
         var26 = var35.a * 24 - var4;
         var27 = var35.b * 24 - var5;
         if(var26 >= -24 && var27 >= -24 && var26 <= 224 && var27 <= 155) {
            float var38;
            if(this.x.a(var35)) {
               var38 = 1.0F;
               GL11.glColor4f(var38, var38, var38, 1.0F);
            } else if(this.x.b(var35)) {
               var38 = Math.sin((double)(System.currentTimeMillis() % 600L) / 600.0D * 3.141592653589793D * 2.0D) < 0.6D?0.6F:0.8F;
               GL11.glColor4f(var38, var38, var38, 1.0F);
            } else {
               var38 = 0.3F;
               GL11.glColor4f(var38, var38, var38, 1.0F);
            }

            this.p.p.b(var7);
            var39 = var10 + var26;
            var40 = var11 + var27;
            if(var35.g()) {
               this.b(var39 - 2, var40 - 2, 26, 202, 26, 26);
            } else {
               this.b(var39 - 2, var40 - 2, 0, 202, 26, 26);
            }

            if(!this.x.b(var35)) {
               float var41 = 0.1F;
               GL11.glColor4f(var41, var41, var41, 1.0F);
               var34.a = false;
            }

            GL11.glEnable(2896);
            GL11.glEnable(2884);
            var34.a(this.p.q, this.p.p, var35.d, var39 + 3, var40 + 3);
            GL11.glDisable(2896);
            if(!this.x.b(var35)) {
               var34.a = true;
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if(var1 >= var10 && var2 >= var11 && var1 < var10 + 224 && var2 < var11 + 155 && var1 >= var39 && var1 <= var39 + 22 && var2 >= var40 && var2 <= var40 + 22) {
               var32 = var35;
            }
         }
      }

      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.p.p.b(var7);
      this.b(var8, var9, 0, 0, this.a, this.b);
      GL11.glPopMatrix();
      this.g = 0.0F;
      GL11.glDepthFunc(515);
      GL11.glDisable(2929);
      GL11.glEnable(3553);
      super.a(var1, var2, var3);
      if(var32 != null) {
         String var36 = cy.a(var32.i());
         String var37 = var32.f();
         var26 = var1 + 12;
         var27 = var2 - 4;
         if(this.x.b(var32)) {
            var39 = Math.max(this.u.a(var36), 120);
            var40 = this.u.b(var37, var39);
            if(this.x.a(var32)) {
               var40 += 12;
            }

            this.a(var26 - 3, var27 - 3, var26 + var39 + 3, var27 + var40 + 3 + 12, -1073741824, -1073741824);
            this.u.a(var37, var26, var27 + 12, var39, -6250336);
            if(this.x.a(var32)) {
               this.u.a(cy.a("mojang.achievement.taken"), var26, var27 + var40 + 4, -7302913);
            }
         } else {
            var39 = Math.max(this.u.a(var36), 120);
            String var42 = cy.a("mojang.achievement.requires", new Object[]{cy.a(var32.c.i())});
            var30 = this.u.b(var42, var39);
            this.a(var26 - 3, var27 - 3, var26 + var39 + 3, var27 + var30 + 12 + 3, -1073741824, -1073741824);
            this.u.a(var42, var26, var27 + 12, var39, -9416624);
         }

         this.u.a(var36, var26, var27, this.x.b(var32)?(var32.g()?-128:-1):(var32.g()?-8355776:-8355712));
      }

      GL11.glEnable(2929);
      GL11.glEnable(2896);
      tf.a();
   }

   public boolean b() {
      return true;
   }

}
