package mojang;

import java.util.HashMap;
import java.util.Map;

public class kw {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public xd i;
   public int j;
   public int k;
   public int l;
   protected boolean m;
   public int n = -1;
   public pb o;


   private static void a(Class var0, String var1) {
      if(b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate id: " + var1);
      } else {
         a.put(var1, var0);
         b.put(var0, var1);
      }
   }

   public void a(ady var1) {
      this.j = var1.f("x");
      this.k = var1.f("y");
      this.l = var1.f("z");
   }

   public void b(ady var1) {
      String var2 = (String)b.get(this.getClass());
      if(var2 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         var1.a("id", var2);
         var1.a("x", this.j);
         var1.a("y", this.k);
         var1.a("z", this.l);
      }
   }

   public void n_() {}

   public static kw c(ady var0) {
      kw var1 = null;

      try {
         Class var2 = (Class)a.get(var0.j("id"));
         if(var2 != null) {
            var1 = (kw)var2.newInstance();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      if(var1 != null) {
         var1.a(var0);
      } else {
         System.out.println("Skipping TileEntity with id " + var0.j("id"));
      }

      return var1;
   }

   public int i() {
      if(this.n == -1) {
         this.n = this.i.e(this.j, this.k, this.l);
      }

      return this.n;
   }

   public void j() {
      if(this.i != null) {
         this.n = this.i.e(this.j, this.k, this.l);
         this.i.b(this.j, this.k, this.l, this);
      }

   }

   public double a(double var1, double var3, double var5) {
      double var7 = (double)this.j + 0.5D - var1;
      double var9 = (double)this.k + 0.5D - var3;
      double var11 = (double)this.l + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public pb k() {
      if(this.o == null) {
         this.o = pb.m[this.i.a(this.j, this.k, this.l)];
      }

      return this.o;
   }

   public boolean l() {
      return this.m;
   }

   public void h() {
      this.m = true;
   }

   public void m() {
      this.m = false;
   }

   public void b(int var1, int var2) {}

   public void b() {
      this.o = null;
      this.n = -1;
   }

   static {
      a(ahg.class, "Furnace");
      a(hb.class, "Chest");
      a(dk.class, "RecordPlayer");
      a(az.class, "Trap");
      a(sc.class, "Sign");
      a(cj.class, "MobSpawner");
      a(oh.class, "Music");
      a(ou.class, "Piston");
      a(amc.class, "Cauldron");
      a(uz.class, "EnchantTable");
      a(bw.class, "Airportal");
   }
}
