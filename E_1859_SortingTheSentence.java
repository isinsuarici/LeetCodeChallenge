    public String sortSentence(String s) {
        StringBuilder ret = new StringBuilder();
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];

        for (String word : words)
            sorted[word.charAt(word.length() - 1) - 49] = word.replace(word.charAt(word.length() - 1), ' ');
        
        for (String value : sorted)
            ret.append(value);
        
        ret.deleteCharAt(x.length()-1);
        return ret.toString();
    }
