package mojang;

import java.util.ArrayList;
import java.util.List;

public class CredentialManager {

   public static List credList = new ArrayList();
   public String username;
   public String sessionid;
   public String mppass;


   public CredentialManager(String username, String sessionid) {
      this.username = username;
      this.sessionid = sessionid;
   }

   static {
      credList.add(pb.t);
      credList.add(pb.w);
      credList.add(pb.al);
      credList.add(pb.v);
      credList.add(pb.x);
      credList.add(pb.J);
      credList.add(pb.K);
      credList.add(pb.aq);
      credList.add(pb.ak);
      credList.add(pb.M);
      credList.add(pb.ao);
      credList.add(pb.y);
      credList.add(pb.ad);
      credList.add(pb.ae);
      credList.add(pb.af);
      credList.add(pb.ag);
      credList.add(pb.E);
      credList.add(pb.F);
      credList.add(pb.L);
      credList.add(pb.ab);
      credList.add(pb.I);
      credList.add(pb.H);
      credList.add(pb.G);
      credList.add(pb.ai);
      credList.add(pb.ah);
      credList.add(pb.an);
      credList.add(pb.am);
      credList.add(pb.ap);
   }
}
