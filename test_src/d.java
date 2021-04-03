import java.util.List;

public class d extends si {

   private int b;
   public long a = 0L;
   private int c;


   public d(xd var1, double var2, double var4, double var6) {
      super(var1);
      this.c(var2, var4, var6, 0.0F, 0.0F);
      this.b = 2;
      this.a = this.U.nextLong();
      this.c = this.U.nextInt(3) + 1;
      if(var1.q >= 2 && var1.e(gk.c(var2), gk.c(var4), gk.c(var6), 10)) {
         int var8 = gk.c(var2);
         int var9 = gk.c(var4);
         int var10 = gk.c(var6);
         if(var1.a(var8, var9, var10) == 0 && pb.ar.e(var1, var8, var9, var10)) {
            var1.g(var8, var9, var10, pb.ar.bO);
         }

         for(var8 = 0; var8 < 4; ++var8) {
            var9 = gk.c(var2) + this.U.nextInt(3) - 1;
            var10 = gk.c(var4) + this.U.nextInt(3) - 1;
            int var11 = gk.c(var6) + this.U.nextInt(3) - 1;
            if(var1.a(var9, var10, var11) == 0 && pb.ar.e(var1, var9, var10, var11)) {
               var1.g(var9, var10, var11, pb.ar.bO);
            }
         }
      }

   }

   public void J_() {
      super.J_();
      if(this.b == 2) {
         this.k.a(this.o, this.p, this.q, "ambient.weather.thunder", 10000.0F, 0.8F + this.U.nextFloat() * 0.2F);
         this.k.a(this.o, this.p, this.q, "random.explode", 2.0F, 0.5F + this.U.nextFloat() * 0.2F);
      }

      --this.b;
      if(this.b < 0) {
         if(this.c == 0) {
            this.A();
         } else if(this.b < -this.U.nextInt(10)) {
            --this.c;
            this.b = 1;
            this.a = this.U.nextLong();
            if(this.k.e(gk.c(this.o), gk.c(this.p), gk.c(this.q), 10)) {
               int var1 = gk.c(this.o);
               int var2 = gk.c(this.p);
               int var3 = gk.c(this.q);
               if(this.k.a(var1, var2, var3) == 0 && pb.ar.e(this.k, var1, var2, var3)) {
                  this.k.g(var1, var2, var3, pb.ar.bO);
               }
            }
         }
      }

      if(this.b >= 0) {
         double var6 = 3.0D;
         List var7 = this.k.b((nn)this, wu.b(this.o - var6, this.p - var6, this.q - var6, this.o + var6, this.p + 6.0D + var6, this.q + var6));

         for(int var4 = 0; var4 < var7.size(); ++var4) {
            nn var5 = (nn)var7.get(var4);
            var5.a(this);
         }

         this.k.n = 2;
      }

   }

   protected void b() {}

   protected void a(ady var1) {}

   protected void b(ady var1) {}

   public boolean a(bo var1) {
      return this.b >= 0;
   }
}
