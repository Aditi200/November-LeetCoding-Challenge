class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) return intervals;
        // sort in ASC order by interval start
        Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);
        Stack<int[]> result = new Stack<>();        
		// first intervall will be in stack by default
        result.add(intervals[0]);
        
        for (int r = 1; r < intervals.length; r++) {
			// compare last interval from stack
            int[] prev = result.peek(); 
			// with current interval
            int[] curr = intervals[r];
			// if last interval have greater end comparing to current start
			// just shift its end
            if (prev[1] >= curr[0]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}