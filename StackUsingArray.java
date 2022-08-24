public class StackUsingArray {
    int size;
    int[] arr;
    int top;

    StackUsingArray(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=top;

    }

    public void addInto(int pushedElement){
        if (!isFull()){
            top++;
            arr[top]=pushedElement;
            System.out.println("Pushed Element : "+pushedElement);
        }
        else {
            System.out.println("Stack is full");
        }

    }

    public int pop(){
            if (!isEmpty()){
                int returnedTop=top;
                top--;
                System.out.println("Popped :"+returnedTop);
                return arr[returnedTop];
            }
            else {
                System.out.println("Stack is empty");
                return -1;
            }
    }

    public boolean isFull(){
        return size-1==top;
    }

    public boolean isEmpty(){
        return top==-1;
    }




    public static void main(String[] args) {
        StackUsingArray stackUsingArray=new StackUsingArray(10);

        stackUsingArray.addInto(2);
        stackUsingArray.addInto(4);
        stackUsingArray.addInto(9);
        System.out.println("==========");
        stackUsingArray.pop();
        stackUsingArray.pop();

        System.out.println("==========");

    }
}
