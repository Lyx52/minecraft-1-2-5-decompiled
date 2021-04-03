
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

   public ady a() {
      ady var1 = new ady();
      var1.a("name", this.a);
      var1.a("ip", this.b);
      return var1;
   }

   public static oa a(ady var0) {
      return new oa(var0.j("name"), var0.j("ip"));
   }
}
