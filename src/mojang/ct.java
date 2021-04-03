package mojang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class ct {

   public World a;
   private int y = -1;
   private static Tessalator z = Tessalator.tessalatorInstance;
   public static int b = 0;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public boolean l = false;
   public boolean[] m = new boolean[2];
   public int n;
   public int o;
   public int p;
   public boolean q;
   public wu r;
   public int s;
   public boolean t = true;
   public boolean u;
   public int v;
   public boolean w;
   private boolean A = false;
   public List x = new ArrayList();
   private List B;
   private int C;


   public ct(World var1, List var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.B = var2;
      this.y = var6;
      this.c = -999;
      this.a(var3, var4, var5);
      this.q = false;
   }

   public void a(int var1, int var2, int var3) {
      if(var1 != this.c || var2 != this.d || var3 != this.e) {
         this.b();
         this.c = var1;
         this.d = var2;
         this.e = var3;
         this.n = var1 + 8;
         this.o = var2 + 8;
         this.p = var3 + 8;
         this.i = var1 & 1023;
         this.j = var2;
         this.k = var3 & 1023;
         this.f = var1 - this.i;
         this.g = var2 - this.j;
         this.h = var3 - this.k;
         float var4 = 6.0F;
         this.r = wu.a((double)((float)var1 - var4), (double)((float)var2 - var4), (double)((float)var3 - var4), (double)((float)(var1 + 16) + var4), (double)((float)(var2 + 16) + var4), (double)((float)(var3 + 16) + var4));
         GL11.glNewList(this.y + 2, 4864);
         tw.a(wu.b((double)((float)this.i - var4), (double)((float)this.j - var4), (double)((float)this.k - var4), (double)((float)(this.i + 16) + var4), (double)((float)(this.j + 16) + var4), (double)((float)(this.k + 16) + var4)));
         GL11.glEndList();
         this.f();
      }
   }

   private void g() {
      GL11.glTranslatef((float)this.i, (float)this.j, (float)this.k);
   }

   public void a() {
      if(this.q) {
         this.q = false;
         int var1 = this.c;
         int var2 = this.d;
         int var3 = this.e;
         int var4 = this.c + 16;
         int var5 = this.d + 16;
         int var6 = this.e + 16;

         for(int var7 = 0; var7 < 2; ++var7) {
            this.m[var7] = true;
         }

         ack.a = false;
         HashSet var21 = new HashSet();
         var21.addAll(this.x);
         this.x.clear();
         byte var8 = 1;
         dv var9 = new dv(this.a, var1 - var8, var2 - var8, var3 - var8, var4 + var8, var5 + var8, var6 + var8);
         if(!var9.a()) {
            ++b;
            vl var10 = new vl(var9);
            this.C = 0;

            for(int var11 = 0; var11 < 2; ++var11) {
               boolean var12 = false;
               boolean var13 = false;
               boolean var14 = false;

               for(int var15 = var2; var15 < var5; ++var15) {
                  for(int var16 = var3; var16 < var6; ++var16) {
                     for(int var17 = var1; var17 < var4; ++var17) {
                        int var18 = var9.a(var17, var15, var16);
                        if(var18 > 0) {
                           if(!var14) {
                              var14 = true;
                              GL11.glNewList(this.y + var11, 4864);
                              GL11.glPushMatrix();
                              this.g();
                              float var19 = 1.000001F;
                              GL11.glTranslatef(-8.0F, -8.0F, -8.0F);
                              GL11.glScalef(var19, var19, var19);
                              GL11.glTranslatef(8.0F, 8.0F, 8.0F);
                              z.b();
                              z.b((double)(-this.c), (double)(-this.d), (double)(-this.e));
                           }

                           if(var11 == 0 && pb.m[var18].p()) {
                              kw var23 = var9.b(var17, var15, var16);
                              if(ach.a.a(var23)) {
                                 this.x.add(var23);
                              }
                           }

                           pb var24 = pb.m[var18];
                           int var20 = var24.c();
                           if(var20 != var11) {
                              var12 = true;
                           } else if(var20 == var11) {
                              var13 |= var10.b(var24, var17, var15, var16);
                           }
                        }
                     }
                  }
               }

               if(var14) {
                  this.C += z.a();
                  GL11.glPopMatrix();
                  GL11.glEndList();
                  z.b(0.0D, 0.0D, 0.0D);
               } else {
                  var13 = false;
               }

               if(var13) {
                  this.m[var11] = false;
               }

               if(!var12) {
                  break;
               }
            }
         }

         HashSet var22 = new HashSet();
         var22.addAll(this.x);
         var22.removeAll(var21);
         this.B.addAll(var22);
         var21.removeAll(this.x);
         this.B.removeAll(var21);
         this.w = ack.a;
         this.A = true;
      }
   }

   public float a(BaseEntity var1) {
      float var2 = (float)(var1.o - (double)this.n);
      float var3 = (float)(var1.p - (double)this.o);
      float var4 = (float)(var1.q - (double)this.p);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public void b() {
      for(int var1 = 0; var1 < 2; ++var1) {
         this.m[var1] = true;
      }

      this.l = false;
      this.A = false;
   }

   public void c() {
      this.b();
      this.a = null;
   }

   public int a(int var1) {
      return !this.l?-1:(!this.m[var1]?this.y + var1:-1);
   }

   public void a(amd var1) {
      this.l = var1.a(this.r);
   }

   public void d() {
      GL11.glCallList(this.y + 2);
   }

   public boolean e() {
      return !this.A?false:this.m[0] && this.m[1];
   }

   public void f() {
      this.q = true;
   }

}
