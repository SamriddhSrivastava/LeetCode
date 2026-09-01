/*class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            list.add(intervals[i]);
        }
        list.add(newInterval);
        list.sort((a,b) -> Integer.compare(a[0],b[0]));
        int start=list.get(0)[0];
        int last=list.get(0)[1];
        int i=1;
        List<int[]> ans=new ArrayList<>();
        while(i<list.size())
        {
            if(list.get(i)[0]<=last)
            {
              last=Math.max(list.get(i)[1],last);
            } 
            else
            {
              ans.add(new int[]{start,last});
              start=list.get(i)[0];
              last=list.get(i)[1];
            }
            i++;
        }
        ans.add(new int[]{start, last});
        return ans.toArray(new int[ans.size()][]);
    }
}
*/


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> output = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            output.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        output.add(newInterval);

        while (i < n) {
            output.add(intervals[i]);
            i++;
        }

        return output.toArray(new int[output.size()][]);
    }
}