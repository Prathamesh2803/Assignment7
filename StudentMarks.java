package Assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double sum = 0;
           ArrayList<Integer> marks=new ArrayList<>();
           marks.add(40);
           marks.add(65);
           marks.add(75);
           marks.add(93);
           System.out.println(marks);
           for (double element : marks) {
				sum = sum + element;
			}
			double average = sum / marks.size();;
			// list.size();
			 System.out.println("Highest Marks:"+Collections.max(marks));
	
			System.out.println("Average marks : " + average);
	System.out.println("Marks:"+"1)"+marks.get(0)+"\n"+"2)"+marks.get(1)+"\n"+"3)"+marks.get(2)+"\n"+"4)"+marks.get(3));
          System.out.println("Marks of 3rd Student:"+marks.get(2));
          Collections.sort(marks);
          System.out.println("Final Sorted mark List");
	
	}  
}
