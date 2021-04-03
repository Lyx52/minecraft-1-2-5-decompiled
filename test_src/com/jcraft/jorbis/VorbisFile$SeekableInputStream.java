package com.jcraft.jorbis;

import com.jcraft.jorbis.VorbisFile;
import java.io.InputStream;
import java.io.RandomAccessFile;

class VorbisFile$SeekableInputStream extends InputStream {

   RandomAccessFile raf;
   final String mode;
   // $FF: synthetic field
   final VorbisFile this$0;


   VorbisFile$SeekableInputStream(VorbisFile var1, String var2) {
      this.this$0 = var1;
      this.raf = null;
      this.mode = "r";
      this.raf = new RandomAccessFile(var2, "r");
   }

   public int read() {
      return this.raf.read();
   }

   public int read(byte[] var1) {
      return this.raf.read(var1);
   }

   public int read(byte[] var1, int var2, int var3) {
      return this.raf.read(var1, var2, var3);
   }

   public long skip(long var1) {
      return (long)this.raf.skipBytes((int)var1);
   }

   public long getLength() {
      return this.raf.length();
   }

   public long tell() {
      return this.raf.getFilePointer();
   }

   public int available() {
      return this.raf.length() == this.raf.getFilePointer()?0:1;
   }

   public void close() {
      this.raf.close();
   }

   public synchronized void mark(int var1) {}

   public synchronized void reset() {}

   public boolean markSupported() {
      return false;
   }

   public void seek(long var1) {
      this.raf.seek(var1);
   }
}
