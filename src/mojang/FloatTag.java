package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FloatTag extends BaseTag {

   public float a;


   public FloatTag(String var1) {
      super(var1);
   }

   public FloatTag(String var1, float var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeFloat(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      this.a = dataInt.readFloat();
   }

   public byte a() {
      return (byte)5;
   }

   public String toString() {
      return "" + this.a;
   }

   public BaseTag b() {
      return new FloatTag(this.getTag(), this.a);
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         FloatTag var2 = (FloatTag)var1;
         return this.a == var2.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.a);
   }
}
