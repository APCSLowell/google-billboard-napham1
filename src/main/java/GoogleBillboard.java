public class GoogleBillboard {
    public final static String e = "27182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
    public static void main(final String e)  
    {            
        for(int i = 0; i < e.length(); i++){
          String digits = e.substring(i,i+10);
          double num = Double.parseDouble(digits);
          if(isPrime(num) == true){
            System.out.print(num);
            break;
          }
        }
    }  
    public boolean isPrime(double num)  
    {   
      if(num < 2){
        return false;
      }
      else{
        for(int i = 2; i <= Math.sqrt(num); i++){
          if(num % i == 0){
            return false;
          }
        }
      }
      return true;  
    } 
}
