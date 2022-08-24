import org.w3c.dom.Node;

public class LinkedList {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add a node at first.
            public void addFirst (String data){
        //if we have head == null than create a new node using Node class.
                Node newNode = new Node(data);
                //to check if there's any linkedList present, check for null value.
                //so to check whether the linkedlist is there or not we check it using if condition.
                //if my head is equal to null then we hava linkedlist present.
                if (head == null) {
                    head=newNode; //after checking we will assign our newnode as head.
                    return;
                }
                //if we already have a list present then make my newNode as head.
                newNode.next = head;
                //and than make that new node as head.
                head = newNode;
            }

            public void addLast(String data){
        //to check whether head node is empty or not.
                Node newNode=new Node(data);
                if (head==null){
                    head=newNode;
                    return;
                }
                //to traverse any linkedlist we create a node and assign it to head.
                //and update the current node
                Node cuurentNode=head;
                //we cannot make the head to traverse through so to avoid that we
                //make use of currentNode.
                while (cuurentNode.next!=null){
                    cuurentNode=cuurentNode.next;
                }
                cuurentNode.next=newNode;
            }
            public void deleteFirst(){

                        if (head==null){
                            System.out.println("The list is empty.");
                            return;
                        }
                        head=head.next;
                }

                public void printList(){
                    Node cuurentNode=head;
                    if (head==null){
                        System.out.println("The list is empty.");
                        return;
                    }
                    while (cuurentNode.next!=null){
                        System.out.print(cuurentNode.data+" -> ");
                        cuurentNode=cuurentNode.next;
                    }
                    System.out.print("NULL");
                }

                public  void deleteLast(){
                    if (head==null){
                        System.out.println("The list is empty.");
                        return;
                    }
                    if (head.next==null){
                        head=null;
                        return;
                    }
                    Node secondLast=head;
                    Node lastNode=head.next;
                    while (lastNode.next!=null){
                        lastNode=lastNode.next;
                        secondLast=secondLast.next;

                    }
                    secondLast.next=null;
                }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst("a");
        linkedList.addFirst("is");
        linkedList.addFirst("hello");
        linkedList.printList();

            
    }
}
