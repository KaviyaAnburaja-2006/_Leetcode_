// Last updated: 7/14/2026, 2:14:14 PM
class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] result = new int[intervals.length][2];
        int k = 0;

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= end) {

                if (intervals[i][1] > end) {
                    end = intervals[i][1];
                }

            } else {

                result[k][0] = start;
                result[k][1] = end;
                k++;

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        result[k][0] = start;
        result[k][1] = end;
        k++;

        return Arrays.copyOf(result, k);
    }
}