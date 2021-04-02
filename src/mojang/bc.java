package mojang;

import java.util.List;

public abstract class bc extends ajr {

   private int a;
   private int b = 0;


   public bc(xd var1) {
      super(var1);
   }

   protected void g() {
      if(this.av() != 0) {
         this.a = 0;
      }

      super.g();
   }

   public void e() {
      super.e();
      if(this.av() != 0) {
         this.a = 0;
      }

      if(this.a > 0) {
         --this.a;
         String var1 = "heart";
         if(this.a % 10 == 0) {
            double var2 = this.U.nextGaussian() * 0.02D;
            double var4 = this.U.nextGaussian() * 0.02D;
            double var6 = this.U.nextGaussian() * 0.02D;
            this.k.a(var1, this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, this.p + 0.5D + (double)(this.U.nextFloat() * this.J), this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, var2, var4, var6);
         }
      } else {
         this.b = 0;
      }

   }

   protected void a(nn var1, float var2) {
      if(var1 instanceof yw) {
         if(var2 < 3.0F) {
            double var3 = var1.o - this.o;
            double var5 = var1.q - this.q;
            this.u = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.ap = true;
         }

         yw var7 = (yw)var1;
         if(var7.av() == null || !this.a(var7.av())) {
            this.ao = null;
         }
      } else if(var1 instanceof bc) {
         bc var8 = (bc)var1;
         if(this.av() > 0 && var8.av() < 0) {
            if((double)var2 < 2.5D) {
               this.ap = true;
            }
         } else if(this.a > 0 && var8.a > 0) {
            if(var8.ao == null) {
               var8.ao = this;
            }

            if(var8.ao == this && (double)var2 < 3.5D) {
               ++var8.a;
               ++this.a;
               ++this.b;
               if(this.b % 4 == 0) {
                  this.k.a("heart", this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, this.p + 0.5D + (double)(this.U.nextFloat() * this.J), this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, 0.0D, 0.0D, 0.0D);
               }

               if(this.b == 60) {
                  this.c((bc)var1);
               }
            } else {
               this.b = 0;
            }
         } else {
            this.b = 0;
            this.ao = null;
         }
      }

   }

   private void c(bc var1) {
      bc var2 = this.a(var1);
      if(var2 != null) {
         this.d(6000);
         var1.d(6000);
         this.a = 0;
         this.b = 0;
         this.ao = null;
         var1.ao = null;
         var1.b = 0;
         var1.a = 0;
         var2.d(-24000);
         var2.c(this.o, this.p, this.q, this.u, this.v);

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.U.nextGaussian() * 0.02D;
            double var6 = this.U.nextGaussian() * 0.02D;
            double var8 = this.U.nextGaussian() * 0.02D;
            this.k.a("heart", this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, this.p + 0.5D + (double)(this.U.nextFloat() * this.J), this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, var4, var6, var8);
         }

         this.k.a((nn)var2);
      }

   }

   public abstract bc a(bc var1);

   protected void b(nn var1, float var2) {}

   public boolean a(md var1, int var2) {
      this.aq = 60;
      this.ao = null;
      this.a = 0;
      return super.a(var1, var2);
   }

   public float a(int var1, int var2, int var3) {
      return this.k.a(var1, var2 - 1, var3) == pb.u.bO?10.0F:this.k.c(var1, var2, var3) - 0.5F;
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("InLove", this.a);
   }

   public void a(ady var1) {
      super.a(var1);
      this.a = var1.f("InLove");
   }

   protected nn h() {
      if(this.aq > 0) {
         return null;
      } else {
         float var1 = 8.0F;
         List var2;
         int var3;
         bc var4;
         if(this.a > 0) {
            var2 = this.k.a(this.getClass(), this.y.b((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               var4 = (bc)var2.get(var3);
               if(var4 != this && var4.a > 0) {
                  return var4;
               }
            }
         } else if(this.av() == 0) {
            var2 = this.k.a(yw.class, this.y.b((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               yw var5 = (yw)var2.get(var3);
               if(var5.av() != null && this.a(var5.av())) {
                  return var5;
               }
            }
         } else if(this.av() > 0) {
            var2 = this.k.a(this.getClass(), this.y.b((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               var4 = (bc)var2.get(var3);
               if(var4 != this && var4.av() < 0) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public boolean i() {
      int var1 = gk.c(this.o);
      int var2 = gk.c(this.y.b);
      int var3 = gk.c(this.q);
      return this.k.a(var1, var2 - 1, var3) == pb.u.bO && this.k.n(var1, var2, var3) > 8 && super.i();
   }

   public int j() {
      return 120;
   }

   protected boolean c_() {
      return false;
   }

   protected int b(yw var1) {
      return 1 + this.k.r.nextInt(3);
   }

   public boolean a(aan var1) {
      return var1.c == yr.T.bQ;
   }

   public boolean c(yw var1) {
      aan var2 = var1.ap.b();
      if(var2 != null && this.a(var2) && this.av() == 0) {
         if(!var1.aT.d) {
            --var2.a;
            if(var2.a <= 0) {
               var1.ap.a(var1.ap.c, (aan)null);
            }
         }

         this.a = 600;
         this.ao = null;

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.U.nextGaussian() * 0.02D;
            double var6 = this.U.nextGaussian() * 0.02D;
            double var8 = this.U.nextGaussian() * 0.02D;
            this.k.a("heart", this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, this.p + 0.5D + (double)(this.U.nextFloat() * this.J), this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, var4, var6, var8);
         }

         return true;
      } else {
         return super.c(var1);
      }
   }

   public boolean o_() {
      return this.a > 0;
   }

   public void p_() {
      this.a = 0;
   }

   public boolean b(bc var1) {
      return var1 == this?false:(var1.getClass() != this.getClass()?false:this.o_() && var1.o_());
   }
}
