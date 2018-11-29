import java.util.*;
class HockeyPlayer{
	//fields
	private String lastName;
	private String position;
	private String birthplace;
	
	//constructor
	public HockeyPlayer(String lastName, String position, String birthplace){
		this.lastName = lastName;
		this.position = position;
		this.birthplace = birthplace;
	}	
	
	//setters
	public void setLastName(String lastName){
		this.lastName = lastName;	
	}
	
	public void setPosition(String position){
		this.position = position;	
	}
	
	public void setBirthplace(String birthplace){
		this.birthplace = birthplace;	
	}
	
	//getters
	public String getLastName(){
		return lastName;
	}
	
	public String getPosition(){
		return position;	
	}
	
	public String getBirthplace(){
		return birthplace;	
	}
	
	@Override
	public String toString(){
		return lastName + " | " + position + " | " + birthplace; 	
	}
}

class Skater{
	//fields
	String season;
	int gamesPlayed;
	int goals;
	int assists;
	int plusMinus;
	int shots;
	
	//constructor
	public Skater(String season, int gamesPlayed, int goals, int assists, int plusMinus, int shots){
		this.season = season;
		this.gamesPlayed = gamesPlayed;
		this.goals = goals;
		this.assists = assists;
		this.plusMinus = plusMinus;
		this.shots = shots;
	}
	
	//setters
	public void setSeason(String season){
		this.season = season;	
	}
	
	public void setGamesPlayed(int gamesPlayed){
		this.gamesPlayed = gamesPlayed;	
	}
	
	public void setGoals(int goals){
		this.goals = goals;	
	}
	
	public void setAssists(int assists){
		this.assists = assists;	
	}
	
	public void setPlusMinus(int plusMinus){
		this.plusMinus = plusMinus;	
	}
	
	public void setShots(int shots){
		this.shots = shots;	
	}
	
	//getters
	public String getSeason(){
		return season;	
	}
	
	public int getGamesPlayed(){
		return gamesPlayed;	
	}
	
	public int getGoals(){
		return goals;	
	}
	
	public int getAssists(){
		return assists;	
	}
	
	public int getPlusMinus(){
		return plusMinus;	
	}
	
	public int getShots(){
		return shots;	
	}
	
	@Override
	public String toString(){
		return "Season: " + season + " | Games Played: " + gamesPlayed + " | Goals: " + goals + " | Assists: " + assists + " | +/-: " + plusMinus + " | Shots: " + shots; 	
	}
}

class Goalie{
	//fields
	String season;
	int gamesPlayed;
	int wins;
	int goalsAgainst;
	int saves;
	
	//constructor
	public Goalie(String season, int gamesPlayed, int wins, int goalsAgainst, int saves){
		this.season = season;
		this.gamesPlayed = gamesPlayed;
		this.wins = wins;
		this.goalsAgainst = goalsAgainst;
		this.saves = saves;
	}
	
	//setters
	public void setSeason(String season){
		this.season = season;	
	}
	
	public void setGamesPlayed(int gamesPlayed){
		this.gamesPlayed = gamesPlayed;	
	}
	
	public void setWins(int wins){
		this.wins = wins;	
	}
	
	public void setGoalsAgainst(int goalsAgainst){
		this.goalsAgainst = goalsAgainst;	
	}
	
	public void setSaves(int saves){
		this.saves = saves;	
	}
	
	//getters
	public String getSeason(){
		return season;	
	}
	
	public int getGamesPlayed(){
		return gamesPlayed;	
	}
	
	public int getWins(){
		return wins;	
	}
	
	public int getGoalsAgainst(){
		return goalsAgainst;	
	}
	
	public int getSaves(){
		return saves;	
	}
	
	@Override
	public String toString(){
		return "Season: " + season + " | Games Played: " + gamesPlayed + " | Wins: " + wins + " | Goals Against: " + goalsAgainst + " | Saves: " + saves; 	
	}
}

public class DataStorageV3{
	
	//static final String[] goalieStats = {"Season", "Games Played", "Wins", "Goals Against", "Saves"};
	//static final String[] skaterStats = {"Season", "Games Played", "Goals", "Assists", "+/-", "Shots"};	
	
	HockeyPlayer backstrom = new HockeyPlayer("Backstrom", "Forward, C", "Sweden");
	Skater backstrom2017 = new Skater("2017 - 2018", 81, 21, 50, 5, 165);
	Skater backstrom2016 = new Skater("2016 - 2017", 82, 23, 63, 17, 162);
	Skater backstrom2015 = new Skater("2015 - 2016", 75, 20, 50, 17, 129);
	Skater backstrom2014 = new Skater("2014 - 2015", 82, 18, 60, 5, 153);
	Skater backstrom2013 = new Skater("2013 - 2014", 82, 18, 61, -20, 196);
	
	HockeyPlayer holtby = new HockeyPlayer("Holtby", "Goalie", "Canada");
	Goalie holtby2017 = new Goalie("2017 - 2018", 54, 34, 153, 1495);
	Goalie holtby2016 = new Goalie("2016 - 2017", 63, 42, 127, 1563);
	Goalie holtby2015 = new Goalie("2015 - 2016", 66, 48, 141, 1661);
	Goalie holtby2014 = new Goalie("2014 - 2015", 73, 41, 157, 1887);
	Goalie holtby2013 = new Goalie("2013 - 2014", 48, 23, 126, 1349);
	
	HockeyPlayer carlson = new HockeyPlayer("Carlson", "Defense", "USA");
	Skater carlson2017 = new Skater("2017 - 2018", 82, 15, 53, 0, 237);
	Skater carlson2016 = new Skater("2016 - 2017", 72, 9, 28, 7, 180);
	Skater carlson2015 = new Skater("2015 - 2016", 56, 8, 31, 16, 124);
	Skater carlson2014 = new Skater("2014 - 2015", 82, 12, 43, 11, 193);
	Skater carlson2013 = new Skater("2013 - 2014", 82, 10, 27, -3, 208);
	
	HockeyPlayer kuznetsov = new HockeyPlayer("Kuznetsov", "Forward, C", "Russia");
	Skater kuznetsov2017 = new Skater("2017 - 2018", 79, 27, 56, 3, 187);
	Skater kuznetsov2016 = new Skater("2016 - 2017", 82, 19, 40, 18, 170);
	Skater kuznetsov2015 = new Skater("2015 - 2016", 82, 20, 57, 27, 193);
	Skater kuznetsov2014 = new Skater("2014 - 2015", 80, 11, 26, 10, 127);
	Skater kuznetsov2013 = new Skater("2013 - 2014", 17, 3, 6, -2, 22);
	
	HockeyPlayer orlov = new HockeyPlayer("Orlov", "Defense", "Russia");
	Skater orlov2017 = new Skater("2017 - 2018", 82, 10, 21, 10, 125);
	Skater orlov2016 = new Skater("2016 - 2017", 82, 6, 27, 30, 125);
	Skater orlov2015 = new Skater("2015 - 2016", 82, 8, 21, 8, 90);
	Skater orlov2014 = new Skater("2014 - 2015", 54, 3, 8, -1, 59);
	Skater orlov2013 = new Skater("2013 - 2014", 5, 0, 1, 5, 1);
	
	HockeyPlayer burakovsky = new HockeyPlayer("Burakovsky", "Forward, LW", "Austria");
	Skater burakovsky2017 = new Skater("2017 - 2018", 56, 12, 13, 3, 84);
	Skater burakovsky2016 = new Skater("2016 - 2017", 64, 12, 23, 13, 111);
	Skater burakovsky2015 = new Skater("2015 - 2016", 79, 17, 21, 4, 126);
	Skater burakovsky2014 = new Skater("2014 - 2015", 53, 9, 13, 12, 65);
	
	HockeyPlayer grubauer = new HockeyPlayer("Grubauer", "Goalie", "Germany");
	Goalie grubauer2017 = new Goalie("2017 - 2018", 35, 15, 73, 880);
	Goalie grubauer2016 = new Goalie("2016 - 2017", 24, 13, 43, 542);
	Goalie grubauer2015 = new Goalie("2015 - 2016", 22, 8, 43, 480);
	Goalie grubauer2014 = new Goalie("2014 - 2015", 1, 1, 2, 23);
	Goalie grubauer2013 = new Goalie("2013 - 2014", 17, 6, 35, 434);
	
	Object[][] rosterInfo = {
						{backstrom, backstrom2017, backstrom2016, backstrom2015, backstrom2014, backstrom2013},
						{holtby, holtby2017, holtby2016, holtby2015, holtby2014, holtby2013},
						{carlson, carlson2017, carlson2016, carlson2015, carlson2014, carlson2013},
						{kuznetsov, kuznetsov2017, kuznetsov2016, kuznetsov2015, kuznetsov2014, kuznetsov2013},
						{orlov, orlov2017, orlov2016, orlov2015, orlov2014, orlov2013},
						{burakovsky, burakovsky2017, burakovsky2016, burakovsky2015, burakovsky2014},
						{grubauer, grubauer2017, grubauer2016, grubauer2015, grubauer2014, grubauer2013}
						};
						
	public void printRoster(Object[][] rosterData){
		for(Object[] player1DArray : rosterData){
			for(Object info : player1DArray){
				System.out.println(info.toString());	
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String... args){
		DataStorageV3 ds = new DataStorageV3();
		ds.printRoster(ds.rosterInfo);
	}
}