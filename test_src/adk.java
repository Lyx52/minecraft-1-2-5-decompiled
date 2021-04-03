
class adk implements afs {

   // $FF: synthetic field
   final afl a;
   // $FF: synthetic field
   final acr b;


   adk(acr var1, afl var2) {
      this.b = var1;
      this.a = var2;
   }

   public void a(aca var1) {
      this.a.b(var1);
   }

   public void a(afl var1) {
      throw new RuntimeException("Coding failure in Argo:  Attempt to add a field to a field.");
   }
}
