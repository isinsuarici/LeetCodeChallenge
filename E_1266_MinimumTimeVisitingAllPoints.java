  public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        int x, y;
        for (int i = 0; i < points.length - 1; i++) {
            x = points[i][0];
            y = points[i][1];
            count+=Math.max(Math.abs(points[i + 1][0] - x), Math.abs(points[i +1][1] - y));
        }
        return count;
    }