public class LogLevels {
    
    public static String message(String logLine) {
        final String arr[] = logLine.split(":");  
        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        // Match anything between "[" and "]"
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');
        
        if (start != -1 && end != -1 && end > start) {
            return logLine.substring(start + 1, end).toLowerCase();
        }
        return "";
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
