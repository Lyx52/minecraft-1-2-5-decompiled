package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ou extends kw {

   private int a;
   private int b;
   private int c;
   private boolean d;
   private boolean e;
   private float f;
   private float g;
   private static List h = new ArrayList();


   public ou() {}

   public ou(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public int a() {
      return this.a;
   }

   public int i() {
      return this.b;
   }

   public boolean d() {
      return this.d;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.e;
   }

   public float a(float var1) {
      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return this.g + (this.f - this.g) * var1;
   }

   public float b(float var1) {
      return this.d?(this.a(var1) - 1.0F) * (float)qs.b[this.c]:(1.0F - this.a(var1)) * (float)qs.b[this.c];
   }

   public float c(float var1) {
      return this.d?(this.a(var1) - 1.0F) * (float)qs.c[this.c]:(1.0F - this.a(var1)) * (float)qs.c[this.c];
   }

   public float d(float var1) {
      return this.d?(this.a(var1) - 1.0F) * (float)qs.d[this.c]:(1.0F - this.a(var1)) * (float)qs.d[this.c];
   }

   private void a(float var1, float var2) {
      if(!this.d) {
         --var1;
      } else {
         var1 = 1.0F - var1;
      }

      wu var3 = pb.ac.b(this.i, this.j, this.k, this.l, this.a, var1, this.c);
      if(var3 != null) {
         List var4 = this.i.b((BaseEntity)null, var3);
         if(!var4.isEmpty()) {
            h.addAll(var4);
            Iterator var5 = h.iterator();

            while(var5.hasNext()) {
               BaseEntity var6 = (BaseEntity)var5.next();
               var6.b((double)(var2 * (float)qs.b[this.c]), (double)(var2 * (float)qs.c[this.c]), (double)(var2 * (float)qs.d[this.c]));
            }

            h.clear();
         }
      }

   }

   public void g() {
      if(this.g < 1.0F && this.i != null) {
         this.g = this.f = 1.0F;
         this.i.q(this.j, this.k, this.l);
         this.h();
         if(this.i.a(this.j, this.k, this.l) == pb.ac.bO) {
            this.i.d(this.j, this.k, this.l, this.a, this.b);
         }
      }

   }

   public void n_() {
      this.g = this.f;
      if(this.g >= 1.0F) {
         this.a(1.0F, 0.25F);
         this.i.q(this.j, this.k, this.l);
         this.h();
         if(this.i.a(this.j, this.k, this.l) == pb.ac.bO) {
            this.i.d(this.j, this.k, this.l, this.a, this.b);
         }

      } else {
         this.f += 0.5F;
         if(this.f >= 1.0F) {
            this.f = 1.0F;
         }

         if(this.d) {
            this.a(this.f, this.f - this.g + 0.0625F);
         }

      }
   }

   public void a(CompundTag var1) {
      super.a(var1);
      this.a = var1.getInt("blockId");
      this.b = var1.getInt("blockData");
      this.c = var1.getInt("facing");
      this.g = this.f = var1.getFloat("progress");
      this.d = var1.getBoolean("extending");
   }

   public void b(CompundTag var1) {
      super.b(var1);
      var1.addInt("blockId", this.a);
      var1.addInt("blockData", this.b);
      var1.addInt("facing", this.c);
      var1.addFloat("progress", this.g);
      var1.addBoolean("extending", this.d);
   }

}
