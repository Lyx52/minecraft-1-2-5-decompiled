package mojang;

import java.util.ArrayList;
import java.util.List;

public final class aan {

   public int a;
   public int b;
   public int c;
   public CompundTag d;
   private int e;


   public aan(pb var1) {
      this(var1, 1);
   }

   public aan(pb var1, int var2) {
      this(var1.bO, var2, 0);
   }

   public aan(pb var1, int var2, int var3) {
      this(var1.bO, var2, var3);
   }

   public aan(yr var1) {
      this(var1.bQ, 1, 0);
   }

   public aan(yr var1, int var2) {
      this(var1.bQ, var2, 0);
   }

   public aan(yr var1, int var2, int var3) {
      this(var1.bQ, var2, var3);
   }

   public aan(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.e = var3;
   }

   public static aan a(CompundTag var0) {
      aan var1 = new aan();
      var1.c(var0);
      return var1.a() != null?var1:null;
   }

   private aan() {
      this.a = 0;
   }

   public aan a(int var1) {
      aan var2 = new aan(this.c, var1, this.e);
      if(this.d != null) {
         var2.d = (CompundTag)this.d.b();
      }

      this.a -= var1;
      return var2;
   }

   public yr a() {
      return yr.e[this.c];
   }

   public int b() {
      return this.a().g(this);
   }

   public boolean a(Player var1, World var2, int var3, int var4, int var5, int var6) {
      boolean var7 = this.a().a(this, var1, var2, var3, var4, var5, var6);
      if(var7) {
         var1.a(gv.E[this.c], 1);
      }

      return var7;
   }

   public float a(pb var1) {
      return this.a().a(this, var1);
   }

   public aan a(World var1, Player var2) {
      return this.a().a(this, var1, var2);
   }

   public aan b(World var1, Player var2) {
      return this.a().b(this, var1, var2);
   }

   public CompundTag b(CompundTag var1) {
      var1.addShort("id", (short)this.c);
      var1.addByte("Count", (byte)this.a);
      var1.addShort("Damage", (short)this.e);
      if(this.d != null) {
         var1.addBaseTag("tag", (BaseTag)this.d);
      }

      return var1;
   }

   public void c(CompundTag var1) {
      this.c = var1.getShort("id");
      this.a = var1.getByte("Count");
      this.e = var1.getShort("Damage");
      if(var1.containsKey("tag")) {
         this.d = var1.getCompundTag("tag");
      }

   }

   public int c() {
      return this.a().f();
   }

   public boolean d() {
      return this.c() > 1 && (!this.e() || !this.g());
   }

   public boolean e() {
      return yr.e[this.c].h() > 0;
   }

   public boolean f() {
      return yr.e[this.c].g();
   }

   public boolean g() {
      return this.e() && this.e > 0;
   }

   public int h() {
      return this.e;
   }

   public int i() {
      return this.e;
   }

   public void b(int var1) {
      this.e = var1;
   }

   public int j() {
      return yr.e[this.c].h();
   }

   public void a(int var1, Mob var2) {
      if(this.e()) {
         if(var1 > 0 && var2 instanceof Player) {
            int var3 = ais.c(((Player)var2).ap);
            if(var3 > 0 && var2.k.r.nextInt(var3 + 1) > 0) {
               return;
            }
         }

         this.e += var1;
         if(this.e > this.j()) {
            var2.c(this);
            if(var2 instanceof Player) {
               ((Player)var2).a(gv.F[this.c], 1);
            }

            --this.a;
            if(this.a < 0) {
               this.a = 0;
            }

            this.e = 0;
         }

      }
   }

   public void a(Mob var1, Player var2) {
      boolean var3 = yr.e[this.c].a(this, var1, (Mob)var2);
      if(var3) {
         var2.a(gv.E[this.c], 1);
      }

   }

   public void a(int var1, int var2, int var3, int var4, Player var5) {
      boolean var6 = yr.e[this.c].a(this, var1, var2, var3, var4, var5);
      if(var6) {
         var5.a(gv.E[this.c], 1);
      }

   }

   public int a(BaseEntity var1) {
      return yr.e[this.c].a(var1);
   }

   public boolean b(pb var1) {
      return yr.e[this.c].a(var1);
   }

   public void a(Player var1) {}

   public void a(Mob var1) {
      yr.e[this.c].a(this, var1);
   }

   public aan k() {
      aan var1 = new aan(this.c, this.a, this.e);
      if(this.d != null) {
         var1.d = (CompundTag)this.d.b();
         if(!var1.d.equals(this.d)) {
            return var1;
         }
      }

      return var1;
   }

   public static boolean a(aan var0, aan var1) {
      return var0 == null && var1 == null?true:(var0 != null && var1 != null?(var0.d == null && var1.d != null?false:var0.d == null || var0.d.equals(var1.d)):false);
   }

   public static boolean b(aan var0, aan var1) {
      return var0 == null && var1 == null?true:(var0 != null && var1 != null?var0.d(var1):false);
   }

   private boolean d(aan var1) {
      return this.a != var1.a?false:(this.c != var1.c?false:(this.e != var1.e?false:(this.d == null && var1.d != null?false:this.d == null || this.d.equals(var1.d))));
   }

   public boolean a(aan var1) {
      return this.c == var1.c && this.e == var1.e;
   }

   public static aan b(aan var0) {
      return var0 == null?null:var0.k();
   }

   public String toString() {
      return this.a + "x" + yr.e[this.c].e() + "@" + this.e;
   }

   public void a(World var1, BaseEntity var2, int var3, boolean var4) {
      if(this.b > 0) {
         --this.b;
      }

      yr.e[this.c].a(this, var1, var2, var3, var4);
   }

   public void a(World var1, Player var2, int var3) {
      var2.a(gv.D[this.c], var3);
      yr.e[this.c].c(this, var1, var2);
   }

   public boolean c(aan var1) {
      return this.c == var1.c && this.a == var1.a && this.e == var1.e;
   }

   public int l() {
      return this.a().b(this);
   }

   public aaq m() {
      return this.a().c(this);
   }

   public void b(World var1, Player var2, int var3) {
      this.a().a(this, var1, var2, var3);
   }

   public boolean n() {
      return this.d != null;
   }

   public CompundTag o() {
      return this.d;
   }

   public ListTag p() {
      return this.d == null?null:(ListTag)this.d.getBaseTag("ench");
   }

   public void d(CompundTag var1) {
      this.d = var1;
   }

   public List q() {
      ArrayList var1 = new ArrayList();
      yr var2 = yr.e[this.c];
      var1.add(var2.d(this));
      var2.a(this, (List)var1);
      if(this.n()) {
         ListTag var3 = this.p();
         if(var3 != null) {
            for(int var4 = 0; var4 < var3.d(); ++var4) {
               short var5 = ((CompundTag)var3.a(var4)).getShort("id");
               short var6 = ((CompundTag)var3.a(var4)).getShort("lvl");
               if(jt.a[var5] != null) {
                  var1.add(jt.a[var5].c(var6));
               }
            }
         }
      }

      return var1;
   }

   public boolean r() {
      return this.a().e(this);
   }

   public fo s() {
      return this.a().f(this);
   }

   public boolean t() {
      return !this.a().j(this)?false:!this.u();
   }

   public void a(jt var1, int var2) {
      if(this.d == null) {
         this.d(new CompundTag());
      }

      if(!this.d.containsKey("ench")) {
         this.d.addBaseTag("ench", (BaseTag)(new ListTag("ench")));
      }

      ListTag var3 = (ListTag)this.d.getBaseTag("ench");
      CompundTag var4 = new CompundTag();
      var4.addShort("id", (short)var1.w);
      var4.addShort("lvl", (short)((byte)var2));
      var3.a((BaseTag)var4);
   }

   public boolean u() {
      return this.d != null && this.d.containsKey("ench");
   }
}
