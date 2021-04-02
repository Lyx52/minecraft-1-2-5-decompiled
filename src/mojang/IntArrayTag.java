package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class IntArrayTag extends BaseTag {

   public int[] a;


   public IntArrayTag(String var1) {
      super(var1);
   }

   public IntArrayTag(String var1, int[] var2) {
      super(var1);
      this.a = var2;
   }

   void write(DataOutput dataOut) throws IOException {
      dataOut.writeInt(this.a.length);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         dataOut.writeInt(this.a[var2]);
      }

   }

   void read(DataInput dataInt) throws IOException {
      int var2 = dataInt.readInt();
      this.a = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = dataInt.readInt();
      }

   }

   public byte a() {
      return (byte)11;
   }

   public String toString() {
      return "[" + this.a.length + " bytes]";
   }

   public BaseTag b() {
      int[] var1 = new int[this.a.length];
      System.arraycopy(this.a, 0, var1, 0, this.a.length);
      return new IntArrayTag(this.getTag(), var1);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         IntArrayTag var2 = (IntArrayTag)var1;
         return this.a == null && var2.a == null || this.a != null && this.a.equals(var2.a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.a);
   }
}
