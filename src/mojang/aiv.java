package mojang;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class aiv implements ChunkInterface, ua {

   private List a = new ArrayList();
   private Set b = new HashSet();
   private Object c = new Object();
   private final File d;


   public aiv(File var1) {
      this.d = var1;
   }

   public ack a(World var1, int var2, int var3) throws IOException {
      CompundTag var4 = null;
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

   protected ack a(World var1, int var2, int var3, CompundTag var4) {
      if(!var4.containsKey("Level")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
         return null;
      } else if(!var4.getCompundTag("Level").containsKey("Sections")) {
         System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
         return null;
      } else {
         ack var5 = this.a(var1, var4.getCompundTag("Level"));
         if(!var5.a(var2, var3)) {
            System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var5.g + ", " + var5.h + ")");
            var4.addInt("xPos", var2);
            var4.addInt("zPos", var3);
            var5 = this.a(var1, var4.getCompundTag("Level"));
         }

         var5.j();
         return var5;
      }
   }

   public void a(World var1, ack var2) {
      var1.u();

      try {
         CompundTag var3 = new CompundTag();
         CompundTag var4 = new CompundTag();
         var3.addBaseTag("Level", (BaseTag)var4);
         this.a(var2, var1, var4);
         this.a(var2.l(), var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   protected void a(sj var1, CompundTag var2) {
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

   private void a(ge var1) throws IOException {
      DataOutputStream var2 = agp.c(this.d, var1.a.a, var1.a.b);
      at.a(var1.b, (DataOutput)var2);
      var2.close();
   }

   public void b(World var1, ack var2) {}

   public void b() {}

   public void c() {}

   private void a(ack var1, World world, CompundTag var3) {
      world.u();
      var3.addInt("xPos", var1.g);
      var3.addInt("zPos", var1.h);
      var3.addLong("LastUpdate", world.w());
      var3.addIntArray("HeightMap", var1.f);
      var3.addBoolean("TerrainPopulated", var1.k);
      zg[] var4 = var1.i();
      ListTag var5 = new ListTag("Sections");
      zg[] var6 = var4;
      int var7 = var4.length;

      CompundTag var10;
      for(int var8 = 0; var8 < var7; ++var8) {
         zg var9 = var6[var8];
         if(var9 != null && var9.f() != 0) {
            var10 = new CompundTag();
            var10.addByte("Y", (byte)(var9.c() >> 4 & 255));
            var10.addByteArray("Blocks", var9.g());
            if(var9.i() != null) {
               var10.addByteArray("Add", var9.i().a);
            }

            var10.addByteArray("Data", var9.j().a);
            var10.addByteArray("SkyLight", var9.l().a);
            var10.addByteArray("BlockLight", var9.k().a);
            var5.a(var10);
         }
      }

      var3.addBaseTag("Sections", (BaseTag)var5);
      var3.addByteArray("Biomes", var1.m());
      var1.m = false;
      ListTag var15 = new ListTag();

      Iterator var17;
      for(var7 = 0; var7 < var1.j.length; ++var7) {
         var17 = var1.j[var7].iterator();

         while(var17.hasNext()) {
            BaseEntity var19 = (BaseEntity)var17.next();
            var1.m = true;
            var10 = new CompundTag();
            if(var19.c(var10)) {
               var15.a((BaseTag)var10);
            }
         }
      }

      var3.addBaseTag("Entities", (BaseTag)var15);
      ListTag var16 = new ListTag();
      var17 = var1.i.values().iterator();

      while(var17.hasNext()) {
         kw var20 = (kw)var17.next();
         var10 = new CompundTag();
         var20.b(var10);
         var16.a((BaseTag)var10);
      }

      var3.addBaseTag("TileEntities", (BaseTag)var16);
      List var18 = world.a(var1, false);
      if(var18 != null) {
         long var21 = world.w();
         ListTag var11 = new ListTag();
         Iterator var12 = var18.iterator();

         while(var12.hasNext()) {
            ml var13 = (ml)var12.next();
            CompundTag var14 = new CompundTag();
            var14.addInt("i", var13.d);
            var14.addInt("x", var13.a);
            var14.addInt("y", var13.b);
            var14.addInt("z", var13.c);
            var14.addInt("t", (int)(var13.e - var21));
            var11.a((BaseTag)var14);
         }

         var3.addBaseTag("TileTicks", (BaseTag)var11);
      }

   }

   private ack a(World var1, CompundTag var2) {
      int var3 = var2.getInt("xPos");
      int var4 = var2.getInt("zPos");
      ack var5 = new ack(var1, var3, var4);
      var5.f = var2.getIntArray("HeightMap");
      var5.k = var2.getBoolean("TerrainPopulated");
      ListTag var6 = var2.getListTag("Sections");
      byte var7 = 16;
      zg[] var8 = new zg[var7];

      for(int var9 = 0; var9 < var6.d(); ++var9) {
         CompundTag var10 = (CompundTag)var6.a(var9);
         byte var11 = var10.getByte("Y");
         zg var12 = new zg(var11 << 4);
         var12.a(var10.getByteArray("Blocks"));
         if(var10.containsKey("Add")) {
            var12.a(new qq(var10.getByteArray("Add"), 4));
         }

         var12.b(new qq(var10.getByteArray("Data"), 4));
         var12.d(new qq(var10.getByteArray("SkyLight"), 4));
         var12.c(new qq(var10.getByteArray("BlockLight"), 4));
         var12.d();
         var8[var11] = var12;
      }

      var5.a(var8);
      if(var2.containsKey("Biomes")) {
         var5.a(var2.getByteArray("Biomes"));
      }

      ListTag var14 = var2.getListTag("Entities");
      if(var14 != null) {
         for(int var15 = 0; var15 < var14.d(); ++var15) {
            CompundTag var17 = (CompundTag)var14.a(var15);
            BaseEntity var19 = EntityManager.a(var17, var1);
            var5.m = true;
            if(var19 != null) {
               var5.a(var19);
            }
         }
      }

      ListTag var16 = var2.getListTag("TileEntities");
      if(var16 != null) {
         for(int var18 = 0; var18 < var16.d(); ++var18) {
            CompundTag var21 = (CompundTag)var16.a(var18);
            kw var13 = kw.c(var21);
            if(var13 != null) {
               var5.a(var13);
            }
         }
      }

      if(var2.containsKey("TileTicks")) {
         ListTag var20 = var2.getListTag("TileTicks");
         if(var20 != null) {
            for(int var22 = 0; var22 < var20.d(); ++var22) {
               CompundTag var23 = (CompundTag)var20.a(var22);
               var1.e(var23.getInt("x"), var23.getInt("y"), var23.getInt("z"), var23.getInt("i"), var23.getInt("t"));
            }
         }
      }

      return var5;
   }
}
