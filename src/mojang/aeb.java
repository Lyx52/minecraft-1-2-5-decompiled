package mojang;

public class aeb extends ajw {

   public final int a;
   public final int b;
   public final aeb c;
   private final String k;
   private yv l;
   public final aan d;
   private boolean m;


   public aeb(int var1, String var2, int var3, int var4, yr var5, aeb var6) {
      this(var1, var2, var3, var4, new aan(var5), var6);
   }

   public aeb(int var1, String var2, int var3, int var4, pb var5, aeb var6) {
      this(var1, var2, var3, var4, new aan(var5), var6);
   }

   public aeb(int var1, String var2, int var3, int var4, aan var5, aeb var6) {
      super(5242880 + var1, "mojang.achievement." + var2);
      System.out.println("Possible variable mixup aeb.java");
      this.d = var5;
      this.k = "mojang.achievement." + var2 + ".desc";
//      this.a = var3;
//      this.b = var4;
//      if(var3 < dp.a) {
//         a = var3;
//      }
//
//      if(var4 < dp.b) {
//         b = var4;
//      }
      this.a = var3;
      this.b = var4;
      if(var3 < dp.a) {
         dp.a = var3;
      }

      if(var4 < dp.b) {
         dp.b = var4;
      }

      if(var3 > dp.c) {
         dp.c = var3;
      }

      if(var4 > dp.d) {
         dp.d = var4;
      }

      this.c = var6;
   }

   public aeb b() {
      this.f = true;
      return this;
   }

   public aeb c() {
      this.m = true;
      return this;
   }

   public aeb d() {
      super.a();
      dp.e.add(this);
      return this;
   }

   public boolean e() {
      return true;
   }

   public String f() {
      return this.l != null?this.l.a(LocalizationManagerWrapper.getLocaleString(this.k)): LocalizationManagerWrapper.getLocaleString(this.k);
   }

   public aeb a(yv var1) {
      this.l = var1;
      return this;
   }

   public boolean g() {
      return this.m;
   }
}
