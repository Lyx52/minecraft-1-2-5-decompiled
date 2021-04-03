package mojang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class ahu {

   private Map o = new HashMap();
   public static ahu a = new ahu();
   private nl p;
   public static double b;
   public static double c;
   public static double d;
   public TextureManager e;
   public mn f;
   public World g;
   public Mob h;
   public float i;
   public float j;
   public OptionParser k;
   public double l;
   public double m;
   public double n;


   private ahu() {
      this.o.put(Spider.class, new amo());
      this.o.put(CaveSpider.class, new amo());
      this.o.put(Pig.class, new ix(new dl(), new dl(0.5F), 0.7F));
      this.o.put(Sheep.class, new alq(new jm(), new dj(), 0.7F));
      this.o.put(Cow.class, new ajh(new ze(), 0.7F));
      this.o.put(MushroomCow.class, new cl(new ze(), 0.7F));
      this.o.put(Wolf.class, new aki(new sx(), 0.5F));
      this.o.put(Chicken.class, new gn(new ahp(), 0.3F));
      this.o.put(Ozelot.class, new sw(new mu(), 0.4F));
      this.o.put(Silverfish.class, new vs());
      this.o.put(Creeper.class, new sv());
      this.o.put(Enderman.class, new st());
      this.o.put(SnowMan.class, new afm());
      this.o.put(Skeleton.class, new tg(new ie(), 0.5F));
      this.o.put(Blaze.class, new qz());
      this.o.put(Zombie.class, new tg(new wr(), 0.5F));
      this.o.put(Slime.class, new jd(new ads(16), new ads(0), 0.25F));
      this.o.put(LavaSlime.class, new aw());
      this.o.put(Player.class, new we());
      this.o.put(Giant.class, new alz(new wr(), 0.5F, 6.0F));
      this.o.put(Ghast.class, new lm());
      this.o.put(Squid.class, new ww(new qw(), 0.7F));
      this.o.put(Villager.class, new zb());
      this.o.put(VillagerGolem.class, new co());
      this.o.put(Mob.class, new fe(new xg(), 0.5F));
      this.o.put(EnderDragon.class, new or());
      this.o.put(EnderCrystal.class, new ik());
      this.o.put(BaseEntity.class, new it());
      this.o.put(Painting.class, new dh());
      this.o.put(Arrow.class, new iv());
      this.o.put(Snowball.class, new cr(yr.aD.b(0)));
      this.o.put(ThrownEnderpearl.class, new cr(yr.bn.b(0)));
      this.o.put(EyeOfEnderSignal.class, new cr(yr.bA.b(0)));
      this.o.put(qe.class, new cr(yr.aP.b(0)));
      this.o.put(ThrownPotion.class, new cr(154));
      this.o.put(ThrownExpBottle.class, new cr(yr.bD.b(0)));
      this.o.put(Fireball.class, new abu(2.0F));
      this.o.put(SmallFireball.class, new abu(0.5F));
      this.o.put(Item.class, new tw());
      this.o.put(XPOrb.class, new tb());
      this.o.put(PrimeTnt.class, new aeo());
      this.o.put(FallingSand.class, new yt());
      this.o.put(Minecart.class, new ahm());
      this.o.put(Boat.class, new ea());
      this.o.put(act.class, new afj());
      this.o.put(d.class, new afg());
      Iterator var1 = this.o.values().iterator();

      while(var1.hasNext()) {
         um var2 = (um)var1.next();
         var2.a(this);
      }

   }

   public um a(Class var1) {
      um var2 = (um)this.o.get(var1);
      if(var2 == null && var1 != BaseEntity.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public um a(BaseEntity var1) {
      return this.a(var1.getClass());
   }

   public void a(World var1, TextureManager var2, nl var3, Mob var4, OptionParser var5, float var6) {
      this.g = var1;
      this.e = var2;
      this.k = var5;
      this.h = var4;
      this.p = var3;
      if(var4.az()) {
         int var7 = var1.a(Utils.c(var4.o), Utils.c(var4.p), Utils.c(var4.q));
         if(var7 == pb.S.bO) {
            int var8 = var1.e(Utils.c(var4.o), Utils.c(var4.p), Utils.c(var4.q));
            int var9 = var8 & 3;
            this.i = (float)(var9 * 90 + 180);
            this.j = 0.0F;
         }
      } else {
         this.i = var4.w + (var4.u - var4.w) * var6;
         this.j = var4.x + (var4.v - var4.x) * var6;
      }

      if(var5.E == 2) {
         this.i += 180.0F;
      }

      this.l = var4.N + (var4.o - var4.N) * (double)var6;
      this.m = var4.O + (var4.p - var4.O) * (double)var6;
      this.n = var4.P + (var4.q - var4.P) * (double)var6;
   }

   public void a(BaseEntity var1, float var2) {
      double var3 = var1.N + (var1.o - var1.N) * (double)var2;
      double var5 = var1.O + (var1.p - var1.O) * (double)var2;
      double var7 = var1.P + (var1.q - var1.P) * (double)var2;
      float var9 = var1.w + (var1.u - var1.w) * var2;
      int var10 = var1.b(var2);
      if(var1.T()) {
         var10 = 15728880;
      }

      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      ARBTextureHelper.setMultiTexCoord2f(ARBTextureHelper.b, (float)var11 / 1.0F, (float)var12 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(BaseEntity var1, double var2, double var4, double var6, float var8, float var9) {
      um var10 = this.a(var1);
      if(var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(World var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public nl a() {
      return this.p;
   }

}
