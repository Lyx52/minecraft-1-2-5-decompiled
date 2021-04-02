package mojang;

public class qb extends bt {

   public qb(xd var1) {
      super(var1);
      this.a(0.3125F, 0.3125F);
   }

   public qb(xd var1, acq var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.a(0.3125F, 0.3125F);
   }

   public qb(xd var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.a(0.3125F, 0.3125F);
   }

   protected void a(pl var1) {
      if(!this.k.F) {
         if(var1.g != null) {
            if(!var1.g.F() && var1.g.a(md.a((bt)this, this.a), 5)) {
               var1.g.e(5);
            }
         } else {
            int var2 = var1.b;
            int var3 = var1.c;
            int var4 = var1.d;
            switch(var1.e) {
            case 0:
               --var3;
               break;
            case 1:
               ++var3;
               break;
            case 2:
               --var4;
               break;
            case 3:
               ++var4;
               break;
            case 4:
               --var2;
               break;
            case 5:
               ++var2;
            }

            if(this.k.i(var2, var3, var4)) {
               this.k.g(var2, var3, var4, pb.ar.bO);
            }
         }

         this.A();
      }

   }

   public boolean l_() {
      return false;
   }

   public boolean a(md var1, int var2) {
      return false;
   }
}
