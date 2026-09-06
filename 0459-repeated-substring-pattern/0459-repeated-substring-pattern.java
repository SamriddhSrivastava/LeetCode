class Solution {
    public boolean repeatedSubstringPattern(String s) 
    {
     String s1=s+s;
     s1=s1.substring(1,s1.length()-1);
     for(int i=0;i<=s1.length()-s.length();i++)
     {
        if(s1.substring(i,i+s.length()).equals(s))
        return true;
     }
     return false;
    }
}