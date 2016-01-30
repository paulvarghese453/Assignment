class Vote
{
public static void main (String[] args)
{int a =Integer.parseInt(args[0]);

 if(a>=18)
 {System.out.println ("Elgible for vote");}
  
 else
 { if (a<18)
	 {
		 System.out.println ("Not elgible for vote");
	 }
	}
 }

}
