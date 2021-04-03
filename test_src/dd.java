import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class dd {

   public List d = new ArrayList();
   public List e = new ArrayList();
   public int f = 0;
   private short a = 0;
   protected List g = new ArrayList();
   private Set b = new HashSet();


   protected void a(yu var1) {
      var1.c = this.e.size();
      this.e.add(var1);
      this.d.add((Object)null);
   }

   public void a() {
      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         aan var2 = ((yu)this.e.get(var1)).b();
         aan var3 = (aan)this.d.get(var1);
         if(!aan.b(var3, var2)) {
            var3 = var2 == null?null:var2.k();
            this.d.set(var1, var3);

            for(int var4 = 0; var4 < this.g.size(); ++var4) {
               ((wm)this.g.get(var4)).a(this, var1, var3);
            }
         }
      }

   }

   public boolean a(yw var1, int var2) {
      return false;
   }

   public yu b(int var1) {
      return (yu)this.e.get(var1);
   }

   public aan a(int var1) {
      yu var2 = (yu)this.e.get(var1);
      return var2 != null?var2.b():null;
   }

   public aan a(int var1, int var2, boolean var3, yw var4) {
      aan var5 = null;
      if(var2 > 1) {
         return null;
      } else {
         if(var2 == 0 || var2 == 1) {
            aak var6 = var4.ap;
            if(var1 == -999) {
               if(var6.k() != null && var1 == -999) {
                  if(var2 == 0) {
                     var4.a(var6.k());
                     var6.b((aan)null);
                  }

                  if(var2 == 1) {
                     var4.a(var6.k().a(1));
                     if(var6.k().a == 0) {
                        var6.b((aan)null);
                     }
                  }
               }
            } else if(var3) {
               aan var7 = this.a(var1);
               if(var7 != null) {
                  int var8 = var7.c;
                  var5 = var7.k();
                  yu var9 = (yu)this.e.get(var1);
                  if(var9 != null && var9.b() != null && var9.b().c == var8) {
                     this.b(var1, var2, var3, var4);
                  }
               }
            } else {
               if(var1 < 0) {
                  return null;
               }

               yu var12 = (yu)this.e.get(var1);
               if(var12 != null) {
                  var12.d();
                  aan var13 = var12.b();
                  aan var14 = var6.k();
                  if(var13 != null) {
                     var5 = var13.k();
                  }

                  int var10;
                  if(var13 == null) {
                     if(var14 != null && var12.a(var14)) {
                        var10 = var2 == 0?var14.a:1;
                        if(var10 > var12.a()) {
                           var10 = var12.a();
                        }

                        var12.d(var14.a(var10));
                        if(var14.a == 0) {
                           var6.b((aan)null);
                        }
                     }
                  } else if(var14 == null) {
                     var10 = var2 == 0?var13.a:(var13.a + 1) / 2;
                     aan var11 = var12.a(var10);
                     var6.b(var11);
                     if(var13.a == 0) {
                        var12.d((aan)null);
                     }

                     var12.b(var6.k());
                  } else if(var12.a(var14)) {
                     if(var13.c == var14.c && (!var13.f() || var13.i() == var14.i()) && aan.a(var13, var14)) {
                        var10 = var2 == 0?var14.a:1;
                        if(var10 > var12.a() - var13.a) {
                           var10 = var12.a() - var13.a;
                        }

                        if(var10 > var14.c() - var13.a) {
                           var10 = var14.c() - var13.a;
                        }

                        var14.a(var10);
                        if(var14.a == 0) {
                           var6.b((aan)null);
                        }

                        var13.a += var10;
                     } else if(var14.a <= var12.a()) {
                        var12.d(var14);
                        var6.b(var13);
                     }
                  } else if(var13.c == var14.c && var14.c() > 1 && (!var13.f() || var13.i() == var14.i()) && aan.a(var13, var14)) {
                     var10 = var13.a;
                     if(var10 > 0 && var10 + var14.a <= var14.c()) {
                        var14.a += var10;
                        var13 = var12.a(var10);
                        if(var13.a == 0) {
                           var12.d((aan)null);
                        }

                        var12.b(var6.k());
                     }
                  }
               }
            }
         }

         return var5;
      }
   }

   protected void b(int var1, int var2, boolean var3, yw var4) {
      this.a(var1, var2, var3, var4);
   }

   public void a(yw var1) {
      aak var2 = var1.ap;
      if(var2.k() != null) {
         var1.a(var2.k());
         var2.b((aan)null);
      }

   }

   public void a(io var1) {
      this.a();
   }

   public void a(int var1, aan var2) {
      this.b(var1).d(var2);
   }

   public void a(aan[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.b(var2).d(var1[var2]);
      }

   }

   public void a(int var1, int var2) {}

   public short a(aak var1) {
      ++this.a;
      return this.a;
   }

   public void a(short var1) {}

   public void b(short var1) {}

   public abstract boolean b(yw var1);

   protected boolean a(aan var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var2;
      if(var4) {
         var6 = var3 - 1;
      }

      yu var7;
      aan var8;
      if(var1.d()) {
         while(var1.a > 0 && (!var4 && var6 < var3 || var4 && var6 >= var2)) {
            var7 = (yu)this.e.get(var6);
            var8 = var7.b();
            if(var8 != null && var8.c == var1.c && (!var1.f() || var1.i() == var8.i()) && aan.a(var1, var8)) {
               int var9 = var8.a + var1.a;
               if(var9 <= var1.c()) {
                  var1.a = 0;
                  var8.a = var9;
                  var7.d();
                  var5 = true;
               } else if(var8.a < var1.c()) {
                  var1.a -= var1.c() - var8.a;
                  var8.a = var1.c();
                  var7.d();
                  var5 = true;
               }
            }

            if(var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      if(var1.a > 0) {
         if(var4) {
            var6 = var3 - 1;
         } else {
            var6 = var2;
         }

         while(!var4 && var6 < var3 || var4 && var6 >= var2) {
            var7 = (yu)this.e.get(var6);
            var8 = var7.b();
            if(var8 == null) {
               var7.d(var1.k());
               var7.d();
               var1.a = 0;
               var5 = true;
               break;
            }

            if(var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      return var5;
   }
}
