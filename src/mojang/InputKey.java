package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InputKey {

   public static List a = new ArrayList();
   public static abh b = new abh();
   public String keyBindName;
   public int keyCode;
   public boolean e;
   public int f = 0;


   public static void a(int var0) {
      InputKey var1 = (InputKey)b.a(var0);
      if(var1 != null) {
         ++var1.f;
      }

   }

   public static void a(int var0, boolean var1) {
      InputKey var2 = (InputKey)b.a(var0);
      if(var2 != null) {
         var2.e = var1;
      }

   }

   public static void a() {
      Iterator var0 = a.iterator();

      while(var0.hasNext()) {
         InputKey var1 = (InputKey)var0.next();
         var1.d();
      }

   }

   public static void b() {
      b.a();
      Iterator var0 = a.iterator();

      while(var0.hasNext()) {
         InputKey var1 = (InputKey)var0.next();
         b.a(var1.keyCode, var1);
      }

   }

   public InputKey(String bindName, int keyCode) {
      this.keyBindName = bindName;
      this.keyCode = keyCode;
      a.add(this);
      b.a(keyCode, this);
   }

   public boolean c() {
      if(this.f == 0) {
         return false;
      } else {
         --this.f;
         return true;
      }
   }

   private void d() {
      this.f = 0;
      this.e = false;
   }

}
