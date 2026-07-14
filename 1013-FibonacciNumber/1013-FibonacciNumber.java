// Last updated: 7/14/2026, 2:13:28 PM
class Solution {
    public int fib(int n) {
      
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int a = 0, b = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = a + b; 
            a = b; 
            b = temp; 
        }
        
        return b;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int n = 2;
        System.out.println(solution.fib(n));  
    }
}

    
