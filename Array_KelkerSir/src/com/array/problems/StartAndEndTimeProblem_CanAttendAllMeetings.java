package com.array.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//How many meetings a Person can attend:
public class StartAndEndTimeProblem_CanAttendAllMeetings {

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
		System.out.println("Can Attend all meetings : "
				+ canAttendAllMeetings(list));

	}
	static boolean canAttendAllMeetings(List<Interval> list) {
		if (list.size() == 0)
			return false;
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i).start < list.get(i-1).end)
				return false;
		}
		return true;
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
