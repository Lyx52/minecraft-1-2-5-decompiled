
public class hf extends av {

   public hf(xd var1) {
      super(var1);
   }

   public hf(xd var1, acq var2) {
      super(var1, var2);
   }

   public hf(xd var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected float e() {
      return 0.07F;
   }

   protected float c() {
      return 0.7F;
   }

   protected float d() {
      return -20.0F;
   }

   protected void a(pl var1) {
      if(!this.k.F) {
         this.k.g(2002, (int)Math.round(this.o), (int)Math.round(this.p), (int)Math.round(this.q), 0);
         int var2 = 3 + this.k.r.nextInt(5) + this.k.r.nextInt(5);

         while(var2 > 0) {
            int var3 = bz.b(var2);
            var2 -= var3;
            this.k.a((nn)(new bz(this.k, this.o, this.p, this.q, var3)));
         }

         this.A();
      }

   }
}
