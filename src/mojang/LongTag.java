package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class LongTag extends BaseTag {

   public long a;


   public LongTag(String var1) {
      super(var1);
   }

   public LongTag(String var1, long var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeLong(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      this.a = dataInt.readLong();
   }

   public byte a() {
      return (byte)4;
   }

   public String toString() {
      return "" + this.a;
   }

   public BaseTag b() {
      return new LongTag(this.getTag(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         LongTag var2 = (LongTag)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ (int)(this.a ^ this.a >>> 32);
   }
}
