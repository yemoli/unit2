import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExecEscape {
    private static String getIllegalArgs(String param) {
        Pattern pattern = Pattern.compile("(`.*?`)|(\\$\\((.*?)\\))");
        Matcher matcher = pattern.matcher(param);
        if (matcher.find()) {
            return matcher.group(1) == null ? matcher.group(2) : matcher.group(1);
        }

        Iterator<String> iterator = Arrays.asList(";", "|", "&", ">").iterator();
        String[] argsList = param.split("\\s+");
        while (iterator.hasNext()) {
            String chr = iterator.next();
            for (String arg : argsList) {
                if (arg.contains(chr)) {
                    return arg;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {

        String mvn = "";
        StringBuilder cmdBuffer = new StringBuilder(mvn).append("mvn clean package -DskipTests ;");
        String cmd = ";ls";
        System.out.println(getIllegalArgs(cmd));

    }
}
