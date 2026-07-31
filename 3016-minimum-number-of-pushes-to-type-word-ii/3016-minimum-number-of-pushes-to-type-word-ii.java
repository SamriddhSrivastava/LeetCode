class Solution {
    public int minimumPushes(String word) 
    {
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<word.length();i++)
     {
        char c=word.charAt(i);
        map.put(c, map.getOrDefault(c, 0) + 1);
     }   
     List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
     Collections.sort(list,(a,b)->b.getValue()-a.getValue());
     int sum=0;
     for(int i=0;i<list.size();i++)
     {
        if(i<8)
        sum+=list.get(i).getValue();
        else if(i<16)
        sum+=list.get(i).getValue()*2;
        else if(i<24)
        sum+=list.get(i).getValue()*3;
        else
        sum+=list.get(i).getValue()*4;
     }
     return sum;
    }
}