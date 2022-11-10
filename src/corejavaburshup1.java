import java.util.ArrayList;

public class corejavaburshup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 5;
		String bantu ="amar name depp";
		char f ='c';
		double h =5.99;				
		boolean k = true;
  
		
		//System.out.println(bantu+ " is the string " + h);
		
		String [] a = new String [5];
		
		a[0]="a";
		a[1]="b";
		a[2]="c";
		a[3]="d";
		a[4]="e";

      int [] arr2 = { 1,2,3,4,5};
      
      //System.out.println(arr2[2]);
      System.out.println("the odd numbers are");
      for    (int i=4; i>=0;i--)
      {
    	  
		if ( arr2[i]%2!=0)
		{
			
			System.out.println(arr2[i]);	
			
			break;
		}		
		
		
      }
      
      System.out.println("the even  numbers are");
      for    (int i=4; i>=0;i--)
      {
    	  
		if ( arr2[i]%2==0)
		{
			
			System.out.println(arr2[i]);	
		}		
		
		
      }
      
      
      ArrayList <String>a1= new ArrayList<String>();
      a1.add("c");
      a1.add("v");
      a1.add("gg");
      
      System.out.println(a1.get(2));
      for (int i=0; i<a1.size();i++)
      {
    	  
    	  System.out.println(a1.get(i));
      }
      
      ArrayList <String> a3 =new ArrayList<String>();
      a3.add("ahnc");
      a3.add("assd0");
      
      for (int i=1;i>=0;i--)
      {
    	  
    	  System.out.println(a3.get(i));
      }
    String s = "aaa";
    String s2="aaa";
    
	  System.out.println(s2);
	  
	  String s21= new String ("Welcome to my home");
	  String[] sf=s21.split("my");
	  
	  for (int i=sf.length-1;i>=0;i--)
	  {
		  System.out.println(sf[i]);
	  }
	  
	  String sh ="tui ekta jantu";
	  

  for (int i=sh.length()-1; i>=0;i--) 
  {
	  System.out.println (sh.charAt(i));
	  
  }
}
	
}
