package mojang;

import org.lwjgl.opengl.GL11;

public class zn extends gb {

   private io h;
   private io i;
   private int j = 0;


   public zn(io var1, io var2) {
      super(new bs(var1, var2));
      this.h = var1;
      this.i = var2;
      this.t = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.j = var2.a() / 9;
      this.c = var4 + this.j * 18;
   }

   protected void d() {
      this.u.b(LocalizationManagerWrapper.getLocaleString(this.i.c()), 8, 6, 4210752);
      this.u.b(LocalizationManagerWrapper.getLocaleString(this.h.c()), 8, this.c - 96 + 2, 4210752);
   }

   protected void a(float var1, int var2, int var3) {
      int var4 = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/container.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.minecraft.textureManager.b(var4);
      int var5 = (this.q - this.b) / 2;
      int var6 = (this.r - this.c) / 2;
      this.b(var5, var6, 0, 0, this.b, this.j * 18 + 17);
      this.b(var5, var6 + this.j * 18 + 17, 0, 126, this.b, 96);
   }
}
