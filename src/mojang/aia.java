package mojang;

import java.io.File;
import java.util.List;

public class aia extends eg {

   public aia(File var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   public ua a(alb var1) {
      File var2 = this.a();
      File var3;
      if(var1 instanceof akf) {
         var3 = new File(var2, "DIM-1");
         var3.mkdirs();
         return new aiv(var3);
      } else if(var1 instanceof ii) {
         var3 = new File(var2, "DIM1");
         var3.mkdirs();
         return new aiv(var3);
      } else {
         return new aiv(var2);
      }
   }

   public void a(WorldParser var1, List var2) {
      var1.setVersion(19133);
      super.a(var1, var2);
   }
}
