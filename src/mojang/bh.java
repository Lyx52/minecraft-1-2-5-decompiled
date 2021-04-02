package mojang;

public class bh extends yr {

   public bh(int var1) {
      super(var1);
      this.f(1);
      this.g(238);
   }

   public boolean a(aan var1, int var2, int var3, int var4, int var5, Mob var6) {
      if(var2 != pb.K.bO && var2 != pb.W.bO && var2 != pb.X.bO && var2 != pb.bu.bO) {
         return super.a(var1, var2, var3, var4, var5, var6);
      } else {
         var1.a(1, var6);
         return true;
      }
   }

   public boolean a(pb var1) {
      return var1.bO == pb.W.bO;
   }

   public float a(aan var1, pb var2) {
      return var2.bO != pb.W.bO && var2.bO != pb.K.bO?(var2.bO == pb.ab.bO?5.0F:super.a(var1, var2)):15.0F;
   }
}
