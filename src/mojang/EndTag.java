package mojang;

import java.io.DataInput;
import java.io.DataOutput;

public class EndTag extends BaseTag {

   public EndTag() {
      super(null);
   }

   void read(DataInput dataInt) {}

   void write(DataOutput dataOut) {}

   public byte a() {
      return (byte)0;
   }

   public String toString() {
      return "END";
   }

   public BaseTag b() {
      return new EndTag();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
