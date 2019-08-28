package Java.learning.sumu;

public class Metrix {

	
	public void format1(){
		int i,j, n=5;
		for (i=0; i<n ; i++)
		{
			for (j=n-i; j>1; j--) 
            {  // printing spaces 
                System.out.print(" "); 
            } 
			
			for(j=0; j<=i; j++)
				{ System.out.print("* "); }
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metrix me = new Metrix();
		me.format1();

	}

}
