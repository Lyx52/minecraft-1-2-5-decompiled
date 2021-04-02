package mojang;

import java.util.ArrayList;
import java.util.List;

public class pc implements ca {

   private ack a;
   private en b = new en();
   private List c = new ArrayList();
   private xd d;


   public pc(xd var1) {
      this.a = new ace(var1, 0, 0);
      this.d = var1;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void d(int var1, int var2) {
      ack var3 = this.b(var1, var2);
      if(!var3.g()) {
         var3.e();
      }

      this.b.d(sj.a(var1, var2));
      this.c.remove(var3);
   }

   public ack c(int var1, int var2) {
      ack var3 = new ack(this.d, var1, var2);
      this.b.a(sj.a(var1, var2), var3);
      var3.d = true;
      return var3;
   }

   public ack b(int var1, int var2) {
      ack var3 = (ack)this.b.a(sj.a(var1, var2));
      return var3 == null?this.a:var3;
   }

   public boolean a(boolean var1, rw var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(ca var1, int var2, int var3) {}

   public String c() {
      return "MultiplayerChunkCache: " + this.b.a();
   }

   public List a(acf var1, int var2, int var3, int var4) {
      return null;
   }

   public qo a(xd var1, String var2, int var3, int var4, int var5) {
      return null;
   }
}
