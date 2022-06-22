public class longcommon {
    public static void main(String args[]) {

        String[] strs = { "flower", "flow", "flighT" };

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        String result = "";

        if (strs.length < 1 || strs.length > 200) {
            return result = "false1";
        } else {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < 1 || strs[i].length() > 200
                        || strs[i].matches("[a-z]+")) {
                    return result = "false2";
                }
            }
        }

        return result;
    }
}
