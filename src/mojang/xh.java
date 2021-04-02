package mojang;

import java.util.Random;
import org.lwjgl.input.Keyboard;

public class xh extends GUIManager {

   private GUIManager a;
   private agu b;
   private agu c;
   private String d;
   private String e = "survival";
   private boolean f = true;
   private boolean h = false;
   private boolean i;
   private boolean j;
   private Button k;
   private Button l;
   private Button m;
   private Button n;
   private String o;
   private String w;
   private String x;
   private String y;
   private int z = 0;


   public xh(GUIManager var1) {
      this.a = var1;
      this.x = "";
      this.y = cy.a("selectWorld.newWorld");
   }

   public void a() {
      this.b.a();
      this.c.a();
   }

   public void c() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      Keyboard.enableRepeatEvents(true);
      this.buttonList.clear();
      this.buttonList.add(new Button(0, this.q / 2 - 155, this.r - 28, 150, 20, var1.getLocaleStringByName("selectWorld.create")));
      this.buttonList.add(new Button(1, this.q / 2 + 5, this.r - 28, 150, 20, var1.getLocaleStringByName("mojang.gui.cancel")));
      this.buttonList.add(this.k = new Button(2, this.q / 2 - 75, 100, 150, 20, var1.getLocaleStringByName("selectWorld.gameMode")));
      this.buttonList.add(this.l = new Button(3, this.q / 2 - 75, 172, 150, 20, var1.getLocaleStringByName("selectWorld.moreWorldOptions")));
      this.buttonList.add(this.m = new Button(4, this.q / 2 - 155, 100, 150, 20, var1.getLocaleStringByName("selectWorld.mapFeatures")));
      this.m.i = false;
      this.buttonList.add(this.n = new Button(5, this.q / 2 + 5, 100, 150, 20, var1.getLocaleStringByName("selectWorld.mapType")));
      this.n.i = false;
      this.b = new agu(this.u, this.q / 2 - 100, 60, 200, 20);
      this.b.b(true);
      this.b.a(this.y);
      this.c = new agu(this.u, this.q / 2 - 100, 60, 200, 20);
      this.c.a(this.x);
      this.d();
      this.g();
   }

   private void d() {
      this.d = this.b.b().trim();
      char[] var1 = xn.b;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = var1[var3];
         this.d = this.d.replace(var4, '_');
      }

      if(Utils.isWorldNameValid(this.d)) {
         this.d = "World";
      }

      this.d = a(this.minecraft.getSaveFileManager(), this.d);
   }

   private void g() {
      LocalizationManager var1 = LocalizationManager.getInstance();
      this.k.title = var1.getLocaleStringByName("selectWorld.gameMode") + " " + var1.getLocaleStringByName("selectWorld.gameMode." + this.e);
      this.o = var1.getLocaleStringByName("selectWorld.gameMode." + this.e + ".line1");
      this.w = var1.getLocaleStringByName("selectWorld.gameMode." + this.e + ".line2");
      this.m.title = var1.getLocaleStringByName("selectWorld.mapFeatures") + " ";
      if(this.f) {
         this.m.title = this.m.title + var1.getLocaleStringByName("options.on");
      } else {
         this.m.title = this.m.title + var1.getLocaleStringByName("options.off");
      }

      this.n.title = var1.getLocaleStringByName("selectWorld.mapType") + " " + var1.getLocaleStringByName(WorldGeneratorTypes.WORLD_GENERATOR_TYPES[this.z].b());
   }

   public static String a(SaveFileInterface var0, String var1) {
      for(var1 = var1.replaceAll("[\\./\"]|COM", "_"); var0.parseSaveFile(var1) != null; var1 = var1 + "-") {
         ;
      }

      return var1;
   }

   public void e() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(Button var1) {
      if(var1.h) {
         if(var1.f == 1) {
            this.minecraft.a(this.a);
         } else if(var1.f == 0) {
            this.minecraft.a((GUIManager)null);
            if(this.i) {
               return;
            }

            this.i = true;
            long var2 = (new Random()).nextLong();
            String var4 = this.c.b();
            if(!Utils.isWorldNameValid(var4)) {
               try {
                  long var5 = Long.parseLong(var4);
                  if(var5 != 0L) {
                     var2 = var5;
                  }
               } catch (NumberFormatException var7) {
                  var2 = (long)var4.hashCode();
               }
            }

            byte var9 = 0;
            if(this.e.equals("creative")) {
               var9 = 1;
               this.minecraft.c = new aff(this.minecraft);
            } else {
               this.minecraft.c = new aes(this.minecraft);
            }

            this.minecraft.a(this.d, this.b.b(), new WorldStub(var2, var9, this.f, this.h, WorldGeneratorTypes.WORLD_GENERATOR_TYPES[this.z]));
            this.minecraft.a((GUIManager)null);
         } else if(var1.f == 3) {
            this.j = !this.j;
            this.k.i = !this.j;
            this.m.i = this.j;
            this.n.i = this.j;
            LocalizationManager var8;
            if(this.j) {
               var8 = LocalizationManager.getInstance();
               this.l.title = var8.getLocaleStringByName("mojang.gui.done");
            } else {
               var8 = LocalizationManager.getInstance();
               this.l.title = var8.getLocaleStringByName("selectWorld.moreWorldOptions");
            }
         } else if(var1.f == 2) {
            if(this.e.equals("survival")) {
               this.h = false;
               this.e = "hardcore";
               this.h = true;
               this.g();
            } else if(this.e.equals("hardcore")) {
               this.h = false;
               this.e = "creative";
               this.g();
               this.h = false;
            } else {
               this.e = "survival";
               this.g();
               this.h = false;
            }

            this.g();
         } else if(var1.f == 4) {
            this.f = !this.f;
            this.g();
         } else if(var1.f == 5) {
            ++this.z;
            if(this.z >= WorldGeneratorTypes.WORLD_GENERATOR_TYPES.length) {
               this.z = 0;
            }

            while(WorldGeneratorTypes.WORLD_GENERATOR_TYPES[this.z] == null || !WorldGeneratorTypes.WORLD_GENERATOR_TYPES[this.z].d()) {
               ++this.z;
               if(this.z >= WorldGeneratorTypes.WORLD_GENERATOR_TYPES.length) {
                  this.z = 0;
               }
            }

            this.g();
         }

      }
   }

   protected void a(char var1, int var2) {
      if(this.b.j() && !this.j) {
         this.b.a(var1, var2);
         this.y = this.b.b();
      } else if(this.c.j() && this.j) {
         this.c.a(var1, var2);
         this.x = this.c.b();
      }

      if(var1 == 13) {
         this.a((Button)this.buttonList.get(0));
      }

      ((Button)this.buttonList.get(0)).h = this.b.b().length() > 0;
      this.d();
   }

   protected void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if(!this.j) {
         this.b.a(var1, var2, var3);
      } else {
         this.c.a(var1, var2, var3);
      }

   }

   public void a(int var1, int var2, float var3) {
      LocalizationManager var4 = LocalizationManager.getInstance();
      this.k();
      this.a(this.u, var4.getLocaleStringByName("selectWorld.create"), this.q / 2, 20, 16777215);
      if(!this.j) {
         this.b(this.u, var4.getLocaleStringByName("selectWorld.enterName"), this.q / 2 - 100, 47, 10526880);
         this.b(this.u, var4.getLocaleStringByName("selectWorld.resultFolder") + " " + this.d, this.q / 2 - 100, 85, 10526880);
         this.b.f();
         this.b(this.u, this.o, this.q / 2 - 100, 122, 10526880);
         this.b(this.u, this.w, this.q / 2 - 100, 134, 10526880);
      } else {
         this.b(this.u, var4.getLocaleStringByName("selectWorld.enterSeed"), this.q / 2 - 100, 47, 10526880);
         this.b(this.u, var4.getLocaleStringByName("selectWorld.seedInfo"), this.q / 2 - 100, 85, 10526880);
         this.b(this.u, var4.getLocaleStringByName("selectWorld.mapFeatures.info"), this.q / 2 - 150, 122, 10526880);
         this.c.f();
      }

      super.a(var1, var2, var3);
   }
}
