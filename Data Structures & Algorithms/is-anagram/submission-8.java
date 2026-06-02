class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character ,Integer> HashMapS= new HashMap<>();
        HashMap<Character, Integer> HashMapT= new HashMap<>(); 

        for (Character c: s.toCharArray()){
            HashMapS.put(c, HashMapS.getOrDefault(c, 0)+1);
        }
         for (Character c: t.toCharArray()){
            HashMapT.put(c, HashMapT.getOrDefault(c, 0)+1);
        }
        return HashMapS.equals(HashMapT);


    }
}
