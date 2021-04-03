import java.util.List;
import java.util.Map;

public abstract class fd {

   public abstract ts a();

   public abstract String b();

   public abstract Map c();

   public abstract List d();

   public final String a(Object ... var1) {
      return (String)this.a(hh.a(var1), this, var1);
   }

   public final List b(Object ... var1) {
      return (List)this.a(hh.b(var1), this, var1);
   }

   private Object a(abe var1, fd var2, Object[] var3) {
      try {
         return var1.b(var2);
      } catch (adj var5) {
         throw tp.a(var5, var3, kq.a(new fd[]{var2}));
      }
   }
}
