class While
{
	public static void main(String args[])
	{
		int n=1;
		while(n<=10)
		{
			if(n==5)
				continue;
			System.out.println(n);
			n++;
		}
	}
}