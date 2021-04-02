package mojang;

public class afp extends agy {

   public afp(int var1) {
      super(var1, 74, acn.d);
   }

   public int a_(int var1) {
      return this.bN;
   }

   public void a(World var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0) {
         boolean var6 = var1.x(var2, var3, var4);
         oh var7 = (oh)var1.b(var2, var3, var4);
         if(var7 != null && var7.b != var6) {
            if(var6) {
               var7.a(var1, var2, var3, var4);
            }

            var7.b = var6;
         }
      }

   }

   public boolean b(World var1, int var2, int var3, int var4, Player var5) {
      if(var1.F) {
         return true;
      } else {
         oh var6 = (oh)var1.b(var2, var3, var4);
         if(var6 != null) {
            var6.a();
            var6.a(var1, var2, var3, var4);
         }

         return true;
      }
   }

   public void a(World var1, int var2, int var3, int var4, Player var5) {
      if(!var1.F) {
         oh var6 = (oh)var1.b(var2, var3, var4);
         if(var6 != null) {
            var6.a(var1, var2, var3, var4);
         }

      }
   }

   public kw u_() {
      return new oh();
   }

   public void b(World var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)Math.pow(2.0D, (double)(var6 - 12) / 12.0D);
      String var8 = "harp";
      if(var5 == 1) {
         var8 = "bd";
      }

      if(var5 == 2) {
         var8 = "snare";
      }

      if(var5 == 3) {
         var8 = "hat";
      }

      if(var5 == 4) {
         var8 = "bassattack";
      }

      var1.a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "note." + var8, 3.0F, var7);
      var1.a("note", (double)var2 + 0.5D, (double)var3 + 1.2D, (double)var4 + 0.5D, (double)var6 / 24.0D, 0.0D, 0.0D);
   }
}
