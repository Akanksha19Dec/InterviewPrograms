//Given are two ordered lists of sizes 7 and 3. The first list has three vacant spots in the end. Merge them in a sorted manner with a minimum number of steps.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeTwoOrderedList {

	
public static void main(String [] args)

{
	List<Integer> list1 = Arrays.asList(1,2,3,4,null,null,null);
	List<Integer> list2 = Arrays.asList(1,2,3);
	
	ArrayList<Integer> mergeList = new ArrayList<Integer>();
	mergeList.addAll(list1);
	mergeList.addAll(list2);
	//Collections.sort(mergeList); // sorted in ascending order
	Collections.sort(mergeList,Comparator.nullsLast(Comparator.naturalOrder()));
	System.out.println("List 1 is " +list1);
	System.out.println("List 2 is " +list2);
	System.out.println("Merge List is " +mergeList);

		
}
}

