import java.io.DataInputStream;
import java.io.DataOutputStream;

public class us extends abs {

   public static final String[] a = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
   public int b;
   public int c;


   public void a(DataInputStream var1) {
      this.b = var1.readByte();
      this.c = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.b);
      var1.writeByte(this.c);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 2;
   }

}
