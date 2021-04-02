package mojang;

public class oh extends kw {

   public byte a = 0;
   public boolean b = false;


   public void b(CompundTag var1) {
      super.b(var1);
      var1.addByte("note", this.a);
   }

   public void a(CompundTag var1) {
      super.a(var1);
      this.a = var1.getByte("note");
      if(this.a < 0) {
         this.a = 0;
      }

      if(this.a > 24) {
         this.a = 24;
      }

   }

   public void a() {
      this.a = (byte)((this.a + 1) % 25);
      this.j();
   }

   public void a(World var1, int var2, int var3, int var4) {
      if(var1.f(var2, var3 + 1, var4) == acn.a) {
         acn var5 = var1.f(var2, var3 - 1, var4);
         byte var6 = 0;
         if(var5 == acn.e) {
            var6 = 1;
         }

         if(var5 == acn.o) {
            var6 = 2;
         }

         if(var5 == acn.q) {
            var6 = 3;
         }

         if(var5 == acn.d) {
            var6 = 4;
         }

         var1.f(var2, var3, var4, var6, this.a);
      }
   }
}
