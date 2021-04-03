import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public final class hq extends Minecraft {

   // $FF: synthetic field
   final Frame a;


   public hq(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6, Frame var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.a = var7;
   }

   public void a(ja var1) {
      this.a.removeAll();
      this.a.add(new uu(var1), "Center");
      this.a.validate();
   }
}
