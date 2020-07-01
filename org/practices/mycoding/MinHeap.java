package org.practices.mycoding;

import java.util.ArrayList;

public class MinHeap {

	static ArrayList<Integer> minHeap = new ArrayList<>();
	
	public static void main(String[] args) {
		insertNode(10);
		insertNode(16);
		insertNode(18);
		insertNode(23);
		insertNode(45);
		insertNode(7);
		insertNode(6);
		insertNode(5);
		
		System.out.println(minHeap);
	}
	
	public static void insertNode(int element) {
		minHeap.add(element);
		
		int index = minHeap.size() - 1;
		int temp;
		
		if(index == 0) {
			return;
		}
		
		while(index > 0){
			if(minHeap.get(index) < minHeap.get((index-1)/2)) {
				temp = minHeap.get((index-1)/2);
				minHeap.set((index-1)/2, element);
				minHeap.set(index, temp);
			} else {
				break;
			}
			
			index = (index-1)/2;
		}

	}

}
