import net.minecraft.client.Minecraft;

public abstract class ki {

   protected final Minecraft a;
   public boolean b = false;


   public ki(Minecraft var1) {
      this.a = var1;
   }

   public void a(xd var1) {}

   public abstract void a(int var1, int var2, int var3, int var4);

   public boolean b(int var1, int var2, int var3, int var4) {
      xd var5 = this.a.f;
      pb var6 = pb.m[var5.a(var1, var2, var3)];
      if(var6 == null) {
         return false;
      } else {
         var5.g(2001, var1, var2, var3, var6.bO + (var5.e(var1, var2, var3) << 12));
         int var7 = var5.e(var1, var2, var3);
         boolean var8 = var5.g(var1, var2, var3, 0);
         if(var8) {
            var6.b(var5, var1, var2, var3, var7);
         }

         return var8;
      }
   }

   public abstract void c(int var1, int var2, int var3, int var4);

   public abstract void a();

   public void a(float var1) {}

   public abstract float b();

   public boolean a(yw var1, xd var2, aan var3) {
      int var4 = var3.a;
      aan var5 = var3.a(var2, var1);
      if(var5 == var3 && (var5 == null || var5.a == var4)) {
         return false;
      } else {
         var1.ap.a[var1.ap.c] = var5;
         if(var5.a == 0) {
            var1.ap.a[var1.ap.c] = null;
         }

         return true;
      }
   }

   public void a(yw var1) {}

   public void c() {}

   public abstract boolean d();

   public void b(yw var1) {
      aff.e(var1);
   }

   public abstract boolean a(yw var1, xd var2, aan var3, int var4, int var5, int var6, int var7);

   public yw b(xd var1) {
      return new vq(this.a, var1, this.a.k, var1.t.g);
   }

   public void a(yw var1, nn var2) {
      var1.j(var2);
   }

   public void b(yw var1, nn var2) {
      var1.k(var2);
   }

   public aan a(int var1, int var2, int var3, boolean var4, yw var5) {
      return var5.ar.a(var2, var3, var4, var5);
   }

   public void a(int var1, yw var2) {
      var2.ar.a(var2);
      var2.ar = var2.aq;
   }

   public void a(int var1, int var2) {}

   public boolean e() {
      return false;
   }

   public void c(yw var1) {
      var1.am();
   }

   public boolean f() {
      return false;
   }

   public boolean g() {
      return true;
   }

   public boolean h() {
      return false;
   }

   public boolean i() {
      return false;
   }

   public void a(aan var1, int var2) {}

   public void a(aan var1) {}
}
