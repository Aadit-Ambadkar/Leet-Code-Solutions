//Speed: 15ms
//Memory: 40.8 (Wow 97.78% better than other sols)

import java.util.Arrays;
import java.util.List;

class Problem658 {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		if (k==arr.length) {
			Integer[] ret = new Integer[arr.length];
			for (int i = 0; i < arr.length; i++) {
				ret[i] = (Integer) arr[i];
			}
			return Arrays.asList(ret);
		}
		pair[] res = new pair[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = new pair(arr[i], Math.abs(x-arr[i]));
		}
		Arrays.sort(res);
		res = Arrays.copyOfRange(res, 0, k);
		Integer[] ret = new Integer[k];
		for (int i = 0; i < res.length; i++) {
			ret[i] = res[i].f;
		}
        Arrays.sort(ret);
		return Arrays.asList(ret);
	}
	public class pair implements Comparable<pair> {
		public int f;
		public int s;
		public pair(int first, int second) {
			f = first;
			s = second;
		}
		@Override
		public int compareTo(pair o) {
			if (s==o.s) return f-o.f;
			return s-o.s;
		}
	}
}
//This can also be done using Collections.sort(), but you will have to convert the arr to a List<Integer>. 
//That works faster, but uses more memory, and that solution is already on the solutions page, so I decided to present this solution
//with very little memory usage.
