import java.util.*;

public class DataStorageV2{
	
	static final String[] goalieStats = {"Season", "Games Played", "Wins", "Goals Against", "Saves"};
	static final String[] skaterStats = {"Season", "Games Played", "Goals", "Assists", "+/-", "Shots"};	
	
	Object[][][] rosterInfo = {
							{
								{"Backstrom", "Forward, C", "Sweden"},
								{"2017 - 2018", 81, 21, 50, 5, 165},
								{"2016 - 2017", 82, 23, 63, 17, 162},
								{"2015 - 2016", 75, 20, 50, 17, 129},
								{"2014 - 2015", 82, 18, 60, 5, 153},
								{"2013 - 2014", 82, 18, 61, -20, 196}
							},
							{
								{"Holtby", "Goalie", "Canada"},
								{"2017 - 2018", 54, 34, 153, 1495},
								{"2016 - 2017", 63, 42, 127, 1563},
								{"2015 - 2016", 66, 48, 141, 1661},
								{"2014 - 2015", 73, 41, 157, 1887},
								{"2013 - 2014", 48, 23, 126, 1349}
							},
							{
								{"Carlson", "Defense", "USA"},
								{"2017 - 2018", 82, 15, 53, 0, 237},
								{"2016 - 2017", 72, 9, 28, 7, 180},
								{"2015 - 2016", 56, 8, 31, 16, 124},
								{"2014 - 2015", 82, 12, 43, 11, 193},
								{"2013 - 2014", 82, 10, 27, -3, 208}
							},
							{
								{"Kuznetsov", "Forward, C", "Russia"},
								{"2017 - 2018", 79, 27, 56, 3, 187},
								{"2016 - 2017", 82, 19, 40, 18, 170},
								{"2015 - 2016", 82, 20, 57, 27, 193},
								{"2014 - 2015", 80, 11, 26, 10, 127},
								{"2013 - 2014", 17, 3, 6, -2, 22}
							},
							{
								{"Orlov", "Defense", "Russia"},
								{"2017 - 2018", 82, 10, 21, 10, 125},
								{"2016 - 2017", 82, 6, 27, 30, 125},
								{"2015 - 2016", 82, 8, 21, 8, 90},
								{"2014 - 2015", 54, 3, 8, -1, 59},
								{"2013 - 2014", 5, 0, 1, 5, 1}
							},
							{
								{"Burakovsky", "Forward, LW", "Austria"},
								{"2017 - 2018", 56, 12, 13, 3, 84},
								{"2016 - 2017", 64, 12, 23, 13, 111},
								{"2015 - 2016", 79, 17, 21, 4, 126},
								{"2014 - 2015", 53, 9, 13, 12, 65}
							},
							{
								{"Grubauer", "Goalie", "Germany"},
								{"2017 - 2018", 35, 15, 73, 880},
								{"2016 - 2017", 24, 13, 43, 542},
								{"2015 - 2016", 22, 8, 43, 480},
								{"2014 - 2015", 1, 1, 2, 23},
								{"2013 - 2014", 17, 6, 35, 434}
							}
						};
						
	public void printRoster(Object[][][] rosterData){
		int ctr = 0;
		int indexCtr = 0;
		String[] statTypes = new String[1];
		for(Object[][] player2DArray : rosterData){
			Object position = player2DArray[0][1];
			if(position.equals("Goalie")){
				statTypes = goalieStats;	
			}
			else{
				statTypes = skaterStats;	
			}
			for(Object[] player1DArray : player2DArray){
				for(Object info : player1DArray){
					ctr++;
					if(ctr < 4){
						System.out.print(info + " | ");	
					}
					else{
						System.out.print(statTypes[indexCtr] + ": " + info + " | ");	
						indexCtr++;
					}
				}
				indexCtr = 0;
				System.out.println();
			}
			System.out.println();
			ctr = 0;
		}
	}

	public static void main(String... args){
		DataStorageV2 ds = new DataStorageV2();
		ds.printRoster(ds.rosterInfo);
	}
}