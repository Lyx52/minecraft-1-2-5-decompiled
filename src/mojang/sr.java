package mojang;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class sr extends gb {

   private static me h = new me("tmp", 72);
   private float i = 0.0F;
   private boolean j = false;
   private boolean k;


   public sr(Player var1) {
      super(new os(var1));
      var1.ar = this.d;
      this.t = true;
      var1.a((ajw)dp.f, 1);
      this.c = 208;
   }

   public void a() {
      if(!this.minecraft.c.h()) {
         this.minecraft.addMenu((GUIManager)(new ain(this.minecraft.h)));
      }

   }

   protected void a(yu var1, int var2, int var3, boolean var4) {
      aak var5;
      aan var6;
      if(var1 != null) {
         if(var1.b == h) {
            var5 = this.minecraft.h.ap;
            var6 = var5.k();
            aan var7 = var1.b();
            if(var6 != null && var7 != null && var6.c == var7.c) {
               if(var3 == 0) {
                  if(var4) {
                     var6.a = var6.c();
                  } else if(var6.a < var6.c()) {
                     ++var6.a;
                  }
               } else if(var6.a <= 1) {
                  var5.b((aan)null);
               } else {
                  --var6.a;
               }
            } else if(var6 != null) {
               var5.b((aan)null);
            } else if(var7 == null) {
               var5.b((aan)null);
            } else if(var6 == null || var6.c != var7.c) {
               var5.b(aan.b(var7));
               var6 = var5.k();
               if(var4) {
                  var6.a = var6.c();
               }
            }
         } else {
            this.d.a(var1.c, var3, var4, this.minecraft.h);
            aan var8 = this.d.b(var1.c).b();
            this.minecraft.c.a(var8, var1.c - this.d.e.size() + 9 + 36);
         }
      } else {
         var5 = this.minecraft.h.ap;
         if(var5.k() != null) {
            if(var3 == 0) {
               this.minecraft.h.a(var5.k());
               this.minecraft.c.a(var5.k());
               var5.b((aan)null);
            }

            if(var3 == 1) {
               var6 = var5.k().a(1);
               this.minecraft.h.a(var6);
               this.minecraft.c.a(var6);
               if(var5.k().a == 0) {
                  var5.b((aan)null);
               }
            }
         }
      }

   }

   public void c() {
      if(!this.minecraft.c.h()) {
         this.minecraft.addMenu((GUIManager)(new ain(this.minecraft.h)));
      } else {
         super.c();
         this.buttonList.clear();
      }

   }

   protected void d() {
      this.u.b(LocalizationManagerWrapper.getLocaleString("container.creative"), 8, 6, 4210752);
   }

   public void f() {
      super.f();
      int var1 = Mouse.getEventDWheel();
      if(var1 != 0) {
         int var2 = ((os)this.d).a.size() / 8 - 8 + 1;
         if(var1 > 0) {
            var1 = 1;
         }

         if(var1 < 0) {
            var1 = -1;
         }

         this.i = (float)((double)this.i - (double)var1 / (double)var2);
         if(this.i < 0.0F) {
            this.i = 0.0F;
         }

         if(this.i > 1.0F) {
            this.i = 1.0F;
         }

         ((os)this.d).a(this.i);
      }

   }

   public void a(int var1, int var2, float var3) {
      boolean var4 = Mouse.isButtonDown(0);
      int var5 = this.e;
      int var6 = this.f;
      int var7 = var5 + 155;
      int var8 = var6 + 17;
      int var9 = var7 + 14;
      int var10 = var8 + 160 + 2;
      if(!this.k && var4 && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.j = true;
      }

      if(!var4) {
         this.j = false;
      }

      this.k = var4;
      if(this.j) {
         this.i = (float)(var2 - (var8 + 8)) / ((float)(var10 - var8) - 16.0F);
         if(this.i < 0.0F) {
            this.i = 0.0F;
         }

         if(this.i > 1.0F) {
            this.i = 1.0F;
         }

         ((os)this.d).a(this.i);
      }

      super.a(var1, var2, var3);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
   }

   protected void a(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var4 = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/allitems.png");
      this.minecraft.textureManager.b(var4);
      int var5 = this.e;
      int var6 = this.f;
      this.b(var5, var6, 0, 0, this.b, this.c);
      int var7 = var5 + 155;
      int var8 = var6 + 17;
      int var9 = var8 + 160 + 2;
      this.b(var5 + 154, var6 + 17 + (int)((float)(var9 - var8 - 17) * this.i), 0, 208, 16, 16);
   }

   protected void clickButton(Button var1) {
      if(var1.buttonID == 0) {
         this.minecraft.addMenu((GUIManager)(new ro(this.minecraft.K)));
      }

      if(var1.buttonID == 1) {
         this.minecraft.addMenu((GUIManager)(new dc(this, this.minecraft.K)));
      }

   }

   // $FF: synthetic method
   static me g() {
      return h;
   }

}
