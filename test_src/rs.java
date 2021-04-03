import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rs {

   private wp a;
   private wp b;
   private pn c;
   private List d;


   protected rs() {
      this.c = new pn(this);
      this.d = new ArrayList();
      this.d.add(abn.f);
      this.d.add(abn.c);
      this.d.add(abn.g);
      this.d.add(abn.u);
      this.d.add(abn.t);
      this.d.add(abn.w);
      this.d.add(abn.x);
   }

   public rs(long var1, vx var3) {
      this();
      wp[] var4 = wp.a(var1, var3);
      this.a = var4[0];
      this.b = var4[1];
   }

   public rs(xd var1) {
      this(var1.v(), var1.B().t());
   }

   public List a() {
      return this.d;
   }

   public abn a(int var1, int var2) {
      return this.c.b(var1, var2);
   }

   public float[] b(float[] var1, int var2, int var3, int var4, int var5) {
      ad.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.b.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)abn.a[var6[var7]].g() / 65536.0F;
         if(var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public float a(float var1, int var2) {
      return var1;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      ad.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      int[] var6 = this.b.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         float var8 = (float)abn.a[var6[var7]].h() / 65536.0F;
         if(var8 > 1.0F) {
            var8 = 1.0F;
         }

         var1[var7] = var8;
      }

      return var1;
   }

   public abn[] a(abn[] var1, int var2, int var3, int var4, int var5) {
      ad.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new abn[var4 * var5];
      }

      int[] var6 = this.a.a(var2, var3, var4, var5);

      for(int var7 = 0; var7 < var4 * var5; ++var7) {
         var1[var7] = abn.a[var6[var7]];
      }

      return var1;
   }

   public abn[] b(abn[] var1, int var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, var5, true);
   }

   public abn[] a(abn[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      ad.a();
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new abn[var4 * var5];
      }

      if(var6 && var4 == 16 && var5 == 16 && (var2 & 15) == 0 && (var3 & 15) == 0) {
         abn[] var9 = this.c.c(var2, var3);
         System.arraycopy(var9, 0, var1, 0, var4 * var5);
         return var1;
      } else {
         int[] var7 = this.b.a(var2, var3, var4, var5);

         for(int var8 = 0; var8 < var4 * var5; ++var8) {
            var1[var8] = abn.a[var7[var8]];
         }

         return var1;
      }
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      int var5 = var1 - var3 >> 2;
      int var6 = var2 - var3 >> 2;
      int var7 = var1 + var3 >> 2;
      int var8 = var2 + var3 >> 2;
      int var9 = var7 - var5 + 1;
      int var10 = var8 - var6 + 1;
      int[] var11 = this.a.a(var5, var6, var9, var10);

      for(int var12 = 0; var12 < var9 * var10; ++var12) {
         abn var13 = abn.a[var11[var12]];
         if(!var4.contains(var13)) {
            return false;
         }
      }

      return true;
   }

   public qo a(int var1, int var2, int var3, List var4, Random var5) {
      int var6 = var1 - var3 >> 2;
      int var7 = var2 - var3 >> 2;
      int var8 = var1 + var3 >> 2;
      int var9 = var2 + var3 >> 2;
      int var10 = var8 - var6 + 1;
      int var11 = var9 - var7 + 1;
      int[] var12 = this.a.a(var6, var7, var10, var11);
      qo var13 = null;
      int var14 = 0;

      for(int var15 = 0; var15 < var12.length; ++var15) {
         int var16 = var6 + var15 % var10 << 2;
         int var17 = var7 + var15 / var10 << 2;
         abn var18 = abn.a[var12[var15]];
         if(var4.contains(var18) && (var13 == null || var5.nextInt(var14 + 1) == 0)) {
            var13 = new qo(var16, 0, var17);
            ++var14;
         }
      }

      return var13;
   }

   public void b() {
      this.c.a();
   }
}
