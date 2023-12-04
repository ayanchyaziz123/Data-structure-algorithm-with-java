public class Prob1_9{
   
   boolean isRotation(String s1, String s2){
      if(s1.length() == s2.length() && s1.length > 0 ){
         String s3 = s1+s2;
         return isSubString(s3, s2);
      }
   }
   public static void main(String[] args){
      System.out.println("Hello world..!");
   }
}
