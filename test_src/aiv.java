import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class aiv implements eu, ua {

   private List a = new ArrayList();
   private Set b = new HashSet();
   private Object c = new Object();
   private final File d;


   public aiv(File var1) {
      this.d = var1;
   }

   public ack a(xd var1, int var2, int var3) {
      ady var4 = null;
      sj var5 = new sj(var2, var3);
      Object var6 = this.c;
      synchronized(this.c) {
         if(this.b.contains(var5)) {
            for(int var7 = 0; var7 < this.a.size(); ++var7) {
               if(((ge)this.a.get(var7)).a.equals(var5)) {
                  var4 = ((ge)this.a.get(var7)).b;
                  break;
               }
            }
         }
      }

      if(var4 == null) {
         DataInputStream var10 = agp.b(this.d, var2, var3);
         if(var10 == null) {
            return null;
         }

         var4 = at.a((DataInput)var10);
      }

      return this.a(var1, var2, var3, var4);
   }

   protected ack a(xd var1, int var2, int var3, ady var4) {
      if(!var4.c("Level")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
         return null;
      } else if(!var4.m("Level").c("Sections")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
         return null;
      } else {
         ack var5 = this.a(var1, var4.m("Level"));
         if(!var5.a(var2, var3)) {
            System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var5.g + ", " + var5.h + ")");
            var4.a("xPos", var2);
            var4.a("zPos", var3);
            var5 = this.a(var1, var4.m("Level"));
         }

         var5.j();
         return var5;
      }
   }

   public void a(xd var1, ack var2) {
      var1.u();

      try {
         ady var3 = new ady();
         ady var4 = new ady();
         var3.a("Level", (gh)var4);
         this.a(var2, var1, var4);
         this.a(var2.l(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   protected void a(sj var1, ady var2) {
      Object var3 = this.c;
      synchronized(this.c) {
         if(this.b.contains(var1)) {
            for(int var4 = 0; var4 < this.a.size(); ++var4) {
               if(((ge)this.a.get(var4)).a.equals(var1)) {
                  this.a.set(var4, new ge(var1, var2));
                  return;
               }
            }
         }

         this.a.add(new ge(var1, var2));
         this.b.add(var1);
         ce.a.a(this);
      }
   }

   public boolean a() {
      ge var1 = null;
      Object var2 = this.c;
      synchronized(this.c) {
         if(this.a.size() <= 0) {
            return false;
         }

         var1 = (ge)this.a.remove(0);
         this.b.remove(var1.a);
      }

      if(var1 != null) {
         try {
            this.a(var1);
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

      return true;
   }

   private void a(ge var1) {
      DataOutputStream var2 = agp.c(this.d, var1.a.a, var1.a.b);
      at.a(var1.b, (DataOutput)var2);
      var2.close();
   }

   public void b(xd var1, ack var2) {}

   public void b() {}

   public void c() {}

   private void a(ack var1, xd var2, ady var3) {
      var2.u();
      var3.a("xPos", var1.g);
      var3.a("zPos", var1.h);
      var3.a("LastUpdate", var2.w());
      var3.a("HeightMap", var1.f);
      var3.a("TerrainPopulated", var1.k);
      zg[] var4 = var1.i();
      no var5 = new no("Sections");
      zg[] var6 = var4;
      int var7 = var4.length;

      ady var10;
      for(int var8 = 0; var8 < var7; ++var8) {
         zg var9 = var6[var8];
         if(var9 != null && var9.f() != 0) {
            var10 = new ady();
            var10.a("Y", (byte)(var9.c() >> 4 & 255));
            var10.a("Blocks", var9.g());
            if(var9.i() != null) {
               var10.a("Add", var9.i().a);
            }

            var10.a("Data", var9.j().a);
            var10.a("SkyLight", var9.l().a);
            var10.a("BlockLight", var9.k().a);
            var5.a((gh)var10);
         }
      }

      var3.a("Sections", (gh)var5);
      var3.a("Biomes", var1.m());
      var1.m = false;
      no var15 = new no();

      Iterator var17;
      for(var7 = 0; var7 < var1.j.length; ++var7) {
         var17 = var1.j[var7].iterator();

         while(var17.hasNext()) {
            nn var19 = (nn)var17.next();
            var1.m = true;
            var10 = new ady();
            if(var19.c(var10)) {
               var15.a((gh)var10);
            }
         }
      }

      var3.a("Entities", (gh)var15);
      no var16 = new no();
      var17 = var1.i.values().iterator();

      while(var17.hasNext()) {
         kw var20 = (kw)var17.next();
         var10 = new ady();
         var20.b(var10);
         var16.a((gh)var10);
      }

      var3.a("TileEntities", (gh)var16);
      List var18 = var2.a(var1, false);
      if(var18 != null) {
         long var21 = var2.w();
         no var11 = new no();
         Iterator var12 = var18.iterator();

         while(var12.hasNext()) {
            ml var13 = (ml)var12.next();
            ady var14 = new ady();
            var14.a("i", var13.d);
            var14.a("x", var13.a);
            var14.a("y", var13.b);
            var14.a("z", var13.c);
            var14.a("t", (int)(var13.e - var21));
            var11.a((gh)var14);
         }

         var3.a("TileTicks", (gh)var11);
      }

   }

   private ack a(xd var1, ady var2) {
      int var3 = var2.f("xPos");
      int var4 = var2.f("zPos");
      ack var5 = new ack(var1, var3, var4);
      var5.f = var2.l("HeightMap");
      var5.k = var2.o("TerrainPopulated");
      no var6 = var2.n("Sections");
      byte var7 = 16;
      zg[] var8 = new zg[var7];

      for(int var9 = 0; var9 < var6.d(); ++var9) {
         ady var10 = (ady)var6.a(var9);
         byte var11 = var10.d("Y");
         zg var12 = new zg(var11 << 4);
         var12.a(var10.k("Blocks"));
         if(var10.c("Add")) {
            var12.a(new qq(var10.k("Add"), 4));
         }

         var12.b(new qq(var10.k("Data"), 4));
         var12.d(new qq(var10.k("SkyLight"), 4));
         var12.c(new qq(var10.k("BlockLight"), 4));
         var12.d();
         var8[var11] = var12;
      }

      var5.a(var8);
      if(var2.c("Biomes")) {
         var5.a(var2.k("Biomes"));
      }

      no var14 = var2.n("Entities");
      if(var14 != null) {
         for(int var15 = 0; var15 < var14.d(); ++var15) {
            ady var17 = (ady)var14.a(var15);
            nn var19 = aao.a(var17, var1);
            var5.m = true;
            if(var19 != null) {
               var5.a(var19);
            }
         }
      }

      no var16 = var2.n("TileEntities");
      if(var16 != null) {
         for(int var18 = 0; var18 < var16.d(); ++var18) {
            ady var21 = (ady)var16.a(var18);
            kw var13 = kw.c(var21);
            if(var13 != null) {
               var5.a(var13);
            }
         }
      }

      if(var2.c("TileTicks")) {
         no var20 = var2.n("TileTicks");
         if(var20 != null) {
            for(int var22 = 0; var22 < var20.d(); ++var22) {
               ady var23 = (ady)var20.a(var22);
               var1.e(var23.f("x"), var23.f("y"), var23.f("z"), var23.f("i"), var23.f("t"));
            }
         }
      }

      return var5;
   }
}
