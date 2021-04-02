package mojang;

public class uq extends av {

   public uq(xd var1) {
      super(var1);
   }

   public uq(xd var1, acq var2) {
      super(var1, var2);
   }

   public uq(xd var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected void a(pl var1) {
      if(var1.g != null) {
         byte var2 = 0;
         if(var1.g instanceof adg) {
            var2 = 3;
         }

         if(var1.g.a(md.a((nn)this, this.c), var2)) {
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
