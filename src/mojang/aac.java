package mojang;

import java.io.IOException;
import java.io.InputStream;
import mojang.paulscode.sound.codecs.CodecJOrbis;

public class aac extends CodecJOrbis {

   protected InputStream openInputStream() {
      try {
         return new adu(this, this.url, this.urlConnection.getInputStream());
      } catch (IOException e) {
         e.printStackTrace();
         return null;
      }
   }
}
