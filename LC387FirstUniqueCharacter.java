class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
/*char[] arr=s.toCharArray(); 
Map<char,Integer> map=new HashMap<>(); 
for(char i:arr) 
{ 
    map.put(i,map.getOrDefault(i,0)+1); 
} 
int i=0; 
for(Map.Entry<char,Integer> entry:map.entrySet()) 
{ 
    i++; 
    if(entry.getValue()==1) 
    { 
        return i; 
    } 
} 
return -1;*/
