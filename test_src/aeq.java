import java.io.File;
import java.io.FilenameFilter;

class aeq implements FilenameFilter {

   // $FF: synthetic field
   final fp a;


   aeq(fp var1) {
      this.a = var1;
   }

   public boolean accept(File var1, String var2) {
      return var2.endsWith(".mcr");
   }
}
