package mojang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class qc extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public String f;


   public qc() {}

   public qc(mk var1) {
      this.a = var1.f;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.a;
      this.f = var1.e.A;
   }

   public void a(DataInputStream var1) {
      try {
         this.a = var1.readInt();
         this.f = a(var1, go.z);
         this.b = var1.readInt();
         this.c = var1.readInt();
         this.d = var1.readInt();
         this.e = var1.readInt();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(DataOutputStream var1) {
      try {
         var1.writeInt(this.a);
         a(this.f, var1);
         var1.writeInt(this.b);
         var1.writeInt(this.c);
         var1.writeInt(this.d);
         var1.writeInt(this.e);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 24;
   }
}
