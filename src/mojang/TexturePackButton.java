package mojang;

public class TexturePackButton extends Button {

   private final DefaultOptions options;


   public TexturePackButton(int id, int x, int y, String title) {
      this(id, x, y, (DefaultOptions)null, title);
   }

   public TexturePackButton(int id, int x, int y, int width, int height, String title) {
      super(id, x, y, width, height, title);
      this.options = null;
   }

   public TexturePackButton(int id, int x, int y, DefaultOptions options, String title) {
      super(id, x, y, 150, 20, title);
      this.options = options;
   }

   public DefaultOptions getOptions() {
      return this.options;
   }
}
