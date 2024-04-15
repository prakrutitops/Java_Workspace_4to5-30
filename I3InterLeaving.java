package string;

import java.util.HashSet;
import java.util.Set;

public class I3InterLeaving 
{
	public static void allInterleavings(String res, String P, String Q, Set < String > out) 
	{
		  if (P.length() == 0 && Q.length() == 0) 
		  {
		   out.add(res);
		   return;
		  }
		  if (P.length() > 0)
		  {
		   allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
		  }
		  if (Q.length() > 0)
		  {
		   allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
		  }
	}

		 public static void main(String[] args) 
		 {
			 String P = "WX";
			 String Q = "YZ";
			 System.out.println("The given strings are: " + P + "  " + Q);
			 System.out.println("The interleavings strings are: ");
			 Set < String > out = new HashSet < > ();
			 allInterleavings("", P, Q, out);

			 out.stream().forEach(System.out::println);
			 
		 }
}
