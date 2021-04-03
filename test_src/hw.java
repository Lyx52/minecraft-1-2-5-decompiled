import java.util.Comparator;

class hw implements Comparator {

   // $FF: synthetic field
   final fr a;


   hw(fr var1) {
      this.a = var1;
   }

   public int a(wf var1, wf var2) {
      return var1 instanceof aif && var2 instanceof aai?1:(var2 instanceof aif && var1 instanceof aai?-1:(var2.a() < var1.a()?-1:(var2.a() > var1.a()?1:0)));
   }
}
