package mojang;

import java.util.Date;

class iz extends iff {

   // $FF: synthetic field
   final WorldSelectionMenu a;


   public iz(WorldSelectionMenu var1) {
      super(var1.minecraft, var1.q, var1.r, 32, var1.r - 64, 36);
      this.a = var1;
   }

   protected int a() {
      return WorldSelectionMenu.a(this.a).size();
   }

   protected void a(int var1, boolean var2) {
      WorldSelectionMenu.a(this.a, var1);
      boolean var3 = WorldSelectionMenu.b(this.a) >= 0 && WorldSelectionMenu.b(this.a) < this.a();
      WorldSelectionMenu.c(this.a).h = var3;
      WorldSelectionMenu.d(this.a).h = var3;
      WorldSelectionMenu.e(this.a).h = var3;
      if(var2 && var3) {
         this.a.c(var1);
      }

   }

   protected boolean b_(int var1) {
      return var1 == WorldSelectionMenu.b(this.a);
   }

   protected int b() {
      return WorldSelectionMenu.a(this.a).size() * 36;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, Tessalator var5) {
      WorldListItem var6 = (WorldListItem) WorldSelectionMenu.a(this.a).get(var1);
      String var7 = var6.getWorldName();
      if(var7 == null || Utils.isWorldNameValid(var7)) {
         var7 = WorldSelectionMenu.f(this.a) + " " + (var1 + 1);
      }

      String var8 = var6.getWorldLocation();
      var8 = var8 + " (" + WorldSelectionMenu.g(this.a).format(new Date(var6.getLastPlayed()));
      var8 = var8 + ")";
      String var9 = "";
      if(var6.getNeedsConversion()) {
         var9 = WorldSelectionMenu.h(this.a) + " " + var9;
      } else {
         var9 = WorldSelectionMenu.i(this.a)[var6.getGameType()];
         if(var6.isHardcore()) {
            var9 = "§4" + cy.a("gameMode.hardcore") + "§8";
         }
      }

      this.a.b(this.a.u, var7, var2 + 2, var3 + 1, 16777215);
      this.a.b(this.a.u, var8, var2 + 2, var3 + 12, 8421504);
      this.a.b(this.a.u, var9, var2 + 2, var3 + 12 + 10, 8421504);
   }
}
