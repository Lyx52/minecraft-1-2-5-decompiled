
public class yc extends rc {

   private tl a;
   private ed b;
   private int c;


   public yc(tl var1) {
      this.a = var1;
      this.a(3);
   }

   public boolean a() {
      if(!this.a.k.m()) {
         return false;
      } else if(this.a.aO().nextInt(8000) != 0) {
         return false;
      } else {
         this.b = (ed)this.a.k.a(ed.class, this.a.y.b(6.0D, 2.0D, 6.0D), this.a);
         return this.b != null;
      }
   }

   public boolean b() {
      return this.c > 0;
   }

   public void c() {
      this.c = 400;
      this.a.a(true);
   }

   public void d() {
      this.a.a(false);
      this.b = null;
   }

   public void e() {
      this.a.aJ().a(this.b, 30.0F, 30.0F);
      --this.c;
   }
}
