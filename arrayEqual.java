import java.util.Arrays;

public class arrayEqual {

    public static void main(String[] args) {
        int arrayone[]={1,2,3,4,5};
        int arraytwo[]={1,2,3,8,5};

        Boolean status=Arrays.equals(arrayone,arraytwo);

        if (status==true){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }

    }
}
