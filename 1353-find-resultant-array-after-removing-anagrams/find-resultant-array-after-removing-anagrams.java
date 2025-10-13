class Solution
 {
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for (int i = 1; i < words.length; i++) 
        {
            String prev = words[i - 1];
            String curr = words[i];
            if (!isAnagram(prev, curr)) 
            {
                result.add(curr);
            } else 
            {
                continue;
            }
        }
        return result;
    }
     private boolean isAnagram(String s1, String s2) 
     {
        if (s1.length() != s2.length()) return false;
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

