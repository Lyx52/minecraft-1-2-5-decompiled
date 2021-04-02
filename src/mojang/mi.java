package mojang;

public class mi extends GUIManager {

   private GUIManager a;
   private String b;
   private String e;
   protected String c;
   protected String d;
   private int f;


   public mi(GUIManager var1, String var2, String var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.f = var4;
      LocalizationManager var5 = LocalizationManager.getInstance();
      this.c = var5.getLocaleStringByName("mojang.gui.yes");
      this.d = var5.getLocaleStringByName("mojang.gui.no");
   }

   public mi(GUIManager var1, String var2, String var3, String var4, String var5, int var6) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.c = var4;
      this.d = var5;
      this.f = var6;
   }

   public void c() {
      this.buttonList.add(new z(0, this.q / 2 - 155, this.r / 6 + 96, this.c));
      this.buttonList.add(new z(1, this.q / 2 - 155 + 160, this.r / 6 + 96, this.d));
   }

   protected void a(Button var1) {
      this.a.a(var1.f == 0, this.f);
   }

   public void a(int var1, int var2, float var3) {
      this.k();
      this.a(this.u, this.b, this.q / 2, 70, 16777215);
      this.a(this.u, this.e, this.q / 2, 90, 16777215);
      super.a(var1, var2, var3);
   }
}
