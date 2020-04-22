public class MyLinkedListQueue {

    class Node{
       int key;
       Node next ;

       public Node(int key){
           this.key = key;
       }
   }

   Node head;
   Node tail;

   public MyLinkedListQueue(){
       this.head =null;
       this.tail = null;
   }

   void  enqueue(int key){
       Node temp = new Node(key);
       if (tail== null){
           head =tail =temp;
           return;
       }else {
           tail.next =temp;
           tail =temp;
       }
   }

   Node dequeue(){
       if (head == null){
           return null;
       }
       Node temp =head;
       head = temp.next;
       if (head ==null)
           tail =null;
       return temp;
   }

}
