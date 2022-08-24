public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("H");
//        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.charAt(0));
//        //set char at is used to update the character at particular index..
//        stringBuilder.setCharAt(0,'h');
//        System.out.println(stringBuilder);
//        stringBuilder.insert(8,"Athani");
//        System.out.println(stringBuilder);
//        stringBuilder.delete(8,15);
//        System.out.println(stringBuilder);
        stringBuilder.append("a");
        stringBuilder.append("r");
        stringBuilder.append("s");
        stringBuilder.append("h");
    System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
    }
}
