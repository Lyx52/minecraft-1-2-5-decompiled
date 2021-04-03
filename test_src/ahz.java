
public class ahz {

   private Object[][] a;


   public ahz() {
      this.a = new Object[][]{{pb.ah, new aan(yr.p, 9)}, {pb.ai, new aan(yr.o, 9)}, {pb.ax, new aan(yr.n, 9)}, {pb.O, new aan(yr.aW, 9, 4)}};
   }

   public void a(fr var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         pb var3 = (pb)this.a[var2][0];
         aan var4 = (aan)this.a[var2][1];
         var1.a(new aan(var3), new Object[]{"###", "###", "###", Character.valueOf('#'), var4});
         var1.a(var4, new Object[]{"#", Character.valueOf('#'), var3});
      }

      var1.a(new aan(yr.p), new Object[]{"###", "###", "###", Character.valueOf('#'), yr.bq});
      var1.a(new aan(yr.bq, 9), new Object[]{"#", Character.valueOf('#'), yr.p});
   }
}
