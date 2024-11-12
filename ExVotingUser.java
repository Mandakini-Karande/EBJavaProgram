

//Ex: of Custom Exception or user defined exception
class ageCheckingException extends Exception
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  ageCheckingException(String s)
	 {
		 super(s);
	 }
}


class Voting
{
	public void checkAge(int age)
	{
		try
		{
			if(age<18)
			{
				throw new ageCheckingException("not eligible to vote");
				
			}
			
			else
			{
				System.out.println("You can vote");
			}
		}
		catch(ageCheckingException e)
		{
			e.printStackTrace();
	    }
	
	
	}
	
}



public class ExVotingUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Voting voting = new Voting();
		voting.checkAge(19);

		
		
		
		
	}

}
