import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class if {

   private final Minecraft a;
   private final int b;
   private final int c;
   protected final int h;
   protected final int i;
   private final int d;
   private final int e;
   protected final int j;
   private int f;
   private int g;
   protected int k;
   protected int l;
   private float m = -2.0F;
   private float n;
   private float o;
   private int p = -1;
   private long q = 0L;
   private boolean r = true;
   private boolean s;
   private int t;


   public if(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.h = var4;
      this.i = var5;
      this.j = var6;
      this.e = 0;
      this.d = var2;
   }

   public void a(boolean var1) {
      this.r = var1;
   }

   protected void a(boolean var1, int var2) {
      this.s = var1;
      this.t = var2;
      if(!var1) {
         this.t = 0;
      }

   }

   protected abstract int a();

   protected abstract void a(int var1, boolean var2);

   protected abstract boolean b_(int var1);

   protected int b() {
      return this.a() * this.j + this.t;
   }

   protected abstract void c();

   protected abstract void a(int var1, int var2, int var3, int var4, adz var5);

   protected void a(int var1, int var2, adz var3) {}

   protected void a(int var1, int var2) {}

   protected void b(int var1, int var2) {}

   public int c(int var1, int var2) {
      int var3 = this.b / 2 - 110;
      int var4 = this.b / 2 + 110;
      int var5 = var2 - this.h - this.t + (int)this.o - 4;
      int var6 = var5 / this.j;
      return var1 >= var3 && var1 <= var4 && var6 >= 0 && var5 >= 0 && var6 < this.a()?var6:-1;
   }

   public void a(List var1, int var2, int var3) {
      this.f = var2;
      this.g = var3;
   }

   private void d() {
      int var1 = this.b() - (this.i - this.h - 4);
      if(var1 < 0) {
         var1 /= 2;
      }

      if(this.o < 0.0F) {
         this.o = 0.0F;
      }

      if(this.o > (float)var1) {
         this.o = (float)var1;
      }

   }

   public void a(abp var1) {
      if(var1.h) {
         if(var1.f == this.f) {
            this.o -= (float)(this.j * 2 / 3);
            this.m = -2.0F;
            this.d();
         } else if(var1.f == this.g) {
            this.o += (float)(this.j * 2 / 3);
            this.m = -2.0F;
            this.d();
         }

      }
   }

   public void a(int var1, int var2, float var3) {
      this.k = var1;
      this.l = var2;
      this.c();
      int var4 = this.a();
      int var5 = this.b / 2 + 124;
      int var6 = var5 + 6;
      int var9;
      int var10;
      int var11;
      int var13;
      int var20;
      if(Mouse.isButtonDown(0)) {
         if(this.m == -1.0F) {
            boolean var7 = true;
            if(var2 >= this.h && var2 <= this.i) {
               int var8 = this.b / 2 - 110;
               var9 = this.b / 2 + 110;
               var10 = var2 - this.h - this.t + (int)this.o - 4;
               var11 = var10 / this.j;
               if(var1 >= var8 && var1 <= var9 && var11 >= 0 && var10 >= 0 && var11 < var4) {
                  boolean var12 = var11 == this.p && System.currentTimeMillis() - this.q < 250L;
                  this.a(var11, var12);
                  this.p = var11;
                  this.q = System.currentTimeMillis();
               } else if(var1 >= var8 && var1 <= var9 && var10 < 0) {
                  this.a(var1 - var8, var2 - this.h + (int)this.o - 4);
                  var7 = false;
               }

               if(var1 >= var5 && var1 <= var6) {
                  this.n = -1.0F;
                  var20 = this.b() - (this.i - this.h - 4);
                  if(var20 < 1) {
                     var20 = 1;
                  }

                  var13 = (int)((float)((this.i - this.h) * (this.i - this.h)) / (float)this.b());
                  if(var13 < 32) {
                     var13 = 32;
                  }

                  if(var13 > this.i - this.h - 8) {
                     var13 = this.i - this.h - 8;
                  }

                  this.n /= (float)(this.i - this.h - var13) / (float)var20;
               } else {
                  this.n = 1.0F;
               }

               if(var7) {
                  this.m = (float)var2;
               } else {
                  this.m = -2.0F;
               }
            } else {
               this.m = -2.0F;
            }
         } else if(this.m >= 0.0F) {
            this.o -= ((float)var2 - this.m) * this.n;
            this.m = (float)var2;
         }
      } else {
         while(Mouse.next()) {
            int var16 = Mouse.getEventDWheel();
            if(var16 != 0) {
               if(var16 > 0) {
                  var16 = -1;
               } else if(var16 < 0) {
                  var16 = 1;
               }

               this.o += (float)(var16 * this.j / 2);
            }
         }

         this.m = -1.0F;
      }

      this.d();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      adz var18 = adz.a;
      GL11.glBindTexture(3553, this.a.p.b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var17 = 32.0F;
      var18.b();
      var18.c(2105376);
      var18.a((double)this.e, (double)this.i, 0.0D, (double)((float)this.e / var17), (double)((float)(this.i + (int)this.o) / var17));
      var18.a((double)this.d, (double)this.i, 0.0D, (double)((float)this.d / var17), (double)((float)(this.i + (int)this.o) / var17));
      var18.a((double)this.d, (double)this.h, 0.0D, (double)((float)this.d / var17), (double)((float)(this.h + (int)this.o) / var17));
      var18.a((double)this.e, (double)this.h, 0.0D, (double)((float)this.e / var17), (double)((float)(this.h + (int)this.o) / var17));
      var18.a();
      var9 = this.b / 2 - 92 - 16;
      var10 = this.h + 4 - (int)this.o;
      if(this.s) {
         this.a(var9, var10, var18);
      }

      int var14;
      for(var11 = 0; var11 < var4; ++var11) {
         var20 = var10 + var11 * this.j + this.t;
         var13 = this.j - 4;
         if(var20 <= this.i && var20 + var13 >= this.h) {
            if(this.r && this.b_(var11)) {
               var14 = this.b / 2 - 110;
               int var15 = this.b / 2 + 110;
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glDisable(3553);
               var18.b();
               var18.c(8421504);
               var18.a((double)var14, (double)(var20 + var13 + 2), 0.0D, 0.0D, 1.0D);
               var18.a((double)var15, (double)(var20 + var13 + 2), 0.0D, 1.0D, 1.0D);
               var18.a((double)var15, (double)(var20 - 2), 0.0D, 1.0D, 0.0D);
               var18.a((double)var14, (double)(var20 - 2), 0.0D, 0.0D, 0.0D);
               var18.c(0);
               var18.a((double)(var14 + 1), (double)(var20 + var13 + 1), 0.0D, 0.0D, 1.0D);
               var18.a((double)(var15 - 1), (double)(var20 + var13 + 1), 0.0D, 1.0D, 1.0D);
               var18.a((double)(var15 - 1), (double)(var20 - 1), 0.0D, 1.0D, 0.0D);
               var18.a((double)(var14 + 1), (double)(var20 - 1), 0.0D, 0.0D, 0.0D);
               var18.a();
               GL11.glEnable(3553);
            }

            this.a(var11, var9, var20, var13, var18);
         }
      }

      GL11.glDisable(2929);
      byte var19 = 4;
      this.a(0, this.h, 255, 255);
      this.a(this.i, this.c, 255, 255);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      var18.b();
      var18.a(0, 0);
      var18.a((double)this.e, (double)(this.h + var19), 0.0D, 0.0D, 1.0D);
      var18.a((double)this.d, (double)(this.h + var19), 0.0D, 1.0D, 1.0D);
      var18.a(0, 255);
      var18.a((double)this.d, (double)this.h, 0.0D, 1.0D, 0.0D);
      var18.a((double)this.e, (double)this.h, 0.0D, 0.0D, 0.0D);
      var18.a();
      var18.b();
      var18.a(0, 255);
      var18.a((double)this.e, (double)this.i, 0.0D, 0.0D, 1.0D);
      var18.a((double)this.d, (double)this.i, 0.0D, 1.0D, 1.0D);
      var18.a(0, 0);
      var18.a((double)this.d, (double)(this.i - var19), 0.0D, 1.0D, 0.0D);
      var18.a((double)this.e, (double)(this.i - var19), 0.0D, 0.0D, 0.0D);
      var18.a();
      var20 = this.b() - (this.i - this.h - 4);
      if(var20 > 0) {
         var13 = (this.i - this.h) * (this.i - this.h) / this.b();
         if(var13 < 32) {
            var13 = 32;
         }

         if(var13 > this.i - this.h - 8) {
            var13 = this.i - this.h - 8;
         }

         var14 = (int)this.o * (this.i - this.h - var13) / var20 + this.h;
         if(var14 < this.h) {
            var14 = this.h;
         }

         var18.b();
         var18.a(0, 255);
         var18.a((double)var5, (double)this.i, 0.0D, 0.0D, 1.0D);
         var18.a((double)var6, (double)this.i, 0.0D, 1.0D, 1.0D);
         var18.a((double)var6, (double)this.h, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)this.h, 0.0D, 0.0D, 0.0D);
         var18.a();
         var18.b();
         var18.a(8421504, 255);
         var18.a((double)var5, (double)(var14 + var13), 0.0D, 0.0D, 1.0D);
         var18.a((double)var6, (double)(var14 + var13), 0.0D, 1.0D, 1.0D);
         var18.a((double)var6, (double)var14, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)var14, 0.0D, 0.0D, 0.0D);
         var18.a();
         var18.b();
         var18.a(12632256, 255);
         var18.a((double)var5, (double)(var14 + var13 - 1), 0.0D, 0.0D, 1.0D);
         var18.a((double)(var6 - 1), (double)(var14 + var13 - 1), 0.0D, 1.0D, 1.0D);
         var18.a((double)(var6 - 1), (double)var14, 0.0D, 1.0D, 0.0D);
         var18.a((double)var5, (double)var14, 0.0D, 0.0D, 0.0D);
         var18.a();
      }

      this.b(var1, var2);
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   private void a(int var1, int var2, int var3, int var4) {
      adz var5 = adz.a;
      GL11.glBindTexture(3553, this.a.p.b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.b();
      var5.a(4210752, var4);
      var5.a(0.0D, (double)var2, 0.0D, 0.0D, (double)((float)var2 / var6));
      var5.a((double)this.b, (double)var2, 0.0D, (double)((float)this.b / var6), (double)((float)var2 / var6));
      var5.a(4210752, var3);
      var5.a((double)this.b, (double)var1, 0.0D, (double)((float)this.b / var6), (double)((float)var1 / var6));
      var5.a(0.0D, (double)var1, 0.0D, 0.0D, (double)((float)var1 / var6));
      var5.a();
   }
}
