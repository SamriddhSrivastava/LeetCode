class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> list = new ArrayList<>();
        int i = 0;

        while (i < intervals.length) {   // FIX 1: was length-1
            int start = intervals[i][0];
            int max = intervals[i][1];
            int j = i + 1;

            // FIX 2: check j < intervals.length FIRST
            while (j < intervals.length && intervals[j][0] <= max) {
                max = Math.max(max, intervals[j][1]); // FIX 3
                j++;
            }

            list.add(Arrays.asList(start, max));
            i = j;
        }

        // FIX 4: convert List<List<Integer>> → int[][]
        int[][] result = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            result[k][0] = list.get(k).get(0);
            result[k][1] = list.get(k).get(1);
        }

        return result;
    }
}
