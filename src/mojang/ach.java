package mojang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ach {

   private Map m = new HashMap();
   public static ach a = new ach();
   private nl n;
   public static double b;
   public static double c;
   public static double d;
   public aaw e;
   public xd f;
   public acq g;
   public float h;
   public float i;
   public double j;
   public double k;
   public double l;


   private ach() {
      this.m.put(sc.class, new ll());
      this.m.put(cj.class, new af());
      this.m.put(ou.class, new fv());
      this.m.put(hb.class, new ajq());
      this.m.put(uz.class, new eq());
      this.m.put(bw.class, new kz());
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         aar var2 = (aar)var1.next();
         var2.a(this);
      }

   }

   public aar a(Class var1) {
      aar var2 = (aar)this.m.get(var1);
      if(var2 == null && var1 != kw.class) {
         var2 = this.a(var1.getSuperclass());
         this.m.put(var1, var2);
      }

      return var2;
   }

   public boolean a(kw var1) {
      return this.b(var1) != null;
   }

   public aar b(kw var1) {
      return var1 == null?null:this.a(var1.getClass());
   }

   public void a(xd var1, aaw var2, nl var3, acq var4, float var5) {
      if(this.f != var1) {
         this.a(var1);
      }

      this.e = var2;
      this.g = var4;
      this.n = var3;
      this.h = var4.w + (var4.u - var4.w) * var5;
      this.i = var4.x + (var4.v - var4.x) * var5;
      this.j = var4.N + (var4.o - var4.N) * (double)var5;
      this.k = var4.O + (var4.p - var4.O) * (double)var5;
      this.l = var4.P + (var4.q - var4.P) * (double)var5;
   }

   public void a() {}

   public void a(kw var1, float var2) {
      if(var1.a(this.j, this.k, this.l) < 4096.0D) {
         int var3 = this.f.b(var1.j, var1.k, var1.l, 0);
         int var4 = var3 % 65536;
         int var5 = var3 / 65536;
         es.a(es.b, (float)var4 / 1.0F, (float)var5 / 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.a(var1, (double)var1.j - b, (double)var1.k - c, (double)var1.l - d, var2);
      }

   }

   public void a(kw var1, double var2, double var4, double var6, float var8) {
      aar var9 = this.b(var1);
      if(var9 != null) {
         var9.a(var1, var2, var4, var6, var8);
      }

   }

   public void a(xd var1) {
      this.f = var1;
      Iterator var2 = this.m.values().iterator();

      while(var2.hasNext()) {
         aar var3 = (aar)var2.next();
         if(var3 != null) {
            var3.a(var1);
         }
      }

   }

   public nl b() {
      return this.n;
   }

}
