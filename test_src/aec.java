import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aec extends abs {

   public int a;
   public String b;
   public vx c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public byte h;


   public aec() {}

   public aec(String var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = a(var1, 16);
      String var2 = a(var1, 16);
      this.c = vx.a(var2);
      if(this.c == null) {
         this.c = vx.b;
      }

      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      a(this.b, var1);
      if(this.c == null) {
         a("", var1);
      } else {
         a(this.c.a(), var1);
      }

      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeByte(this.h);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      int var1 = 0;
      if(this.c != null) {
         var1 = this.c.a().length();
      }

      return 4 + this.b.length() + 4 + 7 + 7 + var1;
   }
}
