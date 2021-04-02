package mojang;

import java.util.List;

public class alt extends ajg {

   private int a = 0;
   private int b = 0;
   private static final aan d = new aan(yr.G, 1);


   public alt(xd var1) {
      super(var1);
      this.bm = "/mojang/mob/pigzombie.png";
      this.cj = 0.5F;
      this.c = 5;
      this.ab = true;
   }

   protected boolean b_() {
      return false;
   }

   public void J_() {
      this.cj = this.ao != null?0.95F:0.5F;
      if(this.b > 0 && --this.b == 0) {
         this.k.a(this, "mojang.mob.zombiepig.zpigangry", this.C_() * 2.0F, ((this.U.nextFloat() - this.U.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.J_();
   }

   public boolean i() {
      return this.k.q > 0 && this.k.a(this.y) && this.k.a((nn)this, this.y).size() == 0 && !this.k.b(this.y);
   }

   public void b(ady var1) {
      super.b(var1);
      var1.a("Anger", (short)this.a);
   }

   public void a(ady var1) {
      super.a(var1);
      this.a = var1.e("Anger");
   }

   protected nn h() {
      return this.a == 0?null:super.h();
   }

   public void e() {
      super.e();
   }

   public boolean a(md var1, int var2) {
      nn var3 = var1.a();
      if(var3 instanceof yw) {
         List var4 = this.k.b((nn)this, this.y.b(32.0D, 32.0D, 32.0D));

         for(int var5 = 0; var5 < var4.size(); ++var5) {
            nn var6 = (nn)var4.get(var5);
            if(var6 instanceof alt) {
               alt var7 = (alt)var6;
               var7.d(var3);
            }
         }

         this.d(var3);
      }

      return super.a(var1, var2);
   }

   private void d(nn var1) {
      this.ao = var1;
      this.a = 400 + this.U.nextInt(400);
      this.b = this.U.nextInt(40);
   }

   protected String m() {
      return "mojang.mob.zombiepig.zpig";
   }

   protected String n() {
      return "mojang.mob.zombiepig.zpighurt";
   }

   protected String o() {
      return "mojang.mob.zombiepig.zpigdeath";
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.U.nextInt(2 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.bm.bQ, 1);
      }

      var3 = this.U.nextInt(2 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.b(yr.bq.bQ, 1);
      }

   }

   protected void j_(int var1) {
      if(var1 > 0) {
         aan var2 = new aan(yr.G);
         ais.a(this.U, var2, 5);
         this.a(var2, 0.0F);
      } else {
         int var3 = this.U.nextInt(3);
         if(var3 == 0) {
            this.b(yr.p.bQ, 1);
         } else if(var3 == 1) {
            this.b(yr.G.bQ, 1);
         } else if(var3 == 2) {
            this.b(yr.al.bQ, 1);
         }
      }

   }

   protected int f() {
      return yr.bm.bQ;
   }

   public aan ae() {
      return d;
   }

}
