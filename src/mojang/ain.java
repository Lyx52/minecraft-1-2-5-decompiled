package mojang;

import java.util.Collection;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class ain extends gb {

   private float h;
   private float i;


   public ain(Player var1) {
      super(var1.aq);
      this.t = true;
      var1.a((ajw)dp.f, 1);
   }

   public void a() {
      if(this.minecraft.c.h()) {
         this.minecraft.addMenu((GUIManager)(new sr(this.minecraft.h)));
      }

   }

   public void c() {
      this.buttonList.clear();
      if(this.minecraft.c.h()) {
         this.minecraft.addMenu((GUIManager)(new sr(this.minecraft.h)));
      } else {
         super.c();
         if(!this.minecraft.h.bg().isEmpty()) {
            this.e = 160 + (this.q - this.b - 200) / 2;
         }
      }

   }

   protected void d() {
      this.u.b(LocalizationManagerWrapper.getLocaleString("container.crafting"), 86, 16, 4210752);
   }

   public void a(int var1, int var2, float var3) {
      super.a(var1, var2, var3);
      this.h = (float)var1;
      this.i = (float)var2;
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/inventory.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.textureManager.b(var4);
      int var5 = this.e;
      int var6 = this.f;
      this.b(var5, var6, 0, 0, this.b, this.c);
      this.g();
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var5 + 51), (float)(var6 + 75), 50.0F);
      float var7 = 30.0F;
      GL11.glScalef(-var7, var7, var7);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var8 = this.minecraft.h.bd;
      float var9 = this.minecraft.h.u;
      float var10 = this.minecraft.h.v;
      float var11 = (float)(var5 + 51) - this.h;
      float var12 = (float)(var6 + 75 - 50) - this.i;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      tf.b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var12 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      this.minecraft.h.bd = (float)Math.atan((double)(var11 / 40.0F)) * 20.0F;
      this.minecraft.h.u = (float)Math.atan((double)(var11 / 40.0F)) * 40.0F;
      this.minecraft.h.v = -((float)Math.atan((double)(var12 / 40.0F))) * 20.0F;
      this.minecraft.h.bf = this.minecraft.h.u;
      GL11.glTranslatef(0.0F, this.minecraft.h.H, 0.0F);
      ahu.a.i = 180.0F;
      ahu.a.a(this.minecraft.h, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      this.minecraft.h.bd = var8;
      this.minecraft.h.u = var9;
      this.minecraft.h.v = var10;
      GL11.glPopMatrix();
      tf.a();
      GL11.glDisable('\u803a');
   }

   protected void clickButton(Button var1) {
      if(var1.buttonID == 0) {
         this.minecraft.addMenu((GUIManager)(new ro(this.minecraft.K)));
      }

      if(var1.buttonID == 1) {
         this.minecraft.addMenu((GUIManager)(new dc(this, this.minecraft.K)));
      }

   }

   private void g() {
      int var1 = this.e - 124;
      int var2 = this.f;
      int var3 = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/inventory.png");
      Collection var4 = this.minecraft.h.bg();
      if(!var4.isEmpty()) {
         int var5 = 33;
         if(var4.size() > 5) {
            var5 = 132 / (var4.size() - 1);
         }

         for(Iterator var6 = this.minecraft.h.bg().iterator(); var6.hasNext(); var2 += var5) {
            alg var7 = (alg)var6.next();
            aad var8 = aad.a[var7.a()];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.minecraft.textureManager.b(var3);
            this.b(var1, var2, 0, this.c, 140, 32);
            if(var8.d()) {
               int var9 = var8.e();
               this.b(var1 + 6, var2 + 7, 0 + var9 % 8 * 18, this.c + 32 + var9 / 8 * 18, 18, 18);
            }

            String var11 = LocalizationManagerWrapper.getLocaleString(var8.c());
            if(var7.c() == 1) {
               var11 = var11 + " II";
            } else if(var7.c() == 2) {
               var11 = var11 + " III";
            } else if(var7.c() == 3) {
               var11 = var11 + " IV";
            }

            this.u.a(var11, var1 + 10 + 18, var2 + 6, 16777215);
            String var10 = aad.a(var7);
            this.u.a(var10, var1 + 10 + 18, var2 + 6 + 10, 8355711);
         }

      }
   }
}
