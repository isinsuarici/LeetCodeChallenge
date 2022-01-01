    public String sortSentence(String s) {
        StringBuilder x= new StringBuilder();
        String[] words =s.split(" ");
        String[] sirali = new String[words.length];

        for (String word : words)
            sirali[word.charAt(word.length() - 1) - 49] = word.replace(word.charAt(word.length() - 1), ' ');
        
        for (String value : sirali)
            x.append(value);
        
        x.deleteCharAt(x.length()-1);
        return x.toString();
    }