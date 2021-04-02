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
   private int e;
   private List parsedSaveFiles;
   private iz h;
   private String i;
   private String j;
   private String[] k = new String[2];
   private boolean l;
   private Button m;
   private Button n;
   private Button o;


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
      this.g();
      this.h = new iz(this);
      this.h.alist(this.buttonList, 4, 5);
      this.addWorldSelectionButtons();
   }

   private void g() {
      SaveFileManager saveFileManager = this.minecraft.getSaveFileManager();
      this.parsedSaveFiles = saveFileManager.parseSaveFiles();
      Collections.sort(this.parsedSaveFiles);
      this.e = -1;
   }

   protected String a(int var1) {
      return ((WorldListItem)this.parsedSaveFiles.get(var1)).getWorldLocation();
   }

   protected String b(int index) {
      String worldName = ((WorldListItem)this.parsedSaveFiles.get(index)).getWorldName();

      if(worldName == null || Utils.isWorldNameValid(worldName)) {
         LocalizationManager var3 = LocalizationManager.getInstance();
         worldName = var3.getLocaleStringByName("selectWorld.world") + " " + (index + 1);
      }

      return worldName;
   }

   public void addWorldSelectionButtons() {
      LocalizationManager localeManager = LocalizationManager.getInstance();
      this.buttonList.add(this.n = new Button(1, this.q / 2 - 154, this.r - 52, 150, 20, localeManager.getLocaleStringByName("selectWorld.select")));
      this.buttonList.add(this.o = new Button(6, this.q / 2 - 154, this.r - 28, 70, 20, localeManager.getLocaleStringByName("selectWorld.rename")));
      this.buttonList.add(this.m = new Button(2, this.q / 2 - 74, this.r - 28, 70, 20, localeManager.getLocaleStringByName("selectWorld.delete")));
      this.buttonList.add(new Button(3, this.q / 2 + 4, this.r - 52, 150, 20, localeManager.getLocaleStringByName("selectWorld.create")));
      this.buttonList.add(new Button(0, this.q / 2 + 4, this.r - 28, 150, 20, localeManager.getLocaleStringByName("mojang.gui.cancel")));
      this.n.h = false;
      this.m.h = false;
      this.o.h = false;
   }

   protected void a(Button var1) {
      if(var1.h) {
         if(var1.f == 2) {
            String var2 = this.b(this.e);
            if(var2 != null) {
               this.l = true;
               LocalizationManager var3 = LocalizationManager.getInstance();
               String var4 = var3.getLocaleStringByName("selectWorld.deleteQuestion");
               String var5 = "\'" + var2 + "\' " + var3.getLocaleStringByName("selectWorld.deleteWarning");
               String var6 = var3.getLocaleStringByName("selectWorld.deleteButton");
               String var7 = var3.getLocaleStringByName("mojang.gui.cancel");
               mi var8 = new mi(this, var4, var5, var6, var7, this.e);
               this.minecraft.a((GUIManager)var8);
            }
         } else if(var1.f == 1) {
            this.c(this.e);
         } else if(var1.f == 3) {
            this.minecraft.a((GUIManager)(new xh(this)));
         } else if(var1.f == 6) {
            this.minecraft.a((GUIManager)(new aax(this, this.a(this.e))));
         } else if(var1.f == 0) {
            this.minecraft.a(this.guiManager);
         } else {
            this.h.a(var1);
         }

      }
   }

   public void c(int var1) {
      this.minecraft.a((GUIManager)null);
      if(!this.d) {
         this.d = true;
         int var2 = ((WorldListItem)this.parsedSaveFiles.get(var1)).getGameType();
         if(var2 == 0) {
            this.minecraft.c = new aes(this.minecraft);
         } else {
            this.minecraft.c = new aff(this.minecraft);
         }

         String var3 = this.a(var1);
         if(var3 == null) {
            var3 = "World" + var1;
         }

         this.minecraft.a(var3, this.b(var1), (WorldStub)null);
         this.minecraft.a((GUIManager)null);
      }
   }

   public void a(boolean var1, int var2) {
      if(this.l) {
         this.l = false;
         if(var1) {
            SaveFileInterface var3 = this.minecraft.getSaveFileManager();
            var3.d();
            var3.deleteSave(this.a(var2));
            this.g();
         }

         this.minecraft.a((GUIManager)this);
      }

   }

   public void a(int var1, int var2, float var3) {
      this.h.a(var1, var2, var3);
      this.a(this.u, this.selectWorldTitle, this.q / 2, 20, 16777215);
      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static List a(WorldSelectionMenu var0) {
      return var0.parsedSaveFiles;
   }

   // $FF: synthetic method
   static int a(WorldSelectionMenu var0, int var1) {
      return var0.e = var1;
   }

   // $FF: synthetic method
   static int b(WorldSelectionMenu var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static Button c(WorldSelectionMenu var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static Button d(WorldSelectionMenu var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static Button e(WorldSelectionMenu var0) {
      return var0.o;
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
