package mojang;

public class sc extends kw {

   public String[] a = new String[]{"", "", "", ""};
   public int b = -1;
   private boolean c = true;


   public void b(CompundTag var1) {
      super.b(var1);
      var1.addString("Text1", this.a[0]);
      var1.addString("Text2", this.a[1]);
      var1.addString("Text3", this.a[2]);
      var1.addString("Text4", this.a[3]);
   }

   public void a(CompundTag var1) {
      this.c = false;
      super.a(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         this.a[var2] = var1.getString("Text" + (var2 + 1));
         if(this.a[var2].length() > 15) {
            this.a[var2] = this.a[var2].substring(0, 15);
         }
      }

   }

   public boolean a() {
      return this.c;
   }

   public void a(boolean var1) {
      this.c = var1;
   }
}
