package Class_Program_3;

public class Upplow_bound {
	public static void main(String[]args) {
	int a[]= {8,5,6,9,10,21,25,30};
	int val=8;
	
	recursive(a,val,0,1);
}

	
	
	public static void recursive(int[]a,int val,int i,int j) 
	{
		
	if(a.length==(i+1))
	{
		return;
	}
	else
		if(a[i]>a[j])
		{
			if(a[i]==val)
			{
				System.out.println("lower bound: "+val);
				System.out.println("upper bound: "+(val+1));
				return;
			}
			else {
				recursive(a,val,i+1,j+1);
			}
		}
	
		
	
	}

}
