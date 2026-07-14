// Last updated: 7/14/2026, 2:13:25 PM
class Solution {
    public int subtractProductAndSum(int n) {
      
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; 
            product *= digit;   
            sum += digit;       
            n /= 10;            
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 234;
        System.out.println(solution.subtractProductAndSum(n));  
    }
}

        
