package mojang;

public class Snowball extends av {

   public Snowball(World var1) {
      super(var1);
   }

   public Snowball(World var1, Mob var2) {
      super(var1, var2);
   }

   public Snowball(World var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(pl var1) {
      if(var1.g != null) {
         byte var2 = 0;
         if(var1.g instanceof Blaze) {
            var2 = 3;
         }

         if(var1.g.a(md.a((BaseEntity)this, this.c), var2)) {
            ;
         }
      }

      for(int var3 = 0; var3 < 8; ++var3) {
         this.k.a("snowballpoof", this.o, this.p, this.q, 0.0D, 0.0D, 0.0D);
      }

      if(!this.k.F) {
         this.A();
      }

   }
}
