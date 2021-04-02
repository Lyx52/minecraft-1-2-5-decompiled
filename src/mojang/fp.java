package mojang;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fp extends aib {

   public fp(File var1) {
      super(var1);
   }

   public String a() {
      return "Anvil";
   }

   public List b() {
      ArrayList var1 = new ArrayList();
      File[] var2 = this.a.listFiles();
      File[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         File var6 = var3[var5];
         if(var6.isDirectory()) {
            String var7 = var6.getName();
            wq var8 = this.b(var7);
            if(var8 != null && (var8.k() == 19132 || var8.k() == 19133)) {
               boolean var9 = var8.k() != this.c();
               String var10 = var8.j();
               if(var10 == null || gk.a(var10)) {
                  var10 = var7;
               }

               long var11 = 0L;
               var1.add(new pj(var7, var10, var8.l(), var11, var8.q(), var9, var8.s()));
            }
         }
      }

      return var1;
   }

   protected int c() {
      return 19133;
   }

   public void d() {
      agp.a();
   }

   public akp a(String var1, boolean var2) {
      return new aia(this.a, var1, var2);
   }

   public boolean a(String var1) {
      wq var2 = this.b(var1);
      return var2 != null && var2.k() != this.c();
   }

   public boolean a(String var1, rw var2) {
      var2.a(0);
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      File var6 = new File(this.a, var1);
      File var7 = new File(var6, "DIM-1");
      File var8 = new File(var6, "DIM1");
      System.out.println("Scanning folders...");
      this.a(var6, var3);
      if(var7.exists()) {
         this.a(var7, var4);
      }

      if(var8.exists()) {
         this.a(var8, var5);
      }

      int var9 = var3.size() + var4.size() + var5.size();
      System.out.println("Total conversion count is " + var9);
      wq var10 = this.b(var1);
      Object var11 = null;
      if(var10.t() == vx.c) {
         var11 = new fm(abn.c, 0.5F, 0.5F);
      } else {
         var11 = new rs(var10.b(), var10.t());
      }

      this.a(new File(var6, "region"), var3, (rs)var11, 0, var9, var2);
      this.a(new File(var7, "region"), var4, new fm(abn.j, 1.0F, 0.0F), var3.size(), var9, var2);
      this.a(new File(var8, "region"), var5, new fm(abn.k, 0.5F, 0.0F), var3.size() + var4.size(), var9, var2);
      var10.d(19133);
      if(var10.t() == vx.d) {
         var10.a(vx.b);
      }

      this.d(var1);
      akp var12 = this.a(var1, false);
      var12.a(var10);
      return true;
   }

   private void d(String var1) {
      File var2 = new File(this.a, var1);
      if(!var2.exists()) {
         System.out.println("Warning: Unable to create level.dat_mcr backup");
      } else {
         File var3 = new File(var2, "level.dat");
         if(!var3.exists()) {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
         } else {
            File var4 = new File(var2, "level.dat_mcr");
            if(!var3.renameTo(var4)) {
               System.out.println("Warning: Unable to create level.dat_mcr backup");
            }

         }
      }
   }

   private void a(File var1, ArrayList var2, rs var3, int var4, int var5, rw var6) {
      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         File var8 = (File)var7.next();
         this.a(var1, var8, var3, var4, var5, var6);
         ++var4;
         int var9 = (int)Math.round(100.0D * (double)var4 / (double)var5);
         var6.a(var9);
      }

   }

   private void a(File var1, File var2, rs var3, int var4, int var5, rw var6) {
      try {
         String var7 = var2.getName();
         lz var8 = new lz(var2);
         lz var9 = new lz(new File(var1, var7.substring(0, var7.length() - ".mcr".length()) + ".mca"));

         for(int var10 = 0; var10 < 32; ++var10) {
            int var11;
            for(var11 = 0; var11 < 32; ++var11) {
               if(var8.c(var10, var11) && !var9.c(var10, var11)) {
                  DataInputStream var12 = var8.a(var10, var11);
                  if(var12 == null) {
                     System.out.println("Failed to fetch input stream");
                  } else {
                     ady var13 = at.a((DataInput)var12);
                     var12.close();
                     ady var14 = var13.m("Level");
                     acj var15 = oj.a(var14);
                     ady var16 = new ady();
                     ady var17 = new ady();
                     var16.a("Level", (gh)var17);
                     oj.a(var15, var17, var3);
                     DataOutputStream var18 = var9.b(var10, var11);
                     at.a(var16, (DataOutput)var18);
                     var18.close();
                  }
               }
            }

            var11 = (int)Math.round(100.0D * (double)(var4 * 1024) / (double)(var5 * 1024));
            int var20 = (int)Math.round(100.0D * (double)((var10 + 1) * 32 + var4 * 1024) / (double)(var5 * 1024));
            if(var20 > var11) {
               var6.a(var20);
            }
         }

         var8.a();
         var9.a();
      } catch (IOException var19) {
         var19.printStackTrace();
      }

   }

   private void a(File var1, ArrayList var2) {
      File var3 = new File(var1, "region");
      File[] var4 = var3.listFiles(new aeq(this));
      if(var4 != null) {
         File[] var5 = var4;
         int var6 = var4.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            File var8 = var5[var7];
            var2.add(var8);
         }
      }

   }
}
