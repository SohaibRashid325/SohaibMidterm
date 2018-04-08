//package datastructure;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;
//
//
//public class UseQueue {
//
//	public static void main(String[] args) {
//		/*
//		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
//		 * Use For Each loop and while loop with Iterator to retrieve data.
//		 *
//		 */
//		Queue<String> newQueue = new LinkedList<String>();
//		newQueue.add("John");
//		newQueue.add("Melanie");
//		newQueue.add("Frank");
//		newQueue.add("Brian");
//		newQueue.add("Carlos");
//		newQueue.add("Anthony");
//
//
//		System.out.println(newQueue.peek());
//		System.out.println(newQueue.element());
//		System.out.println(newQueue.poll());
//
//
//
//
//
//
//		//Iterator
//		Iterator<String> name = newQueue.iterator();
//		while (name.hasNext()) {
//			System.out.println(name.next());
//
//
//		}
//
//
//		newQueue.remove();
//		System.out.println("After removing two elements:");
//		for (String st: newQueue) {
//			System.out.println(st);
//
//
//		}
//	}
//}
//
//
//
//	}
//
//}
