package mojang;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class WorldSelectionMenu extends GUIManager {

   private final DateFormat dateFormat = new SimpleDateFormat();
   protected GUIManager guiManager;
   protected String selectWorldTitle = "Select world";
   private boolean d = false;
   private int selectedIndex;
   private List parsedSaveFiles;
   private WorldButtonList worldButtonList;
   private String i;
   private String j;
   private String[] k = new String[2];
   private boolean l;
   private Button deleteWorldButton;
   private Button selectWorldButton;
   private Button renameWorldButton;


   public WorldSelectionMenu(GUIManager guiManager) {
      this.guiManager = guiManager;
   }

   public void c() {
      LocalizationManager localeManager = LocalizationManager.getInstance();
      this.selectWorldTitle = localeManager.getLocaleStringByName("selectWorld.title");
      this.i = localeManager.getLocaleStringByName("selectWorld.world");
      this.j = localeManager.getLocaleStringByName("selectWorld.conversion");
      this.k[0] = localeManager.getLocaleStringByName("gameMode.survival");
      this.k[1] = localeManager.getLocaleStringByName("gameMode.creative");
      this.sortWorlds();
      this.worldButtonList = new WorldButtonList(this);
      this.worldButtonList.alist(this.buttonList, 4, 5);
      this.addWorldSelectionButtons();
   }

   private void sortWorlds() {
      SaveFileInterface saveFileManager = this.minecraft.getSaveFileManager();
      this.parsedSaveFiles = ((SaveFileManager)saveFileManager).parseSaveFiles();
      Collections.sort(this.parsedSaveFiles);
      this.selectedIndex = -1;
   }

   protected String getWorldLocation(int index) {
      return ((WorldListItem)this.parsedSaveFiles.get(index)).getWorldLocation();
   }

   protected String getWorldByIndex(int index) {
      String worldName = ((WorldListItem)this.parsedSaveFiles.get(index)).getWorldName();

      if(worldName == null || Utils.isWorldNameValid(worldName)) {
         LocalizationManager localeManager = LocalizationManager.getInstance();
         worldName = localeManager.getLocaleStringByName("selectWorld.world") + " " + (index + 1);
      }

      return worldName;
   }

   public void addWorldSelectionButtons() {
      LocalizationManager localeManager = LocalizationManager.getInstance();
      this.buttonList.add(this.selectWorldButton = new Button(1, this.q / 2 - 154, this.r - 52, 150, 20, localeManager.getLocaleStringByName("selectWorld.select")));
      this.buttonList.add(this.renameWorldButton = new Button(6, this.q / 2 - 154, this.r - 28, 70, 20, localeManager.getLocaleStringByName("selectWorld.rename")));
      this.buttonList.add(this.deleteWorldButton = new Button(2, this.q / 2 - 74, this.r - 28, 70, 20, localeManager.getLocaleStringByName("selectWorld.delete")));
      this.buttonList.add(new Button(3, this.q / 2 + 4, this.r - 52, 150, 20, localeManager.getLocaleStringByName("selectWorld.create")));
      this.buttonList.add(new Button(0, this.q / 2 + 4, this.r - 28, 150, 20, localeManager.getLocaleStringByName("mojang.gui.cancel")));
      this.selectWorldButton.visible = false;
      this.deleteWorldButton.visible = false;
      this.renameWorldButton.visible = false;
   }

   protected void clickButton(Button button) {
      if(button.visible) {
         if(button.buttonID == 2) {
            String selectedIndex = this.getWorldByIndex(this.selectedIndex);
            if(selectedIndex != null) {
               this.l = true;
               LocalizationManager var3 = LocalizationManager.getInstance();
               String var4 = var3.getLocaleStringByName("selectWorld.deleteQuestion");
               String var5 = "\'" + selectedIndex + "\' " + var3.getLocaleStringByName("selectWorld.deleteWarning");
               String var6 = var3.getLocaleStringByName("selectWorld.deleteButton");
               String var7 = var3.getLocaleStringByName("mojang.gui.cancel");
               mi var8 = new mi(this, var4, var5, var6, var7, this.selectedIndex);
               this.minecraft.addMenu((GUIManager)var8);
            }
         } else if(button.buttonID == 1) {
            this.menuLoadWorld(this.selectedIndex);
         } else if(button.buttonID == 3) {
            this.minecraft.addMenu((GUIManager)(new xh(this)));
         } else if(button.buttonID == 6) {
            this.minecraft.addMenu((GUIManager)(new aax(this, this.getWorldLocation(this.selectedIndex))));
         } else if(button.buttonID == 0) {
            this.minecraft.addMenu(this.guiManager);
         } else {
            this.worldButtonList.a(button);
         }

      }
   }

   public void menuLoadWorld(int worldIndex) {
      this.minecraft.addMenu((GUIManager)null);
      if(!this.d) {
         this.d = true;
         int gameType = ((WorldListItem)this.parsedSaveFiles.get(worldIndex)).getGameType();
         if(gameType == 0) {
            this.minecraft.c = new aes(this.minecraft);
         } else {
            this.minecraft.c = new aff(this.minecraft);
         }

         String worldLocation = this.getWorldLocation(worldIndex);
         if(worldLocation == null) {
            worldLocation = "World" + worldIndex;
         }

         this.minecraft.loadWorld(worldLocation, this.getWorldByIndex(worldIndex), (WorldStub)null);
         this.minecraft.addMenu((GUIManager)null);
      }
   }

   public void a(boolean var1, int var2) {
      if(this.l) {
         this.l = false;
         if(var1) {
            SaveFileInterface var3 = this.minecraft.getSaveFileManager();
            var3.d();
            var3.deleteSave(this.getWorldLocation(var2));
            this.sortWorlds();
         }

         this.minecraft.addMenu((GUIManager)this);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.worldButtonList.a(var1, var2, var3);
      this.a(this.u, this.selectWorldTitle, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }


   static List getParsedSaveFiles(WorldSelectionMenu selectionMenu) {
      return selectionMenu.parsedSaveFiles;
   }

   static int setSelectedIndex(WorldSelectionMenu selectionMenu, int index) {
      return selectionMenu.selectedIndex = index;
   }

   static int getSelectedIndex(WorldSelectionMenu selectionMenu) {
      return selectionMenu.selectedIndex;
   }

   static Button getSelectWorldButton(WorldSelectionMenu selectionMenu) {
      return selectionMenu.selectWorldButton;
   }

   static Button getDeleteWorldButton(WorldSelectionMenu selectionMenu) {
      return selectionMenu.deleteWorldButton;
   }

   static Button getRenameWorldButton(WorldSelectionMenu selectionMenu) {
      return selectionMenu.renameWorldButton;
   }

   // $FF: synthetic method
   static String f(WorldSelectionMenu var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static DateFormat g(WorldSelectionMenu var0) {
      return var0.dateFormat;
   }

   // $FF: synthetic method
   static String h(WorldSelectionMenu var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static String[] i(WorldSelectionMenu var0) {
      return var0.k;
   }
}
