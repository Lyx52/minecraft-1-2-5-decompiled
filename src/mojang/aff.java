package mojang;

import mojang.net.minecraft.client.Minecraft;

public class aff extends ki {

   private int c;


   public aff(Minecraft var1) {
      super(var1);
      this.b = true;
   }

   public static void d(Player var0) {
      var0.aT.c = true;
      var0.aT.d = true;
      var0.aT.a = true;
   }

   public static void e(Player var0) {
      var0.aT.c = false;
      var0.aT.b = false;
      var0.aT.d = false;
      var0.aT.a = false;
   }

   public void b(Player var1) {
      d(var1);

      for(int var2 = 0; var2 < 9; ++var2) {
         if(var1.ap.a[var2] == null) {
            var1.ap.a[var2] = new aan((pb) CredentialManager.credList.get(var2));
         }
      }

   }

   public static void a(Minecraft var0, ki var1, int var2, int var3, int var4, int var5) {
      if(!var0.f.a((Player)var0.h, var2, var3, var4, var5)) {
         var1.b(var2, var3, var4, var5);
      }

   }

   public boolean a(Player var1, World var2, aan var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.a(var4, var5, var6);
      if(var8 > 0 && pb.m[var8].b(var2, var4, var5, var6, var1)) {
         return true;
      } else if(var3 == null) {
         return false;
      } else {
         int var9 = var3.i();
         int var10 = var3.a;
         boolean var11 = var3.a(var1, var2, var4, var5, var6, var7);
         var3.b(var9);
         var3.a = var10;
         return var11;
      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      a(this.a, this, var1, var2, var3, var4);
      this.c = 5;
   }

   public void c(int var1, int var2, int var3, int var4) {
      --this.c;
      if(this.c <= 0) {
         this.c = 5;
         a(this.a, this, var1, var2, var3, var4);
      }

   }

   public void a() {}

   public boolean d() {
      return false;
   }

   public void a(World var1) {
      super.a(var1);
   }

   public float b() {
      return 5.0F;
   }

   public boolean g() {
      return false;
   }

   public boolean h() {
      return true;
   }

   public boolean i() {
      return true;
   }
}
