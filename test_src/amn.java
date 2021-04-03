
public class amn extends yu {

   private final io a;
   private yw f;
   private int g;


   public amn(yw var1, io var2, io var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.f = var1;
      this.a = var2;
   }

   public boolean a(aan var1) {
      return false;
   }

   public aan a(int var1) {
      if(this.c()) {
         this.g += Math.min(var1, this.b().a);
      }

      return super.a(var1);
   }

   protected void a(aan var1, int var2) {
      this.g += var2;
      this.c(var1);
   }

   protected void c(aan var1) {
      var1.a(this.f.k, this.f, this.g);
      this.g = 0;
      if(var1.c == pb.ay.bO) {
         this.f.a((ajw)dp.h, 1);
      } else if(var1.c == yr.t.bQ) {
         this.f.a((ajw)dp.i, 1);
      } else if(var1.c == pb.aB.bO) {
         this.f.a((ajw)dp.j, 1);
      } else if(var1.c == yr.N.bQ) {
         this.f.a((ajw)dp.l, 1);
      } else if(var1.c == yr.U.bQ) {
         this.f.a((ajw)dp.m, 1);
      } else if(var1.c == yr.aZ.bQ) {
         this.f.a((ajw)dp.n, 1);
      } else if(var1.c == yr.x.bQ) {
         this.f.a((ajw)dp.o, 1);
      } else if(var1.c == yr.r.bQ) {
         this.f.a((ajw)dp.r, 1);
      } else if(var1.c == pb.bE.bO) {
         this.f.a((ajw)dp.D, 1);
      } else if(var1.c == pb.an.bO) {
         this.f.a((ajw)dp.F, 1);
      }

   }

   public void b(aan var1) {
      this.c(var1);

      for(int var2 = 0; var2 < this.a.a(); ++var2) {
         aan var3 = this.a.k_(var2);
         if(var3 != null) {
            this.a.a(var2, 1);
            if(var3.a().m()) {
               aan var4 = new aan(var3.a().l());
               if(!var3.a().i(var3) || !this.f.ap.a(var4)) {
                  if(this.a.k_(var2) == null) {
                     this.a.a(var2, var4);
                  } else {
                     this.f.a(var4);
                  }
               }
            }
         }
      }

   }
}
