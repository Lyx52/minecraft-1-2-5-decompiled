
public class oj {

   public static acj a(ady var0) {
      int var1 = var0.f("xPos");
      int var2 = var0.f("zPos");
      acj var3 = new acj(var1, var2);
      var3.g = var0.k("Blocks");
      var3.f = new pd(var0.k("Data"), 7);
      var3.e = new pd(var0.k("SkyLight"), 7);
      var3.d = new pd(var0.k("BlockLight"), 7);
      var3.c = var0.k("HeightMap");
      var3.b = var0.o("TerrainPopulated");
      var3.h = var0.n("Entities");
      var3.i = var0.n("TileEntities");
      var3.j = var0.n("TileTicks");

      try {
         var3.a = var0.g("LastUpdate");
      } catch (ClassCastException var5) {
         var3.a = (long)var0.f("LastUpdate");
      }

      return var3;
   }

   public static void a(acj var0, ady var1, rs var2) {
      var1.a("xPos", var0.k);
      var1.a("zPos", var0.l);
      var1.a("LastUpdate", var0.a);
      int[] var3 = new int[var0.c.length];

      for(int var4 = 0; var4 < var0.c.length; ++var4) {
         var3[var4] = var0.c[var4];
      }

      var1.a("HeightMap", var3);
      var1.a("TerrainPopulated", var0.b);
      no var16 = new no("Sections");

      int var7;
      for(int var5 = 0; var5 < 8; ++var5) {
         boolean var6 = true;

         for(var7 = 0; var7 < 16 && var6; ++var7) {
            int var8 = 0;

            while(var8 < 16 && var6) {
               int var9 = 0;

               while(true) {
                  if(var9 < 16) {
                     int var10 = var7 << 11 | var9 << 7 | var8 + (var5 << 4);
                     byte var11 = var0.g[var10];
                     if(var11 == 0) {
                        ++var9;
                        continue;
                     }

                     var6 = false;
                  }

                  ++var8;
                  break;
               }
            }
         }

         if(!var6) {
            byte[] var19 = new byte[4096];
            qq var20 = new qq(var19.length, 4);
            qq var21 = new qq(var19.length, 4);
            qq var22 = new qq(var19.length, 4);

            for(int var23 = 0; var23 < 16; ++var23) {
               for(int var12 = 0; var12 < 16; ++var12) {
                  for(int var13 = 0; var13 < 16; ++var13) {
                     int var14 = var23 << 11 | var13 << 7 | var12 + (var5 << 4);
                     byte var15 = var0.g[var14];
                     var19[var12 << 8 | var13 << 4 | var23] = (byte)(var15 & 255);
                     var20.a(var23, var12, var13, var0.f.a(var23, var12 + (var5 << 4), var13));
                     var21.a(var23, var12, var13, var0.e.a(var23, var12 + (var5 << 4), var13));
                     var22.a(var23, var12, var13, var0.d.a(var23, var12 + (var5 << 4), var13));
                  }
               }
            }

            ady var24 = new ady();
            var24.a("Y", (byte)(var5 & 255));
            var24.a("Blocks", var19);
            var24.a("Data", var20.a);
            var24.a("SkyLight", var21.a);
            var24.a("BlockLight", var22.a);
            var16.a((gh)var24);
         }
      }

      var1.a("Sections", (gh)var16);
      byte[] var17 = new byte[256];

      for(int var18 = 0; var18 < 16; ++var18) {
         for(var7 = 0; var7 < 16; ++var7) {
            var17[var7 << 4 | var18] = (byte)(var2.a(var0.k << 4 | var18, var0.l << 4 | var7).M & 255);
         }
      }

      var1.a("Biomes", var17);
      var1.a("Entities", (gh)var0.h);
      var1.a("TileEntities", (gh)var0.i);
      if(var0.j != null) {
         var1.a("TileTicks", (gh)var0.j);
      }

   }
}
