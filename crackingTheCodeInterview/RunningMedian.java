import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {

	// - We use 2 Heaps to keep track of median
	// - We make sure that 1 of the following conditions is always true:
//	    1) maxHeap.size() == minHeap.size()
//	    2) maxHeap.size() - 1 = minHeap.size()
	
	private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // keeps track of
																										// the SMALL
																										// numbers
	private static PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // keeps track of the LARGE numbers

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		medianTracker(array);
	}

	private static void medianTracker(int[] array) {
		for (int i = 0; i < array.length; i++) {
			addNumber(array[i]);
			System.out.println(getMedian());
		}

	}

	private static double getMedian() {
		if(minHeap.isEmpty()) return maxHeap.peek();
//		if(maxHeap.isEmpty()) return maxHeap.peek();
		else if(maxHeap.size() == minHeap.size()) {
			return (maxHeap.peek()+minHeap.peek()) /2.0;
		}
		else { //(maxHeap.size() != minHeap.size()) 
			return maxHeap.peek();
		}
	}

	private static void addNumber(int number) {
		if (maxHeap.isEmpty()) {
			maxHeap.add(number);
		} else if (maxHeap.size() == minHeap.size()) {
			if(number < minHeap.peek()) {
				maxHeap.add(number);
			}else {
				maxHeap.add(minHeap.remove());
				minHeap.add(number);
			}

		} else if (maxHeap.size() > minHeap.size()) {
			if (number > maxHeap.peek()) {
                minHeap.add(number);
				
			}else{
                minHeap.offer(maxHeap.remove());
				maxHeap.add(number);
            }
		}

	}

}
