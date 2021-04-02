package mojang;

public class pj implements Comparable {

   private final String a;
   private final String b;
   private final long c;
   private final long d;
   private final boolean e;
   private final int f;
   private final boolean g;


   public pj(String var1, String var2, long var3, long var5, int var7, boolean var8, boolean var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
      this.f = var7;
      this.e = var8;
      this.g = var9;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public boolean c() {
      return this.e;
   }

   public long d() {
      return this.c;
   }

   public int compareTo(Object var1) {
      return this.c < ((pj)var1).c?1:(this.c > ((pj)var1).c?-1:this.a.compareTo(((pj)var1).a));
   }

   public int e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }
}
