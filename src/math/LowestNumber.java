package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{213, 120, 1, 33, 67, 8, 7, 456, 321, 426, 78, 98, 45, 32, 56, 78, 90, 54, 32, 13, 67, 5, 79, 54, 32, 65};
		//find lowest number from the array

		int LowestNumber;
		LowestNumber = array[0];
		for (int anArray : array)
		{
			if (anArray < LowestNumber){
				LowestNumber = anArray;
			}
		}
		System.out.println("The lowest value in the given array is " + LowestNumber);

		ConnectDB connectDB = new ConnectDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectDB.insertDataFromArrayToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}
}
