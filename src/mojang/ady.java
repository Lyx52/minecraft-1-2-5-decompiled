package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ady extends gh {

   private Map a = new HashMap();


   public ady() {
      super("");
   }

   public ady(String var1) {
      super(var1);
   }

   void a(DataOutput var1) {
      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         gh var3 = (gh)var2.next();
         try {
            gh.a(var3, var1);
         } catch (IOException e) {
            e.printStackTrace();
         }
      }

      try {
         var1.writeByte(0);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   void a(DataInput var1) {
      this.a.clear();

      gh var2;
      try {
         while ((var2 = gh.b(var1)).a() != 0) {
            this.a.put(var2.c(), var2);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

   public Collection d() {
      return this.a.values();
   }

   public byte a() {
      return (byte)10;
   }

   public void a(String var1, gh var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, new mf(var1, var2));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, new ow(var1, var2));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, new afn(var1, var2));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, new adb(var1, var2));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, new m(var1, var2));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, new ahl(var1, var2));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, new ald(var1, var2));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, new zl(var1, var2));
   }

   public void a(String var1, int[] var2) {
      this.a.put(var1, new gc(var1, var2));
   }

   public void a(String var1, ady var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2?1:0));
   }

   public gh b(String var1) {
      return (gh)this.a.get(var1);
   }

   public boolean c(String var1) {
      return this.a.containsKey(var1);
   }

   public byte d(String var1) {
      return !this.a.containsKey(var1)?0:((mf)this.a.get(var1)).a;
   }

   public short e(String var1) {
      return !this.a.containsKey(var1)?0:((ow)this.a.get(var1)).a;
   }

   public int f(String var1) {
      return !this.a.containsKey(var1)?0:((afn)this.a.get(var1)).a;
   }

   public long g(String var1) {
      return !this.a.containsKey(var1)?0L:((adb)this.a.get(var1)).a;
   }

   public float h(String var1) {
      return !this.a.containsKey(var1)?0.0F:((m)this.a.get(var1)).a;
   }

   public double i(String var1) {
      return !this.a.containsKey(var1)?0.0D:((ahl)this.a.get(var1)).a;
   }

   public String j(String var1) {
      return !this.a.containsKey(var1)?"":((ald)this.a.get(var1)).a;
   }

   public byte[] k(String var1) {
      return !this.a.containsKey(var1)?new byte[0]:((zl)this.a.get(var1)).a;
   }

   public int[] l(String var1) {
      return !this.a.containsKey(var1)?new int[0]:((gc)this.a.get(var1)).a;
   }

   public ady m(String var1) {
      return !this.a.containsKey(var1)?new ady(var1):(ady)this.a.get(var1);
   }

   public no n(String var1) {
      return !this.a.containsKey(var1)?new no(var1):(no)this.a.get(var1);
   }

   public boolean o(String var1) {
      return this.d(var1) != 0;
   }

   public String toString() {
      return "" + this.a.size() + " entries";
   }

   public gh b() {
      ady var1 = new ady(this.c());
      Iterator var2 = this.a.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.a(var3, ((gh)this.a.get(var3)).b());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         ady var2 = (ady)var1;
         return this.a.entrySet().equals(var2.a.entrySet());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a.hashCode();
   }
}
