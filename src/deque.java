import java.util.*;

public class deque {
    public static void main(String args[]){


                // Creating a Deque
                Deque<Integer> deque = new LinkedList<>();

                // Adding elements to the Deque
                deque.add(1); // Add at the end
                deque.addFirst(2); // Add at the front
                deque.addLast(3); // Add at the end (same as add())
                deque.offer(4); // Add at the end
                deque.offerFirst(5); // Add at the front
                deque.offerLast(6); // Add at the end

                // Printing the Deque
                System.out.println("Deque after additions: " + deque);

                // Accessing elements
                System.out.println("First element (using getFirst): " + deque.getFirst());
                System.out.println("Last element (using getLast): " + deque.getLast());
                System.out.println("First element (using peek): " + deque.peek());
                System.out.println("First element (using peekFirst): " + deque.peekFirst());
                System.out.println("Last element (using peekLast): " + deque.peekLast());

                // Removing elements
                System.out.println("Removed first element (using removeFirst): " + deque.removeFirst());
                System.out.println("Removed last element (using removeLast): " + deque.removeLast());
                System.out.println("Removed first element (using poll): " + deque.poll());
                System.out.println("Removed first element (using pollFirst): " + deque.pollFirst());
                System.out.println("Removed last element (using pollLast): " + deque.pollLast());

                // Checking if Deque contains an element
                deque.add(7);
                deque.add(8);
                System.out.println("Deque contains 7: " + deque.contains(7));
                System.out.println("Deque contains 9: " + deque.contains(9));

                // Iterating over the Deque
                System.out.println("Iterating over the Deque:");
                for (Integer element : deque) {
                    System.out.println(element);
                }

                // Clearing the Deque
                deque.clear();
                System.out.println("Deque after clearing: " + deque);
            }
        }


