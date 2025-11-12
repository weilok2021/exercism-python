public class LogLine {

    private String log;
    
    public LogLine(String log) {
        this.log = log;
    }

 public LogLevel getLogLevel() {
        LogLevel logLevel; 
        int start = this.log.indexOf('[') + 1;
        int end = this.log.indexOf(']');
        StringBuilder sb = new StringBuilder();
        char[] logArr = log.toCharArray();
        for (int i = start; i < end; i++) {
            sb.append(logArr[i]);
        }

        String tempLogLevel = sb.toString();
        switch(tempLogLevel) {
            case "TRC":
                logLevel = LogLevel.TRACE;
                break;
            case "DBG":
                logLevel = LogLevel.DEBUG;
                break;
            case "INF":
                logLevel = LogLevel.INFO;
                break;
            case "WRN":
                logLevel = LogLevel.WARNING;
                break;
            case "ERR":
                logLevel = LogLevel.ERROR;
                break;
            case "FTL":
                logLevel = LogLevel.FATAL;
                break;
            default:
                logLevel = LogLevel.UNKNOWN;
                break;
        }
        return logLevel;
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = this.getLogLevel();
        int numLogLevel = logLevel.getNumLogLevel();
        int start = this.log.indexOf(':') + 2;
        int end = this.log.length();
        char[] logArr = log.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(numLogLevel);
        sb.append(':');
        for (int i = start; i < end; i++) {
            sb.append(logArr[i]);
        }
        return sb.toString().trim();
    }
}
