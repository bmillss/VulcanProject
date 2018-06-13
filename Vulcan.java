	import java.util.Scanner;
	import java.io.*;
	import java.util.StringTokenizer;

public class Vulcan {
	

		public static void main(String[] args) throws IOException
		{
			// TODO Auto-generated method stub	
			Scanner fileReader = new Scanner(new File("orders.txt"));
			Scanner inputReader = new Scanner(new File("tickets.txt"));
			String input = new String("");
			String line = new String("");
			String userInput = new String("");
			boolean match = false;
			String token = new String("");
			StringTokenizer tokenizer;
			
			int fileLength = 0;
			
			System.out.println("Start");
			while(fileReader.hasNextLine())
			{
				fileLength++;
				fileReader.nextLine();
			}
			
			fileReader = new Scanner(new File("orders.txt")); //C:\\Users\\Brandon\\workspace\\Project\\orders.txt))
			String[] fileLines = new String[fileLength];
			String[] tempLines = fileLines;
			
			for(int i = 0; i < fileLength; i++)
			{
				fileLines[i] = fileReader.nextLine();
			}
			System.out.println("Starting Ticket Search");
			do
			{
				//System.out.println("Starting Ticket Search");			
					int x = 0;
					int ticketNumber = Integer.parseInt(inputReader.nextLine());
					System.out.println(ticketNumber);
					//Create array to hold tokens TICKET # IS THE 7TH TOKEN
					do
					{
						line = new String(fileLines[x]);
						tokenizer = new StringTokenizer(line, ",");
						
						for(int i = 0; i < 6; i++)
						{						
							tokenizer.nextToken();
						}
						
						token = tokenizer.nextToken();

						
						int ticketNumber2 = Integer.parseInt(token);
						
						if(ticketNumber == ticketNumber2)
						{
							match = true;
							System.out.println("Match found");
							fileLength--;
							tempLines[x] = new String("REMOVE");
							fileLines = new String[fileLength];
							for(int i = 0; i < x; i++)
							{
								fileLines[i] = tempLines[i];
							}
							
							for(int i = x; i < fileLength; i++)
							{
								fileLines[i] = tempLines[i+1];
							}
							
							tempLines = fileLines;
							
							x = 0;
						}
						else
						{
							x++;
						}
						
					} while(x < fileLength && match == false);
					
					if(match == false)
					{
						System.out.println("No Match found");
					}
					
					match = false;
					
					
					
					
			}while(inputReader.hasNextLine());
			
			/*
			 * TICKET NUMBERS NOT FOUND SECTION
			 */
			System.out.println("Order #'s with no ticket matching them: ");
			for(int i = 0; i < fileLength; i++)
			{			
				line = new String(fileLines[i]);
				tokenizer = new StringTokenizer(line, ",");
				
				for(int z = 0; z < 6; z++)
				{						
					tokenizer.nextToken();
				}
				
				token = tokenizer.nextToken();
				
				System.out.println(token);
			}	
			/*
			 * TICKET NUMBERS NOT FOUND SECTION
			 */
			
			try
			{
				PrintWriter out = new PrintWriter("orders.txt");
				
				for(int i = 0; i < fileLength; i++)
				{
					out.println(fileLines[i]);
				}
				
				out.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
			inputReader.close();
			fileReader.close();
			
			
			System.out.println("Closing...");
					
		}
	}