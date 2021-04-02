package mojang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class os extends dd {

   public List a = new ArrayList();


   public os(Player var1) {
      pb[] var2 = new pb[]{pb.w, pb.t, pb.aw, pb.G, pb.H, pb.I, pb.N, pb.aN, pb.bm, pb.bm, pb.bm, pb.bm, pb.aW, pb.ax, pb.ah, pb.ai, pb.z, pb.O, pb.al, pb.ao, pb.ak, pb.ak, pb.ak, pb.ak, pb.ak, pb.ak, pb.ap, pb.bb, pb.bc, pb.bd, pb.J, pb.J, pb.J, pb.J, pb.K, pb.K, pb.K, pb.K, pb.v, pb.u, pb.E, pb.Q, pb.Q, pb.Q, pb.F, pb.W, pb.x, pb.x, pb.x, pb.x, pb.y, pb.y, pb.y, pb.y, pb.Y, pb.L, pb.aT, pb.aU, pb.ad, pb.ae, pb.af, pb.ag, pb.aV, pb.br, pb.ba, pb.bf, pb.bu, pb.bp, pb.bq, pb.bA, pb.bB, pb.bC, pb.bJ, pb.by, pb.bz, pb.X, pb.X, pb.au, pb.ay, pb.M, pb.am, pb.an, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.ab, pb.P, pb.aB, pb.R, pb.aY, pb.V, pb.Z, pb.aZ, pb.bv, pb.aF, pb.aG, pb.T, pb.U, pb.aq, pb.at, pb.aH, pb.bw, pb.bx, pb.aJ, pb.aK, pb.aM, pb.aQ, pb.aR, pb.bk, pb.bE, pb.bL};
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 1;

      int var12;
      int var13;
      for(var12 = 0; var12 < var2.length; ++var12) {
         var13 = 0;
         if(var2[var12] == pb.ab) {
            var13 = var3++;
         } else if(var2[var12] == pb.ak) {
            var13 = var4++;
         } else if(var2[var12] == pb.J) {
            var13 = var5++;
         } else if(var2[var12] == pb.x) {
            var13 = var6++;
         } else if(var2[var12] == pb.y) {
            var13 = var7++;
         } else if(var2[var12] == pb.bm) {
            var13 = var8++;
         } else if(var2[var12] == pb.Q) {
            var13 = var9++;
         } else if(var2[var12] == pb.X) {
            var13 = var11++;
         } else if(var2[var12] == pb.K) {
            var13 = var10++;
         }

         this.a.add(new aan(var2[var12], 1, var13));
      }

      for(var12 = 256; var12 < yr.e.length; ++var12) {
         if(yr.e[var12] != null && yr.e[var12].bQ != yr.bs.bQ && yr.e[var12].bQ != yr.bC.bQ) {
            this.a.add(new aan(yr.e[var12]));
         }
      }

      for(var12 = 1; var12 < 16; ++var12) {
         this.a.add(new aan(yr.aW.bQ, 1, var12));
      }

      Iterator var15 = EntityManager.a.keySet().iterator();

      while(var15.hasNext()) {
         Integer var17 = (Integer)var15.next();
         this.a.add(new aan(yr.bC.bQ, 1, var17.intValue()));
      }

      aak var16 = var1.ap;

      for(var13 = 0; var13 < 9; ++var13) {
         for(int var14 = 0; var14 < 8; ++var14) {
            this.a(new yu(sr.g(), var14 + var13 * 8, 8 + var14 * 18, 18 + var13 * 18));
         }
      }

      for(var13 = 0; var13 < 9; ++var13) {
         this.a(new yu(var16, var13, 8 + var13 * 18, 184));
      }

      this.a(0.0F);
   }

   public boolean b(Player var1) {
      return true;
   }

   public void a(float var1) {
      int var2 = this.a.size() / 8 - 8 + 1;
      int var3 = (int)((double)(var1 * (float)var2) + 0.5D);
      if(var3 < 0) {
         var3 = 0;
      }

      for(int var4 = 0; var4 < 9; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            int var6 = var5 + (var4 + var3) * 8;
            if(var6 >= 0 && var6 < this.a.size()) {
               sr.g().a(var5 + var4 * 8, (aan)this.a.get(var6));
            } else {
               sr.g().a(var5 + var4 * 8, (aan)null);
            }
         }
      }

   }

   protected void b(int var1, int var2, boolean var3, Player var4) {}
}
