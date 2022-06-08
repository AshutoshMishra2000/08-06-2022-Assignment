public class ReverseWord {
    public static void main(String[] args) {
        String S="This.Is.Ashutosh.Mishra";
        // str=str.trim();
        // String words[]=str.split("\\s+");
        // StringBuilder sb=new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){
        //     sb.append(words[i]).append(" ");
        // }

        // System.out.println(sb.toString().trim());
         // S=S.trim();
         String words[]=S.split("\\.");
        
         StringBuilder sb=new StringBuilder();
         for(int i=words.length-1;i>=0;i--){
             sb.append(words[i]).append(".");
         }
         
        System.out.println(sb.toString());
    }
}
