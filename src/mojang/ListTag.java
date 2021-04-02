package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTag extends BaseTag {

   private List a = new ArrayList();
   private byte b;


   public ListTag() {
      super("");
   }

   public ListTag(String var1) {
      super(var1);
   }

   void write(DataOutput dataOut) throws IOException {
      if(this.a.size() > 0) {
         this.b = ((BaseTag)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      dataOut.writeByte(this.b);
      dataOut.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((BaseTag)this.a.get(var2)).write(dataOut);
      }

   }

   void read(DataInput dataInt) throws IOException {
      this.b = dataInt.readByte();
      int var2 = dataInt.readInt();
      this.a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         BaseTag var4 = BaseTag.createTag(this.b, (String)null);
         var4.read(dataInt);
         this.a.add(var4);
      }

   }

   public byte a() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.a.size() + " entries of type " + BaseTag.getTagType(this.b);
   }

   public void a(BaseTag var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public BaseTag a(int var1) {
      return (BaseTag)this.a.get(var1);
   }

   public int d() {
      return this.a.size();
   }

   public BaseTag b() {
      ListTag var1 = new ListTag(this.getTag());
      var1.b = this.b;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         BaseTag var3 = (BaseTag)var2.next();
         BaseTag var4 = var3.b();
         var1.a.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         ListTag var2 = (ListTag)var1;
         if(this.b == var2.b) {
            return this.a.equals(var2.a);
         }
      }

      return false;
   }

   public int hashCode() {
      return super.hashCode() ^ this.a.hashCode();
   }
}
