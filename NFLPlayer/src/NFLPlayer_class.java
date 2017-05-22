import java.util.Scanner;

	public class NFLPlayer_class {

		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("See players ranking /nType the number representing desired stats: " +  
			"\n0 (Passing Yards), " + 
			"\n1 (Tackles), " +
			"\n2 (Rushing Yards)  " +
			"\n3 (Sacks) " +
			"\n4 (Receiving Yards), " +  
			"\n5 (Interceptions):  " );
			
			
		int MySelection = input.nextInt();
		
		
		if (MySelection == 0)
		{
			
			System.out.print("\n1. Drew Brees NO 5208 \n2. Matt Ryan ATL 4944 \n3. Kirk Cousins WAS 4917 \n4. Aaron Rodgers GB 4428 \n5. Philip Rivers SD 4386 "  );
		}
		
		else if (MySelection ==1)
		{
			System.out.print("\n1. Bobby Wagner SEA 167\n2. Zach Brown BUF 149\n3. Christian Kirksey CLE 148\n4. Kwon Alexander TB 145\n5. Sean Lee DAL 145" );
		}
		
		else if (MySelection ==2)
		{
			System.out.print("\n1. Ezekiel Elliott DAL 1631\n2. Jordan Howard CHI 1313\n3. DeMarco Murray TEN 1287\n4. Jay Ajayi MIA 1272\n5. Le'Veon Bell PIT 1268" );

		}
		
		else if (MySelection ==3)
		{
			System.out.print("\n1. Vic Beasley ATL 15.5\n2. Von Miller DEN 13.5\n3. Lorenzo Alexander BUF 12.5\n4. Markus Golden ARI 12.5\n5. Danielle Hunter MIN 12.5" );

		}

		else if (MySelection ==4)
		{
			System.out.print("\n1. T.Y. Hilton IND 1448\n2. Julio Jones ATL 1409\n3. Odell Beckham NYG 1367\n4. Mike Evans TB 1321\n5. Antonio Brown PIT 1284" );

		}
		else if (MySelection ==5)
		{
			System.out.print("\n1. Casey Hayward SD 7\n2. Quintin Demps HOU 6\n3. Marcus Peters KC 6\n4. Dominique Rodgers-Cromartie NYG 6\n5. Ha Ha Clinton-Dix GB 5" );

		}

		
		input.close();
		
		}

	}