package mojang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ahu {

   private Map o = new HashMap();
   public static ahu a = new ahu();
   private nl p;
   public static double b;
   public static double c;
   public static double d;
   public aaw e;
   public mn f;
   public xd g;
   public acq h;
   public float i;
   public float j;
   public hu k;
   public double l;
   public double m;
   public double n;


   private ahu() {
      this.o.put(cb.class, new amo());
      this.o.put(fn.class, new amo());
      this.o.put(qr.class, new ix(new dl(), new dl(0.5F), 0.7F));
      this.o.put(cu.class, new alq(new jm(), new dj(), 0.7F));
      this.o.put(un.class, new ajh(new ze(), 0.7F));
      this.o.put(of.class, new cl(new ze(), 0.7F));
      this.o.put(yo.class, new aki(new sx(), 0.5F));
      this.o.put(rd.class, new gn(new ahp(), 0.3F));
      this.o.put(uo.class, new sw(new mu(), 0.4F));
      this.o.put(qn.class, new vs());
      this.o.put(yd.class, new sv());
      this.o.put(jg.class, new st());
      this.o.put(q.class, new afm());
      this.o.put(xr.class, new tg(new ie(), 0.5F));
      this.o.put(adg.class, new qz());
      this.o.put(ajg.class, new tg(new wr(), 0.5F));
      this.o.put(aja.class, new jd(new ads(16), new ads(0), 0.25F));
      this.o.put(aic.class, new aw());
      this.o.put(yw.class, new we());
      this.o.put(kh.class, new alz(new wr(), 0.5F, 6.0F));
      this.o.put(ui.class, new lm());
      this.o.put(all.class, new ww(new qw(), 0.7F));
      this.o.put(ed.class, new zb());
      this.o.put(tl.class, new co());
      this.o.put(acq.class, new fe(new xg(), 0.5F));
      this.o.put(oq.class, new or());
      this.o.put(el.class, new ik());
      this.o.put(nn.class, new it());
      this.o.put(mk.class, new dh());
      this.o.put(nm.class, new iv());
      this.o.put(uq.class, new cr(yr.aD.b(0)));
      this.o.put(adw.class, new cr(yr.bn.b(0)));
      this.o.put(va.class, new cr(yr.bA.b(0)));
      this.o.put(qe.class, new cr(yr.aP.b(0)));
      this.o.put(bj.class, new cr(154));
      this.o.put(hf.class, new cr(yr.bD.b(0)));
      this.o.put(bt.class, new abu(2.0F));
      this.o.put(qb.class, new abu(0.5F));
      this.o.put(fq.class, new tw());
      this.o.put(bz.class, new tb());
      this.o.put(agg.class, new aeo());
      this.o.put(abf.class, new yt());
      this.o.put(ama.class, new ahm());
      this.o.put(ep.class, new ea());
      this.o.put(act.class, new afj());
      this.o.put(d.class, new afg());
      Iterator var1 = this.o.values().iterator();

      while(var1.hasNext()) {
         um var2 = (um)var1.next();
         var2.a(this);
      }

   }

   public um a(Class var1) {
      um var2 = (um)this.o.get(var1);
      if(var2 == null && var1 != nn.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public um a(nn var1) {
      return this.a(var1.getClass());
   }

   public void a(xd var1, aaw var2, nl var3, acq var4, hu var5, float var6) {
      this.g = var1;
      this.e = var2;
      this.k = var5;
      this.h = var4;
      this.p = var3;
      if(var4.az()) {
         int var7 = var1.a(gk.c(var4.o), gk.c(var4.p), gk.c(var4.q));
         if(var7 == pb.S.bO) {
            int var8 = var1.e(gk.c(var4.o), gk.c(var4.p), gk.c(var4.q));
            int var9 = var8 & 3;
            this.i = (float)(var9 * 90 + 180);
            this.j = 0.0F;
         }
      } else {
         this.i = var4.w + (var4.u - var4.w) * var6;
         this.j = var4.x + (var4.v - var4.x) * var6;
      }

      if(var5.E == 2) {
         this.i += 180.0F;
      }

      this.l = var4.N + (var4.o - var4.N) * (double)var6;
      this.m = var4.O + (var4.p - var4.O) * (double)var6;
      this.n = var4.P + (var4.q - var4.P) * (double)var6;
   }

   public void a(nn var1, float var2) {
      double var3 = var1.N + (var1.o - var1.N) * (double)var2;
      double var5 = var1.O + (var1.p - var1.O) * (double)var2;
      double var7 = var1.P + (var1.q - var1.P) * (double)var2;
      float var9 = var1.w + (var1.u - var1.w) * var2;
      int var10 = var1.b(var2);
      if(var1.T()) {
         var10 = 15728880;
      }

      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      es.a(es.b, (float)var11 / 1.0F, (float)var12 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(nn var1, double var2, double var4, double var6, float var8, float var9) {
      um var10 = this.a(var1);
      if(var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(xd var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public nl a() {
      return this.p;
   }

}
