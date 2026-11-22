class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList toCompare = new ArrayList();
        ArrayList<String> words = new ArrayList<>();

        for(String i: strs){
            HashMap<Character, Integer> text = new HashMap<>();
            for(char s: i.toCharArray()){
                text.put(s, text.getOrDefault(s, 0) + 1);
            }
            toCompare.add(text);
            words.add(i);
        }

        ArrayList result = new ArrayList();
        for (int i = 0; i < toCompare.size(); i++){
            ArrayList temp = new ArrayList();
            temp.add(words.get(i));
            for (int j = i+1; j < toCompare.size(); j++){ 
                // elements shift left after remove
                if (toCompare.get(i).equals(toCompare.get(j))){
                    temp.add(words.get(j));
                    toCompare.remove(j);
                    words.remove(j);
                    j--;
                }
            }
            result.add(temp);
        }

        return result;
    }
}
