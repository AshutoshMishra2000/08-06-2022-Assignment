public class stringCompression{
    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        StringBuilder sb=new StringBuilder();
        
        int i = 0;
        int count=1;
    
        for (; i < chars.length-1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
               sb.append(chars[i]).append(count);
                count=1;
                
            }
        }
        sb.append(chars[i]).append(count);
        chars=new char[sb.length()];
        for(int j=0;j<chars.length;j++){
chars[j]=sb.charAt(j);
        }
      System.out.println(sb.toString());
       System.out.println(sb.toString().length());
       for (char c : chars) {
           System.out.print(c);
       }
      
    }
}
