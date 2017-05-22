public class NFLPlayer 
{
////////    Passing Yards
	private int passingYards;
	
	public void setPassingYards (int passingYards)
	{		
		if (passingYards <= 5)
		{	
			this.passingYards = passingYards;
			System.out.print("PassingYards bla bla");
		}
			else
			{
				System.out.println("You chose over 5");
			}
			
	}
		public int getPassingYards ()
		{
			return passingYards;
			
		}
		
		//////////       tackle 
		
		
		private int tackles;
		
		public void setTackless (int Ttckles)
		{		
			if (tackles <= 5)
			{	
				this.tackles = tackles;
				System.out.print("tackles bla bla");
			}
				else
				{
					System.out.println("You chose over 5");
				}
			
		}
			public int getTackless ()
			{
				return tackles;
				
			}
		
			///    Rushing Yards
			
			private int rushingYards;
			
			public void setRushingYards (int rushingYards)
			{		
				if (rushingYards <= 5)
				{	
					this.rushingYards = rushingYards;
					System.out.print("rushingYards bla bla");
				}
					else
					{
						System.out.println("You chose over 5");
					}
				
			}
				public int getRushingYards ()
				{
					return rushingYards;
					
				}
				/// Sacks
				private int sacks;
				
				public void setSacks (int sacks)
				{		
					if (sacks <= 5)
					{	
						this.sacks = sacks;
						System.out.print("sacks bla bla");
					}
						else
						{
							System.out.println("You chose over 5");
						}
					
				}
					public int getSacks ()
					{
						return sacks;
						
					}
			////////   Receiving Yards
					
					private int receivingYards;
					
					public void setReceivingYards (int receivingYards)
					{		
						if (receivingYards <= 5)
						{	
							this.receivingYards = receivingYards;
							System.out.print("receivingYards bla bla");
						}
							else
							{
								System.out.println("You chose over 5");
							}
						
					}
						public int getrRceivingYards ()
						{
							return receivingYards;
							
						}
					
					//////     Interceptions
						private int  interceptions;
						
						public void setInterceptions (int interceptions)
						{		
							if (interceptions <= 5)
							{	
								this.interceptions = interceptions;
								System.out.print("receivingYards bla bla");
							}
								else
								{
									System.out.println("You chose over 5");
								}
							
						}
							public int getInterceptions ()
							{
								return interceptions;
								
							}
						
						/////  Players
							private int  players;
							
							public void setPlayers (int players)
							{		
								if (players <= 5)
								{	
									this.players = players;
									System.out.print("receivingYards bla bla");
								}
									else
									{
										System.out.println("You chose over 5");
									}
								
							}
								public int getPlayers ()
								{
									return players;
									
								}
							
		
		
		}