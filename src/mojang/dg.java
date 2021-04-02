package mojang;

public class dg extends BaseEntity {

   public final ajn a;
   public final String b;


   public dg(ajn var1, String var2, float var3, float var4) {
      super(var1.k);
      this.a(var3, var4);
      this.a = var1;
      this.b = var2;
   }

   protected void b() {}

   protected void a(CompundTag var1) {}

   protected void b(CompundTag var1) {}

   public boolean l_() {
      return true;
   }

   public boolean a(md var1, int var2) {
      return this.a.a(this, var1, var2);
   }

   public boolean a(BaseEntity var1) {
      return this == var1 || this.a == var1;
   }
}
