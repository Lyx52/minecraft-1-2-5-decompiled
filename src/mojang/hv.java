package mojang;

import java.util.Random;

public class hv {

   private static Random s = new Random();
   public double a;
   public double b;
   public double c;
   public double d;
   public double e;
   public double f;
   public double g;
   public boolean h;
   public int i;
   public int j;
   public double k;
   public double l;
   public double m;
   public double n;
   public double o;
   public double p;
   public double q;
   public double r;


   public void a(wg var1) {
      this.a += this.e;
      this.b += this.f;
      this.e *= this.g;
      this.f *= this.g;
      this.f += 0.1D;
      if(++this.i > this.j) {
         this.b();
      }

      this.n = 2.0D - (double)this.i / (double)this.j * 2.0D;
      if(this.n > 1.0D) {
         this.n = 1.0D;
      }

      this.n *= this.n;
      this.n *= 0.5D;
   }

   public void a() {
      this.o = this.k;
      this.p = this.l;
      this.q = this.m;
      this.r = this.n;
      this.c = this.a;
      this.d = this.b;
   }

   public void b() {
      this.h = true;
   }

}
