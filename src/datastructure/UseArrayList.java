//package datastructure;
//import databases.ConnectDB;
//import javafx.beans.binding.ObjectExpression;
//
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//
//
//
//public class UseArrayList {
//
//	public static void main(String[] args) {
//		/*
//		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
//		 * Use For Each loop and while loop with Iterator to retrieve data.
//		 * Store all the sorted data into one of the databases.
//		 *
//		 */
//		ArrayList<Object> newArrayList = new ArrayList<>();
//		newArrayList.add("Chocolate");
//		newArrayList.add(1, "Games");
//		newArrayList.add("Mario");
//		newArrayList.add("Sonic");
//
//
//		System.out.println(newArrayList.get(0));
//		System.out.println(newArrayList.get(newArrayList.size()-1));
//		newArrayList.remove("Sonic");
//		System.out.println(newArrayList.get(newArrayList.size()-1));
//
//
//		System.out.println();
//
//
//		for(Object s: newArrayList){
//			System.out.println(s);
//		}
//
//
//		System.out.println();
//
//
//		Iterator newIterator = newArrayList.iterator();
//		while(newIterator.hasNext()){
//			System.out.println(newIterator.next());
//		}
//
//
//
//
//		ConnectDB connectDB = new ConnectDB();
//
//
//
//
//		connectDB.InsertDataFromArrayListToMySql(newArrayList, "Games", "Consoles");
//		connectDB.readDataBase("Games", "Consoles");
//
//
//
//
//
//
//	}
//
//
//}
//
//
//
//
//	}
//
//}