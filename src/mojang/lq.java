package mojang;

public class lq {

   private zw[] h;
   private on[] i;
   public final float a;
   public final float b;
   public final float c;
   public final float d;
   public final float e;
   public final float f;
   public String g;


   public lq(qp var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.a = var4;
      this.b = var5;
      this.c = var6;
      this.d = var4 + (float)var7;
      this.e = var5 + (float)var8;
      this.f = var6 + (float)var9;
      this.h = new zw[8];
      this.i = new on[6];
      float var11 = var4 + (float)var7;
      float var12 = var5 + (float)var8;
      float var13 = var6 + (float)var9;
      var4 -= var10;
      var5 -= var10;
      var6 -= var10;
      var11 += var10;
      var12 += var10;
      var13 += var10;
      if(var1.i) {
         float var14 = var11;
         var11 = var4;
         var4 = var14;
      }

      zw var23 = new zw(var4, var5, var6, 0.0F, 0.0F);
      zw var15 = new zw(var11, var5, var6, 0.0F, 8.0F);
      zw var16 = new zw(var11, var12, var6, 8.0F, 8.0F);
      zw var17 = new zw(var4, var12, var6, 8.0F, 0.0F);
      zw var18 = new zw(var4, var5, var13, 0.0F, 0.0F);
      zw var19 = new zw(var11, var5, var13, 0.0F, 8.0F);
      zw var20 = new zw(var11, var12, var13, 8.0F, 8.0F);
      zw var21 = new zw(var4, var12, var13, 8.0F, 0.0F);
      this.h[0] = var23;
      this.h[1] = var15;
      this.h[2] = var16;
      this.h[3] = var17;
      this.h[4] = var18;
      this.h[5] = var19;
      this.h[6] = var20;
      this.h[7] = var21;
      this.i[0] = new on(new zw[]{var19, var15, var16, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var9, var3 + var9 + var8, var1.a, var1.b);
      this.i[1] = new on(new zw[]{var23, var18, var21, var17}, var2, var3 + var9, var2 + var9, var3 + var9 + var8, var1.a, var1.b);
      this.i[2] = new on(new zw[]{var19, var18, var23, var15}, var2 + var9, var3, var2 + var9 + var7, var3 + var9, var1.a, var1.b);
      this.i[3] = new on(new zw[]{var16, var17, var21, var20}, var2 + var9 + var7, var3 + var9, var2 + var9 + var7 + var7, var3, var1.a, var1.b);
      this.i[4] = new on(new zw[]{var15, var23, var17, var16}, var2 + var9, var3 + var9, var2 + var9 + var7, var3 + var9 + var8, var1.a, var1.b);
      this.i[5] = new on(new zw[]{var18, var19, var20, var21}, var2 + var9 + var7 + var9, var3 + var9, var2 + var9 + var7 + var9 + var7, var3 + var9 + var8, var1.a, var1.b);
      if(var1.i) {
         for(int var22 = 0; var22 < this.i.length; ++var22) {
            this.i[var22].a();
         }
      }

   }

   public void a(adz var1, float var2) {
      for(int var3 = 0; var3 < this.i.length; ++var3) {
         this.i[var3].a(var1, var2);
      }

   }

   public lq a(String var1) {
      this.g = var1;
      return this;
   }
}
