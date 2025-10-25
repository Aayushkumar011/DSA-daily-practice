class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                s.push(asteroids[i]);
            }
            else{
            while(!s.isEmpty() && s.peek()>0 && s.peek()< Math.abs(asteroids[i])){
                s.pop();
            }
            if(!s.isEmpty() && s.peek()>0 && s.peek()== Math.abs(asteroids[i])){
                s.pop();
            }
            else if(s.isEmpty() || s.peek()<0){
                s.push(asteroids[i]);
            }
        }
        }
         int[] result = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            result[i] = s.pop();
        }

        return result;
    }
}