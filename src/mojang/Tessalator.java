package mojang;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class Tessalator {

   private static boolean b = false;
   private static boolean c = false;
   private ByteBuffer buffer;
   private IntBuffer intBuffer;
   private FloatBuffer floatBuffer;
   private ShortBuffer shortBuffer;
   private int[] intArray;
   private int points = 0;
   private double j;
   private double k;
   private int l;
   private int m;
   private boolean n = false;
   private boolean o = false;
   private boolean p = false;
   private boolean q = false;
   private int r = 0;
   private int s = 0;
   private boolean t = false;
   private int u;
   private double v;
   private double w;
   private double x;
   private int y;
   public static final Tessalator a = new Tessalator(2097152);
   private boolean running = false;
   private boolean A = false;
   private IntBuffer B;
   private int C = 0;
   private int D = 10;
   private int bufferSize;


   private Tessalator(int bufferSize) {
      this.bufferSize = bufferSize;
      this.buffer = BufferManager.createByteBuffer(bufferSize * 4);
      this.intBuffer = this.buffer.asIntBuffer();
      this.floatBuffer = this.buffer.asFloatBuffer();
      this.shortBuffer = this.buffer.asShortBuffer();
      this.intArray = new int[bufferSize];
      this.A = c && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
      if(this.A) {
         this.B = BufferManager.createIntBuffer(this.D);
         ARBVertexBufferObject.glGenBuffersARB(this.B);
      }

   }

   public int a() {
      if(!this.running) {
         throw new IllegalStateException("Not tesselating!");
      } else {
         this.running = false;
         if(this.points > 0) {
            this.intBuffer.clear();
            this.intBuffer.put(this.intArray, 0, this.r);
            this.buffer.position(0);
            this.buffer.limit(this.r * 4);
            if(this.A) {
               this.C = (this.C + 1) % this.D;
               ARBVertexBufferObject.glBindBufferARB('\u8892', this.B.get(this.C));
               ARBVertexBufferObject.glBufferDataARB('\u8892', this.buffer, '\u88e0');
            }

            if(this.o) {
               if(this.A) {
                  GL11.glTexCoordPointer(2, 5126, 32, 12L);
               } else {
                  this.floatBuffer.position(3);
                  GL11.glTexCoordPointer(2, 32, this.floatBuffer);
               }

               GL11.glEnableClientState('\u8078');
            }

            if(this.p) {
               ARBTextureHelper.selectClientActiveTexture(ARBTextureHelper.b);
               if(this.A) {
                  GL11.glTexCoordPointer(2, 5122, 32, 28L);
               } else {
                  this.shortBuffer.position(14);
                  GL11.glTexCoordPointer(2, 32, this.shortBuffer);
               }

               GL11.glEnableClientState('\u8078');
               ARBTextureHelper.selectClientActiveTexture(ARBTextureHelper.a);
            }

            if(this.n) {
               if(this.A) {
                  GL11.glColorPointer(4, 5121, 32, 20L);
               } else {
                  this.buffer.position(20);
                  GL11.glColorPointer(4, true, 32, this.buffer);
               }

               GL11.glEnableClientState('\u8076');
            }

            if(this.q) {
               if(this.A) {
                  GL11.glNormalPointer(5121, 32, 24L);
               } else {
                  this.buffer.position(24);
                  GL11.glNormalPointer(32, this.buffer);
               }

               GL11.glEnableClientState('\u8075');
            }

            if(this.A) {
               GL11.glVertexPointer(3, 5126, 32, 0L);
            } else {
               this.floatBuffer.position(0);
               GL11.glVertexPointer(3, 32, this.floatBuffer);
            }

            GL11.glEnableClientState('\u8074');
            if(this.u == 7 && b) {
               GL11.glDrawArrays(4, 0, this.points);
            } else {
               GL11.glDrawArrays(this.u, 0, this.points);
            }

            GL11.glDisableClientState('\u8074');
            if(this.o) {
               GL11.glDisableClientState('\u8078');
            }

            if(this.p) {
               ARBTextureHelper.selectClientActiveTexture(ARBTextureHelper.b);
               GL11.glDisableClientState('\u8078');
               ARBTextureHelper.selectClientActiveTexture(ARBTextureHelper.a);
            }

            if(this.n) {
               GL11.glDisableClientState('\u8076');
            }

            if(this.q) {
               GL11.glDisableClientState('\u8075');
            }
         }

         int var1 = this.r * 4;
         this.d();
         return var1;
      }
   }

   private void d() {
      this.points = 0;
      this.buffer.clear();
      this.r = 0;
      this.s = 0;
   }

   public void b() {
      this.a(7);
   }

   public void a(int var1) {
      if(this.running) {
         throw new IllegalStateException("Already tesselating!");
      } else {
         this.running = true;
         this.d();
         this.u = var1;
         this.q = false;
         this.n = false;
         this.o = false;
         this.p = false;
         this.t = false;
      }
   }

   public void a(double var1, double var3) {
      this.o = true;
      this.j = var1;
      this.k = var3;
   }

   public void b(int var1) {
      this.p = true;
      this.l = var1;
   }

   public void a(float var1, float var2, float var3) {
      this.a((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F));
   }

   public void a(float var1, float var2, float var3, float var4) {
      this.a((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public void a(int var1, int var2, int var3) {
      this.a(var1, var2, var3, 255);
   }

   public void a(int var1, int var2, int var3, int var4) {
      if(!this.t) {
         if(var1 > 255) {
            var1 = 255;
         }

         if(var2 > 255) {
            var2 = 255;
         }

         if(var3 > 255) {
            var3 = 255;
         }

         if(var4 > 255) {
            var4 = 255;
         }

         if(var1 < 0) {
            var1 = 0;
         }

         if(var2 < 0) {
            var2 = 0;
         }

         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         this.n = true;
         if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.m = var4 << 24 | var3 << 16 | var2 << 8 | var1;
         } else {
            this.m = var1 << 24 | var2 << 16 | var3 << 8 | var4;
         }

      }
   }

   public void a(double var1, double var3, double var5, double var7, double var9) {
      this.a(var7, var9);
      this.a(var1, var3, var5);
   }

   public void a(double var1, double var3, double var5) {
      ++this.s;
      if(this.u == 7 && b && this.s % 4 == 0) {
         for(int var7 = 0; var7 < 2; ++var7) {
            int var8 = 8 * (3 - var7);
            if(this.o) {
               this.intArray[this.r + 3] = this.intArray[this.r - var8 + 3];
               this.intArray[this.r + 4] = this.intArray[this.r - var8 + 4];
            }

            if(this.p) {
               this.intArray[this.r + 7] = this.intArray[this.r - var8 + 7];
            }

            if(this.n) {
               this.intArray[this.r + 5] = this.intArray[this.r - var8 + 5];
            }

            this.intArray[this.r + 0] = this.intArray[this.r - var8 + 0];
            this.intArray[this.r + 1] = this.intArray[this.r - var8 + 1];
            this.intArray[this.r + 2] = this.intArray[this.r - var8 + 2];
            ++this.points;
            this.r += 8;
         }
      }

      if(this.o) {
         this.intArray[this.r + 3] = Float.floatToRawIntBits((float)this.j);
         this.intArray[this.r + 4] = Float.floatToRawIntBits((float)this.k);
      }

      if(this.p) {
         this.intArray[this.r + 7] = this.l;
      }

      if(this.n) {
         this.intArray[this.r + 5] = this.m;
      }

      if(this.q) {
         this.intArray[this.r + 6] = this.y;
      }

      this.intArray[this.r + 0] = Float.floatToRawIntBits((float)(var1 + this.v));
      this.intArray[this.r + 1] = Float.floatToRawIntBits((float)(var3 + this.w));
      this.intArray[this.r + 2] = Float.floatToRawIntBits((float)(var5 + this.x));
      this.r += 8;
      ++this.points;
      if(this.points % 4 == 0 && this.r >= this.bufferSize - 32) {
         this.a();
         this.running = true;
      }

   }

   public void c(int var1) {
      int var2 = var1 >> 16 & 255;
      int var3 = var1 >> 8 & 255;
      int var4 = var1 & 255;
      this.a(var2, var3, var4);
   }

   public void a(int var1, int var2) {
      int var3 = var1 >> 16 & 255;
      int var4 = var1 >> 8 & 255;
      int var5 = var1 & 255;
      this.a(var3, var4, var5, var2);
   }

   public void c() {
      this.t = true;
   }

   public void b(float var1, float var2, float var3) {
      this.q = true;
      byte var4 = (byte)((int)(var1 * 127.0F));
      byte var5 = (byte)((int)(var2 * 127.0F));
      byte var6 = (byte)((int)(var3 * 127.0F));
      this.y = var4 & 255 | (var5 & 255) << 8 | (var6 & 255) << 16;
   }

   public void b(double var1, double var3, double var5) {
      this.v = var1;
      this.w = var3;
      this.x = var5;
   }

   public void c(float var1, float var2, float var3) {
      this.v += var1;
      this.w += var2;
      this.x += var3;
   }

}
