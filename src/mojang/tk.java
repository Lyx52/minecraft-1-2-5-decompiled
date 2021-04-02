package mojang;

public class tk {

   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;


   public tk() {
      this.b = new Object[][]{{yr.aF, pb.ar, yr.o, yr.n, yr.p}, {yr.V, yr.Z, yr.ad, yr.ah, yr.al}, {yr.W, yr.aa, yr.ae, yr.ai, yr.am}, {yr.X, yr.ab, yr.af, yr.aj, yr.an}, {yr.Y, yr.ac, yr.ag, yr.ak, yr.ao}};
   }

   public void a(fr var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            yr var5 = (yr)this.b[var4 + 1][var2];
            var1.a(new aan(var5), new Object[]{this.a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
