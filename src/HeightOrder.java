
public class HeightOrder {
	
	public static int concertQueue(int N)
	{
		int count = 0;
		
		int prod = 1;
		
		for(int i = 1 ; i <= N-2 ; i++)
		{
			for(int j = i+1 ; j <= N-1 ; j++)
			{
				for(int k = j+1 ; k <= N ; k++)
				{
					prod = i*j*k;
					if(prod == N)
						count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int N = 12;
		//int[] result = concertQueue(N,A);
		System.out.println(concertQueue(N));

	}

}
