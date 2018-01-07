class LC735_Asteroid_Collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int a: asteroids) {
            if(a > 0) {
                stack.push(a);
            } else {
                boolean exp = false;
                while(!stack.isEmpty() && stack.peek() > 0 && !exp) {
                    exp = (stack.peek() + a >= 0);
                    if(stack.peek() + a <= 0) {
                        stack.pop();
                    }
                }
                if(!exp) {
                    stack.push(a);
                }
            }
        }
        int[] res = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}