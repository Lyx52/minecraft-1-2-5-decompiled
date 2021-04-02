package mojang;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AppReport {

   private Map reportValues = new HashMap();
   private final URL reportURL;


   public AppReport(String applicationType) {
      URL tempURL;
      try {
         tempURL = new URL("https://snoop.minecraft.net/" + applicationType);
      } catch (MalformedURLException e) {
         e.printStackTrace();
         tempURL = null;
      }
      this.reportURL = tempURL;
   }

   public void addValue(String paramName, Object value) {
      this.reportValues.put(paramName, value);
   }

   public void init() {
      ReportingThread reporter = new ReportingThread(this, "reporter");
      reporter.setDaemon(true);
      reporter.start();
   }

   static URL getReportingURL(AppReport report) {
      return report.reportURL;
   }

   static Map getReport(AppReport report) {
      return report.reportValues;
   }
}
