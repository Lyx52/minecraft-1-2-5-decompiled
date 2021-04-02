package mojang;

public class ThrownEnderpearl extends av {

   public ThrownEnderpearl(World var1) {
      super(var1);
   }

   public ThrownEnderpearl(World var1, Mob var2) {
      super(var1, var2);
   }

   public ThrownEnderpearl(World var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(pl var1) {
      if(var1.g != null && var1.g.a(md.a((BaseEntity)this, this.c), 0)) {
         ;
      }

      for(int var2 = 0; var2 < 32; ++var2) {
         this.k.a("portal", this.o, this.p + this.U.nextDouble() * 2.0D, this.q, this.U.nextGaussian(), 0.0D, this.U.nextGaussian());
      }

      if(!this.k.F) {
         if(this.c != null) {
            this.c.j(this.o, this.p, this.q);
            this.c.fallDistance = 0.0F;
            this.c.a(md.i, 5);
         }

         this.A();
      }

   }
}
