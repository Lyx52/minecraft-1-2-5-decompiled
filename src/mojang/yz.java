package mojang;

public class yz {

   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;


   public yz() {
      this.b = new Object[][]{{pb.x, pb.w, yr.o, yr.n, yr.p}, {yr.t, yr.x, yr.g, yr.B, yr.I}, {yr.s, yr.w, yr.f, yr.A, yr.H}, {yr.u, yr.y, yr.h, yr.C, yr.J}, {yr.N, yr.O, yr.P, yr.Q, yr.R}};
   }

   public void a(fr var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            yr var5 = (yr)this.b[var4 + 1][var2];
            var1.a(new aan(var5), new Object[]{this.a[var4], Character.valueOf('#'), yr.D, Character.valueOf('X'), var3});
         }
      }

      var1.a(new aan(yr.be), new Object[]{" #", "# ", Character.valueOf('#'), yr.o});
   }
}
