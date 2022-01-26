public class All 
{

    public static void main(String[] args)
    {
        
        //Scanner sc=new Scanner(System.in);
        String A="seema";
        String B="Dev";
       
        System.out.println(A.length()+B.length());
        int i = A.compareTo(B);
        if(i>0)
	{
             System.out.println("Yes");
        } 
	else
	{
             System.out.println("No");
        }
        String at = A.substring(0,1).toUpperCase()+A.substring(1);
        String bt = B.substring(0,1).toUpperCase()+B.substring(1);;
        System.out.println(at+" "+bt);
    }
}


