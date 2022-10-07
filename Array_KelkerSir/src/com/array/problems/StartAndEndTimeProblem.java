package com.array.problems;

import java.util.PriorityQueue;

public class StartAndEndTimeProblem {

	public static void main(String[] args) {
		int startTime[] = { 4, 7, 15, 20, 27, 32 };
		int endTime[] = { 17, 10, 20, 30, 90, 56 };

		int counter = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(13);
		pq.add(20);
		pq.add(5);
		pq.add(2);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		/*
		 * 
		 * int e = 0; pq.add(endTime[e]); counter++; e++; while (e <
		 * endTime.length) { if (startTime[e] < pq.peek()) { counter++;
		 * pq.add(endTime[e]); } else { pq.poll(); pq.add(endTime[e]); } e++; }
		 * System.out.println(counter);
		 */
	}

}