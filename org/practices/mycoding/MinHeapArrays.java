package org.practices.mycoding;

public class MinHeapArrays {

	static int minHeap[] = new int[15];
	static int size = 0;
	public static void main(String[] args) {
		
		insertElement(10);
		insertElement(16);
		insertElement(18);
		insertElement(23);
		insertElement(45);
		insertElement(7);
		insertElement(6);
		insertElement(5);
		
		for(int i=0; i < size; i++) {
			System.out.print(minHeap[i] + " ");
		}
	}
	
	public static void insertElement(int element) {
		int index = size;
		minHeap[size++] = element;
		int parent;
		int temp;
		
		if(size == 1) {
			return;
		}
			
		while(index > 0) {
			parent = (index-1)/2;
			if(minHeap[index] < minHeap[parent] ) {
				temp = minHeap[parent];
				minHeap[parent] = minHeap[index];
				minHeap[index] = temp;
			} else {
				break;
			}
			
			index = parent;
		}
	}

}
