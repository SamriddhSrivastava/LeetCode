class Solution {
    public String smallestPalindrome(String s) 
    {
        String ans="";
     char arr1[]=s.substring(0,s.length()/2).toCharArray();
     Arrays.sort(arr1);
     ans=new String(arr1);
     if(s.length()%2==0)
     {
      ans=ans+new StringBuilder(ans).reverse().toString();
     }   
     else
     {
       ans+=s.charAt(s.length()/2);
      ans+=new StringBuilder(new String(arr1)).reverse().toString();
     }
     return ans;
    }
}