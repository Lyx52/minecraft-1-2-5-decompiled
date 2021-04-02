package mojang;

import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class sm extends gb {

   private static lk w = new lk();
   private Random x = new Random();
   private gm y;
   public int h;
   public float i;
   public float j;
   public float k;
   public float l;
   public float m;
   public float n;
   aan o;


   public sm(aak var1, World var2, int var3, int var4, int var5) {
      super(new gm(var1, var2, var3, var4, var5));
      this.y = (gm)this.d;
   }

   public void e() {
      super.e();
   }

   protected void d() {
      this.u.b(cy.a("container.enchant"), 12, 6, 4210752);
      this.u.b(cy.a("container.inventory"), 8, this.c - 96 + 2, 4210752);
   }

   public void a() {
      super.a();
      this.D_();
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      int var4 = (this.q - this.b) / 2;
      int var5 = (this.r - this.c) / 2;

      for(int var6 = 0; var6 < 3; ++var6) {
         int var7 = var1 - (var4 + 60);
         int var8 = var2 - (var5 + 14 + 19 * var6);
         if(var7 >= 0 && var8 >= 0 && var7 < 108 && var8 < 19 && this.y.a(this.minecraft.h, var6)) {
            this.minecraft.c.a(this.y.f, var6);
         }
      }

   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.minecraft.p.b("/mojang/gui/enchant.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.p.b(var4);
      int var5 = (this.q - this.b) / 2;
      int var6 = (this.r - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      WindowScaler var7 = new WindowScaler(this.minecraft.options, this.minecraft.width, this.minecraft.height);
      GL11.glViewport((var7.getWidth() - 320) / 2 * var7.scale, (var7.getHeight() - 240) / 2 * var7.scale, 320 * var7.scale, 240 * var7.scale);
      GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
      GLU.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
      float var8 = 1.0F;
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      tf.b();
      GL11.glTranslatef(0.0F, 3.3F, -16.0F);
      GL11.glScalef(var8, var8, var8);
      float var9 = 5.0F;
      GL11.glScalef(var9, var9, var9);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      this.minecraft.p.b(this.minecraft.p.b("/mojang/item/book.png"));
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      float var10 = this.n + (this.m - this.n) * var1;
      GL11.glTranslatef((1.0F - var10) * 0.2F, (1.0F - var10) * 0.1F, (1.0F - var10) * 0.25F);
      GL11.glRotatef(-(1.0F - var10) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      float var11 = this.j + (this.i - this.j) * var1 + 0.25F;
      float var12 = this.j + (this.i - this.j) * var1 + 0.75F;
      var11 = (var11 - (float) Utils.b((double)var11)) * 1.6F - 0.3F;
      var12 = (var12 - (float) Utils.b((double)var12)) * 1.6F - 0.3F;
      if(var11 < 0.0F) {
         var11 = 0.0F;
      }

      if(var12 < 0.0F) {
         var12 = 0.0F;
      }

      if(var11 > 1.0F) {
         var11 = 1.0F;
      }

      if(var12 > 1.0F) {
         var12 = 1.0F;
      }

      GL11.glEnable('\u803a');
      w.a((BaseEntity)null, 0.0F, var11, var12, var10, 0.0F, 0.0625F);
      GL11.glDisable('\u803a');
      tf.a();
      GL11.glMatrixMode(5889);
      GL11.glViewport(0, 0, this.minecraft.width, this.minecraft.height);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      tf.a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.p.b(var4);
      gy.a.a(this.y.b);

      for(int var13 = 0; var13 < 3; ++var13) {
         String var14 = gy.a.a();
         this.g = 0.0F;
         this.minecraft.p.b(var4);
         int var15 = this.y.c[var13];
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         if(var15 == 0) {
            this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
         } else {
            String var16 = "" + var15;
            nl var17 = this.minecraft.r;
            int var18 = 6839882;
            if(this.minecraft.h.aU < var15 && !this.minecraft.h.aT.d) {
               this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
               var17.a(var14, var5 + 62, var6 + 16 + 19 * var13, 104, (var18 & 16711422) >> 1);
               var17 = this.minecraft.q;
               var18 = 4226832;
               var17.a(var16, var5 + 62 + 104 - var17.a(var16), var6 + 16 + 19 * var13 + 7, var18);
            } else {
               int var19 = var2 - (var5 + 60);
               int var20 = var3 - (var6 + 14 + 19 * var13);
               if(var19 >= 0 && var20 >= 0 && var19 < 108 && var20 < 19) {
                  this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 204, 108, 19);
                  var18 = 16777088;
               } else {
                  this.b(var5 + 60, var6 + 14 + 19 * var13, 0, 166, 108, 19);
               }

               var17.a(var14, var5 + 62, var6 + 16 + 19 * var13, 104, var18);
               var17 = this.minecraft.q;
               var18 = 8453920;
               var17.a(var16, var5 + 62 + 104 - var17.a(var16), var6 + 16 + 19 * var13 + 7, var18);
            }
         }
      }

   }

   public void D_() {
      aan var1 = this.d.b((int)0).b();
      if(!aan.b(var1, this.o)) {
         this.o = var1;

         do {
            this.k += (float)(this.x.nextInt(4) - this.x.nextInt(4));
         } while(this.i <= this.k + 1.0F && this.i >= this.k - 1.0F);
      }

      ++this.h;
      this.j = this.i;
      this.n = this.m;
      boolean var2 = false;

      for(int var3 = 0; var3 < 3; ++var3) {
         if(this.y.c[var3] != 0) {
            var2 = true;
         }
      }

      if(var2) {
         this.m += 0.2F;
      } else {
         this.m -= 0.2F;
      }

      if(this.m < 0.0F) {
         this.m = 0.0F;
      }

      if(this.m > 1.0F) {
         this.m = 1.0F;
      }

      float var5 = (this.k - this.i) * 0.4F;
      float var4 = 0.2F;
      if(var5 < -var4) {
         var5 = -var4;
      }

      if(var5 > var4) {
         var5 = var4;
      }

      this.l += (var5 - this.l) * 0.9F;
      this.i += this.l;
   }

}
