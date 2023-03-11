class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res= new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int x=stack.pop();
                res[x]=i-x;
        }
        stack.push(i);
        }
        return res;
    }
}