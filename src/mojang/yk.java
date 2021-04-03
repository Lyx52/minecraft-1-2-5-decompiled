package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

class yk extends iff {

   private ArrayList b;
   private TreeMap c;
   // $FF: synthetic field
   final LanguageOptionMenu a;


   public yk(LanguageOptionMenu var1) {
      super(var1.minecraft, var1.q, var1.r, 32, var1.r - 65 + 4, 18);
      this.a = var1;
      this.c = LocalizationManager.getInstance().getLangCodeToName();
      this.b = new ArrayList();
      Iterator var2 = this.c.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.b.add(var3);
      }

   }

   protected int a() {
      return this.b.size();
   }

   protected void a(int var1, boolean var2) {
      LocalizationManager.getInstance().changeLocale((String)this.b.get(var1));
      this.a.minecraft.q.a(LocalizationManager.getInstance().d());
      LanguageOptionMenu.a(this.a).lang = (String)this.b.get(var1);
      this.a.u.b(LocalizationManager.isSaudiArabicOrHebrew(LanguageOptionMenu.a(this.a).lang));
      LanguageOptionMenu.b(this.a).title = LocalizationManager.getInstance().getLocaleStringByName("mojang.gui.done");
   }

   protected boolean b_(int var1) {
      return ((String)this.b.get(var1)).equals(LocalizationManager.getInstance().getCurrentLocaleCode());
   }

   protected int b() {
      return this.a() * 18;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, Tessalator var5) {
      this.a.u.b(true);
      this.a.a(this.a.u, (String)this.c.get(this.b.get(var1)), this.a.q / 2, var3 + 1, 16777215);
      this.a.u.b(LocalizationManager.isSaudiArabicOrHebrew(LanguageOptionMenu.a(this.a).lang));
   }
}
