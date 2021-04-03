package mojang;

import java.io.File;
import java.util.List;

public interface WorldFileInterface {

   WorldParser c();

   void b();

   ua createDimensionFile(alb var1);

   void a(WorldParser var1, List var2);

   void a(WorldParser var1);

   File getDataFile(String var1);

   String getWorldName();
}
