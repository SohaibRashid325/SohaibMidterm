//package datastructure;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//
//public class UseMap {
//
//	public static void main(String[] args) {
//		/*
//		 * Demonstrate how to use Map that includes storing and retrieving elements.
//		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
//		 * Use For Each loop and while loop with Iterator to retrieve data.
//		 *
//		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
//		 */
//
//		Map<Integer, String> newMap = new HashMap<>();
//
//
//		newMap.put(0, "Oranges");
//		newMap.put(1, "Apples");
//		newMap.put(2, "Grapes");
//		newMap.put(3, "Mangos");
//
//
//		for(Map.Entry<Integer, String> i : newMap.entrySet()){
//			System.out.println(i);
//		}
//
//
//		System.out.println();
//
//
//		System.out.println(newMap.get(3));
//		newMap.remove(3);
//
//
//		newMap.replace(2, "Daredevil", "The Defenders");
//
//
//		for(Map.Entry<Integer, String> i : newMap.entrySet()){
//			System.out.println(i);
//		}
//
//
//		System.out.println();
//
//
//		Iterator<Map.Entry<Integer, String>> i = newMap.entrySet().iterator();
//		while(i.hasNext()){
//			System.out.println(m.next());
//		}
//
//
//	}
//
//
//
//
//
//
//}
//
//	}
//
//}
