
public class akd extends da {

   private static pb[] c = new pb[]{pb.u, pb.v, pb.E, pb.F, pb.aS, pb.aU, pb.aW, pb.aA, pb.bc, pb.by};


   public akd(int var1, uk var2) {
      super(var1, 1, var2, c);
   }

   public boolean a(pb var1) {
      return var1 == pb.aS?true:var1 == pb.aU;
   }

}
