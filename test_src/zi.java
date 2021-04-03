
public class zi extends rc {

   private acq b;
   private xd c;
   int a = 0;


   public zi(acq var1) {
      this.b = var1;
      this.c = var1.k;
      this.a(7);
   }

   public boolean a() {
      if(this.b.aO().nextInt(this.b.bi()?50:1000) != 0) {
         return false;
      } else {
         int var1 = gk.c(this.b.o);
         int var2 = gk.c(this.b.p);
         int var3 = gk.c(this.b.q);
         return this.c.a(var1, var2, var3) == pb.X.bO && this.c.e(var1, var2, var3) == 1?true:this.c.a(var1, var2 - 1, var3) == pb.u.bO;
      }
   }

   public void c() {
      this.a = 40;
      this.c.a(this.b, (byte)10);
      this.b.aM().f();
   }

   public void d() {
      this.a = 0;
   }

   public boolean b() {
      return this.a > 0;
   }

   public int h() {
      return this.a;
   }

   public void e() {
      this.a = Math.max(0, this.a - 1);
      if(this.a == 4) {
         int var1 = gk.c(this.b.o);
         int var2 = gk.c(this.b.p);
         int var3 = gk.c(this.b.q);
         if(this.c.a(var1, var2, var3) == pb.X.bO) {
            this.c.g(2001, var1, var2, var3, pb.X.bO + 4096);
            this.c.g(var1, var2, var3, 0);
            this.b.v();
         } else if(this.c.a(var1, var2 - 1, var3) == pb.u.bO) {
            this.c.g(2001, var1, var2 - 1, var3, pb.u.bO);
            this.c.g(var1, var2 - 1, var3, pb.v.bO);
            this.b.v();
         }

      }
   }
}
