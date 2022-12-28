package suvendu.mystring;

final public class MyStringMethod {

    public String trim(String s) {
        if (s.isEmpty()) {
            return s;
        }
        s = trimFirst(s);
        if (s == null) {
            return "";
        }
        s = trimLast(s);
        if (s == null) {
            return "";
        }
        return s;
    }

    
    private static String trimFirst(String s) {
        try {
            if (s.charAt(0) != ' ') {
                return s;
            }
            if (s.charAt(0) == ' ') {
                return trimFirst(s.substring(1));
            }
        } catch (Exception e) {

            return null;
        }
        return null;
    }

    private static String trimLast(String s) {
        try {
            if (s.charAt(s.length() - 1) != ' ') {
                return s;
            }
            if (s.charAt(s.length() - 1) == ' ') {
                return trimLast(s.substring(0, s.length() - 1));
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}