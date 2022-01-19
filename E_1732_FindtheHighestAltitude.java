 public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length + 1];
        int max = 0;
        result[0] = 0;
        for (int i = 0; i < gain.length - 1; i++) {
            result[1] = gain[0];
            if (result.length > 2)
                result[i + 2] = result[i + 1] + gain[i + 1];
        }
        for (int j = 0; j < result.length; j++) {
            if (result[j] > max) max = result[j];
        }
        return max;
    }