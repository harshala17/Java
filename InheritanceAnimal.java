public class InheritanceAnimal {
    String name;
    String color;

    InheritanceAnimal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

    class Hen extends InheritanceAnimal {

        Hen(String name, String color) {
            super(name, color);

        }


        public static void main(String[] args) {
            Hen hen = new Hen("Tiger", "Yellow");
            System.out.println(hen.name + " " + hen.color);
        }
    }
