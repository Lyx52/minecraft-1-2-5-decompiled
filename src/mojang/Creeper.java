package mojang;

public class Creeper extends Monster {

   int a;
   int b;


   public Creeper(World var1) {
      super(var1);
      this.bm = "/mojang/mob/creeper.png";
      this.bT.a(1, new aje(this));
      this.bT.a(2, new ahe(this));
      this.bT.a(3, new fg(this, Ozelot.class, 6.0F, 0.25F, 0.3F));
      this.bT.a(4, new ax(this, 0.25F, false));
      this.bT.a(5, new acu(this, 0.2F));
      this.bT.a(6, new ob(this, Player.class, 8.0F));
      this.bT.a(6, new bd(this));
      this.bU.a(1, new amf(this, Player.class, 16.0F, 0, true));
      this.bU.a(2, new zy(this, false));
   }

   public boolean b_() {
      return true;
   }

   public int d() {
      return 20;
   }

   protected void b() {
      super.b();
      this.ac.a(16, Byte.valueOf((byte)-1));
      this.ac.a(17, Byte.valueOf((byte)0));
   }

   public void b(CompundTag var1) {
      super.b(var1);
      if(this.ac.a(17) == 1) {
         var1.addBoolean("powered", true);
      }

   }

   public void a(CompundTag var1) {
      super.a(var1);
      this.ac.b(17, Byte.valueOf((byte)(var1.getBoolean("powered")?1:0)));
   }

   public void J_() {
      if(this.M()) {
         this.b = this.a;
         int var1 = this.ag();
         if(var1 > 0 && this.a == 0) {
            this.k.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.a += var1;
         if(this.a < 0) {
            this.a = 0;
         }

         if(this.a >= 30) {
            this.a = 30;
            if(!this.k.F) {
               if(this.af()) {
                  this.k.a(this, this.o, this.p, this.q, 6.0F);
               } else {
                  this.k.a(this, this.o, this.p, this.q, 3.0F);
               }

               this.A();
            }
         }
      }

      super.J_();
   }

   protected String n() {
      return "mojang.mob.creeper";
   }

   protected String o() {
      return "mojang.mob.creeperdeath";
   }

   public void a(md var1) {
      super.a(var1);
      if(var1.a() instanceof Skeleton) {
         this.b(yr.bF.bQ + this.U.nextInt(10), 1);
      }

   }

   public boolean c(BaseEntity var1) {
      return true;
   }

   public boolean af() {
      return this.ac.a(17) == 1;
   }

   public float c(float var1) {
      return ((float)this.b + (float)(this.a - this.b) * var1) / 28.0F;
   }

   protected int f() {
      return yr.M.bQ;
   }

   public int ag() {
      return this.ac.a(16);
   }

   public void d(int var1) {
      this.ac.b(16, Byte.valueOf((byte)var1));
   }

   public void a(d var1) {
      super.a(var1);
      this.ac.b(17, Byte.valueOf((byte)1));
   }
}
