package RPGMainClasses;
import java.util.Arrays;
import java.util.Scanner;
public class main 
{
	public static int[] stats=new int[4];
	public static int[] baseStats=new int[4];
	public static int maxHealth=0;
	public static int currentHealth=0;
	public static int armor=0;
	public static int shield=0;
	public static int classSelection=0;
	public static String[] inventory=new String[21];
	public static boolean[] inventoryCheck=new boolean[21];
	public static String progress="";
	public static String areaDescriptionAddon="";
	private static Scanner scan;
	public static void main(String[]args)
	{
		scan=new Scanner(System.in);
		String clas="";
		boolean claschosen=false;
		String[] classes = new String[5];
		classes[0] = "fighter";
		classes[1] = "barbarian";
		classes[2] = "mage";
		classes[3] = "thief";
		classes[4] = "assassin";
		inventory[0]="Wooden Sword";
		inventory[1]="Bronze Sword";
		inventory[2]="Iron Sword";
		inventory[3]="Steel Sword";
		inventory[4]="Mithryl Sword";
		inventory[5]="Wooden Shield";
		inventory[6]="Bronze Shield";
		inventory[7]="Iron Shield";
		inventory[8]="Iron Dagger";
		inventory[9]="Steel Dagger";
		inventory[10]="Mithryl Dagger";
		inventory[11]="Leather Armor";
		inventory[12]="Chainmail Armor";
		inventory[13]="Platemail Armor";
		inventory[14]="Fire Staff";
		inventory[15]="Ice Staff";
		inventory[16]="Lightning Staff";
		inventory[17]="Psychic Staff";
		inventory[18]="Necrotic Staff";
		inventory[19]="Minor Healing Potion";
		inventory[20]="Potent Healing Potion";
		for(int i=0; i<inventoryCheck.length; i++)
		{
			inventoryCheck[i]=false;
		}
		System.out.println("Welcome to Dungeon Crawl! Press enter to continue");
		progress=scan.nextLine();
		System.out.println("Make a Character! Here are your class options!");
		System.out.println("Fighter - Uses armor and weapons, overall average stats");
		System.out.println("Barbarian - Low armor, uses weapons to hit hard, really good health and strength, but low intelligence");
		System.out.println("Mage - Uses staves and magic, no armor, high intelligence and decent speed, low health in strength");
		System.out.println("Thief - Lightly armored and steals things, high speed and intelligence, low strength and health");
		System.out.println("Assassin - Overall good stats, good strength and speed, decent intelligence, lowest health pool though");
		System.out.println("Once you have selected your class, type it in!");
		clas=scan.nextLine();
		clas=clas.toLowerCase();
		for(int i=0;i<=4 && claschosen==false; i++)
		{
			if(clas.equals(classes[i]))
			{
				claschosen=true;
			}
			classSelection=i;
		}
		if(classSelection==0) //Fighter
		{
			for(int i=0; i<stats.length;i++)
			{
				stats[i]=(int)Math.floor(Math.random()*10)+2;
				if(stats[i]<5)
				{
					stats[i]=5;
				}
			}
		}
		else
			if(classSelection==1) //Barbarian
			{
				stats[0]=(int)Math.floor(Math.random()*10)+3;
				if(stats[0]<6)
				{
					stats[0]=6;
				}
				stats[1]=(int)Math.floor(Math.random()*10)+5;
				if(stats[1]<8)
				{
					stats[1]=8;
				}
				stats[2]=(int)Math.floor(Math.random()*10)-1;
				if(stats[2]<2)
				{
					stats[2]=2;
				}
				stats[3]=(int)Math.floor(Math.random()*10)+2;
				if(stats[3]<5)
				{
					stats[3]=5;
				}
			}
			else
				if(classSelection==2) //Mage
				{
					stats[0]=(int)Math.floor(Math.random()*10);
					if(stats[0]<3)
					{
						stats[0]=3;
					}
					stats[1]=(int)Math.floor(Math.random()*10)+1;
					if(stats[1]<4)
					{
						stats[1]=4;
					}
					stats[2]=(int)Math.floor(Math.random()*10)+5;
					if(stats[2]<8)
					{
						stats[2]=8;
					}
					stats[3]=(int)Math.floor(Math.random()*10)+2;
					if(stats[3]<5)
					{
						stats[3]=5;
					}
				}
				else
					if(classSelection==3) //Thief
					{
						stats[0]=(int)Math.floor(Math.random()*10);
						if(stats[0]<3)
						{
							stats[0]=3;
						}
						stats[1]=(int)Math.floor(Math.random()*10);
						if(stats[1]<5)
						{
							stats[1]=5;
						}
						stats[2]=(int)Math.floor(Math.random()*10)+3;
						if(stats[2]<6)
						{
							stats[2]=6;
						}
						stats[3]=(int)Math.floor(Math.random()*10)+5;
						if(stats[3]<8)
						{
							stats[3]=8;
						}
					}
					else
						if(classSelection==4) //Assassin
						{
							stats[0]=(int)Math.floor(Math.random()*10)+3;
							if(stats[0]<6)
							{
								stats[0]=6;
							}
							stats[1]=(int)Math.floor(Math.random()*10);
							if(stats[1]<3)
							{
								stats[1]=3;
							}
							stats[2]=(int)Math.floor(Math.random()*10)+2;
							if(stats[2]<5)
							{
								stats[2]=5;
							}
							stats[3]=(int)Math.floor(Math.random()*10)+3;
							if(stats[3]<6)
							{
								stats[3]=6;
							}
						}
		for(int i=0; i<stats.length;i++)
		{
			baseStats[i]=stats[i];
		}
		maxHealth=stats[1]*2;
		currentHealth=maxHealth;
		System.out.println("These are your stats!");
		System.out.println("Strength: "+stats[0]);
		System.out.println("Constitution: "+stats[1]);
		System.out.println("Intelligence: "+stats[2]);
		System.out.println("Speed: "+stats[3]);
		System.out.println("Health: "+maxHealth);
		System.out.println("Press enter to continue!");
		progress=scan.nextLine();
		System.out.println("Here is your starting equipment!");
		if(classSelection==0) //Fighter
		{
			inventoryCheck[0]=true;
			inventoryCheck[8]=true;
			inventoryCheck[11]=true;
			inventoryCheck[19]=true;
		}
		else
			if(classSelection==1) //Barbarian
			{
				inventoryCheck[1]=true;
				inventoryCheck[5]=true;
				inventoryCheck[19]=true;
			}
			else
				if(classSelection==2) //Mage
				{
					inventoryCheck[14]=true;
					inventoryCheck[8]=true;
					inventoryCheck[19]=true;
				}
				else
					if(classSelection==3) //Thief
					{
						inventoryCheck[8]=true;
						inventoryCheck[0]=true;
						inventoryCheck[19]=true;
					}
					else
						if(classSelection==4) //Assassin
						{
							inventoryCheck[0]=true;
							inventoryCheck[8]=true;
							inventoryCheck[11]=true;
							inventoryCheck[19]=true;
						}
		inventory();
		System.out.println("Press enter to continue!");
		progress=scan.nextLine();
		//First Dungeon Starting!!!!!
		System.out.println("Let's begin our journey!");
		//Forest Dungeon Starts
		forestDungeon();

	}
	public static boolean inventory()
	{
		int itemEquip=0;
		for(int i=0; i<inventoryCheck.length;i++)
		{
			if(inventoryCheck[i]==true)
			{
				System.out.println(i+": "+inventory[i]);
			}
		}
		if(progress.equals("i"))
		{
			System.out.println("What would you like to do? type in the item number to select that item, or type e to exit");
			progress=scan.nextLine();
			if(progress.equals("e"))
			{
				return false;
			}
			else
			{
				itemEquip=Integer.parseInt(progress);
				equipItem(itemEquip);
				System.out.println(inventory[itemEquip]+" equipped!");
			}
			return false;
		}
		return false;
	}
	public static void equipItem(int b)
	{
		int item=b;
		String[] itemType=new String[21];
		int[] itemBonus=new int[21];
		itemType[0]="sword";
		itemType[1]="sword";
		itemType[2]="sword";
		itemType[3]="sword";
		itemType[4]="sword";
		itemType[5]="shield";
		itemType[6]="shield";
		itemType[7]="shield";
		itemType[8]="dagger";
		itemType[9]="dagger";
		itemType[10]="dagger";
		itemType[11]="armor";
		itemType[12]="armor";
		itemType[13]="armor";
		itemType[14]="staff";
		itemType[15]="staff";
		itemType[16]="staff";
		itemType[17]="staff";
		itemType[18]="staff";
		itemType[19]="potion";
		itemType[10]="potion";
		itemBonus[0]=1;
		itemBonus[1]=2;
		itemBonus[2]=3;
		itemBonus[3]=4;
		itemBonus[4]=5;
		itemBonus[5]=1;
		itemBonus[6]=2;
		itemBonus[7]=3;
		itemBonus[8]=1;
		itemBonus[9]=2;
		itemBonus[10]=3;
		itemBonus[11]=1;
		itemBonus[12]=2;
		itemBonus[13]=3;
		itemBonus[14]=1;
		itemBonus[15]=2;
		itemBonus[16]=3;
		itemBonus[17]=4;
		itemBonus[18]=5;
		System.out.println("Would you like to equip "+inventory[item]+"? y for yes, n for no");
		progress=scan.nextLine();
		progress=progress.toLowerCase();
		if(progress.equals("y"))
		{
			if(itemType[item].equals("sword")||itemType[item].equals("dagger"))
			{
				stats[0]=itemBonus[item]+baseStats[0];
			}
			else
				if(itemType[item].equals("staff"))
				{
					stats[2]=itemBonus[item]+baseStats[2];
				}
				else
					if(itemType[item].equals("shield"))
					{
						shield=itemBonus[item];
					}
					else
						if(itemType[item].equals("armor"))
						{
							armor=itemBonus[item];
						}
						else
							if(itemType[item].equals("potion"))
							{
								if(item==19)
								{
									currentHealth=currentHealth+(maxHealth/2);
									if(currentHealth>maxHealth)
									{
										currentHealth=maxHealth;
									}
									inventoryCheck[19]=false;
								}
								if(item==20)
								{
									currentHealth=maxHealth;
									inventoryCheck[20]=false;
								}
							}
		}
		progress="i";
		inventory();
	}
	public static boolean forestDungeon()
	{
		boolean runaway=false;
		boolean win=false;
		String[][] map=new String[8][5];
		map[0][0]="[ ]";
		map[0][1]="[ ]";
		map[0][2]="[ ]";
		map[0][3]="   ";
		map[0][4]="   ";
		map[1][0]="   ";
		map[1][1]="[ ]";
		map[1][2]="[ ]";
		map[1][3]="   ";
		map[1][4]="   ";
		map[2][0]="   ";
		map[2][1]="   ";
		map[2][2]="[ ]";
		map[2][3]="[ ]";
		map[2][4]="   ";
		map[3][0]="   ";
		map[3][1]="[ ]";
		map[3][2]="[ ]";
		map[3][3]="[ ]";
		map[3][4]="[ ]";
		map[4][0]="   ";
		map[4][1]="[ ]";
		map[4][2]="[ ]";
		map[4][3]="[ ]";
		map[4][4]="[ ]";
		map[5][0]="   ";
		map[5][1]="   ";
		map[5][2]="[ ]";
		map[5][3]="[ ]";
		map[5][4]="   ";
		map[6][0]="   ";
		map[6][1]="   ";
		map[6][2]="[ ]";
		map[6][3]="   ";
		map[6][4]="   ";
		map[7][0]="   ";
		map[7][1]="   ";
		map[7][2]="[ ]";
		map[7][3]="   ";
		map[7][4]="   ";
		boolean[][] mapCheck=new boolean[8][5];
		String[][] areaDescription=new String[8][5];
		areaDescription[0][0]="You see a large forest sprawling in front of you and a path branching to the right, what do you do? Press r to go right, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[0][1]="You see a creature standing in the center of this clearing, what do you do? a to attack, f to run";
		areaDescription[0][2]="Just a clearing in a forest. Press d to go down, l to go backwardss, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[1][1]="You see a creature standing in the center of this clearing, what do you do? a to attack, f to run";
		areaDescription[1][2]="Just a clearing in a forest Press d to go down, l to go backwards, or u to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[2][2]="You see an item on the ground, press p to pick it up";
		areaDescription[2][3]="Just a clearing in a forest. Press d to go down, or l to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[3][1]="Just another clearing in a forest. Press r to go backwards, or down to go down, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[3][2]="Just a clearing in a forest Press l to go left, or u to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[3][3]="Surprise! Another clearing! Press r to go right, or u to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[3][4]="You see a creature standing in the center of this clearing, what do you do? a to attack, f to run";
		areaDescription[4][1]="You see a creature standing in the center of this clearing, what do you do? a to attack, f to run";
		areaDescription[4][2]="Just a clearing in a forest Press d to go down, or l to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[4][3]="You see a creature standing in the center of this clearing, what do you do? a to attack, f to run";
		areaDescription[4][4]="Just a clearing in a forest Press l to go left, or u to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[5][2]="Just another clearing in a forest Press d to go down, or u to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[5][3]="Just a clearing in a forest Press l to go left, u to go backwards, s to view stats, i to look in your inventory, or m for your map";
		areaDescription[6][2]="You see an item on the ground, press p to pick it up";
		areaDescription[7][2]="You see a large man in shining armor standing in the clearing, he is covered in blood and he goes to attack you. Press a to attack";
		for (int row = 0; row < mapCheck.length; row++) 
		{
			for (int col = 0; col < mapCheck[row].length; col++) 
			{
				if(map[row][col].equals("   "))
				{
					mapCheck[row][col]=true;
				}
				else
				{
					mapCheck[row][col]=false;
				}
			}
		}
		boolean boss=false;
		int r=0;
		int co=0;
		while(boss==false)
		{
			while(r!=7||co!=2)
			{
				System.out.println(areaDescription[r][co]);
				progress=scan.nextLine();
				progress=progress.toLowerCase();
				mapCheck[r][co]=true;
				map[r][co]="[ ]";
				if(progress.equals("m"))
				{
					map[r][co]="{ }";
					for (int row = 0; row < mapCheck.length; row++) 
					{
						for (int col = 0; col < mapCheck[row].length; col++) 
						{
							if(mapCheck[row][col]==true)
							{
								if(col!=4)
								{
									System.out.print(map[row][col]);
								}
								else
								{
									System.out.println(map[row][col]);
								}
							}
							if(mapCheck[row][col]==false)
							{
								if(col!=4)
								{
									System.out.print("   ");
								}
								else
								{
									System.out.println("   ");
								}
							}
						}
					}
				}
				else
					if(progress.equals("i"))
					{
						inventory();
					}
					else
						if(progress.equals("r"))
						{
							if(map[r][co+1].equals("   "))
							{
								System.out.println("A thicket of trees blocks your way");
							}
							else
							{
								co++;
							}
						}
						else
							if(progress.equals("d"))
							{
								if(map[r+1][co].equals("   "))
								{
									System.out.println("A thicket of trees blocks your way");
								}
								else
								{
									r++;
								}
							}
							else
								if(progress.equals("l"))
								{
									if(map[r][co-1].equals("   "))
									{
										System.out.println("A thicket of trees blocks your way");
									}
									else
									{
										co--;
									}
								}
								else
									if(progress.equals("u"))
									{
										if(map[r-1][co].equals("   "))
										{
											System.out.println("A thicket of trees blocks your way");
										}
										else
										{
											r--;
										}
									}
									else
										if(progress.equals("a"))
										{
											win=combatForest(progress);
											if(win==false)
											{
												System.out.println("You died! Game over!");
												{
													boss=true;
												}
											}
											else
											{
												System.out.println("You won!");
												areaDescription[r][co]="You see the corpse of your defeated enemy in this area, there is nothing else. press i for your inventory, m for your map, ";
												if(r==0&&co==1)
												{
													areaDescriptionAddon="press r to go right, d to go down, or l to go backwards";
													areaDescription[0][1]=areaDescription[0][1].concat(areaDescriptionAddon);
												}
												if(r==1&&co==1)
												{
													areaDescriptionAddon="press r to go right, or u to go backwards";
													areaDescription[1][1]=areaDescription[1][1].concat(areaDescriptionAddon);
												}
												if(r==3&&co==4)
												{
													areaDescriptionAddon="press d to go down, or l to go back";
													areaDescription[3][4]=areaDescription[3][4].concat(areaDescriptionAddon);
												}
												if(r==4&&co==1)
												{
													areaDescriptionAddon="press r to go right, or u to go backwards";
													areaDescription[4][1]=areaDescription[4][1].concat(areaDescriptionAddon);
												}
												if(r==4&&co==3)
												{
													areaDescriptionAddon="press r to go backwards, or d to go down";
													areaDescription[4][3]=areaDescription[4][3].concat(areaDescriptionAddon);
												}
											}

										}
										else
											if(progress.equals("f"))
											{
												runaway=combatForest(progress);
											}
											else
												if(progress.equals("p"))
												{
													if(r==2&&co==2)
													{
														inventoryCheck[19]=true;
														areaDescription[2][2].equals("");
													}
													if(r==6&&co==2)
													{
														inventoryCheck[20]=true;
													}
												}
												else
													if(progress.equals("s"))
													{
														System.out.println("Here are your stats!");
														System.out.println("Health: "+currentHealth+"/"+maxHealth);
														System.out.println("Strength: "+stats[0]);
														System.out.println("Constitution: "+stats[1]);
														System.out.println("Intelligence: "+stats[2]);
														System.out.println("Speed: "+stats[3]);
													}
			}
			System.out.println(areaDescription[r][co]);
			progress=scan.nextLine();
			forestBossBattle(boss);

			
		}
		return true;
	}
	public static boolean combatForest(String selection)
	{
		boolean enemyDead=false;
		int[] enemyStats=new int[4];
		int enemy=(int)Math.floor(Math.random()*100)+1;
		int enemyMaxHealth=0;
		progress=selection;
		String enemyType="";
		if(enemy==1)
		{
			System.out.println("It's a bear!");
			enemyStats[0]=10;
			enemyStats[1]=8;
			enemyStats[2]=2;
			enemyStats[3]=6;
			enemyMaxHealth=enemyStats[1]*2;
			enemyType="Bear";
		}
		else
			if(enemy%2==0)
			{
				System.out.println("It's a wolf!");
				enemyStats[0]=6;
				enemyStats[1]=4;
				enemyStats[2]=4;
				enemyStats[3]=8;
				enemyMaxHealth=enemyStats[1]*2;
				enemyType="Wolf";
			}
			else
			{
				System.out.println("It's a bandit!");
				enemyStats[0]=8;
				enemyStats[1]=6;
				enemyStats[2]=5;
				enemyStats[3]=5;
				enemyMaxHealth=enemyStats[1]*2;
				enemyType="Bandit";
			}
		if(progress.equals("a"))
		{
			enemyMaxHealth=enemyMaxHealth-stats[0];
		}
		else
			if(progress.equals("f"))
			{
				if(stats[3]-enemyStats[3]>2)
				{
					System.out.println("Are you sure you want to flee? y for yes, n for no");
					progress=scan.nextLine();
					progress=progress.toLowerCase();
					if(progress.equals("y"))
					{
						return true;
					}
				}
				else
					System.out.println("You cannot flee, you are not fast enough!");
			}
		while(enemyMaxHealth>0&&currentHealth>0)
		{
			System.out.println("Press a to attack, or b to block");
			progress=scan.nextLine();
			progress=progress.toLowerCase();
			int damageDealt=enemyStats[0]-armor-shield;
			if(progress.equals("a"))
			{
				if(classSelection==3)
				{
					enemyMaxHealth=enemyMaxHealth-stats[2];
					System.out.println("You did "+stats[2]+" damage!");
				}
				if(classSelection!=3)
				{
					enemyMaxHealth=enemyMaxHealth-stats[0];
					System.out.println("You did "+stats[0]+" damage!");
				}
			}
			else
				if(progress.equals("b"))
				{
					System.out.println("Block Successful!");
					damageDealt=enemyStats[0]-armor-(shield*2);
					System.out.println(enemyType+" dealt "+damageDealt+" damage!");
				}
			if(enemyMaxHealth>0)
			{
				currentHealth=currentHealth-damageDealt;
			}
			if(currentHealth<=0)
			{
				currentHealth=0;
			}
			System.out.println("You have "+currentHealth+" hp remaining!");
		}
		if(enemyMaxHealth<=0&&currentHealth>0)
		{
			return true;
		}
		else
			return false;
	}
	public static boolean forestBossBattle(boolean a)
	{
		return true;
	}
}
