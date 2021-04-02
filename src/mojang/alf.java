package mojang;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class alf {

   private Map a = new HashMap();
   private Map b = new HashMap();
   private boolean c = false;
   private vc d;


   public alf(CredentialManager var1, File var2) {
      File var3 = new File(var2, "stats");
      if(!var3.exists()) {
         var3.mkdir();
      }

      File[] var4 = var2.listFiles();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         File var7 = var4[var6];
         if(var7.getName().startsWith("stats_") && var7.getName().endsWith(".dat")) {
            File var8 = new File(var3, var7.getName());
            if(!var8.exists()) {
               System.out.println("Relocating " + var7.getName());
               var7.renameTo(var8);
            }
         }
      }

      this.d = new vc(var1, this, var3);
   }

   public void a(ajw var1, int var2) {
      this.a(this.b, var1, var2);
      this.a(this.a, var1, var2);
      this.c = true;
   }

   private void a(Map var1, ajw var2, int var3) {
      Integer var4 = (Integer)var1.get(var2);
      int var5 = var4 == null?0:var4.intValue();
      var1.put(var2, Integer.valueOf(var5 + var3));
   }

   public Map a() {
      return new HashMap(this.b);
   }

   public void a(Map var1) {
      if(var1 != null) {
         this.c = true;
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            ajw var3 = (ajw)var2.next();
            this.a(this.b, var3, ((Integer)var1.get(var3)).intValue());
            this.a(this.a, var3, ((Integer)var1.get(var3)).intValue());
         }

      }
   }

   public void b(Map var1) {
      if(var1 != null) {
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            ajw var3 = (ajw)var2.next();
            Integer var4 = (Integer)this.b.get(var3);
            int var5 = var4 == null?0:var4.intValue();
            this.a.put(var3, Integer.valueOf(((Integer)var1.get(var3)).intValue() + var5));
         }

      }
   }

   public void c(Map var1) {
      if(var1 != null) {
         this.c = true;
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            ajw var3 = (ajw)var2.next();
            this.a(this.b, var3, ((Integer)var1.get(var3)).intValue());
         }

      }
   }

   public static Map a(String var0) {
      HashMap var1 = new HashMap();

      try {
         String var2 = "local";
         StringBuilder var3 = new StringBuilder();

         ly var4 = mojang.fw.a(var0);
         System.out.println("MODIFIED CODE");
         List var5 = var4.b(new Object[]{"stats-change"});
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            fd var7 = (fd)var6.next();
            Map var8 = var7.c();
            Entry var9 = (Entry)var8.entrySet().iterator().next();
            int var10 = Integer.parseInt(((lu)var9.getKey()).b());
            int var11 = Integer.parseInt(((fd)var9.getValue()).b());
            ajw var12 = gv.a(var10);
            if(var12 == null) {
               System.out.println(var10 + " is not a valid stat");
            } else {
               var3.append(gv.a(var10).g).append(",");
               var3.append(var11).append(",");
               var1.put(var12, Integer.valueOf(var11));
            }
         }

         zd var14 = new zd(var2);
         String var15 = var14.a(var3.toString());
         if(!var15.equals(var4.a(new Object[]{"checksum"}))) {
            System.out.println("CHECKSUM MISMATCH");
            return null;
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }

      return var1;
   }

   public static String a(String var0, String var1, Map var2) {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder();
      boolean var5 = true;
      var3.append("{\r\n");
      if(var0 != null && var1 != null) {
         var3.append("  \"user\":{\r\n");
         var3.append("    \"name\":\"").append(var0).append("\",\r\n");
         var3.append("    \"sessionid\":\"").append(var1).append("\"\r\n");
         var3.append("  },\r\n");
      }

      var3.append("  \"stats-change\":[");
      Iterator var6 = var2.keySet().iterator();

      while(var6.hasNext()) {
         ajw var7 = (ajw)var6.next();
         if(!var5) {
            var3.append("},");
         } else {
            var5 = false;
         }

         var3.append("\r\n    {\"").append(var7.e).append("\":").append(var2.get(var7));
         var4.append(var7.g).append(",");
         var4.append(var2.get(var7)).append(",");
      }

      if(!var5) {
         var3.append("}");
      }

      zd var8 = new zd(var1);
      var3.append("\r\n  ],\r\n");
      var3.append("  \"checksum\":\"").append(var8.a(var4.toString())).append("\"\r\n");
      var3.append("}");
      return var3.toString();
   }

   public boolean a(aeb var1) {
      return this.a.containsKey(var1);
   }

   public boolean b(aeb var1) {
      return var1.c == null || this.a(var1.c);
   }

   public int a(ajw var1) {
      Integer var2 = (Integer)this.a.get(var1);
      return var2 == null?0:var2.intValue();
   }

   public void b() {}

   public void c() {
      this.d.b(this.a());
   }

   public void d() {
      if(this.c && this.d.b()) {
         this.d.a(this.a());
      }

      this.d.c();
   }
}
