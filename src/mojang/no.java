package mojang;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class no extends gh {

   private List a = new ArrayList();
   private byte b;


   public no() {
      super("");
   }

   public no(String var1) {
      super(var1);
   }

   void a(DataOutput var1) throws IOException {
      if(this.a.size() > 0) {
         this.b = ((gh)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         ((gh)this.a.get(var2)).a(var1);
      }

   }

   void a(DataInput var1) throws IOException {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         gh var4 = gh.a(this.b, (String)null);
         var4.a(var1);
         this.a.add(var4);
      }

   }

   public byte a() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.a.size() + " entries of type " + gh.a(this.b);
   }

   public void a(gh var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public gh a(int var1) {
      return (gh)this.a.get(var1);
   }

   public int d() {
      return this.a.size();
   }

   public gh b() {
      no var1 = new no(this.c());
      var1.b = this.b;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         gh var3 = (gh)var2.next();
         gh var4 = var3.b();
         var1.a.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         no var2 = (no)var1;
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
