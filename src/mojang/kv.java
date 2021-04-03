package mojang;

import org.lwjgl.opengl.GL11;

public class kv extends gb {

   private ahg h;


   public kv(aak var1, ahg var2) {
      super(new ug(var1, var2));
      this.h = var2;
   }

   protected void d() {
      this.u.b(LocalizationManagerWrapper.getLocaleString("container.furnace"), 60, 6, 4210752);
      this.u.b(LocalizationManagerWrapper.getLocaleString("container.inventory"), 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/furnace.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.textureManager.b(var4);
      int var5 = (this.q - this.b) / 2;
      int var6 = (this.r - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.c);
      int var7;
      if(this.h.g()) {
         var7 = this.h.d(12);
         this.b(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
      }

      var7 = this.h.c(24);
      this.b(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
   }
}
