import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class sz extends abs {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte[] e;
   public boolean f;
   private int g;
   private int h;
   private static byte[] i = new byte[0];


   public sz() {
      this.q = true;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.f = var1.readBoolean();
      this.c = var1.readShort();
      this.d = var1.readShort();
      this.g = var1.readInt();
      this.h = var1.readInt();
      if(i.length < this.g) {
         i = new byte[this.g];
      }

      var1.readFully(i, 0, this.g);
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         var2 += this.c >> var3 & 1;
      }

      var3 = 12288 * var2;
      if(this.f) {
         var3 += 256;
      }

      this.e = new byte[var3];
      Inflater var4 = new Inflater();
      var4.setInput(i, 0, this.g);

      try {
         var4.inflate(this.e);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeBoolean(this.f);
      var1.writeShort((short)(this.c & '\uffff'));
      var1.writeShort((short)(this.d & '\uffff'));
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      var1.write(this.e, 0, this.g);
   }

   public void a(oe var1) {
      var1.a(this);
   }

   public int a() {
      return 17 + this.g;
   }

}
