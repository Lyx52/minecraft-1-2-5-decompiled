package mojang;

public class oa {

   public String a;
   public String b;
   public String c;
   public String d;
   public long e;
   public boolean f = false;


   public oa(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public CompundTag a() {
      CompundTag var1 = new CompundTag();
      var1.addString("name", this.a);
      var1.addString("ip", this.b);
      return var1;
   }

   public static oa a(CompundTag var0) {
      return new oa(var0.getString("name"), var0.getString("ip"));
   }
}
