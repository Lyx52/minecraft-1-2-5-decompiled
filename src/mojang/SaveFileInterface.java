package mojang;

import java.util.List;

public interface SaveFileInterface {

   String isOld();

   akp a(String var1, boolean var2);

   List parseSaveFiles();

   void d();

   WorldParser parseSaveFile(String saveName);

   void deleteSave(String saveName);

   void a(String var1, String var2);

   boolean a(String var1);

   boolean a(String var1, rw var2);
}
