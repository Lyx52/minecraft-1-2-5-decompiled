
public enum mb {

   a("all", 0),
   b("armor", 1),
   c("armor_feet", 2),
   d("armor_legs", 3),
   e("armor_torso", 4),
   f("armor_head", 5),
   g("weapon", 6),
   h("digger", 7),
   i("bow", 8);
   // $FF: synthetic field
   private static final mb[] j = new mb[]{a, b, c, d, e, f, g, h, i};


   private mb(String var1, int var2) {}

   public boolean a(yr var1) {
      if(this == a) {
         return true;
      } else if(var1 instanceof ql) {
         if(this == b) {
            return true;
         } else {
            ql var2 = (ql)var1;
            return var2.a == 0?this == f:(var2.a == 2?this == d:(var2.a == 1?this == e:(var2.a == 3?this == c:false)));
         }
      } else {
         return var1 instanceof lx?this == g:(var1 instanceof da?this == h:(var1 instanceof mm?this == i:false));
      }
   }

}
