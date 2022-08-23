import java.util.ArrayList;

public class StackArray {
        static class Stack{
            static ArrayList<Integer> arrayList=new ArrayList<Integer>();
            //to check whether our stack is empty or not
            public boolean isEmpty(){
                return arrayList.size()==0;
            }
        //to implement push function.
            public void push(int data){
                arrayList.add(data);
            }
            public int pop(){
                if (isEmpty()){
                    return -1;
                }
                int top=arrayList.get(arrayList.size()-1);
                arrayList.remove(arrayList.size()-1);
                return top;
            }
        }
    public static void main(String[] args) {
            Stack newStack=new Stack();
            newStack.push(1);
        newStack.push(3);
        newStack.push(2);

        while (!newStack.isEmpty()){
            System.out.println(newStack.pop());
        }

    }
}
