// Last updated: 7/14/2026, 2:13:36 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
      
        if (num <= 1) return false; 
        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {  
                sum += i;
            }
        }
        
        return sum == num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
       
        int num = 28;
        System.out.println(solution.checkPerfectNumber(num));  
    }
}

 