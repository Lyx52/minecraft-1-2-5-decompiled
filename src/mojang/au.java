package mojang;

public class au extends da {

   private static pb[] c = new pb[]{pb.w, pb.aj, pb.ak, pb.t, pb.Q, pb.ao, pb.H, pb.ai, pb.I, pb.ah, pb.G, pb.aw, pb.ax, pb.aT, pb.bb, pb.N, pb.O, pb.aN, pb.aO, pb.aG, pb.U, pb.T};


   protected au(int var1, uk var2) {
      super(var1, 2, var2, c);
   }

   public boolean a(pb var1) {
      return var1 == pb.ap?this.b.d() == 3:(var1 != pb.ax && var1 != pb.aw?(var1 != pb.ah && var1 != pb.G?(var1 != pb.ai && var1 != pb.H?(var1 != pb.O && var1 != pb.N?(var1 != pb.aN && var1 != pb.aO?(var1.cd == acn.e?true:var1.cd == acn.f):this.b.d() >= 2):this.b.d() >= 1):this.b.d() >= 1):this.b.d() >= 2):this.b.d() >= 2);
   }

   public float a(aan var1, pb var2) {
      return var2 != null && (var2.cd == acn.f || var2.cd == acn.e)?this.a:super.a(var1, var2);
   }

}
