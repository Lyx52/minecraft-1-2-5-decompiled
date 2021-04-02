package mojang;

import java.util.List;
import java.util.Random;

public class iu {

   private static final ahk[] a = new ahk[]{new ahk(cz.class, 30, 0, true), new ahk(ma.class, 10, 4), new ahk(ajx.class, 10, 4), new ahk(adp.class, 10, 3), new ahk(akb.class, 5, 2), new ahk(pi.class, 5, 1)};
   private static final ahk[] b = new ahk[]{new ahk(adx.class, 25, 0, true), new ahk(alv.class, 15, 5), new ahk(vr.class, 5, 10), new ahk(ip.class, 5, 10), new ahk(sh.class, 10, 3, true), new ahk(jn.class, 7, 2), new ahk(wx.class, 5, 2)};


   private static aas b(ahk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      Class var8 = var0.a;
      Object var9 = null;
      if(var8 == cz.class) {
         var9 = cz.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == ma.class) {
         var9 = ma.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == ajx.class) {
         var9 = ajx.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == adp.class) {
         var9 = adp.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == akb.class) {
         var9 = akb.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == pi.class) {
         var9 = pi.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == adx.class) {
         var9 = adx.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == vr.class) {
         var9 = vr.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == ip.class) {
         var9 = ip.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == sh.class) {
         var9 = sh.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == jn.class) {
         var9 = jn.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == alv.class) {
         var9 = alv.a(var1, var2, var3, var4, var5, var6, var7);
      } else if(var8 == wx.class) {
         var9 = wx.a(var1, var2, var3, var4, var5, var6, var7);
      }

      return (aas)var9;
   }

   // $FF: synthetic method
   static aas a(ahk var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return b(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: synthetic method
   static ahk[] a() {
      return a;
   }

   // $FF: synthetic method
   static ahk[] b() {
      return b;
   }

}
