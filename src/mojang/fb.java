package mojang;

import org.lwjgl.opengl.GL11;

public class fb extends gb {

   public fb(aak var1, az var2) {
      super(new ahf(var1, var2));
   }

   protected void d() {
      this.u.b(cy.a("container.dispenser"), 60, 6, 4210752);
      this.u.b(cy.a("container.inventory"), 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.minecraft.p.b("/mojang/gui/trap.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.p.b(var4);
      int var5 = (this.q - this.b) / 2;
      int var6 = (this.r - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
   }
}
