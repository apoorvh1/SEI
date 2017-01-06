
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DeDup {

	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

	public static void main(String[] args) {
		DeDup dd = new DeDup();
		
		int input;
		
		//Loop to provide user choice
		do{
			System.out.println("Please select an Input: ");
			System.out.println("1: HashSet ");
			System.out.println("2: TreeSet ");
			System.out.println("3: LinkedHashSet ");
			System.out.println("4: Exit ");
		
			Scanner sc = new Scanner(System.in);
			try{
				input = sc.nextInt(); 
			}catch(Exception e){
				input = 0;
			}
			
			//Use switch case to provide option
			switch(input){
				case 1: 
					//Calling HashSet (Random order)
					dd.dedup_HashSet();
					break;
				case 2: 
					//Using TreeSet (Ascending order)
					dd.dedup_TreeSet();
					break;
				case 3: 
					//Using LinkedHashSet (Maintain Order)
					dd.dedup_LinkedHashSet();
					break;
				case 4: 
					System.out.println("\nThanks!");
					System.exit(0);
					break;
				default: System.out.println("\nInvalid Input. Please try again!\n");
			}
			
		}while(true);
	}
	
	//Using HashSet to return unique elements
	private void dedup_HashSet(){
		HashSet<Integer> hs = new HashSet<Integer>();
		int count = 0;
		TreeSet<Integer> tsd = new TreeSet<Integer>();
		
		for(int i:randomIntegers){
			if(hs.add(i) == false){
				count++;
				tsd.add(i);
			}
		}
		
		System.out.println("\nUnique elements in random order (HashSet): " + hs + "\n");
		System.out.println("Total duplicate elements count: " + count + "\n");
		System.out.println("Duplicate elements: " + tsd + "\n");
	}
	
	//Using TreeSet to return unique elements with Ascending sort
	private void dedup_TreeSet(){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int count = 0;
		TreeSet<Integer> tsd = new TreeSet<Integer>();
		
		for(int i:randomIntegers){
			if(ts.add(i) == false){
				count++;
				tsd.add(i);
			}
		}
		
		System.out.println("\nUnique elements in ascending order (TreeSet): " + ts + "\n");
		System.out.println("Total duplicate elements count: " + count + "\n");
		System.out.println("Duplicate elements: " + tsd + "\n");
	}
	
	//Using LinkedHashSet to return unique elements with Insertion Order
		private void dedup_LinkedHashSet(){
			LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
			int count = 0;
			TreeSet<Integer> tsd = new TreeSet<Integer>();
			
			for(int i:randomIntegers){
				if(ls.add(i) == false){
					count++;
					tsd.add(i);
				}
			}
			
			System.out.println("\nUnique elements with insertion order (LinkedHashSet): " + ls + "\n");
			System.out.println("Total duplicate elements count: " + count + "\n");
			System.out.println("Duplicate elements: " + tsd + "\n");
		}
}