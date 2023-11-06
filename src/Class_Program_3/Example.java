package Class_Program_3;

public class Example {
	
	
    public static void main(String[] args) {
    	int a[]= {8,5,6,9,10,21,25,30};
    	recursive(a,0);
    }
    
    	
    	
    	public static void recursive(int[]a,int i) 
    	{
    		
    	if(a.length==(i+1))
    	{
    		return;
    	}
    	else
    	{
    		System.out.println(i+":"+a[i]);
    		recursive(a,i+1);
    		
    	}
    	}
    	
    	
    	
    
    

   
}

	

	
