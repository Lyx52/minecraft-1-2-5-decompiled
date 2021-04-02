package mojang;

public class oj {

   public static acj a(CompundTag var0) {
      int var1 = var0.getInt("xPos");
      int var2 = var0.getInt("zPos");
      acj var3 = new acj(var1, var2);
      var3.g = var0.getByteArray("Blocks");
      var3.f = new pd(var0.getByteArray("Data"), 7);
      var3.e = new pd(var0.getByteArray("SkyLight"), 7);
      var3.d = new pd(var0.getByteArray("BlockLight"), 7);
      var3.c = var0.getByteArray("HeightMap");
      var3.b = var0.getBoolean("TerrainPopulated");
      var3.h = var0.getListTag("Entities");
      var3.i = var0.getListTag("TileEntities");
      var3.j = var0.getListTag("TileTicks");

      try {
         var3.a = var0.getLong("LastUpdate");
      } catch (ClassCastException var5) {
         var3.a = (long)var0.getInt("LastUpdate");
      }

      return var3;
   }

   public static void a(acj var0, CompundTag var1, rs var2) {
      var1.addInt("xPos", var0.k);
      var1.addInt("zPos", var0.l);
      var1.addLong("LastUpdate", var0.a);
      int[] var3 = new int[var0.c.length];

      for(int var4 = 0; var4 < var0.c.length; ++var4) {
         var3[var4] = var0.c[var4];
      }

      var1.addIntArray("HeightMap", var3);
      var1.addBoolean("TerrainPopulated", var0.b);
      ListTag var16 = new ListTag("Sections");

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

            CompundTag var24 = new CompundTag();
            var24.addByte("Y", (byte)(var5 & 255));
            var24.addByteArray("Blocks", var19);
            var24.addByteArray("Data", var20.a);
            var24.addByteArray("SkyLight", var21.a);
            var24.addByteArray("BlockLight", var22.a);
            var16.a((BaseTag)var24);
         }
      }

      var1.addBaseTag("Sections", (BaseTag)var16);
      byte[] var17 = new byte[256];

      for(int var18 = 0; var18 < 16; ++var18) {
         for(var7 = 0; var7 < 16; ++var7) {
            var17[var7 << 4 | var18] = (byte)(var2.a(var0.k << 4 | var18, var0.l << 4 | var7).M & 255);
         }
      }

      var1.addByteArray("Biomes", var17);
      var1.addBaseTag("Entities", (BaseTag)var0.h);
      var1.addBaseTag("TileEntities", (BaseTag)var0.i);
      if(var0.j != null) {
         var1.addBaseTag("TileTicks", (BaseTag)var0.j);
      }

   }
}
