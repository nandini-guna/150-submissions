class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String word: strs){
            sb.append(word.length()).append(':').append(word);
        }
        return sb.toString();
    }

    // Principles:
    // (1) Digits are consecutive: '0'=48, '1'=49, '2'=50... each digit's code is exactly 48 + its value.
    // (2) Lowercase letters are consecutive: 'a'=97, 'b'=98...
    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int len = 0;
            // parse all digits until ':'
            while (str.charAt(i) != ':'){
                // move int left ex: 1 -> 10 + 2 = 12 so count = 12
                len = len*10 + (str.charAt(i) - '0');
                i++;// move to next char
            }
            i++; // skip the ':'

            // take exactly len characters
            decoded.add(str.substring(i, i+len));
            i = i + len;
        }
        return decoded;
    }
}
