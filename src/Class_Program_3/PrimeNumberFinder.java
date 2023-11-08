package Class_Program_3;

/*public class Prime_number {

	public static void main(String[] args) {
		
		arr[]= {13,17,21,31,5,999991,23,25};
		int n=s.nextInt();
		
		
		
		
		
		int n=22;
		
		int loop=0;
		
		
		for(int i=1;i<=22;i++) {
			if(n%i==0)
			{
				System.out.print("prime number");
				loop++;
				
			}
			if(loop==1) {
				System.out.println("prime number");
				
			}
			else {
				System.out.println("Not prime number");
			}
		}
	}
}
	*/	
		
       
public class PrimeNumberFinder {
    public static void main(String[] args) {
        int[] arr = {13, 17, 21, 31, 5, 999991, 23, 25};
        
        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
    
        
     
        
      




	


