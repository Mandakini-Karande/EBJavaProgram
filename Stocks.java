package ExceptionHandling;

class StockLowException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StockLowException(String s1) {
	

		super(s1);
	}
}

class StockHighException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StockHighException(String s)
	{
		super(s);
	}
}



class stock{
	 public float stockRate;
		
		public stock(float stockRate)
		{
			super();
			this.stockRate= stockRate;
		}
		
		
		public String checkRate(float rate) throws Exception
		{
		//	double rate1=0.8*stockRate;
			
			if(rate == 0.8*stockRate)
			{
				return "Hope to raise";
			}
			else if(rate < 0.8*stockRate)
			{
				throw new StockLowException("Under Loss");
			}
			else if(rate > 0.8*stockRate)
			{
				throw new  StockHighException("Under Profit");
			}
			
			return "Hope to raise";
		}
 }


public class Stocks {
	
	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
          
		stock s1=new stock(60.0f);
		
		try
		{
		  System.out.println(s1.checkRate(80.0f));
		}
		catch(StockLowException e)
		{
			System.out.println("StockLowException="+e.getMessage());
		}
		catch(StockHighException e)
		{
			System.out.println("StocHighException="+e.getMessage());
		}
		
	}

}
