/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
class TestSpace {

    public static void main(String[] args) {
        System.out.println(test("We are happy."));
    }

    public static String test(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char unit = s.charAt(i);
            if(Character.isWhitespace(unit)){
                result.append("%20");
            }else{
                result.append(unit);
            }
        }
        return result.toString();
    }

}