public class RemoveWhitespace {
    public String whiteSpace(String input){
        StringBuilder stringBuilder=new StringBuilder();
        char[] charArray=input.toCharArray();

        for (char c:charArray){
            if (!Character.isWhitespace(c));
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String s = "  abc  def";

        s = s.strip();

        System.out.println(s);
    }
}
