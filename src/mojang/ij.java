package mojang;

public class ij extends oy {

   private hu f;


   public ij(hu var1) {
      this.f = var1;
   }

   public void a() {
      this.a = 0.0F;
      this.b = 0.0F;
      if(this.f.n.e) {
         ++this.b;
      }

      if(this.f.p.e) {
         --this.b;
      }

      if(this.f.o.e) {
         ++this.a;
      }

      if(this.f.q.e) {
         --this.a;
      }

      this.d = this.f.r.e;
      this.e = this.f.v.e;
      if(this.e) {
         this.a = (float)((double)this.a * 0.3D);
         this.b = (float)((double)this.b * 0.3D);
      }

   }
}
