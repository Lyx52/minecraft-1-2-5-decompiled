import java.io.DataInput;
import java.io.DataOutput;

public abstract class gh {

   private String a;


   abstract void a(DataOutput var1);

   abstract void a(DataInput var1);

   public abstract byte a();

   protected gh(String var1) {
      if(var1 == null) {
         this.a = "";
      } else {
         this.a = var1;
      }

   }

   public gh a(String var1) {
      if(var1 == null) {
         this.a = "";
      } else {
         this.a = var1;
      }

      return this;
   }

   public String c() {
      return this.a == null?"":this.a;
   }

   public static gh b(DataInput var0) {
      byte var1 = var0.readByte();
      if(var1 == 0) {
         return new ig();
      } else {
         String var2 = var0.readUTF();
         gh var3 = a(var1, var2);
         var3.a(var0);
         return var3;
      }
   }

   public static void a(gh var0, DataOutput var1) {
      var1.writeByte(var0.a());
      if(var0.a() != 0) {
         var1.writeUTF(var0.c());
         var0.a(var1);
      }
   }

   public static gh a(byte var0, String var1) {
      switch(var0) {
      case 0:
         return new ig();
      case 1:
         return new mf(var1);
      case 2:
         return new ow(var1);
      case 3:
         return new afn(var1);
      case 4:
         return new adb(var1);
      case 5:
         return new m(var1);
      case 6:
         return new ahl(var1);
      case 7:
         return new zl(var1);
      case 8:
         return new ald(var1);
      case 9:
         return new no(var1);
      case 10:
         return new ady(var1);
      case 11:
         return new gc(var1);
      default:
         return null;
      }
   }

   public static String a(byte var0) {
      switch(var0) {
      case 0:
         return "TAG_End";
      case 1:
         return "TAG_Byte";
      case 2:
         return "TAG_Short";
      case 3:
         return "TAG_Int";
      case 4:
         return "TAG_Long";
      case 5:
         return "TAG_Float";
      case 6:
         return "TAG_Double";
      case 7:
         return "TAG_Byte_Array";
      case 8:
         return "TAG_String";
      case 9:
         return "TAG_List";
      case 10:
         return "TAG_Compound";
      case 11:
         return "TAG_Int_Array";
      default:
         return "UNKNOWN";
      }
   }

   public abstract gh b();

   public boolean equals(Object var1) {
      if(var1 != null && var1 instanceof gh) {
         gh var2 = (gh)var1;
         return this.a() != var2.a()?false:((this.a != null || var2.a == null) && (this.a == null || var2.a != null)?this.a == null || this.a.equals(var2.a):false);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ this.a();
   }
}
