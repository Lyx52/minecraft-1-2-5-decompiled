import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class qd extends oo {

   private Minecraft a;
   private int b;
   private int c;
   private String d;
   private String e;
   private aeb f;
   private long h;
   private tw i;
   private boolean j;


   public qd(Minecraft var1) {
      this.a = var1;
      this.i = new tw();
   }

   public void a(aeb var1) {
      this.d = cy.a("achievement.get");
      this.e = cy.a(var1.i());
      this.h = System.currentTimeMillis();
      this.f = var1;
      this.j = false;
   }

   public void b(aeb var1) {
      this.d = cy.a(var1.i());
      this.e = var1.f();
      this.h = System.currentTimeMillis() - 2500L;
      this.f = var1;
      this.j = true;
   }

   private void b() {
      GL11.glViewport(0, 0, this.a.d, this.a.e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.b = this.a.d;
      this.c = this.a.e;
      agd var1 = new agd(this.a.A, this.a.d, this.a.e);
      this.b = var1.a();
      this.c = var1.b();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.b, (double)this.c, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   public void a() {
      if(this.f != null && this.h != 0L) {
         double var1 = (double)(System.currentTimeMillis() - this.h) / 3000.0D;
         if(!this.j && (var1 < 0.0D || var1 > 1.0D)) {
            this.h = 0L;
         } else {
            this.b();
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            double var3 = var1 * 2.0D;
            if(var3 > 1.0D) {
               var3 = 2.0D - var3;
            }

            var3 *= 4.0D;
            var3 = 1.0D - var3;
            if(var3 < 0.0D) {
               var3 = 0.0D;
            }

            var3 *= var3;
            var3 *= var3;
            int var5 = this.b - 160;
            int var6 = 0 - (int)(var3 * 36.0D);
            int var7 = this.a.p.b("/achievement/bg.png");
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3553);
            GL11.glBindTexture(3553, var7);
            GL11.glDisable(2896);
            this.b(var5, var6, 96, 202, 160, 32);
            if(this.j) {
               this.a.q.a(this.e, var5 + 30, var6 + 7, 120, -1);
            } else {
               this.a.q.b(this.d, var5 + 30, var6 + 7, -256);
               this.a.q.b(this.e, var5 + 30, var6 + 18, -1);
            }

            tf.c();
            GL11.glDisable(2896);
            GL11.glEnable('\u803a');
            GL11.glEnable(2903);
            GL11.glEnable(2896);
            this.i.a(this.a.q, this.a.p, this.f.d, var5 + 8, var6 + 8);
            GL11.glDisable(2896);
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
         }
      }
   }
}
