package script;

public class Largest_Number_FromArray {
	
	public static void main(String[] args) 
    {
        int max;
        int n[]={21,21,5,4,24,22,23};
         max = n[0];
        for(int i = 0; i<=n.length-1; i++)
        {
            if(max < n[i])
            {
            	System.out.println("In if condition");
                max = n[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }

}
