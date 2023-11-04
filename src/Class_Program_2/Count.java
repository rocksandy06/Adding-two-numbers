package Class_Program_2;

public class Count {

	public static void main(String[] args) {
		 int[] a = {6,7,8,9,10};
	       
	        
	       
	        

	        for (int i=0;(i<a.length-1);i++) {
	        	
	        		if(a[i]<a[i+1]) {
	        			int temp=a[i+1];
	        			a[i+1]=a[i];
	        			a[i]=temp;
	        			i=-1;
	        		}
	        		
	        		for(i=0;i<a.length;i++) {
	        			System.out.println(a[i]+" ");
	        			
	        		}
	        		
	        	}
	        

	}

}
