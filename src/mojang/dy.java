package mojang;

import java.util.HashMap;
import java.util.Map;

public class dy {

   private static final dy a = new dy();
   private Map b = new HashMap();


   public static final dy a() {
      return a;
   }

   private dy() {
      this.a(pb.H.bO, new aan(yr.o));
      this.a(pb.G.bO, new aan(yr.p));
      this.a(pb.aw.bO, new aan(yr.n));
      this.a(pb.E.bO, new aan(pb.M));
      this.a(yr.aq.bQ, new aan(yr.ar));
      this.a(yr.bi.bQ, new aan(yr.bj));
      this.a(yr.bk.bQ, new aan(yr.bl));
      this.a(yr.aU.bQ, new aan(yr.aV));
      this.a(pb.w.bO, new aan(pb.t));
      this.a(yr.aI.bQ, new aan(yr.aH));
      this.a(pb.aV.bO, new aan(yr.aW, 1, 2));
      this.a(pb.J.bO, new aan(yr.m, 1, 1));
      this.a(pb.I.bO, new aan(yr.m));
      this.a(pb.aN.bO, new aan(yr.aC));
      this.a(pb.N.bO, new aan(yr.aW, 1, 4));
   }

   public void a(int var1, aan var2) {
      this.b.put(Integer.valueOf(var1), var2);
   }

   public aan a(int var1) {
      return (aan)this.b.get(Integer.valueOf(var1));
   }

   public Map b() {
      return this.b;
   }

}
