public class Armstrong {
    public static void main(String[] args) {
        int number=371,result=0,remainder,ogNumber;
        ogNumber=number;
        while(ogNumber!=0){
            remainder=ogNumber%10;
            result+=Math.pow(remainder,3);
            ogNumber=ogNumber/10;
        }
        if (result==number){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not a Armstrong");
        }
    }
}
