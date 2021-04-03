package mojang;

import mojang.net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class GUIBackground implements GUIBackgroundInterface {

   private String a = "";
   private Minecraft minecraft;
   private String c = "";
   private long d = System.currentTimeMillis();
   private boolean displayed = false;


   public GUIBackground(Minecraft minecraft) {
      this.minecraft = minecraft;
   }

   public void switchBackgroundString(String str) {
      this.displayed = false;
      this.changeMainString(str);
   }

   public void b(String var1) {
      this.displayed = true;
      this.changeMainString(this.c);
   }

   public void changeMainString(String name) {
      if(!this.minecraft.running) {
         if(!this.displayed) {
            throw new MinecraftError();
         }
      } else {
         this.c = name;
         WindowScaler windowScaler = new WindowScaler(this.minecraft.options, this.minecraft.width, this.minecraft.height);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, windowScaler.widthScaled, windowScaler.heightScaled, 0.0D, 100.0D, 300.0D);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      }
   }

   public void changeSecondaryString(String str) {
      if(!this.minecraft.running) {
         if(!this.displayed) {
            throw new MinecraftError();
         }
      } else {
         this.d = 0L;
         this.a = str;
         this.createBackground(-1);
         this.d = 0L;
      }
   }

   public void createBackground(int var1) {
      if(!this.minecraft.running) {
         if(!this.displayed) {
            throw new MinecraftError();
         }
      } else {
         long var2 = System.currentTimeMillis();
         if(var2 - this.d >= 100L) {
            this.d = var2;
            WindowScaler var4 = new WindowScaler(this.minecraft.options, this.minecraft.width, this.minecraft.height);
            int var5 = var4.getWidth();
            int var6 = var4.getHeight();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0D, var4.widthScaled, var4.heightScaled, 0.0D, 100.0D, 300.0D);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200.0F);
            GL11.glClear(16640);
            Tessalator tessalator = Tessalator.tessalatorInstance;
            int backgroundTextureID = this.minecraft.textureManager.readImageFromLocation("/mojang/gui/background.png");
            GL11.glBindTexture(3553, backgroundTextureID);
            float var9 = 32.0F;
            tessalator.b();
            tessalator.c(4210752);
            tessalator.a(0.0D, (double)var6, 0.0D, 0.0D, (double)((float)var6 / var9));
            tessalator.a((double)var5, (double)var6, 0.0D, (double)((float)var5 / var9), (double)((float)var6 / var9));
            tessalator.a((double)var5, 0.0D, 0.0D, (double)((float)var5 / var9), 0.0D);
            tessalator.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
            tessalator.a();
            if(var1 >= 0) {
               byte var10 = 100;
               byte var11 = 2;
               int var12 = var5 / 2 - var10 / 2;
               int var13 = var6 / 2 + 16;
               GL11.glDisable(3553);
               tessalator.b();
               tessalator.c(8421504);
               tessalator.a((double)var12, (double)var13, 0.0D);
               tessalator.a((double)var12, (double)(var13 + var11), 0.0D);
               tessalator.a((double)(var12 + var10), (double)(var13 + var11), 0.0D);
               tessalator.a((double)(var12 + var10), (double)var13, 0.0D);
               tessalator.c(8454016);
               tessalator.a((double)var12, (double)var13, 0.0D);
               tessalator.a((double)var12, (double)(var13 + var11), 0.0D);
               tessalator.a((double)(var12 + var1), (double)(var13 + var11), 0.0D);
               tessalator.a((double)(var12 + var1), (double)var13, 0.0D);
               tessalator.a();
               GL11.glEnable(3553);
            }

            this.minecraft.q.a(this.c, (var5 - this.minecraft.q.a(this.c)) / 2, var6 / 2 - 4 - 16, 16777215);
            this.minecraft.q.a(this.a, (var5 - this.minecraft.q.a(this.a)) / 2, var6 / 2 - 4 + 8, 16777215);
            Display.update();

            try {
               Thread.yield();
            } catch (Exception var14) {
               ;
            }

         }
      }
   }
}
