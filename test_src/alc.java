
public class alc {

   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;


   public alc() {
      this.b = new Object[][]{{pb.x, pb.w, yr.o, yr.n, yr.p}, {yr.r, yr.v, yr.q, yr.z, yr.G}};
   }

   public void a(fr var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            yr var5 = (yr)this.b[var4 + 1][var2];
            var1.a(new aan(var5), new Object[]{this.a[var4], Character.valueOf('#'), yr.D, Character.valueOf('X'), var3});
         }
      }

      var1.a(new aan(yr.k, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), yr.K, Character.valueOf('#'), yr.D});
      var1.a(new aan(yr.l, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), yr.L, Character.valueOf('X'), yr.ap, Character.valueOf('#'), yr.D});
   }
}
