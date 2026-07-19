class Solution {
    public String smallestSubsequence(String s) 
    {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
          arr[s.charAt(i)-'a']=i;
        Stack<Character> st=new Stack<>();
        boolean visited[]=new boolean[26];

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(visited[c-'a'])
            continue;
          while(!st.isEmpty() && st.peek()>c && arr[st.peek()-'a']>i) 
          {
             visited[st.pop()-'a']=false;
          }
          st.push(c);
          visited[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st)
        sb.append(c);
        return sb.toString();
    }
}