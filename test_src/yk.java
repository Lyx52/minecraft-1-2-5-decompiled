import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

class yk extends if {

   private ArrayList b;
   private TreeMap c;
   // $FF: synthetic field
   final afv a;


   public yk(afv var1) {
      super(var1.p, var1.q, var1.r, 32, var1.r - 65 + 4, 18);
      this.a = var1;
      this.c = adn.a().b();
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
      adn.a().a((String)this.b.get(var1));
      this.a.p.q.a(adn.a().d());
      afv.a(this.a).R = (String)this.b.get(var1);
      this.a.u.b(adn.d(afv.a(this.a).R));
      afv.b(this.a).e = adn.a().b("gui.done");
   }

   protected boolean b_(int var1) {
      return ((String)this.b.get(var1)).equals(adn.a().c());
   }

   protected int b() {
      return this.a() * 18;
   }

   protected void c() {
      this.a.k();
   }

   protected void a(int var1, int var2, int var3, int var4, adz var5) {
      this.a.u.b(true);
      this.a.a(this.a.u, (String)this.c.get(this.b.get(var1)), this.a.q / 2, var3 + 1, 16777215);
      this.a.u.b(adn.d(afv.a(this.a).R));
   }
}
