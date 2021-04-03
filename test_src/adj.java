import java.util.LinkedList;
import java.util.List;

public final class adj extends ab {

   final se a;
   final List b;


   static ab a(se var0) {
      return new adj(var0, new LinkedList());
   }

   static ab a(adj var0, abe var1) {
      LinkedList var2 = new LinkedList(var0.b);
      var2.add(var1);
      return new adj(var0.a, var2);
   }

   static ab b(adj var0, abe var1) {
      LinkedList var2 = new LinkedList();
      var2.add(var1);
      return new adj(var0.a, var2);
   }

   private adj(se var1, List var2) {
      super("Failed to match any JSON node at [" + a(var2) + "]");
      this.a = var1;
      this.b = var2;
   }

   static String a(List var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = var0.size() - 1; var2 >= 0; --var2) {
         var1.append(((abe)var0.get(var2)).a());
         if(var2 != 0) {
            var1.append(".");
         }
      }

      return var1.toString();
   }

   public String toString() {
      return "JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=" + this.a + ", failPath=" + this.b + '}';
   }
}
