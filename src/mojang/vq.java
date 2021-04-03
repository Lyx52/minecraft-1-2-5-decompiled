package mojang;

import mojang.net.minecraft.client.Minecraft;

public class vq extends Player {

   public oy a;
   protected Minecraft b;
   protected int c = 0;
   public int d = 0;
   public float e;
   public float am;
   public float an;
   public float ao;
   private ch cl = new ch();
   private ch cm = new ch();
   private ch cn = new ch();


   public vq(Minecraft var1, World var2, CredentialManager var3, int var4) {
      super(var2);
      this.b = var1;
      this.aB = var4;
      if(var3 != null && var3.username != null && var3.username.length() > 0) {
         this.Z = "https://s3.amazonaws.com/MinecraftSkins/" + var3.username + ".png";
      }

      this.aA = var3.username;
   }

   public void b(double var1, double var3, double var5) {
      super.b(var1, var3, var5);
   }

   public void y_() {
      super.y_();
      this.ce = this.a.a;
      this.cf = this.a.b;
      this.ch = this.a.d;
      this.an = this.e;
      this.ao = this.am;
      this.am = (float)((double)this.am + (double)(this.v - this.am) * 0.5D);
      this.e = (float)((double)this.e + (double)(this.u - this.e) * 0.5D);
   }

   protected boolean H_() {
      return true;
   }

   public void e() {
      if(this.d > 0) {
         --this.d;
         if(this.d == 0) {
            this.d(false);
         }
      }

      if(this.c > 0) {
         --this.c;
      }

      if(this.b.c.e()) {
         this.o = this.q = 0.5D;
         this.o = 0.0D;
         this.q = 0.0D;
         this.u = (float)this.V / 12.0F;
         this.v = 10.0F;
         this.p = 68.5D;
      } else {
         if(!this.b.K.a(dp.f)) {
            this.b.v.b(dp.f);
         }

         this.aS = this.aR;
         boolean var1;
         if(this.aQ) {
            if(!this.k.F && this.j != null) {
               this.h((BaseEntity)null);
            }

            if(this.b.guiManager != null) {
               this.b.addMenu((GUIManager)null);
            }

            if(this.aR == 0.0F) {
               this.b.soundManager.a("portal.trigger", 1.0F, this.U.nextFloat() * 0.4F + 0.8F);
            }

            this.aR += 0.0125F;
            if(this.aR >= 1.0F) {
               this.aR = 1.0F;
               if(!this.k.F) {
                  this.aP = 10;
                  this.b.soundManager.a("portal.travel", 1.0F, this.U.nextFloat() * 0.4F + 0.8F);
                  var1 = false;
                  byte var5;
                  if(this.aB == -1) {
                     var5 = 0;
                  } else {
                     var5 = -1;
                  }

                  this.b.a(var5);
                  this.a((ajw)dp.x);
               }
            }

            this.aQ = false;
         } else if(this.a(aad.k) && this.b(aad.k).b() > 60) {
            this.aR += 0.006666667F;
            if(this.aR > 1.0F) {
               this.aR = 1.0F;
            }
         } else {
            if(this.aR > 0.0F) {
               this.aR -= 0.05F;
            }

            if(this.aR < 0.0F) {
               this.aR = 0.0F;
            }
         }

         if(this.aP > 0) {
            --this.aP;
         }

         var1 = this.a.d;
         float var2 = 0.8F;
         boolean var3 = this.a.b >= var2;
         this.a.a();
         if(this.aj()) {
            this.a.a *= 0.2F;
            this.a.b *= 0.2F;
            this.c = 0;
         }

         if(this.a.e && this.Q < 0.2F) {
            this.Q = 0.2F;
         }

         this.h(this.o - (double)this.I * 0.35D, this.y.b + 0.5D, this.q + (double)this.I * 0.35D);
         this.h(this.o - (double)this.I * 0.35D, this.y.b + 0.5D, this.q - (double)this.I * 0.35D);
         this.h(this.o + (double)this.I * 0.35D, this.y.b + 0.5D, this.q - (double)this.I * 0.35D);
         this.h(this.o + (double)this.I * 0.35D, this.y.b + 0.5D, this.q + (double)this.I * 0.35D);
         boolean var4 = (float)this.aF().a() > 6.0F;
         if(this.z && !var3 && this.a.b >= var2 && !this.W() && var4 && !this.aj() && !this.a(aad.q)) {
            if(this.c == 0) {
               this.c = 7;
            } else {
               this.d(true);
               this.c = 0;
            }
         }

         if(this.V()) {
            this.c = 0;
         }

         if(this.W() && (this.a.b < var2 || this.A || !var4)) {
            this.d(false);
         }

         if(this.aT.c && !var1 && this.a.d) {
            if(this.at == 0) {
               this.at = 7;
            } else {
               this.aT.b = !this.aT.b;
               this.aI();
               this.at = 0;
            }
         }

         if(this.aT.b) {
            if(this.a.e) {
               this.s -= 0.15D;
            }

            if(this.a.d) {
               this.s += 0.15D;
            }
         }

         super.e();
         if(this.z && this.aT.b) {
            this.aT.b = false;
            this.aI();
         }

      }
   }

   public void c(int var1) {
      if(!this.k.F) {
         if(this.aB == 1 && var1 == 1) {
            this.a((ajw)dp.C);
            this.b.addMenu((GUIManager)(new c()));
         } else {
            this.a((ajw)dp.B);
            this.b.soundManager.a("portal.travel", 1.0F, this.U.nextFloat() * 0.4F + 0.8F);
            this.b.a(1);
         }

      }
   }

   public float I_() {
      float var1 = 1.0F;
      if(this.aT.b) {
         var1 *= 1.1F;
      }

      var1 *= (this.bt * this.at() / this.aX + 1.0F) / 2.0F;
      if(this.aj() && this.ah().c == yr.k.bQ) {
         int var2 = this.al();
         float var3 = (float)var2 / 20.0F;
         if(var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      return var1;
   }

   public void b(CompundTag var1) {
      super.b(var1);
      var1.addInt("Score", this.av);
   }

   public void a(CompundTag var1) {
      super.a(var1);
      this.av = var1.getInt("Score");
   }

   public void af() {
      super.af();
      this.b.addMenu((GUIManager)null);
   }

   public void a(sc var1) {
      this.b.addMenu((GUIManager)(new alu(var1)));
   }

   public void a(io var1) {
      this.b.addMenu((GUIManager)(new zn(this.ap, var1)));
   }

   public void a(int var1, int var2, int var3) {
      this.b.addMenu((GUIManager)(new aen(this.ap, this.k, var1, var2, var3)));
   }

   public void c(int var1, int var2, int var3) {
      this.b.addMenu((GUIManager)(new sm(this.ap, this.k, var1, var2, var3)));
   }

   public void a(ahg var1) {
      this.b.addMenu((GUIManager)(new kv(this.ap, var1)));
   }

   public void a(amc var1) {
      this.b.addMenu((GUIManager)(new hg(this.ap, var1)));
   }

   public void a(az var1) {
      this.b.addMenu((GUIManager)(new fb(this.ap, var1)));
   }

   public void d(BaseEntity var1) {
      this.b.j.a((rt)(new fs(this.b.f, var1)));
   }

   public void i(BaseEntity var1) {
      fs var2 = new fs(this.b.f, var1, "magicCrit");
      this.b.j.a((rt)var2);
   }

   public void b(BaseEntity var1, int var2) {
      this.b.j.a((rt)(new ws(this.b.f, var1, this, -0.5F)));
   }

   public void a(String var1) {}

   public boolean V() {
      return this.a.e && !this.aK;
   }

   public void d(int var1) {
      int var2 = this.bb() - var1;
      if(var2 <= 0) {
         this.l(var1);
         if(var2 < 0) {
            this.Y = this.ba / 2;
         }
      } else {
         this.cc = var2;
         this.l(this.bb());
         this.Y = this.ba;
         this.c(md.k, var2);
         this.bA = this.bB = 10;
      }

   }

   public void ag() {
      this.b.a(false, 0, false);
   }

   public void ab() {}

   public void b(String var1) {
      this.b.w.c(var1);
   }

   public void a(ajw var1, int var2) {
      if(var1 != null) {
         if(var1.e()) {
            aeb var3 = (aeb)var1;
            if(var3.c == null || this.b.K.a(var3.c)) {
               if(!this.b.K.a(var3)) {
                  this.b.v.a(var3);
               }

               this.b.K.a(var1, var2);
            }
         } else {
            this.b.K.a(var1, var2);
         }

      }
   }

   private boolean g(int var1, int var2, int var3) {
      return this.k.h(var1, var2, var3);
   }

   protected boolean h(double var1, double var3, double var5) {
      int var7 = Utils.c(var1);
      int var8 = Utils.c(var3);
      int var9 = Utils.c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var5 - (double)var9;
      if(this.g(var7, var8, var9) || this.g(var7, var8 + 1, var9)) {
         boolean var14 = !this.g(var7 - 1, var8, var9) && !this.g(var7 - 1, var8 + 1, var9);
         boolean var15 = !this.g(var7 + 1, var8, var9) && !this.g(var7 + 1, var8 + 1, var9);
         boolean var16 = !this.g(var7, var8, var9 - 1) && !this.g(var7, var8 + 1, var9 - 1);
         boolean var17 = !this.g(var7, var8, var9 + 1) && !this.g(var7, var8 + 1, var9 + 1);
         byte var18 = -1;
         double var19 = 9999.0D;
         if(var14 && var10 < var19) {
            var19 = var10;
            var18 = 0;
         }

         if(var15 && 1.0D - var10 < var19) {
            var19 = 1.0D - var10;
            var18 = 1;
         }

         if(var16 && var12 < var19) {
            var19 = var12;
            var18 = 4;
         }

         if(var17 && 1.0D - var12 < var19) {
            var19 = 1.0D - var12;
            var18 = 5;
         }

         float var21 = 0.1F;
         if(var18 == 0) {
            this.r = (double)(-var21);
         }

         if(var18 == 1) {
            this.r = (double)var21;
         }

         if(var18 == 4) {
            this.t = (double)(-var21);
         }

         if(var18 == 5) {
            this.t = (double)var21;
         }
      }

      return false;
   }

   public void d(boolean var1) {
      super.d(var1);
      this.d = var1?600:0;
   }

   public void a(float var1, int var2, int var3) {
      this.aW = var1;
      this.aV = var2;
      this.aU = var3;
   }
}
