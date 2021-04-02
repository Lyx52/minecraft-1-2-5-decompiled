package mojang;

public class qe extends av {

   public qe(World var1) {
      super(var1);
   }

   public qe(World var1, Mob var2) {
      super(var1, var2);
   }

   public qe(World var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(pl var1) {
      if(var1.g != null && var1.g.a(md.a((BaseEntity)this, this.c), 0)) {
         ;
      }

      if(!this.k.F && this.U.nextInt(8) == 0) {
         byte var2 = 1;
         if(this.U.nextInt(32) == 0) {
            var2 = 4;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            Chicken var4 = new Chicken(this.k);
            var4.d(-24000);
            var4.c(this.o, this.p, this.q, this.u, 0.0F);
            this.k.a((BaseEntity)var4);
         }
      }

      for(int var5 = 0; var5 < 8; ++var5) {
         this.k.a("snowballpoof", this.o, this.p, this.q, 0.0D, 0.0D, 0.0D);
      }

      if(!this.k.F) {
         this.A();
      }

   }
}
