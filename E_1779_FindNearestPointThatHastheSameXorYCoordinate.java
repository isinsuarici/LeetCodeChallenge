class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=10001;
        int index=-1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x || points[i][1]==y){
                if(Math.abs(x-points[i][0])+Math.abs(y-points[i][1])<min){
                    min=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                    index=i;
                }
            }
        }
        return index;
    }
}