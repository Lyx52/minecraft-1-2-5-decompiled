package mojang;

import java.util.List;
import java.util.Random;

public class yh implements ca {

   private xd a;
   private Random b;
   private final boolean c;
   private an d = new an(1);


   public yh(xd var1, long var2, boolean var4) {
      this.a = var1;
      this.c = var4;
      this.b = new Random(var2);
   }

   private void a(byte[] var1) {
      int var2 = var1.length / 256;

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < var2; ++var5) {
               int var6 = 0;
               if(var5 == 0) {
                  var6 = pb.z.bO;
               } else if(var5 <= 2) {
                  var6 = pb.v.bO;
               } else if(var5 == 3) {
                  var6 = pb.u.bO;
               }

               var1[var3 << 11 | var4 << 7 | var5] = (byte)var6;
            }
         }
      }

   }

   public ack c(int var1, int var2) {
      return this.b(var1, var2);
   }

   public ack b(int var1, int var2) {
      byte[] var3 = new byte['\u8000'];
      this.a(var3);
      ack var4 = new ack(this.a, var3, var1, var2);
      if(this.c) {
         this.d.a(this, this.a, var1, var2, var3);
      }

      abn[] var5 = this.a.i().b((abn[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var4.m();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)var5[var7].M;
      }

      var4.b();
      return var4;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(ca var1, int var2, int var3) {
      this.b.setSeed(this.a.v());
      long var4 = this.b.nextLong() / 2L * 2L + 1L;
      long var6 = this.b.nextLong() / 2L * 2L + 1L;
      this.b.setSeed((long)var2 * var4 + (long)var3 * var6 ^ this.a.v());
      if(this.c) {
         this.d.a(this.a, this.b, var2, var3);
      }

   }

   public boolean a(boolean var1, rw var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }

   public String c() {
      return "FlatLevelSource";
   }

   public List a(acf var1, int var2, int var3, int var4) {
      abn var5 = this.a.a(var2, var4);
      return var5 == null?null:var5.a(var1);
   }

   public qo a(xd var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
