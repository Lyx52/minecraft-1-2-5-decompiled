package mojang;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class at {

   public static CompundTag readLevelData(InputStream var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      CompundTag var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void writeAndGZIPTag(CompundTag tag, OutputStream var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         writeToTag(tag, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static CompundTag a(byte[] var0) throws IOException {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var0))));

      CompundTag var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(CompundTag var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         writeToTag(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static void a(CompundTag var0, File var1) throws IOException {
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

   public static void b(CompundTag var0, File var1) throws IOException {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         writeToTag(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static CompundTag a(File var0) throws IOException {
      if(!var0.exists()) {
         return null;
      } else {
         DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

         CompundTag var2;
         try {
            var2 = a((DataInput)var1);
         } finally {
            var1.close();
         }

         return var2;
      }
   }

   public static CompundTag a(DataInput var0) throws IOException {
      BaseTag var1 = BaseTag.readTag(var0);
      if(var1 instanceof CompundTag) {
         return (CompundTag)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void writeToTag(CompundTag tag, DataOutput writer) throws IOException {
      BaseTag.writeTag(tag, writer);
   }
}
