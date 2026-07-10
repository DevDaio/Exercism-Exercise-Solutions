public class LogLevels {

    public static String message(String logLine) {
    String[] log = logLine.split(":");
    return log[1].trim();
    }

    public static String logLevel(String logLine) {
    String[] log = logLine.split("\\[");
    String[] line = log[1].split("\\]");
    String retu = line[0];
    return retu.toLowerCase();
    }

    public static String reformat(String logLine) {
    String concat = message(logLine) + " " + "(" + logLevel(logLine) + ")";
    return concat;
    }
}
