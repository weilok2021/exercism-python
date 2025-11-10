public class LogLevels {
    
    public static String message(String logLine) {
        final String arr[] = logLine.split(":");  
        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("ERROR")) {
            return "error";
        }
        if (logLine.contains("INFO")) {
            return "info";
        }
        if (logLine.contains("WARNING")) {
            return "warning";
        }
        return "";
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
