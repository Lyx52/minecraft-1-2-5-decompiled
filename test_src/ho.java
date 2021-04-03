import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ho {

   public float h;
   public boolean i = false;
   public List j = new ArrayList();
   public boolean k = true;
   private Map a = new HashMap();
   public int l = 64;
   public int m = 32;


   public void a(nn var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {}

   public void a(acq var1, float var2, float var3, float var4) {}

   protected void a(String var1, int var2, int var3) {
      this.a.put(var1, new th(var2, var3));
   }

   public th a(String var1) {
      return (th)this.a.get(var1);
   }
}
