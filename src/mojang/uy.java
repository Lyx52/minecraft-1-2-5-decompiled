package mojang;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class uy extends vp {

   private int a;


   public void c() {
      this.s.clear();
      if(this.p.f.B().s()) {
         this.s.add(new abp(1, this.q / 2 - 100, this.r / 4 + 96, cy.a("deathScreen.deleteWorld")));
      } else {
         this.s.add(new abp(1, this.q / 2 - 100, this.r / 4 + 72, cy.a("deathScreen.respawn")));
         this.s.add(new abp(2, this.q / 2 - 100, this.r / 4 + 96, cy.a("deathScreen.titleScreen")));
         if(this.p.k == null) {
            ((abp)this.s.get(1)).h = false;
         }
      }

      abp var2;
      for(Iterator var1 = this.s.iterator(); var1.hasNext(); var2.h = false) {
         var2 = (abp)var1.next();
      }

   }

   protected void a(char var1, int var2) {}

   protected void a(abp var1) {
      switch(var1.f) {
      case 1:
         if(this.p.f.B().s()) {
            String var2 = this.p.f.A().d();
            this.p.b("Deleting world");
            kb var3 = this.p.c();
            var3.d();
            var3.c(var2);
            this.p.a((vp)(new xt()));
         } else {
            this.p.h.ag();
            this.p.a((vp)null);
         }
         break;
      case 2:
         if(this.p.l()) {
            this.p.f.g();
         }

         this.p.a((xd)null);
         this.p.a((vp)(new xt()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.q, this.r, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      boolean var4 = this.p.f.B().s();
      String var5 = var4?cy.a("deathScreen.title.hardcore"):cy.a("deathScreen.title");
      this.a(this.u, var5, this.q / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      if(var4) {
         this.a(this.u, cy.a("deathScreen.hardcoreInfo"), this.q / 2, 144, 16777215);
      }

      this.a(this.u, cy.a("deathScreen.score") + ": §e" + this.p.h.ar(), this.q / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }

   public void a() {
      super.a();
      ++this.a;
      abp var2;
      if(this.a == 20) {
         for(Iterator var1 = this.s.iterator(); var1.hasNext(); var2.h = true) {
            var2 = (abp)var1.next();
         }
      }

   }
}
