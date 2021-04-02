package mojang;

public class adg extends yy {

   private float a = 0.5F;
   private int b;
   private int d;


   public adg(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/fire.png";
      this.ab = true;
      this.c = 6;
      this.bI = 10;
   }

   public int d() {
      return 20;
   }

   protected void b() {
      super.b();
      this.ac.a(16, new Byte((byte)0));
   }

   protected String m() {
      return "mojang.mob.blaze.breathe";
   }

   protected String n() {
      return "mojang.mob.blaze.hit";
   }

   protected String o() {
      return "mojang.mob.blaze.death";
   }

   public boolean a(md var1, int var2) {
      return super.a(var1, var2);
   }

   public void a(md var1) {
      super.a(var1);
   }

   public int b(float var1) {
      return 15728880;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public void e() {
      if(!this.k.F) {
         if(this.G()) {
            this.a(md.f, 1);
         }

         --this.b;
         if(this.b <= 0) {
            this.b = 100;
            this.a = 0.5F + (float)this.U.nextGaussian() * 3.0F;
         }

         if(this.as() != null && this.as().p + (double)this.as().I() > this.p + (double)this.I() + (double)this.a) {
            this.s += (0.30000001192092896D - this.s) * 0.30000001192092896D;
         }
      }

      if(this.U.nextInt(24) == 0) {
         this.k.a(this.o + 0.5D, this.p + 0.5D, this.q + 0.5D, "fire.fire", 1.0F + this.U.nextFloat(), this.U.nextFloat() * 0.7F + 0.3F);
      }

      if(!this.z && this.s < 0.0D) {
         this.s *= 0.6D;
      }

      for(int var1 = 0; var1 < 2; ++var1) {
         this.k.a("largesmoke", this.o + (this.U.nextDouble() - 0.5D) * (double)this.I, this.p + this.U.nextDouble() * (double)this.J, this.q + (this.U.nextDouble() - 0.5D) * (double)this.I, 0.0D, 0.0D, 0.0D);
      }

      super.e();
   }

   protected void a(nn var1, float var2) {
      if(this.bE <= 0 && var2 < 2.0F && var1.y.e > this.y.b && var1.y.b < this.y.e) {
         this.bE = 20;
         this.c(var1);
      } else if(var2 < 30.0F) {
         double var3 = var1.o - this.o;
         double var5 = var1.y.b + (double)(var1.J / 2.0F) - (this.p + (double)(this.J / 2.0F));
         double var7 = var1.q - this.q;
         if(this.bE == 0) {
            ++this.d;
            if(this.d == 1) {
               this.bE = 60;
               this.a(true);
            } else if(this.d <= 4) {
               this.bE = 6;
            } else {
               this.bE = 100;
               this.d = 0;
               this.a(false);
            }

            if(this.d > 1) {
               float var9 = gk.c(var2) * 0.5F;
               this.k.a((yw)null, 1009, (int)this.o, (int)this.p, (int)this.q, 0);

               for(int var10 = 0; var10 < 1; ++var10) {
                  qb var11 = new qb(this.k, this, var3 + this.U.nextGaussian() * (double)var9, var5, var7 + this.U.nextGaussian() * (double)var9);
                  var11.p = this.p + (double)(this.J / 2.0F) + 0.5D;
                  this.k.a((nn)var11);
               }
            }
         }

         this.u = (float)(Math.atan2(var7, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.ap = true;
      }

   }

   protected void e(float var1) {}

   public void b(ady var1) {
      super.b(var1);
   }

   public void a(ady var1) {
      super.a(var1);
   }

   protected int f() {
      return yr.bo.bQ;
   }

   public boolean T() {
      return this.af();
   }

   protected void a(boolean var1, int var2) {
      if(var1) {
         int var3 = this.U.nextInt(2 + var2);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.b(yr.bo.bQ, 1);
         }
      }

   }

   public boolean af() {
      return (this.ac.a(16) & 1) != 0;
   }

   public void a(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.ac.b(16, Byte.valueOf(var2));
   }

   protected boolean aa() {
      return true;
   }
}
