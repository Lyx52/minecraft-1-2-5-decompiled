
public abstract class agy extends pb {

   protected agy(int var1, acn var2) {
      super(var1, var2);
      this.bU = true;
   }

   protected agy(int var1, int var2, acn var3) {
      super(var1, var2, var3);
      this.bU = true;
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.u_());
   }

   public void b_(xd var1, int var2, int var3, int var4) {
      super.b_(var1, var2, var3, var4);
      var1.q(var2, var3, var4);
   }

   public abstract kw u_();

   public void b(xd var1, int var2, int var3, int var4, int var5, int var6) {
      super.b(var1, var2, var3, var4, var5, var6);
      kw var7 = var1.b(var2, var3, var4);
      if(var7 != null) {
         var7.b(var5, var6);
      }

   }
}
