import java.util.ArrayList;
import java.util.Random;

public class sq extends pb {

   private int a = -1;


   public sq(int var1, int var2) {
      super(var1, var2, acn.E);
      this.a(h);
      this.c(0.5F);
   }

   public void e(int var1) {
      this.a = var1;
   }

   public void v() {
      this.a = -1;
   }

   public void b_(xd var1, int var2, int var3, int var4) {
      super.b_(var1, var2, var3, var4);
      int var5 = var1.e(var2, var3, var4);
      int var6 = qs.a[h(var5)];
      var2 += qs.b[var6];
      var3 += qs.c[var6];
      var4 += qs.d[var6];
      int var7 = var1.a(var2, var3, var4);
      if(var7 == pb.Z.bO || var7 == pb.V.bO) {
         var5 = var1.e(var2, var3, var4);
         if(abc.h(var5)) {
            pb.m[var7].a(var1, var2, var3, var4, var5, 0);
            var1.g(var2, var3, var4, 0);
         }
      }

   }

   public int a(int var1, int var2) {
      int var3 = h(var2);
      return var1 == var3?(this.a >= 0?this.a:((var2 & 8) != 0?this.bN - 1:this.bN)):(var1 == qs.a[var3]?107:108);
   }

   public int d() {
      return 17;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean d(xd var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(xd var1, int var2, int var3, int var4, wu var5, ArrayList var6) {
      int var7 = var1.e(var2, var3, var4);
      switch(h(var7)) {
      case 0:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
         super.a(var1, var2, var3, var4, var5, var6);
         break;
      case 1:
         this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
         super.a(var1, var2, var3, var4, var5, var6);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         break;
      case 3:
         this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
         super.a(var1, var2, var3, var4, var5, var6);
         break;
      case 4:
         this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         break;
      case 5:
         this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(ali var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      switch(h(var5)) {
      case 0:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
         break;
      case 1:
         this.a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
         break;
      case 2:
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
         break;
      case 3:
         this.a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
         break;
      case 4:
         this.a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         break;
      case 5:
         this.a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      int var6 = h(var1.e(var2, var3, var4));
      int var7 = var1.a(var2 - qs.b[var6], var3 - qs.c[var6], var4 - qs.d[var6]);
      if(var7 != pb.Z.bO && var7 != pb.V.bO) {
         var1.g(var2, var3, var4, 0);
      } else {
         pb.m[var7].a(var1, var2 - qs.b[var6], var3 - qs.c[var6], var4 - qs.d[var6], var5);
      }

   }

   public static int h(int var0) {
      return var0 & 7;
   }
}
