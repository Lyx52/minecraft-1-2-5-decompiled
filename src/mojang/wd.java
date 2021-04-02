package mojang;

public abstract class wd extends bc {

   protected fy a = new fy(this);


   public wd(xd var1) {
      super(var1);
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)0));
      this.ac.a(17, "");
   }

   public void b(ady var1) {
      super.b(var1);
      if(this.ag() == null) {
         var1.a("Owner", "");
      } else {
         var1.a("Owner", this.ag());
      }

      var1.a("Sitting", this.af());
   }

   public void a(ady var1) {
      super.a(var1);
      String var2 = var1.j("Owner");
      if(var2.length() > 0) {
         this.a(var2);
         this.b(true);
      }

      this.a.a(var1.o("Sitting"));
   }

   protected void a(boolean var1) {
      String var2 = "heart";
      if(!var1) {
         var2 = "smoke";
      }

      for(int var3 = 0; var3 < 7; ++var3) {
         double var4 = this.U.nextGaussian() * 0.02D;
         double var6 = this.U.nextGaussian() * 0.02D;
         double var8 = this.U.nextGaussian() * 0.02D;
         this.k.a(var2, this.o + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, this.p + 0.5D + (double)(this.U.nextFloat() * this.J), this.q + (double)(this.U.nextFloat() * this.I * 2.0F) - (double)this.I, var4, var6, var8);
      }

   }

   public void a(byte var1) {
      if(var1 == 7) {
         this.a(true);
      } else if(var1 == 6) {
         this.a(false);
      } else {
         super.a(var1);
      }

   }

   public boolean G_() {
      return (this.ac.a(16) & 4) != 0;
   }

   public void b(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)(var2 | 4)));
      } else {
         this.ac.b(16, Byte.valueOf((byte)(var2 & -5)));
      }

   }

   public boolean af() {
      return (this.ac.a(16) & 1) != 0;
   }

   public void f(boolean var1) {
      byte var2 = this.ac.a(16);
      if(var1) {
         this.ac.b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.ac.b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public String ag() {
      return this.ac.d(17);
   }

   public void a(String var1) {
      this.ac.b(17, var1);
   }

   public acq ah() {
      return this.k.a(this.ag());
   }

   public fy ai() {
      return this.a;
   }
}
