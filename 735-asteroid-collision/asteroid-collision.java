class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int ast : asteroids) {
            boolean exploded = false;

            // Collision only occurs when top is moving right (> 0) and current is moving left (< 0)
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int top = stack.peek();
                int absCurrent = -ast;

                if (top < absCurrent) {
                    // Top asteroid explodes; continue testing against previous asteroids
                    stack.pop();
                } else if (top == absCurrent) {
                    // Both asteroids explode
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    // Current asteroid explodes
                    exploded = true;
                    break;
                }
            }

            // If current asteroid did not explode, add it to stack
            if (!exploded) {
                stack.push(ast);
            }
        }

        // Convert stack to array in correct order
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}

