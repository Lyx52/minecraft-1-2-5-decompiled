import java.io.Reader;
import java.util.Arrays;

public final class ap {

   public void a(Reader var1, akj var2) {
      acd var3 = new acd(var1);
      char var4 = (char)var3.c();
      switch(var4) {
      case 91:
         var3.a(var4);
         var2.b();
         this.a(var3, var2);
         break;
      case 123:
         var3.a(var4);
         var2.b();
         this.b(var3, var2);
         break;
      default:
         throw new ale("Expected either [ or { but got [" + var4 + "].", var3);
      }

      int var5 = this.l(var3);
      if(var5 != -1) {
         throw new ale("Got unexpected trailing character [" + (char)var5 + "].", var3);
      } else {
         var2.c();
      }
   }

   private void a(acd var1, akj var2) {
      char var3 = (char)this.l(var1);
      if(var3 != 91) {
         throw new ale("Expected object to start with [ but got [" + var3 + "].", var1);
      } else {
         var2.d();
         char var4 = (char)this.l(var1);
         var1.a(var4);
         if(var4 != 93) {
            this.d(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.l(var1);
            switch(var6) {
            case 44:
               this.d(var1, var2);
               break;
            case 93:
               var5 = true;
               break;
            default:
               throw new ale("Expected either , or ] but got [" + var6 + "].", var1);
            }
         }

         var2.e();
      }
   }

   private void b(acd var1, akj var2) {
      char var3 = (char)this.l(var1);
      if(var3 != 123) {
         throw new ale("Expected object to start with { but got [" + var3 + "].", var1);
      } else {
         var2.f();
         char var4 = (char)this.l(var1);
         var1.a(var4);
         if(var4 != 125) {
            this.c(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.l(var1);
            switch(var6) {
            case 44:
               this.c(var1, var2);
               break;
            case 125:
               var5 = true;
               break;
            default:
               throw new ale("Expected either , or } but got [" + var6 + "].", var1);
            }
         }

         var2.g();
      }
   }

   private void c(acd var1, akj var2) {
      char var3 = (char)this.l(var1);
      if(34 != var3) {
         throw new ale("Expected object identifier to begin with [\"] but got [" + var3 + "].", var1);
      } else {
         var1.a(var3);
         var2.a(this.i(var1));
         char var4 = (char)this.l(var1);
         if(var4 != 58) {
            throw new ale("Expected object identifier to be followed by : but got [" + var4 + "].", var1);
         } else {
            this.d(var1, var2);
            var2.h();
         }
      }
   }

   private void d(acd var1, akj var2) {
      char var3 = (char)this.l(var1);
      switch(var3) {
      case 34:
         var1.a(var3);
         var2.c(this.i(var1));
         break;
      case 45:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         var1.a(var3);
         var2.b(this.a(var1));
         break;
      case 91:
         var1.a(var3);
         this.a(var1, var2);
         break;
      case 102:
         char[] var6 = new char[4];
         int var7 = var1.b(var6);
         if(var7 != 4 || var6[0] != 97 || var6[1] != 108 || var6[2] != 115 || var6[3] != 101) {
            var1.a(var6);
            throw new ale("Expected \'f\' to be followed by [[a, l, s, e]], but got [" + Arrays.toString(var6) + "].", var1);
         }

         var2.j();
         break;
      case 110:
         char[] var8 = new char[3];
         int var9 = var1.b(var8);
         if(var9 != 3 || var8[0] != 117 || var8[1] != 108 || var8[2] != 108) {
            var1.a(var8);
            throw new ale("Expected \'n\' to be followed by [[u, l, l]], but got [" + Arrays.toString(var8) + "].", var1);
         }

         var2.k();
         break;
      case 116:
         char[] var4 = new char[3];
         int var5 = var1.b(var4);
         if(var5 != 3 || var4[0] != 114 || var4[1] != 117 || var4[2] != 101) {
            var1.a(var4);
            throw new ale("Expected \'t\' to be followed by [[r, u, e]], but got [" + Arrays.toString(var4) + "].", var1);
         }

         var2.i();
         break;
      case 123:
         var1.a(var3);
         this.b(var1, var2);
         break;
      default:
         throw new ale("Invalid character at start of value [" + var3 + "].", var1);
      }

   }

   private String a(acd var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if(45 == var3) {
         var2.append('-');
      } else {
         var1.a(var3);
      }

      var2.append(this.b(var1));
      return var2.toString();
   }

   private String b(acd var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if(48 == var3) {
         var2.append('0');
         var2.append(this.f(var1));
         var2.append(this.g(var1));
      } else {
         var1.a(var3);
         var2.append(this.c(var1));
         var2.append(this.e(var1));
         var2.append(this.f(var1));
         var2.append(this.g(var1));
      }

      return var2.toString();
   }

   private char c(acd var1) {
      char var3 = (char)var1.c();
      switch(var3) {
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         return var3;
      default:
         throw new ale("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private char d(acd var1) {
      char var3 = (char)var1.c();
      switch(var3) {
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
         return var3;
      default:
         throw new ale("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private String e(acd var1) {
      StringBuilder var2 = new StringBuilder();
      boolean var3 = false;

      while(!var3) {
         char var4 = (char)var1.c();
         switch(var4) {
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            var2.append(var4);
            break;
         default:
            var3 = true;
            var1.a(var4);
         }
      }

      return var2.toString();
   }

   private String f(acd var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if(var3 == 46) {
         var2.append('.');
         var2.append(this.d(var1));
         var2.append(this.e(var1));
      } else {
         var1.a(var3);
      }

      return var2.toString();
   }

   private String g(acd var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if(var3 != 46 && var3 != 69) {
         var1.a(var3);
      } else {
         var2.append('E');
         var2.append(this.h(var1));
         var2.append(this.d(var1));
         var2.append(this.e(var1));
      }

      return var2.toString();
   }

   private String h(acd var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if(var3 != 43 && var3 != 45) {
         var1.a(var3);
      } else {
         var2.append(var3);
      }

      return var2.toString();
   }

   private String i(acd var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.c();
      if(34 != var3) {
         throw new ale("Expected [\"] but got [" + var3 + "].", var1);
      } else {
         boolean var4 = false;

         while(!var4) {
            char var5 = (char)var1.c();
            switch(var5) {
            case 34:
               var4 = true;
               break;
            case 92:
               char var6 = this.j(var1);
               var2.append(var6);
               break;
            default:
               var2.append(var5);
            }
         }

         return var2.toString();
      }
   }

   private char j(acd var1) {
      char var3 = (char)var1.c();
      char var2;
      switch(var3) {
      case 34:
         var2 = 34;
         break;
      case 47:
         var2 = 47;
         break;
      case 92:
         var2 = 92;
         break;
      case 98:
         var2 = 8;
         break;
      case 102:
         var2 = 12;
         break;
      case 110:
         var2 = 10;
         break;
      case 114:
         var2 = 13;
         break;
      case 116:
         var2 = 9;
         break;
      case 117:
         var2 = (char)this.k(var1);
         break;
      default:
         throw new ale("Unrecognised escape character [" + var3 + "].", var1);
      }

      return var2;
   }

   private int k(acd var1) {
      char[] var2 = new char[4];
      int var3 = var1.b(var2);
      if(var3 != 4) {
         throw new ale("Expected a 4 digit hexidecimal number but got only [" + var3 + "], namely [" + String.valueOf(var2, 0, var3) + "].", var1);
      } else {
         try {
            int var4 = Integer.parseInt(String.valueOf(var2), 16);
            return var4;
         } catch (NumberFormatException var6) {
            var1.a(var2);
            throw new ale("Unable to parse [" + String.valueOf(var2) + "] as a hexidecimal number.", var6, var1);
         }
      }
   }

   private int l(acd var1) {
      boolean var3 = false;

      int var2;
      do {
         var2 = var1.c();
         switch(var2) {
         case 9:
         case 10:
         case 13:
         case 32:
            break;
         default:
            var3 = true;
         }
      } while(!var3);

      return var2;
   }
}
