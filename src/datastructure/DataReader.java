//package datastructure;
//
//import databases.ConnectDB;
//import javafx.beans.binding.ObjectExpression;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//
//public class DataReader {
//
//	public static void main(String[] args) {
//		/*
//		 * User API to read the below textFile and print to console.
//		 * Use BufferedReader class.
//		 * Use try....catch block to handle Exception.
//		 *
//		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
//		 *
//		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
//		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
//		 * order from LinkedList and retrieve as FILO order from Stack.
//		 *
//		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
//		 * Use For Each loop/while loop/Iterator to retrieve data.
//		 */
//
//		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
//
//        ArrayList<Object> AL = new ArrayList<>();
//        AL.add("Chocolate");
//        AL.add(1, "Black Forrest");
//        AL.add("Red Velvet");
//        AL.add("Vanilla");
//
//
//        System.out.println(AL.get(0));
//        System.out.println(AL.get(AL.size()-1));
//        AL.remove("Vanilla");
//        System.out.println(AL.get(AL.size()-1));
//
//
//        System.out.println();
//
//
//        for(Object s: AL){
//            System.out.println(s);
//        }
//
//
//        System.out.println();
//
//
//        Iterator it = AL.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//
//
//
//        ConnectDB connectDB = new ConnectDB();
//
//
//
//
//        connectDB.InsertDataFromArrayListToMySql(AL, "Cake", "Flavors");
//        connectDB.readDataBase("Cake", "Flavors");
//
//
//
//
//
//
//    }
//
//
//}
//
//
//
//
//
//
//
