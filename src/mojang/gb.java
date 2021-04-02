package mojang;

import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public abstract class gb extends vp {

   protected static tw a = new tw();
   protected int b = 176;
   protected int c = 166;
   public dd d;
   protected int e;
   protected int f;


   public gb(dd var1) {
      this.d = var1;
   }

   public void c() {
      super.c();
      this.p.h.ar = this.d;
      this.e = (this.q - this.b) / 2;
      this.f = (this.r - this.c) / 2;
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      int var4 = this.e;
      int var5 = this.f;
      this.a(var3, var1, var2);
      tf.c();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable('\u803a');
      yu var6 = null;
      short var7 = 240;
      short var8 = 240;
      es.a(es.b, (float)var7 / 1.0F, (float)var8 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

      int var10;
      for(int var20 = 0; var20 < this.d.e.size(); ++var20) {
         yu var22 = (yu)this.d.e.get(var20);
         this.a(var22);
         if(this.a(var22, var1, var2)) {
            var6 = var22;
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            int var9 = var22.d;
            var10 = var22.e;
            this.a(var9, var10, var9 + 16, var10 + 16, -2130706433, -2130706433);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
         }
      }

      this.d();
      aak var21 = this.p.h.ap;
      if(var21.k() != null) {
         GL11.glTranslatef(0.0F, 0.0F, 32.0F);
         this.g = 200.0F;
         a.b = 200.0F;
         a.a(this.u, this.p.p, var21.k(), var1 - var4 - 8, var2 - var5 - 8);
         a.b(this.u, this.p.p, var21.k(), var1 - var4 - 8, var2 - var5 - 8);
         this.g = 0.0F;
         a.b = 0.0F;
      }

      GL11.glDisable('\u803a');
      tf.a();
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      if(var21.k() == null && var6 != null && var6.c()) {
         aan var23 = var6.b();
         List var24 = var23.q();
         if(var24.size() > 0) {
            var10 = 0;

            int var11;
            int var12;
            for(var11 = 0; var11 < var24.size(); ++var11) {
               var12 = this.u.a((String)var24.get(var11));
               if(var12 > var10) {
                  var10 = var12;
               }
            }

            var11 = var1 - var4 + 12;
            var12 = var2 - var5 - 12;
            int var14 = 8;
            if(var24.size() > 1) {
               var14 += 2 + (var24.size() - 1) * 10;
            }

            this.g = 300.0F;
            a.b = 300.0F;
            int var15 = -267386864;
            this.a(var11 - 3, var12 - 4, var11 + var10 + 3, var12 - 3, var15, var15);
            this.a(var11 - 3, var12 + var14 + 3, var11 + var10 + 3, var12 + var14 + 4, var15, var15);
            this.a(var11 - 3, var12 - 3, var11 + var10 + 3, var12 + var14 + 3, var15, var15);
            this.a(var11 - 4, var12 - 3, var11 - 3, var12 + var14 + 3, var15, var15);
            this.a(var11 + var10 + 3, var12 - 3, var11 + var10 + 4, var12 + var14 + 3, var15, var15);
            int var16 = 1347420415;
            int var17 = (var16 & 16711422) >> 1 | var16 & -16777216;
            this.a(var11 - 3, var12 - 3 + 1, var11 - 3 + 1, var12 + var14 + 3 - 1, var16, var17);
            this.a(var11 + var10 + 2, var12 - 3 + 1, var11 + var10 + 3, var12 + var14 + 3 - 1, var16, var17);
            this.a(var11 - 3, var12 - 3, var11 + var10 + 3, var12 - 3 + 1, var16, var16);
            this.a(var11 - 3, var12 + var14 + 2, var11 + var10 + 3, var12 + var14 + 3, var17, var17);

            for(int var18 = 0; var18 < var24.size(); ++var18) {
               String var19 = (String)var24.get(var18);
               if(var18 == 0) {
                  var19 = "§" + Integer.toHexString(var23.s().e) + var19;
               } else {
                  var19 = "§7" + var19;
               }

               this.u.a(var19, var11, var12, -1);
               if(var18 == 0) {
                  var12 += 2;
               }

               var12 += 10;
            }

            this.g = 0.0F;
            a.b = 0.0F;
         }
      }

      GL11.glPopMatrix();
      super.a(var1, var2, var3);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   protected void d() {}

   protected abstract void a(float var1, int var2, int var3);

   private void a(yu var1) {
      int var2 = var1.d;
      int var3 = var1.e;
      aan var4 = var1.b();
      boolean var5 = false;
      this.g = 100.0F;
      a.b = 100.0F;
      if(var4 == null) {
         int var8 = var1.e();
         if(var8 >= 0) {
            GL11.glDisable(2896);
            this.p.p.b(this.p.p.b("/mojang/gui/items.png"));
            this.b(var2, var3, var8 % 16 * 16, var8 / 16 * 16, 16, 16);
            GL11.glEnable(2896);
            var5 = true;
         }
      }

      if(!var5) {
         a.a(this.u, this.p.p, var4, var2, var3);
         a.b(this.u, this.p.p, var4, var2, var3);
      }

      a.b = 0.0F;
      this.g = 0.0F;
   }

   private yu a(int var1, int var2) {
      for(int var3 = 0; var3 < this.d.e.size(); ++var3) {
         yu var4 = (yu)this.d.e.get(var3);
         if(this.a(var4, var1, var2)) {
            return var4;
         }
      }

      return null;
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if(var3 == 0 || var3 == 1) {
         yu var4 = this.a(var1, var2);
         int var5 = this.e;
         int var6 = this.f;
         boolean var7 = var1 < var5 || var2 < var6 || var1 >= var5 + this.b || var2 >= var6 + this.c;
         int var8 = -1;
         if(var4 != null) {
            var8 = var4.c;
         }

         if(var7) {
            var8 = -999;
         }

         if(var8 != -1) {
            boolean var9 = var8 != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
            this.a(var4, var8, var3, var9);
         }
      }

   }

   private boolean a(yu var1, int var2, int var3) {
      int var4 = this.e;
      int var5 = this.f;
      var2 -= var4;
      var3 -= var5;
      return var2 >= var1.d - 1 && var2 < var1.d + 16 + 1 && var3 >= var1.e - 1 && var3 < var1.e + 16 + 1;
   }

   protected void a(yu var1, int var2, int var3, boolean var4) {
      if(var1 != null) {
         var2 = var1.c;
      }

      this.p.c.a(this.d.f, var2, var3, var4, this.p.h);
   }

   protected void a(char var1, int var2) {
      if(var2 == 1 || var2 == this.p.A.s.d) {
         this.p.h.af();
      }

   }

   public void e() {
      if(this.p.h != null) {
         this.d.a((yw)this.p.h);
         this.p.c.a(this.d.f, this.p.h);
      }
   }

   public boolean b() {
      return false;
   }

   public void a() {
      super.a();
      if(!this.p.h.M() || this.p.h.G) {
         this.p.h.af();
      }

   }

}
