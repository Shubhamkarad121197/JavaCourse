public class ReverseString {
    public static void main(String []args){
        String str="Shubham";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        
         //Better Approach
        StringBuilder sb= new StringBuilder("Karad");
        System.out.println(sb.reverse());
    }

   
}
