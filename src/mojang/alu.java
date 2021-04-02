package mojang;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class alu extends vp {

   private static final String e = xn.a;
   protected String a = "Edit sign message:";
   private sc b;
   private int c;
   private int d = 0;


   public alu(sc var1) {
      this.b = var1;
   }

   public void c() {
      this.s.clear();
      Keyboard.enableRepeatEvents(true);
      this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 120, "Done"));
      this.b.a(false);
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
      if(this.p.f.F) {
         this.p.q().c(new aiu(this.b.j, this.b.k, this.b.l, this.b.a));
      }

      this.b.a(true);
   }

   public void a() {
      ++this.c;
   }

   protected void a(abp var1) {
      if(var1.h) {
         if(var1.f == 0) {
            this.b.j();
            this.p.a((vp)null);
         }

      }
   }

   protected void a(char var1, int var2) {
      if(var2 == 200) {
         this.d = this.d - 1 & 3;
      }

      if(var2 == 208 || var2 == 28) {
         this.d = this.d + 1 & 3;
      }

      if(var2 == 14 && this.b.a[this.d].length() > 0) {
         this.b.a[this.d] = this.b.a[this.d].substring(0, this.b.a[this.d].length() - 1);
      }

      if(e.indexOf(var1) >= 0 && this.b.a[this.d].length() < 15) {
         this.b.a[this.d] = this.b.a[this.d] + var1;
      }

   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.a, this.q / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.q / 2), 0.0F, 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      pb var5 = this.b.k();
      if(var5 == pb.aD) {
         float var6 = (float)(this.b.i() * 360) / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      } else {
         int var8 = this.b.i();
         float var7 = 0.0F;
         if(var8 == 2) {
            var7 = 180.0F;
         }

         if(var8 == 4) {
            var7 = 90.0F;
         }

         if(var8 == 5) {
            var7 = -90.0F;
         }

         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      }

      if(this.c / 6 % 2 == 0) {
         this.b.b = this.d;
      }

      ach.a.a(this.b, -0.5D, -0.75D, -0.5D, 0.0F);
      this.b.b = -1;
      GL11.glPopMatrix();
      super.a(var1, var2, var3);
   }

}
