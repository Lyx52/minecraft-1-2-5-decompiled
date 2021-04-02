package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class StringTag extends BaseTag {

   public String a;


   public StringTag(String var1) {
      super(var1);
   }

   public StringTag(String var1, String var2) {
      super(var1);
      this.a = var2;
      if(var2 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeUTF(this.a);
   }

   void read(DataInput dataInt) throws IOException {
      this.a = dataInt.readUTF();
   }

   public byte a() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.a;
   }

   public BaseTag b() {
      return new StringTag(this.getTag(), this.a);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         StringTag var2 = (StringTag)var1;
         return this.a == null && var2.a == null || this.a != null && this.a.equals(var2.a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.a.hashCode();
   }
}
