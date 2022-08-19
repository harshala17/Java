public class vowels {
    public static void main(String[] args) {
        System.out.println(getVowels("Hello"));
        System.out.println(getVowels("Harshala"));

    }
    public static boolean getVowels(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
