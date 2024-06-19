class While5
{
	public static void main(String args[])
	{
		int n1=11,n2=20,start=1,count=0;
		if(n1<=n2)
		{
			while(start<=n1)
			{
				if(n1%start==0 && n2%start==0)
				{
					count++;
						if(count==2)
							System.out.println(count);
				}
			}
			
			//System.out.println(start);
			start++;
		}
		else
		{
			while(start<n2)
			{
				if(n2%start==0 && n1%start==0)	
				{
					count++;
						if(count==2)
							System.out.println(count);
				}
			}
			start++;
		}
	}
}	
			