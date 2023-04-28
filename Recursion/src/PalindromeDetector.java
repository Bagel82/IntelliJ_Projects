public class PalindromeDetector {
    public static boolean Detector(String pal) {
        boolean palin = true;
        for (int i = 0; i < pal.length(); i ++) {
            String n = String.valueOf(pal.charAt(i));
            String m = String.valueOf(pal.charAt(pal.length() - i - 1));
            boolean buffer = true;
            if (m.equals(n)) {

            }
            else {
                palin = false;
            }
        }
        return palin;
    }
}
