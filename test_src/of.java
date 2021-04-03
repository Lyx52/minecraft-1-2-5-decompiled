
public class of extends un {

   public of(xd var1) {
      super(var1);
      this.bm = "/mob/redcow.png";
      this.a(0.9F, 1.3F);
   }

   public boolean c(yw var1) {
      aan var2 = var1.ap.b();
      if(var2 != null && var2.c == yr.E.bQ && this.av() >= 0) {
         if(var2.a == 1) {
            var1.ap.a(var1.ap.c, new aan(yr.F));
            return true;
         }

         if(var1.ap.a(new aan(yr.F)) && !var1.aT.d) {
            var1.ap.a(var1.ap.c, 1);
            return true;
         }
      }

      if(var2 != null && var2.c == yr.be.bQ && this.av() >= 0) {
         this.A();
         this.k.a("largeexplode", this.o, this.p + (double)(this.J / 2.0F), this.q, 0.0D, 0.0D, 0.0D);
         if(!this.k.F) {
            un var3 = new un(this.k);
            var3.c(this.o, this.p, this.q, this.u, this.v);
            var3.l(this.bb());
            var3.bd = this.bd;
            this.k.a((nn)var3);

            for(int var4 = 0; var4 < 5; ++var4) {
               this.k.a((nn)(new fq(this.k, this.o, this.p + (double)this.J, this.q, new aan(pb.ag))));
            }
         }

         return true;
      } else {
         return super.c(var1);
      }
   }

   public bc a(bc var1) {
      return new of(this.k);
   }
}
