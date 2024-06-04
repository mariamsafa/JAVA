import java.util.PriorityQueue;

class priority{
    public static void main(String[] args) {
        PriorityQueue<Integer>n=  new PriorityQueue<>();
        n.add(3);
        n.add(4);
        n.add(20);
        n.add(5);
        n.add(2);
        n.offer(2);
        // System.out.println(n.poll());//removing values
        // System.out.println(n.poll());
        // System.out.println(n.poll());
        // System.out.println(n.poll());
        // System.out.println(n.poll());
        // System.out.println(n.poll());
        System.err.println(n);

         int number= n.peek();//shows the head
         System.out.println(number);


         n.remove(2);
         n.remove(2);
         System.out.println(n);

         for (Integer element : n) {
            System.out.println(element+1);
        }



        System.out.println("Does the queue contain 3? " + n.contains(3));


        System.out.println("Size of queue: " + n.size());


        n.clear();


        System.out.println("Is the queue empty? " + n.isEmpty());


    }
}