class Solution 
{
    public String reverseWords(String s)
     {
        s = s.trim();
        String[] words = s.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) 
        {
            if (!words[i].equals("")) 
            { 
                reversed += words[i] + " ";
            }
        }
        return reversed.trim();
    }
}
