import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

class PostDate 
{
	private String date;
	protected int day;
	
	public void setDate(String file)
	{
		this.date=file + " 2017";
	}

	
	
	public String getDate()
	{
		return date;
	}
	
	public int getDay() 
	{
	
	
		//convert date to Date fomate
		try
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
			Date dt = dateFormat.parse(this.date);
	
			
			
	
		//getting day from date
			Calendar c = Calendar.getInstance();
			c.setTime(dt);
			day = c.get(Calendar.DAY_OF_WEEK);
		
		}catch(Exception e ){e.printStackTrace();}
		
		return day;
	}	
}


class PostTime
{

		private String post_time;
		
		public void setPostTime(String file)
		{
			this.post_time = file;
		}

		//time to flaot
		
		public String getTime()
		{
				return post_time;
		}
}

class Weekend extends PostDate
{
		private boolean is_weekend  = false;

		
		public Weekend()
		{
			
		}
		
		public void setWeekend()
		{
			if(day == 7 || day == 1 ) 
				this.is_weekend = true;
		}

		
		// return if it is a weekend or not
		
		public boolean isWeekend()
		{
			return is_weekend;
		}

}		
			
				
public class Data
{
		public static void main(String[] args)
		{
		//	PostDate post = new PostDate();
		//	post.setDate("02 December");
			
			
			Weekend ps = new Weekend();
			ps.setDate("02 December");
			
		
			
			System.out.println(ps.getDay());
			System.out.println(ps.getDate());
				ps.setWeekend();
			System.out.println(ps.isWeekend());
		}	
			
}			
			
		
		