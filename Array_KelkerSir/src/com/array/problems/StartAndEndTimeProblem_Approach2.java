package com.array.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class StartAndEndTimeProblem_Approach2 {

	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(20, 25));
		list.add(new Interval(21, 40));
		list.add(new Interval(5, 15));
		list.add(new Interval(2, 10));
		list.add(new Interval(6, 19));
		list.add(new Interval(23, 44));
		System.out.println("Number of Meeting to conduct : " + list.size());
		Collections.sort(list, new Interval());
		for(int i=0; i<list.size();i++)
			System.out.println(list.get(i).start +" - "+list.get(i).end);
		System.out.println("Minumum rooms require to conduct all meetings : "
				+ getNumberOfMinimumRoomsRequire(list));

	}

	static int getNumberOfMinimumRoomsRequire(List<Interval> list) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		if (list.size() == 0)
			return 0;
		int count = 1;
		int top;
		queue.add(list.get(0).end - 1);
		for (int i = 1; i < list.size(); i++) {
			top = queue.peek() - 1;
			if (list.get(i).start < top) {
				count++;
			} else {
				queue.poll();
			}
			queue.add(list.get(i).end - 1);
		}
		return count;
	}

	static class Interval implements Comparator<Interval> {
		int start, end;

		public Interval() {
		}

		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compare(Interval a, Interval b) {
			Interval next = (Interval) a;
			Interval current = (Interval) b;

			if (next.start == current.start)
				return 0;
			else if (next.start > current.start)
				return 1;
			else
				return -1;
		}
	}
}
