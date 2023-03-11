class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx=coordinates[1][0]-coordinates[0][0];
        int dy=coordinates[1][1]-coordinates[0][1];
        for(int[] point: coordinates){
            int x=point[0];
            int y=point[1];
            if(dy*(x-coordinates[1][0])!=(y-coordinates[1][1])*dx)
            return false;
        }
        return true;
    }
}