package mojang;

import mojang.net.minecraft.client.Minecraft;

public class hk implements yv {

   // $FF: synthetic field
   final Minecraft a;


   public hk(Minecraft var1) {
      this.a = var1;
   }

   public String a(String var1) {
      try {
         return String.format(var1, new Object[]{hu.c(this.a.A.s.d)});
      } catch (Exception var3) {
         return "Error: " + var3.getLocalizedMessage();
      }
   }
}
