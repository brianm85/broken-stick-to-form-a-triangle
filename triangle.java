import java.util.Random;
public class triangle {
	public static void main(String args[])
	{
		int count=0;
		int monte=1000000;
	
		for(int i = 0; i<monte; i++)
		{
		
			Random rangen = new Random();
			int size = rangen.nextInt(100)+1;
			int break1 = rangen.nextInt(size)+1;
			int break2 = rangen.nextInt(break1)+1;
			//System.out.println(size+" "+break1+" "+break2);
			int x = size-break1;
			int y = break1-break2;
			
				if(y+x>(size/2)&&x<(size/2)&&y<(size/2))
				{
					count++;
				}
		}
		double prob=(count/(double)monte);
		System.out.println(prob);
		
		
	}

}
