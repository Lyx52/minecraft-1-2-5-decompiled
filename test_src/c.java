import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class c extends vp {

   private int a = 0;
   private List b;
   private int c = 0;
   private float d = 0.5F;


   public void a() {
      ++this.a;
      float var1 = (float)(this.c + this.r + this.r + 24) / this.d;
      if((float)this.a > var1) {
         this.d();
      }

   }

   protected void a(char var1, int var2) {
      if(var2 == 1) {
         this.d();
      }

   }

   private void d() {
      if(this.p.f.F) {
         ahv var1 = (ahv)this.p.h;
         var1.cl.c(new kx(var1.aB, (byte)this.p.f.q, this.p.f.B().t(), this.p.f.b(), 0));
      } else {
         this.p.a((vp)null);
         this.p.a(this.p.f.F, 0, true);
      }

   }

   public boolean b() {
      return true;
   }

   public void c() {
      if(this.b == null) {
         this.b = new ArrayList();

         try {
            String var1 = "";
            String var2 = "§f§k§a§b";
            short var3 = 274;
            BufferedReader var4 = new BufferedReader(new InputStreamReader(c.class.getResourceAsStream("/title/win.txt"), Charset.forName("UTF-8")));
            Random var5 = new Random(8124371L);

            int var6;
            while((var1 = var4.readLine()) != null) {
               String var7;
               String var8;
               for(var1 = var1.replaceAll("PLAYERNAME", this.p.k.b); var1.indexOf(var2) >= 0; var1 = var7 + "§f§k" + "XXXXXXXX".substring(0, var5.nextInt(4) + 3) + var8) {
                  var6 = var1.indexOf(var2);
                  var7 = var1.substring(0, var6);
                  var8 = var1.substring(var6 + var2.length());
               }

               this.b.addAll(this.p.q.c(var1, var3));
               this.b.add("");
            }

            for(var6 = 0; var6 < 8; ++var6) {
               this.b.add("");
            }

            var4 = new BufferedReader(new InputStreamReader(c.class.getResourceAsStream("/title/credits.txt"), Charset.forName("UTF-8")));

            while((var1 = var4.readLine()) != null) {
               var1 = var1.replaceAll("PLAYERNAME", this.p.k.b);
               var1 = var1.replaceAll("\t", "    ");
               this.b.addAll(this.p.q.c(var1, var3));
               this.b.add("");
            }

            this.c = this.b.size() * 12;
         } catch (Exception var9) {
            var9.printStackTrace();
         }

      }
   }

   protected void a(abp var1) {}

   private void b(int var1, int var2, float var3) {
      adz var4 = adz.a;
      GL11.glBindTexture(3553, this.p.p.b("%blur%/gui/background.png"));
      var4.b();
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = this.q;
      float var6 = 0.0F - ((float)this.a + var3) * 0.5F * this.d;
      float var7 = (float)this.r - ((float)this.a + var3) * 0.5F * this.d;
      float var8 = 0.015625F;
      float var9 = ((float)this.a + var3 - 0.0F) * 0.02F;
      float var10 = (float)(this.c + this.r + this.r + 24) / this.d;
      float var11 = (var10 - 20.0F - ((float)this.a + var3)) * 0.005F;
      if(var11 < var9) {
         var9 = var11;
      }

      if(var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= var9;
      var9 = var9 * 96.0F / 255.0F;
      var4.a(var9, var9, var9);
      var4.a(0.0D, (double)this.r, (double)this.g, 0.0D, (double)(var6 * var8));
      var4.a((double)var5, (double)this.r, (double)this.g, (double)((float)var5 * var8), (double)(var6 * var8));
      var4.a((double)var5, 0.0D, (double)this.g, (double)((float)var5 * var8), (double)(var7 * var8));
      var4.a(0.0D, 0.0D, (double)this.g, 0.0D, (double)(var7 * var8));
      var4.a();
   }

   public void a(int var1, int var2, float var3) {
      this.b(var1, var2, var3);
      adz var4 = adz.a;
      short var5 = 274;
      int var6 = this.q / 2 - var5 / 2;
      int var7 = this.r + 50;
      float var8 = -((float)this.a + var3) * this.d;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, var8, 0.0F);
      GL11.glBindTexture(3553, this.p.p.b("/title/mclogo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b(var6, var7, 0, 0, 155, 44);
      this.b(var6 + 155, var7, 0, 45, 155, 44);
      var4.c(16777215);
      int var9 = var7 + 200;

      int var10;
      for(var10 = 0; var10 < this.b.size(); ++var10) {
         if(var10 == this.b.size() - 1) {
            float var11 = (float)var9 + var8 - (float)(this.r / 2 - 6);
            if(var11 < 0.0F) {
               GL11.glTranslatef(0.0F, -var11, 0.0F);
            }
         }

         if((float)var9 + var8 + 12.0F + 8.0F > 0.0F && (float)var9 + var8 < (float)this.r) {
            String var12 = (String)this.b.get(var10);
            if(var12.startsWith("[C]")) {
               this.u.a(var12.substring(3), var6 + (var5 - this.u.a(var12.substring(3))) / 2, var9, 16777215);
            } else {
               this.u.c.setSeed((long)var10 * 4238972211L + (long)(this.a / 4));
               this.u.a(var12, var6 + 1, var9 + 1, 16777215, true);
               this.u.c.setSeed((long)var10 * 4238972211L + (long)(this.a / 4));
               this.u.a(var12, var6, var9, 16777215, false);
            }
         }

         var9 += 12;
      }

      GL11.glPopMatrix();
      GL11.glBindTexture(3553, this.p.p.b("%blur%/misc/vignette.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(0, 769);
      var4.b();
      var4.a(1.0F, 1.0F, 1.0F, 1.0F);
      var10 = this.q;
      int var13 = this.r;
      var4.a(0.0D, (double)var13, (double)this.g, 0.0D, 1.0D);
      var4.a((double)var10, (double)var13, (double)this.g, 1.0D, 1.0D);
      var4.a((double)var10, 0.0D, (double)this.g, 1.0D, 0.0D);
      var4.a(0.0D, 0.0D, (double)this.g, 0.0D, 0.0D);
      var4.a();
      GL11.glDisable(3042);
      super.a(var1, var2, var3);
   }
}
