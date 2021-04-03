package mojang;

import java.util.List;

public interface SaveFileInterface {

   String isOld();

   WorldFileInterface getWorldFile(String var1, boolean var2);

   List parseOldSaveFiles();

   void d();

   WorldParser parseSaveFile(String saveName);

   void deleteSave(String saveName);

   void a(String var1, String var2);

   boolean isWorldValid(String var1);

   boolean a(String var1, GUIBackgroundInterface var2);
}
