import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger in = new BigInteger(num1);
        BigInteger in2 = new BigInteger(num2);
           return in.multiply(in2).toString();
      
        
    }
}