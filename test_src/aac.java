import java.io.InputStream;
import paulscode.sound.codecs.CodecJOrbis;

public class aac extends CodecJOrbis {

   protected InputStream openInputStream() {
      return new adu(this, this.url, this.urlConnection.getInputStream());
   }
}
