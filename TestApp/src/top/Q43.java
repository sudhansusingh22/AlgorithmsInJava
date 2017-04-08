public class Q43 {
    public String multiply(String num1, String num2) {
        if(num1==null || num2 == null)
            return null;
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int m = num1.length();
        int n = num2.length();
        int pos [] = new int [m+n];
        for(int i = m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1 = i+j;
                int p2 = i+j+1;
                int sum = mul + pos[p2];
                pos[p1] += sum/10;
                pos[p2] = sum%10;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int p:pos){
            if(!(sb.length()==0 && p==0))
                sb.append(p);
        }
        return sb.toString();
    }
}
