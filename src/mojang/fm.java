package mojang;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class fm extends rs {

   private abn a;
   private float b;
   private float c;


   public fm(abn var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public abn a(int var1, int var2) {
      return this.a;
   }

   public abn[] a(abn[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new abn[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.a);
      return var1;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.b);
      return var1;
   }

   public float[] b(float[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.c);
      return var1;
   }

   public abn[] b(abn[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new abn[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.a);
      return var1;
   }

   public abn[] a(abn[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.b(var1, var2, var3, var4, var5);
   }

   public qo a(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.a)?new qo(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)):null;
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      return var4.contains(this.a);
   }
}
