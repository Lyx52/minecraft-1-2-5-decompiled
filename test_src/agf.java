import java.io.DataInputStream;
import java.io.DataOutputStream;

public class agf extends abs {

   public int a;
   public int b;
   public int c;
   public short d;
   public aan e;
   public boolean f;


   public agf() {}

   public agf(int var1, int var2, int var3, boolean var4, aan var5, short var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var5;
      this.d = var6;
      this.f = var4;
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public void a(DataInputStream var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readByte();
      this.d = var1.readShort();
      this.f = var1.readBoolean();
      this.e = this.b(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeByte(this.c);
      var1.writeShort(this.d);
      var1.writeBoolean(this.f);
      this.a(this.e, var1);
   }

   public int a() {
      return 11;
   }
}
