import java.util.Arrays;

public class QuckSort {

	public static void main(String[] args) {
		int x[] = { 36, 12, 15, 42, 4, 60, 9, 18, 75, 42 };
		int stack[][] = new int[10][2];
		int e = 0, f = 0, lb = 0, ub = x.length - 1, pp = 0, tmp = 0;
		int top = x.length;
		top--;
		stack[top][0] = lb;
		stack[top][1] = ub;
		while (top != 10) {
			lb = stack[top][0];
			ub = stack[top][1];
			e = lb;
			f = ub;
			top++;
			while (e < f) {
				while (e < ub && x[e] <= x[lb])
					e++;
				while (x[f] > x[lb])
					f--;
				if (e < f) {
					tmp = x[e];
					x[e] = x[f];
					x[f] = tmp;
				} else {
					tmp = x[lb];
					x[lb] = x[f];
					x[f] = tmp;
					pp = f;
				}
			}
			if (pp + 1 < ub) {
				top--;
				stack[top][0] = pp + 1;
				stack[top][1] = ub;
			}
			if (lb < pp - 1) {
				top--;
				stack[top][0] = lb;
				stack[top][1] = pp - 1;
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
