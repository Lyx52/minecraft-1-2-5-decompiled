package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayTag extends BaseTag {

   public byte[] a;


   public ByteArrayTag(String var1) {
      super(var1);
   }

   public ByteArrayTag(String var1, byte[] var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeInt(this.a.length);
      dataOut.write(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      int var2 = dataInt.readInt();
      this.a = new byte[var2];
      dataInt.readFully(this.a);
   }

   public byte a() {
      return (byte)7;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }

   public BaseTag b() {
      byte[] var1 = new byte[this.a.length];
      System.arraycopy(this.a, 0, var1, 0, this.a.length);
      return new ByteArrayTag(this.getTag(), var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1)?Arrays.equals(this.a, ((ByteArrayTag)var1).a):false;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.a);
   }
}
