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
		int index = minHeap.size() - 1;
		int temp;
		int current = minHeap.size();
		
		if(current == 0) {
			minHeap.add(element);
		}
		
		while(index >= 0){
			if(element < minHeap.get((index)/2)) {
				temp = minHeap.get((index)/2);
				minHeap.set(index/2, element);
				
				if(current > index) {
					minHeap.add(current, temp);
				} else {
					minHeap.set(current, temp);
				}
			} else {
				if(current > index) {
					minHeap.add(current, element);
				} else {
					break;
				}
			}
			
			index = index/2;
			current = index;
		}

	}

}
