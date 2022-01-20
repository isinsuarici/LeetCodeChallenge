   public String toLowerCase(String str) {
        StringBuilder sonuc = new StringBuilder();
 //stringbuilder kullanarak 0ms, str ve += kullanarak 4ms
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (ascii <= 90 && ascii >= 65) {
                sonuc.append((char) (ascii + 32));
            } else
                sonuc.append((char) ascii);

        }
        return sonuc.toString();
    }