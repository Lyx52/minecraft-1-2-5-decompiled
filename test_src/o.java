import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class o extends Canvas {

   // $FF: synthetic field
   final MinecraftApplet a;


   public o(MinecraftApplet var1) {
      this.a = var1;
   }

   public synchronized void addNotify() {
      super.addNotify();
      this.a.a();
   }

   public synchronized void removeNotify() {
      this.a.b();
      super.removeNotify();
   }
}
