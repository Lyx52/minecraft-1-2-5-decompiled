
public class air {

   public float[] a;
   public float[] b;
   public abn[] c;
   public int d;
   public int e;
   public long f;
   // $FF: synthetic field
   final pn g;


   public air(pn var1, int var2, int var3) {
      this.g = var1;
      this.a = new float[256];
      this.b = new float[256];
      this.c = new abn[256];
      this.d = var2;
      this.e = var3;
      pn.a(var1).a(this.a, var2 << 4, var3 << 4, 16, 16);
      pn.a(var1).b(this.b, var2 << 4, var3 << 4, 16, 16);
      pn.a(var1).a(this.c, var2 << 4, var3 << 4, 16, 16, false);
   }

   public abn a(int var1, int var2) {
      return this.c[var1 & 15 | (var2 & 15) << 4];
   }
}
