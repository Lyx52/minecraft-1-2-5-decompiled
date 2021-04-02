package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class abs {

   public static abh k = new abh();
   private static Map a = new HashMap();
   private static Set b = new HashSet();
   private static Set c = new HashSet();
   public final long l = System.currentTimeMillis();
   public static long m;
   public static long n;
   public static long o;
   public static long p;
   public boolean q = false;


   static void a(int var0, boolean var1, boolean var2, Class var3) {
      if(k.b(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if(a.containsKey(var3)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var3);
      } else {
         k.a(var0, var3);
         a.put(var3, Integer.valueOf(var0));
         if(var1) {
            b.add(Integer.valueOf(var0));
         }

         if(var2) {
            c.add(Integer.valueOf(var0));
         }

      }
   }

   public static abs a(int var0) {
      try {
         Class var1 = (Class)k.a(var0);
         return var1 == null?null:(abs)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int c() {
      return ((Integer)a.get(this.getClass())).intValue();
   }

   public static abs a(DataInputStream var0, boolean var1) throws IOException {
      boolean var2 = false;
      abs var3 = null;

      int var6;
      try {
         var6 = var0.read();
         if(var6 == -1) {
            return null;
         }

         if(var1 && !c.contains(Integer.valueOf(var6)) || !var1 && !b.contains(Integer.valueOf(var6))) {
            throw new IOException("Bad packet id " + var6);
         }

         var3 = a(var6);
         if(var3 == null) {
            throw new IOException("Bad packet id " + var6);
         }

         var3.a(var0);
         ++m;
         n += (long)var3.a();
      } catch (EOFException var5) {
         System.out.println("Reached end of stream");
         return null;
      }

      akh.a(var6, (long)var3.a());
      ++m;
      n += (long)var3.a();
      return var3;
   }

   public static void a(abs var0, DataOutputStream var1) throws IOException {
      var1.write(var0.c());
      var0.a(var1);
      ++o;
      p += (long)var0.a();
   }

   public static void a(String var0, DataOutputStream var1) throws IOException {
      if(var0.length() > 32767) {
         throw new IOException("String too big");
      } else {
         var1.writeShort(var0.length());
         var1.writeChars(var0);
      }
   }

   public static String a(DataInputStream var0, int var1) throws IOException {
      short var2 = var0.readShort();
      if(var2 > var1) {
         throw new IOException("Received string length longer than maximum allowed (" + var2 + " > " + var1 + ")");
      } else if(var2 < 0) {
         throw new IOException("Received string length is less than zero! Weird string!");
      } else {
         StringBuilder var3 = new StringBuilder();

         for(int var4 = 0; var4 < var2; ++var4) {
            var3.append(var0.readChar());
         }

         return var3.toString();
      }
   }

   public abstract void a(DataInputStream var1) throws IOException;

   public abstract void a(DataOutputStream var1) throws IOException;

   public abstract void a(oe var1);

   public abstract int a();

   protected aan b(DataInputStream var1) throws IOException {
      aan var2 = null;
      short var3 = var1.readShort();
      if(var3 >= 0) {
         byte var4 = var1.readByte();
         short var5 = var1.readShort();
         var2 = new aan(var3, var4, var5);
         if(yr.e[var3].i() || yr.e[var3].k()) {
            var2.d = this.c(var1);
         }
      }

      return var2;
   }

   protected void a(aan var1, DataOutputStream var2) throws IOException {
      if(var1 == null) {
         var2.writeShort(-1);
      } else {
         var2.writeShort(var1.c);
         var2.writeByte(var1.a);
         var2.writeShort(var1.i());
         if(var1.a().i() || var1.a().k()) {
            this.a(var1.d, var2);
         }
      }

   }

   protected CompundTag c(DataInputStream var1) throws IOException {
      short var2 = var1.readShort();
      if(var2 < 0) {
         return null;
      } else {
         byte[] var3 = new byte[var2];
         var1.readFully(var3);
         return at.a(var3);
      }
   }

   protected void a(CompundTag var1, DataOutputStream var2) throws IOException {
      if(var1 == null) {
         var2.writeShort(-1);
      } else {
         byte[] var3 = at.a(var1);
         var2.writeShort((short)var3.length);
         var2.write(var3);
      }

   }

   static {
      a(0, true, true, acw.class);
      a(1, true, true, aec.class);
      a(2, true, true, jf.class);
      a(3, true, true, afd.class);
      a(4, true, false, zf.class);
      a(5, true, false, ta.class);
      a(6, true, false, agl.class);
      a(7, false, true, a.class);
      a(8, true, false, ds.class);
      a(9, true, true, kx.class);
      a(10, true, true, gg.class);
      a(11, true, true, ag.class);
      a(12, true, true, pq.class);
      a(13, true, true, du.class);
      a(14, false, true, hc.class);
      a(15, false, true, ff.class);
      a(16, false, true, zm.class);
      a(17, true, false, abj.class);
      a(18, true, true, kc.class);
      a(19, false, true, aig.class);
      a(20, true, false, iy.class);
      a(21, true, false, jp.class);
      a(22, true, false, vv.class);
      a(23, true, false, np.class);
      a(24, true, false, aay.class);
      a(25, true, false, qc.class);
      a(26, true, false, lj.class);
      a(28, true, false, yn.class);
      a(29, true, false, agx.class);
      a(30, true, false, aip.class);
      a(31, true, false, nu.class);
      a(32, true, false, nd.class);
      a(33, true, false, lt.class);
      a(34, true, false, mr.class);
      a(35, true, false, aji.class);
      a(38, true, false, gt.class);
      a(39, true, false, adv.class);
      a(40, true, false, pf.class);
      a(41, true, false, wb.class);
      a(42, true, false, ado.class);
      a(43, true, false, ih.class);
      a(50, true, false, ahc.class);
      a(51, true, false, sz.class);
      a(52, true, false, akt.class);
      a(53, true, false, ol.class);
      a(54, true, false, qi.class);
      a(60, true, false, ags.class);
      a(61, true, false, ej.class);
      a(70, true, false, us.class);
      a(71, true, false, wz.class);
      a(100, true, false, gr.class);
      a(101, true, true, add.class);
      a(102, false, true, agf.class);
      a(103, true, false, fu.class);
      a(104, true, false, abl.class);
      a(105, true, false, jl.class);
      a(106, true, true, kn.class);
      a(107, true, true, db.class);
      a(108, false, true, lh.class);
      a(130, true, true, aiu.class);
      a(131, true, false, ai.class);
      a(132, true, false, ait.class);
      a(200, true, false, kk.class);
      a(201, true, false, wj.class);
      a(202, true, true, ym.class);
      a(250, true, true, ee.class);
      a(254, false, true, wa.class);
      a(255, true, true, amg.class);
   }
}
