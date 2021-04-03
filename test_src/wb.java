import java.io.DataInputStream;
import java.io.DataOutputStream;

public class wb extends abs {

   public int a;
   public byte b;
   public byte c;
   public short d;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readByte();
      this.d = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeByte(this.c);
      var1.writeShort(this.d);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
