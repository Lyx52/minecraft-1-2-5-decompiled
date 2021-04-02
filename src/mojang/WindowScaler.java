package mojang;

public class WindowScaler {

   private int width;
   private int height;
   public double widthScaled;
   public double heightScaled;
   public int scale;


   public WindowScaler(OptionParser optionParser, int width, int height) {
      this.width = width;
      this.height = height;
      this.scale = 1;
      int guiScale = optionParser.guiScale;
      if(guiScale == 0) {
         guiScale = 1000;
      }

      while(this.scale < guiScale && this.width / (this.scale + 1) >= 320 && this.height / (this.scale + 1) >= 240) {
         ++this.scale;
      }

      this.widthScaled = (double)this.width / (double)this.scale;
      this.heightScaled = (double)this.height / (double)this.scale;
      this.width = (int)Math.ceil(this.widthScaled);
      this.height = (int)Math.ceil(this.heightScaled);
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }
}
