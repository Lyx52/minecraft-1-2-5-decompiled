package mojang;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

final class acd implements dr {

   private final PushbackReader a;
   private int b = 0;
   private int c = 1;
   private boolean d = false;


   public acd(Reader var1) {
      this.a = new PushbackReader(var1);
   }

   public void a(char var1) throws IOException {
      --this.b;
      if(this.b < 0) {
         this.b = 0;
      }

      this.a.unread(var1);
   }

   public void a(char[] var1) {
      this.b -= var1.length;
      if(this.b < 0) {
         this.b = 0;
      }

   }

   public int c() throws IOException {
      int var1 = this.a.read();
      this.a(var1);
      return var1;
   }

   public int b(char[] var1) throws IOException {
      int var2 = this.a.read(var1);
      char[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         this.a((int)var6);
      }

      return var2;
   }

   private void a(int var1) {
      if(13 == var1) {
         this.b = 0;
         ++this.c;
         this.d = true;
      } else {
         if(10 == var1 && !this.d) {
            this.b = 0;
            ++this.c;
         } else {
            ++this.b;
         }

         this.d = false;
      }

   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }
}
