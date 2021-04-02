package mojang;

public class StopGameException {

   public final String exceptionString;
   public final Throwable exception;


   public StopGameException(String exceptionString, Throwable exception) {
      this.exceptionString = exceptionString;
      this.exception = exception;
   }
}
