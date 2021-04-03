import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class at {

   public static ady a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      ady var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(ady var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static ady a(byte[] var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var0))));

      ady var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(ady var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static void a(ady var0, File var1) {
      File var2 = new File(var1.getAbsolutePath() + "_tmp");
      if(var2.exists()) {
         var2.delete();
      }

      b(var0, var2);
      if(var1.exists()) {
         var1.delete();
      }

      if(var1.exists()) {
         throw new IOException("Failed to delete " + var1);
      } else {
         var2.renameTo(var1);
      }
   }

   public static void b(ady var0, File var1) {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static ady a(File var0) {
      if(!var0.exists()) {
         return null;
      } else {
         DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

         ady var2;
         try {
            var2 = a((DataInput)var1);
         } finally {
            var1.close();
         }

         return var2;
      }
   }

   public static ady a(DataInput var0) {
      gh var1 = gh.b(var0);
      if(var1 instanceof ady) {
         return (ady)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(ady var0, DataOutput var1) {
      gh.a(var0, var1);
   }
}
