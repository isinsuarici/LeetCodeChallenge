 public int[] decode(int[] encoded, int first) {
        int[] sonuc = new int[encoded.length+1];

        sonuc[0] = first;


        for (int i = 1; i <= encoded.length; i++) {

            for (int j=0; j<=Math.pow(10,5); j++) {
                if((sonuc[i-1]^j)==encoded[i-1]){
                    sonuc[i]=j;
                    break;
                }
            }
        }return sonuc;
    }