class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        
        int[] productSum = new int[num1.length()+num2.length()];
        
        for(int i = num1.length()-1;i>=0 ; i--)
            for(int j = num2.length()-1;j>=0;j--)
                productSum[i+j+1] += (num1.charAt(i)-'0') * (num2.charAt(j) - '0');
        
        int product =0;
        int carry = 0;
        StringBuilder res = new StringBuilder(num1.length()+num2.length());

        for(int i= productSum.length-1; i >= 0 ; i--){
            if(i==0 && productSum[i]==0 && carry==0)
                continue;
            product = productSum[i] + carry;
            carry = product/10;
            res.append(product%10);                
        }
        return res.reverse().toString();
    }
}
