The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

For example, the saying and conversion for digit string "3322251":


Given a positive integer n, return the nth term of the count-and-say sequence.

 

Example 1:

Input: n = 1
Output: "1"
Explanation: This is the base case.
Example 2:

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 

Constraints:

1 <= n <= 30








class Solution {
    
    public String Say(String num){
        
        if(num == "11"){
            return "21";
        }
        if(num == "21"){
            return "1211";
        }
        
        //String num = Integer.toString(number);
        //List<Character> uniqueNum = new ArrayList<>();
        int count = 1;
        int index = 0;
        String word = "";
        
        for(int i =0;i<num.length()-1;i++){
            //System.out.println("Taking "+num.charAt(i));
            
            if(num.charAt(i) == num.charAt(i+1)){
                count++;
            }
            
            else if(num.charAt(i) != num.charAt(i+1)){
            
                word = word+count+num.charAt(i);
                //System.out.println(word+" ===== ");
                count = 1;
                
            }
            if(i == num.length() - 2){
                word = word+count+num.charAt(i+1);
            }
            
        }
        
        //System.out.println("End of iteration");
        //System.out.println(word+" ===== ");
        
        return word;
        
    }
    
    public String countAndSay(int n){
        if(n == 1){
            return "1";
        }
        
        String words = "11";
        
        for(int i =2;i<n;i++){
            //System.out.println("Injecting "+words);
            words = Say(words);
            
        }
        
        return words;
    }
}
