package mojang;

public class alo extends agt {

   protected boolean a(int var1, int var2) {
      return this.c.nextInt(100) == 0 && this.c.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   protected pg b(int var1, int var2) {
      return new akg(this.d, this.c, var1, var2);
   }
}
