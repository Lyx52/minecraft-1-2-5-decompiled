package mojang;

public enum OSTypes {

   LINUX("linux", 0),
   SOLARIS("solaris", 1),
   WINDOWS("windows", 2),
   MACOS("macos", 3),
   UNKOWN("unknown", 4);

   private static final OSTypes[] TYPES = new OSTypes[]{LINUX, SOLARIS, WINDOWS, MACOS, UNKOWN};


   private OSTypes(String name, int id) {}

}
