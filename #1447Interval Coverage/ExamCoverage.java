import java.util.Scanner;


public class ExamCoverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		if(start > end)//makesure end >= start
			return;
		
		int[] buckets = new int[end+2];
		for(int l = 0;l < buckets.length;l++){
			buckets[l] = 0;
		}
		
		while(count--!=0){
			int i = sc.nextInt();
			int j = sc.nextInt();
			if(buckets[i] < j) 
				buckets[i] = j;
		}
		
		
		int leftMax = 0;
		int countOfUsed = 0;
		while(true){
			int indexH = start;
			int maxOfEnd = 0;
			while(indexH > leftMax){
				maxOfEnd = Math.max(maxOfEnd, buckets[indexH]);
				indexH--;
			}
			if(maxOfEnd <= start){
				countOfUsed = 0;
				break;
			}else{
				countOfUsed++;
			}
			leftMax = start;
			if(maxOfEnd>=end){
				break;
			}
			start = maxOfEnd;
		}
		
		System.out.println(countOfUsed);
		
	}
}
