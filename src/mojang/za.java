package mojang;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class za {

   private akp a;
   private Map b = new HashMap();
   private List c = new ArrayList();
   private Map d = new HashMap();


   public za(akp var1) {
      this.a = var1;
      this.b();
   }

   public zk a(Class var1, String var2) {
      zk var3 = (zk)this.b.get(var2);
      if(var3 != null) {
         return var3;
      } else {
         if(this.a != null) {
            try {
               File var4 = this.a.a(var2);
               if(var4 != null && var4.exists()) {
                  try {
                     var3 = (zk)var1.getConstructor(new Class[]{String.class}).newInstance(new Object[]{var2});
                  } catch (Exception var7) {
                     throw new RuntimeException("Failed to instantiate " + var1.toString(), var7);
                  }

                  FileInputStream var5 = new FileInputStream(var4);
                  ady var6 = at.a((InputStream)var5);
                  var5.close();
                  var3.a(var6.m("data"));
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         if(var3 != null) {
            this.b.put(var2, var3);
            this.c.add(var3);
         }

         return var3;
      }
   }

   public void a(String var1, zk var2) {
      if(var2 == null) {
         throw new RuntimeException("Can\'t set null data");
      } else {
         if(this.b.containsKey(var1)) {
            this.c.remove(this.b.remove(var1));
         }

         this.b.put(var1, var2);
         this.c.add(var2);
      }
   }

   public void a() {
      for(int var1 = 0; var1 < this.c.size(); ++var1) {
         zk var2 = (zk)this.c.get(var1);
         if(var2.b()) {
            this.a(var2);
            var2.a(false);
         }
      }

   }

   private void a(zk var1) {
      if(this.a != null) {
         try {
            File var2 = this.a.a(var1.a);
            if(var2 != null) {
               ady var3 = new ady();
               var1.b(var3);
               ady var4 = new ady();
               var4.a("data", var3);
               FileOutputStream var5 = new FileOutputStream(var2);
               at.a(var4, (OutputStream)var5);
               var5.close();
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }

      }
   }

   private void b() {
      try {
         this.d.clear();
         if(this.a == null) {
            return;
         }

         File var1 = this.a.a("idcounts");
         if(var1 != null && var1.exists()) {
            DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
            ady var3 = at.a((DataInput)var2);
            var2.close();
            Iterator var4 = var3.d().iterator();

            while(var4.hasNext()) {
               gh var5 = (gh)var4.next();
               if(var5 instanceof ow) {
                  ow var6 = (ow)var5;
                  String var7 = var6.c();
                  short var8 = var6.a;
                  this.d.put(var7, Short.valueOf(var8));
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public int a(String var1) {
      Short var2 = (Short)this.d.get(var1);
      if(var2 == null) {
         var2 = Short.valueOf((short)0);
      } else {
         var2 = Short.valueOf((short)(var2.shortValue() + 1));
      }

      this.d.put(var1, var2);
      if(this.a == null) {
         return var2.shortValue();
      } else {
         try {
            File var3 = this.a.a("idcounts");
            if(var3 != null) {
               ady var4 = new ady();
               Iterator var5 = this.d.keySet().iterator();

               while(var5.hasNext()) {
                  String var6 = (String)var5.next();
                  short var7 = ((Short)this.d.get(var6)).shortValue();
                  var4.a(var6, var7);
               }

               DataOutputStream var9 = new DataOutputStream(new FileOutputStream(var3));
               at.a(var4, (DataOutput)var9);
               var9.close();
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         return var2.shortValue();
      }
   }
}
