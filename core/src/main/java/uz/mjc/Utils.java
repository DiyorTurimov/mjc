package uz.mjc;


/**
 * Hello world!
 */
public class Utils {
    public static boolean IsAllPositiveNumbers(String... strs) {
        for (String str : strs) {
            if (isPositive(str)) {
                return false;
            }

        }
        return true;
    }

    public static boolean isPositive(String str) {
        return org.apache.commons.lang3.StringUtils.contains(str, "-");
    }
}
