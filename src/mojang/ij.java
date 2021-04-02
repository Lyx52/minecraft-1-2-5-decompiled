package mojang;

public class ij extends oy {

   private OptionParser f;


   public ij(OptionParser var1) {
      this.f = var1;
   }

   public void a() {
      this.a = 0.0F;
      this.b = 0.0F;
      if(this.f.key_forward.e) {
         ++this.b;
      }

      if(this.f.key_back.e) {
         --this.b;
      }

      if(this.f.key_left.e) {
         ++this.a;
      }

      if(this.f.key_right.e) {
         --this.a;
      }

      this.d = this.f.key_jump.e;
      this.e = this.f.key_sneak.e;
      if(this.e) {
         this.a = (float)((double)this.a * 0.3D);
         this.b = (float)((double)this.b * 0.3D);
      }

   }
}
