/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
 * 该函数将返回左旋转两位得到的结果"cdefgab"。
 * 
 * 输入: s = "abcdefg", k = 2 输出: "cdefgab"
 */
class TestLeftString {

    public static void main(String[] args) {
        System.out.println(test1("abcdefg", 2));
    }

    /**
     * 列表遍历拼接
     */
    public static String test1(String s, int n) {
        if (n <= 0 || n > s.length())
            return s;

        char[] result = new char[s.length()];
        for (int i = n; i < n + s.length(); i++) {
            result[i - n] = s.charAt(i % s.length());
        }

        return new String(result);
    }

    /**
     * 通过字符串切片  来进行拼接
     */
    public static String test2(String s, int n) {
        if (n <= 0 || n > s.length())
            return s;
        return s.substring(n) + s.substring(0, n) ;
    }

}