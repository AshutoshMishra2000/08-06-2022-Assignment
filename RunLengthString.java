public class RunLengthString {
    public static void main(String[] args) {
        int count = 1;
        String str = "aaaabbbbcddd";
        //String str = "abcddd";
     StringBuilder sb=new StringBuilder();
        
        int i = 0;
    
        for (; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
               sb.append(str.charAt(i)).append(count);
                count=1;
                
            }
        }
        sb.append(str.charAt(i)).append(count);
      
       System.out.println(sb.toString());
    }
}
