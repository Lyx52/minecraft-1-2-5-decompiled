package mojang;

import java.io.InputStream;
import mojang.net.minecraft.client.Minecraft;

public abstract class Resource {

   public String a;
   public String b;
   public String c;
   public String d;


   public void read() {}

   public void b() {}

   public void a(Minecraft minecraft) {}

   public void b(Minecraft minecraft) {}

   public void c(Minecraft minecraft) {}

   public InputStream readResourceAsStream(String location) {
      return Resource.class.getResourceAsStream(location);
   }
}
