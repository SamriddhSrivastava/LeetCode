class Solution {
    String map[];
    public Solution()
    {
        map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }
    public List<String> letterCombinations(String digits) 
    {
         List<String> list=new ArrayList<>();
         if(digits.length()==0)
         return list;
         func(digits,0,"",list);
         return list;
    }
    public void func(String digits,int ind,String cur,List<String> list)
    {
        if(ind==digits.length())
        {
            list.add(cur);
            return;
        }
        String s=map[digits.charAt(ind)-'0'];
        for(int i=0;i<s.length();i++)
        {
            func(digits,ind+1,cur+s.charAt(i),list);
        }
    }

}