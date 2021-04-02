package mojang;

public class ada extends yg {

   protected li L;


   public ada(abn var1) {
      super(var1);
      this.L = new aeh(pb.bJ.bO);
   }

   protected void a() {
      this.b();
      if(this.b.nextInt(5) == 0) {
         int var1 = this.c + this.b.nextInt(16) + 8;
         int var2 = this.d + this.b.nextInt(16) + 8;
         int var3 = this.a.g(var1, var2);
         if(var3 > 0) {
            ;
         }

         this.L.a(this.a, this.b, var1, var3, var2);
      }

      if(this.c == 0 && this.d == 0) {
         EnderDragon var4 = new EnderDragon(this.a);
         var4.c(0.0D, 128.0D, 0.0D, this.b.nextFloat() * 360.0F, 0.0F);
         this.a.a((BaseEntity)var4);
      }

   }
}
