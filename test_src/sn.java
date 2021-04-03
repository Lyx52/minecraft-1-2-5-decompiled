import java.util.Iterator;
import java.util.Random;

public class sn extends agy {

   private Random a = new Random();


   protected sn(int var1) {
      super(var1, acn.d);
      this.bN = 26;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public int d() {
      return 22;
   }

   public void a(xd var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      if(var5 == this.bO) {
         this.h(var1, var2, var3, var4 - 1);
      }

      if(var6 == this.bO) {
         this.h(var1, var2, var3, var4 + 1);
      }

      if(var7 == this.bO) {
         this.h(var1, var2 - 1, var3, var4);
      }

      if(var8 == this.bO) {
         this.h(var1, var2 + 1, var3, var4);
      }

   }

   public void a(xd var1, int var2, int var3, int var4, acq var5) {
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      byte var10 = 0;
      int var11 = gk.c((double)(var5.u * 4.0F / 360.0F) + 0.5D) & 3;
      if(var11 == 0) {
         var10 = 2;
      }

      if(var11 == 1) {
         var10 = 5;
      }

      if(var11 == 2) {
         var10 = 3;
      }

      if(var11 == 3) {
         var10 = 4;
      }

      if(var6 != this.bO && var7 != this.bO && var8 != this.bO && var9 != this.bO) {
         var1.f(var2, var3, var4, var10);
      } else {
         if((var6 == this.bO || var7 == this.bO) && (var10 == 4 || var10 == 5)) {
            if(var6 == this.bO) {
               var1.f(var2, var3, var4 - 1, var10);
            } else {
               var1.f(var2, var3, var4 + 1, var10);
            }

            var1.f(var2, var3, var4, var10);
         }

         if((var8 == this.bO || var9 == this.bO) && (var10 == 2 || var10 == 3)) {
            if(var8 == this.bO) {
               var1.f(var2 - 1, var3, var4, var10);
            } else {
               var1.f(var2 + 1, var3, var4, var10);
            }

            var1.f(var2, var3, var4, var10);
         }
      }

   }

   public void h(xd var1, int var2, int var3, int var4) {
      if(!var1.F) {
         int var5 = var1.a(var2, var3, var4 - 1);
         int var6 = var1.a(var2, var3, var4 + 1);
         int var7 = var1.a(var2 - 1, var3, var4);
         int var8 = var1.a(var2 + 1, var3, var4);
         boolean var9 = true;
         int var10;
         int var11;
         boolean var12;
         byte var13;
         int var14;
         if(var5 != this.bO && var6 != this.bO) {
            if(var7 != this.bO && var8 != this.bO) {
               var13 = 3;
               if(pb.n[var5] && !pb.n[var6]) {
                  var13 = 3;
               }

               if(pb.n[var6] && !pb.n[var5]) {
                  var13 = 2;
               }

               if(pb.n[var7] && !pb.n[var8]) {
                  var13 = 5;
               }

               if(pb.n[var8] && !pb.n[var7]) {
                  var13 = 4;
               }
            } else {
               var10 = var1.a(var7 == this.bO?var2 - 1:var2 + 1, var3, var4 - 1);
               var11 = var1.a(var7 == this.bO?var2 - 1:var2 + 1, var3, var4 + 1);
               var13 = 3;
               var12 = true;
               if(var7 == this.bO) {
                  var14 = var1.e(var2 - 1, var3, var4);
               } else {
                  var14 = var1.e(var2 + 1, var3, var4);
               }

               if(var14 == 2) {
                  var13 = 2;
               }

               if((pb.n[var5] || pb.n[var10]) && !pb.n[var6] && !pb.n[var11]) {
                  var13 = 3;
               }

               if((pb.n[var6] || pb.n[var11]) && !pb.n[var5] && !pb.n[var10]) {
                  var13 = 2;
               }
            }
         } else {
            var10 = var1.a(var2 - 1, var3, var5 == this.bO?var4 - 1:var4 + 1);
            var11 = var1.a(var2 + 1, var3, var5 == this.bO?var4 - 1:var4 + 1);
            var13 = 5;
            var12 = true;
            if(var5 == this.bO) {
               var14 = var1.e(var2, var3, var4 - 1);
            } else {
               var14 = var1.e(var2, var3, var4 + 1);
            }

            if(var14 == 4) {
               var13 = 4;
            }

            if((pb.n[var7] || pb.n[var10]) && !pb.n[var8] && !pb.n[var11]) {
               var13 = 5;
            }

            if((pb.n[var8] || pb.n[var11]) && !pb.n[var7] && !pb.n[var10]) {
               var13 = 4;
            }
         }

         var1.f(var2, var3, var4, var13);
      }
   }

   public int d(ali var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.bN - 1;
      } else if(var5 == 0) {
         return this.bN - 1;
      } else {
         int var6 = var1.a(var2, var3, var4 - 1);
         int var7 = var1.a(var2, var3, var4 + 1);
         int var8 = var1.a(var2 - 1, var3, var4);
         int var9 = var1.a(var2 + 1, var3, var4);
         int var10;
         int var11;
         int var12;
         byte var13;
         if(var6 != this.bO && var7 != this.bO) {
            if(var8 != this.bO && var9 != this.bO) {
               byte var14 = 3;
               if(pb.n[var6] && !pb.n[var7]) {
                  var14 = 3;
               }

               if(pb.n[var7] && !pb.n[var6]) {
                  var14 = 2;
               }

               if(pb.n[var8] && !pb.n[var9]) {
                  var14 = 5;
               }

               if(pb.n[var9] && !pb.n[var8]) {
                  var14 = 4;
               }

               return var5 == var14?this.bN + 1:this.bN;
            } else if(var5 != 4 && var5 != 5) {
               var10 = 0;
               if(var8 == this.bO) {
                  var10 = -1;
               }

               var11 = var1.a(var8 == this.bO?var2 - 1:var2 + 1, var3, var4 - 1);
               var12 = var1.a(var8 == this.bO?var2 - 1:var2 + 1, var3, var4 + 1);
               if(var5 == 3) {
                  var10 = -1 - var10;
               }

               var13 = 3;
               if((pb.n[var6] || pb.n[var11]) && !pb.n[var7] && !pb.n[var12]) {
                  var13 = 3;
               }

               if((pb.n[var7] || pb.n[var12]) && !pb.n[var6] && !pb.n[var11]) {
                  var13 = 2;
               }

               return (var5 == var13?this.bN + 16:this.bN + 32) + var10;
            } else {
               return this.bN;
            }
         } else if(var5 != 2 && var5 != 3) {
            var10 = 0;
            if(var6 == this.bO) {
               var10 = -1;
            }

            var11 = var1.a(var2 - 1, var3, var6 == this.bO?var4 - 1:var4 + 1);
            var12 = var1.a(var2 + 1, var3, var6 == this.bO?var4 - 1:var4 + 1);
            if(var5 == 4) {
               var10 = -1 - var10;
            }

            var13 = 5;
            if((pb.n[var8] || pb.n[var11]) && !pb.n[var9] && !pb.n[var12]) {
               var13 = 5;
            }

            if((pb.n[var9] || pb.n[var12]) && !pb.n[var8] && !pb.n[var11]) {
               var13 = 4;
            }

            return (var5 == var13?this.bN + 16:this.bN + 32) + var10;
         } else {
            return this.bN;
         }
      }
   }

   public int a_(int var1) {
      return var1 == 1?this.bN - 1:(var1 == 0?this.bN - 1:(var1 == 3?this.bN + 1:this.bN));
   }

   public boolean e(xd var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.a(var2 - 1, var3, var4) == this.bO) {
         ++var5;
      }

      if(var1.a(var2 + 1, var3, var4) == this.bO) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 - 1) == this.bO) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 + 1) == this.bO) {
         ++var5;
      }

      return var5 > 1?false:(this.i(var1, var2 - 1, var3, var4)?false:(this.i(var1, var2 + 1, var3, var4)?false:(this.i(var1, var2, var3, var4 - 1)?false:!this.i(var1, var2, var3, var4 + 1))));
   }

   private boolean i(xd var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4) != this.bO?false:(var1.a(var2 - 1, var3, var4) == this.bO?true:(var1.a(var2 + 1, var3, var4) == this.bO?true:(var1.a(var2, var3, var4 - 1) == this.bO?true:var1.a(var2, var3, var4 + 1) == this.bO)));
   }

   public void a(xd var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      hb var6 = (hb)var1.b(var2, var3, var4);
      if(var6 != null) {
         var6.b();
      }

   }

   public void b_(xd var1, int var2, int var3, int var4) {
      hb var5 = (hb)var1.b(var2, var3, var4);
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.a(); ++var6) {
            aan var7 = var5.k_(var6);
            if(var7 != null) {
               float var8 = this.a.nextFloat() * 0.8F + 0.1F;
               float var9 = this.a.nextFloat() * 0.8F + 0.1F;

               fq var12;
               for(float var10 = this.a.nextFloat() * 0.8F + 0.1F; var7.a > 0; var1.a((nn)var12)) {
                  int var11 = this.a.nextInt(21) + 10;
                  if(var11 > var7.a) {
                     var11 = var7.a;
                  }

                  var7.a -= var11;
                  var12 = new fq(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new aan(var7.c, var11, var7.i()));
                  float var13 = 0.05F;
                  var12.r = (double)((float)this.a.nextGaussian() * var13);
                  var12.s = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
                  var12.t = (double)((float)this.a.nextGaussian() * var13);
                  if(var7.n()) {
                     var12.a.d((ady)var7.o().b());
                  }
               }
            }
         }
      }

      super.b_(var1, var2, var3, var4);
   }

   public boolean b(xd var1, int var2, int var3, int var4, yw var5) {
      Object var6 = (hb)var1.b(var2, var3, var4);
      if(var6 == null) {
         return true;
      } else if(var1.h(var2, var3 + 1, var4)) {
         return true;
      } else if(j(var1, var2, var3, var4)) {
         return true;
      } else if(var1.a(var2 - 1, var3, var4) == this.bO && (var1.h(var2 - 1, var3 + 1, var4) || j(var1, var2 - 1, var3, var4))) {
         return true;
      } else if(var1.a(var2 + 1, var3, var4) == this.bO && (var1.h(var2 + 1, var3 + 1, var4) || j(var1, var2 + 1, var3, var4))) {
         return true;
      } else if(var1.a(var2, var3, var4 - 1) == this.bO && (var1.h(var2, var3 + 1, var4 - 1) || j(var1, var2, var3, var4 - 1))) {
         return true;
      } else if(var1.a(var2, var3, var4 + 1) == this.bO && (var1.h(var2, var3 + 1, var4 + 1) || j(var1, var2, var3, var4 + 1))) {
         return true;
      } else {
         if(var1.a(var2 - 1, var3, var4) == this.bO) {
            var6 = new kl("Large chest", (hb)var1.b(var2 - 1, var3, var4), (io)var6);
         }

         if(var1.a(var2 + 1, var3, var4) == this.bO) {
            var6 = new kl("Large chest", (io)var6, (hb)var1.b(var2 + 1, var3, var4));
         }

         if(var1.a(var2, var3, var4 - 1) == this.bO) {
            var6 = new kl("Large chest", (hb)var1.b(var2, var3, var4 - 1), (io)var6);
         }

         if(var1.a(var2, var3, var4 + 1) == this.bO) {
            var6 = new kl("Large chest", (io)var6, (hb)var1.b(var2, var3, var4 + 1));
         }

         if(var1.F) {
            return true;
         } else {
            var5.a((io)var6);
            return true;
         }
      }
   }

   public kw u_() {
      return new hb();
   }

   private static boolean j(xd var0, int var1, int var2, int var3) {
      Iterator var4 = var0.a(uo.class, wu.b((double)var1, (double)(var2 + 1), (double)var3, (double)(var1 + 1), (double)(var2 + 2), (double)(var3 + 1))).iterator();

      uo var6;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         nn var5 = (nn)var4.next();
         var6 = (uo)var5;
      } while(!var6.af());

      return true;
   }
}
