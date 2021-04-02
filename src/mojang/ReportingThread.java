package mojang;

class ReportingThread extends Thread {

   final AppReport report;


   ReportingThread(AppReport report, String threadName) {
      super(threadName);
      this.report = report;
   }

   public void run() {
      PostRequestHandler.sendPOSTMAP(AppReport.getReportingURL(this.report), AppReport.getReport(this.report), true);
   }
}
