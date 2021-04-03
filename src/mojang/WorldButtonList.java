package mojang;

import java.util.Date;

class WorldButtonList extends iff {

   // $FF: synthetic field
   final WorldSelectionMenu worldSelectionMenu;


   public WorldButtonList(WorldSelectionMenu var1) {
      super(var1.minecraft, var1.q, var1.r, 32, var1.r - 64, 36);
      this.worldSelectionMenu = var1;
   }

   protected int a() {
      return WorldSelectionMenu.getParsedSaveFiles(this.worldSelectionMenu).size();
   }

   protected void a(int index, boolean menuIsClicked) {
      WorldSelectionMenu.setSelectedIndex(this.worldSelectionMenu, index);
      boolean validIndex = WorldSelectionMenu.getSelectedIndex(this.worldSelectionMenu) >= 0 && WorldSelectionMenu.getSelectedIndex(this.worldSelectionMenu) < this.a();
      WorldSelectionMenu.getSelectWorldButton(this.worldSelectionMenu).visible = validIndex;
      WorldSelectionMenu.getDeleteWorldButton(this.worldSelectionMenu).visible = validIndex;
      WorldSelectionMenu.getRenameWorldButton(this.worldSelectionMenu).visible = validIndex;
      if(menuIsClicked && validIndex) {
         this.worldSelectionMenu.menuLoadWorld(index);
      }

   }

   protected boolean b_(int var1) {
      return var1 == WorldSelectionMenu.getSelectedIndex(this.worldSelectionMenu);
   }

   protected int b() {
      return WorldSelectionMenu.getParsedSaveFiles(this.worldSelectionMenu).size() * 36;
   }

   protected void c() {
      this.worldSelectionMenu.k();
   }

   protected void a(int var1, int var2, int var3, int var4, Tessalator var5) {
      WorldListItem worldListItem = (WorldListItem) WorldSelectionMenu.getParsedSaveFiles(this.worldSelectionMenu).get(var1);
      String worldName = worldListItem.getWorldName();
      if(worldName == null || Utils.isWorldNameValid(worldName)) {
         worldName = WorldSelectionMenu.f(this.worldSelectionMenu) + " " + (var1 + 1);
      }

      String worldTitleString = worldListItem.getWorldLocation();
      worldTitleString = worldTitleString + " (" + WorldSelectionMenu.g(this.worldSelectionMenu).format(new Date(worldListItem.getLastPlayed()));
      worldTitleString = worldTitleString + ")";
      String gameMode = "";
      if(worldListItem.getNeedsConversion()) {
         gameMode = WorldSelectionMenu.h(this.worldSelectionMenu) + " " + gameMode;
      } else {
         gameMode = WorldSelectionMenu.i(this.worldSelectionMenu)[worldListItem.getGameType()];
         if(worldListItem.isHardcore()) {
            gameMode = "§4" + LocalizationManagerWrapper.getLocaleString("gameMode.hardcore") + "§8";
         }
      }

      this.worldSelectionMenu.b(this.worldSelectionMenu.u, worldName, var2 + 2, var3 + 1, 16777215);
      this.worldSelectionMenu.b(this.worldSelectionMenu.u, worldTitleString, var2 + 2, var3 + 12, 8421504);
      this.worldSelectionMenu.b(this.worldSelectionMenu.u, gameMode, var2 + 2, var3 + 12 + 10, 8421504);
   }
}
