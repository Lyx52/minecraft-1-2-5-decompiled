package mojang;

import java.util.Random;

public class Utils {

   private static float[] sinTable = new float[65536];


   public static final float sin(float value) {
      return sinTable[(int)(value * 10430.378F) & '\uffff'];
   }

   public static final float cos(float value) {
      return sinTable[(int)(value * 10430.378F + 16384.0F) & '\uffff'];
   }

   public static final float sqrt(float value) {
      return (float)Math.sqrt(value);
   }

   public static final float sqrt(double value) {
      return (float)Math.sqrt(value);
   }

   public static int d(float var0) {
      int var1 = (int)var0;
      return var0 < (float) var1 ? var1 - 1 : var1;
   }

   public static int b(double var0) {
      return (int)(var0 + 1024.0D) - 1024;
   }

   public static int c(double var0) {
      int var2 = (int)var0;
      return var0 < (double)var2?var2 - 1:var2;
   }

   public static long d(double var0) {
      long var2 = (long)var0;
      return var0 < (double)var2?var2 - 1L:var2;
   }

   public static float e(float var0) {
      return var0 >= 0.0F?var0:-var0;
   }

   public static int a(int var0, int var1, int var2) {
      return var0 < var1 ? var1:(Math.min(var0, var2));
   }

   public static float a(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }

   public static double absMax(double var0, double var2) {
      if(var0 < 0.0D) {
         var0 = -var0;
      }

      if(var2 < 0.0D) {
         var2 = -var2;
      }

      return var0 > var2?var0:var2;
   }

   public static int a(int var0, int var1) {
      return var0 < 0?-((-var0 - 1) / var1) - 1:var0 / var1;
   }

   public static boolean isWorldNameValid(String worldName) {
      return worldName == null || worldName.length() == 0;
   }

   public static int randInt(Random randomizer, int var1, int var2) {
      return var1 >= var2 ? var1 : randomizer.nextInt(var2 - var1 + 1) + var1;
   }

   static {
      for(int index = 0; index < 65536; ++index) {
         sinTable[index] = (float)Math.sin((double)index * 3.141592653589793D * 2.0D / 65536.0D);
      }

   }
}
