
public abstract class wp {

   private long b;
   protected wp a;
   private long c;
   private long d;


   public static wp[] a(long var0, vx var2) {
      aey var3 = new aey(1L);
      ako var9 = new ako(2000L, var3);
      uv var10 = new uv(1L, var9);
      wk var11 = new wk(2001L, var10);
      var10 = new uv(2L, var11);
      tr var12 = new tr(2L, var10);
      var11 = new wk(2002L, var12);
      var10 = new uv(3L, var11);
      var11 = new wk(2003L, var10);
      var10 = new uv(4L, var11);
      hi var15 = new hi(5L, var10);
      byte var4 = 4;
      wp var5 = wk.a(1000L, var15, 0);
      ju var13 = new ju(100L, var5);
      var5 = wk.a(1000L, var13, var4 + 2);
      zj var14 = new zj(1L, var5);
      fk var16 = new fk(1000L, var14);
      wp var6 = wk.a(1000L, var15, 0);
      ahy var17 = new ahy(200L, var6, var2);
      var6 = wk.a(1000L, var17, 2);
      Object var18 = new ao(1000L, var6);

      for(int var7 = 0; var7 < var4; ++var7) {
         var18 = new wk((long)(1000 + var7), (wp)var18);
         if(var7 == 0) {
            var18 = new uv(3L, (wp)var18);
         }

         if(var7 == 1) {
            var18 = new aae(1000L, (wp)var18);
         }

         if(var7 == 1) {
            var18 = new ajm(1000L, (wp)var18);
         }
      }

      fk var19 = new fk(1000L, (wp)var18);
      akl var20 = new akl(100L, var19, var16);
      abo var8 = new abo(10L, var20);
      var20.a(var0);
      var8.a(var0);
      return new wp[]{var20, var8, var20};
   }

   public wp(long var1) {
      this.d = var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
      this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
      this.d += var1;
   }

   public void a(long var1) {
      this.b = var1;
      if(this.a != null) {
         this.a.a(var1);
      }

      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += this.d;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += this.d;
      this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
      this.b += this.d;
   }

   public void a(long var1, long var3) {
      this.c = this.b;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var1;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var3;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var1;
      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += var3;
   }

   protected int a(int var1) {
      int var2 = (int)((this.c >> 24) % (long)var1);
      if(var2 < 0) {
         var2 += var1;
      }

      this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
      this.c += this.b;
      return var2;
   }

   public abstract int[] a(int var1, int var2, int var3, int var4);
}
