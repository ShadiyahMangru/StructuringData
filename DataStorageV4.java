import java.text.*;
class HockeyPlayer{
	//fields
	private String lastName;
	private String position;
	private String birthplace;
	
	//constructors
	public HockeyPlayer(String lastName, String position, String birthplace){
		this.lastName = lastName;
		this.position = position;
		this.birthplace = birthplace;
	}
	
	public HockeyPlayer(HockeyPlayer hp){
		this.lastName = hp.lastName;
		this.position = hp.position;
		this.birthplace = hp.birthplace;
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
	
	public String printInfo(){
		return lastName + " | " + position + " | " + birthplace; 	
	}
}

class Skater extends HockeyPlayer{
	//fields
	private String season;
	private int gamesPlayed;
	private int goals;
	private int assists;
	private int points;
	private int plusMinus;
	private int shots;
	private double shootingPercentage;
	private double avgPtsGP;
	
	//constructor
	public Skater(HockeyPlayer hp, String season, int gamesPlayed, int goals, int assists, int plusMinus, int shots){
		super(hp);
		this.season = season;
		this.gamesPlayed = gamesPlayed;
		this.goals = goals;
		this.assists = assists;
		this.plusMinus = plusMinus;
		this.shots = shots;
		setPoints();
		this.points = getPoints();
		setShootingPercentage();
		this.shootingPercentage = getShootingPercentage();
		setAvgPtsGP();
		this.avgPtsGP = getAvgPtsGP();
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
	
	public void setPoints(){
		points = goals + assists;	
	}
	
	public void setPlusMinus(int plusMinus){
		this.plusMinus = plusMinus;	
	}
	
	public void setShots(int shots){
		this.shots = shots;	
	}
	
	public void setShootingPercentage(){
		try{
			if(shots > 0){
				shootingPercentage = ((double)goals/(double)shots)*100;	
			}
			else{
				shootingPercentage = 0;	
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Exception: " + ae + ".");	
		}
		catch(Exception e){
			System.out.println("Exception: " + e + ".");	
		}
	}
	
	public void setAvgPtsGP(){
		try{
			if(gamesPlayed > 0.0){
				avgPtsGP = (double)points/(double)gamesPlayed;	
			}
			else{
				avgPtsGP = 0.0;	
			}
			
		}
		catch(ArithmeticException ae){
			System.out.println("Exception: " + ae + ".");	
		}
		catch(Exception e){
			System.out.println("Exception: " + e + ".");	
		}
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
	
	public int getPoints(){
		return points;	
	}
	
	public int getPlusMinus(){
		return plusMinus;	
	}
	
	public int getShots(){
		return shots;	
	}
	
	public double getShootingPercentage(){
		return shootingPercentage;	
	}
	
	public double getAvgPtsGP(){
		return avgPtsGP;	
	}
	
	@Override
	public String toString(){
		DecimalFormat df = new DecimalFormat("0.0000");
		return "Season: " + season + " | Games Played: " + gamesPlayed 
		+ " | Goals: " + goals + " | Assists: " + assists + " | Points: " + points + " | +/-: " + plusMinus 
		+ " | Shots: " + shots + " | Shooting %: " + df.format(shootingPercentage) + " | Avg Points/GP: " + df.format(avgPtsGP); 	
	}
}

class Goalie extends HockeyPlayer{
	//fields
	private String season;
	private int gamesPlayed;
	private int wins;
	private int shotsAgainst;
	private int goalsAgainst;
	private int saves;
	private double savePercentage;
	private double avgWinsGP;
	
	//constructor
	public Goalie(HockeyPlayer hp, String season, int gamesPlayed, int wins, int goalsAgainst, int saves){
		super(hp);
		this.season = season;
		this.gamesPlayed = gamesPlayed;
		this.wins = wins;
		this.goalsAgainst = goalsAgainst;
		this.saves = saves;
		setShotsAgainst();
		this.shotsAgainst = getShotsAgainst();
		setSavePercentage();
		this.savePercentage = getSavePercentage();
		setAvgWinsGP();
		this.avgWinsGP = getAvgWinsGP();
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
	
	public void setShotsAgainst(){
		shotsAgainst = goalsAgainst + saves;
	}
	
	public void setGoalsAgainst(int goalsAgainst){
		this.goalsAgainst = goalsAgainst;	
	}
	
	public void setSaves(int saves){
		this.saves = saves;	
	}
	
	public void setSavePercentage(){
		try{
			if(shotsAgainst > 0){
				savePercentage = ((double)saves/(double)shotsAgainst)*100;	
			}
			else{
				savePercentage = 0;	
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Exception: " + ae + ".");	
		}
		catch(Exception e){
			System.out.println("Exception: " + e + ".");	
		}
	}
	
	public void setAvgWinsGP(){
		try{
			if(gamesPlayed > 0){
				avgWinsGP = (double)wins/(double)gamesPlayed;	
			}
			else{
				avgWinsGP = 0;	
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Exception: " + ae + ".");	
		}
		catch(Exception e){
			System.out.println("Exception: " + e + ".");	
		}
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
	
	public int getShotsAgainst(){
		return shotsAgainst;	
	}
	
	public int getGoalsAgainst(){
		return goalsAgainst;	
	}
	
	public int getSaves(){
		return saves;	
	}
	
	public double getSavePercentage(){
		return savePercentage;	
	}
	
	public double getAvgWinsGP(){
		return avgWinsGP;	
	}
	
	@Override
	public String toString(){
		DecimalFormat df = new DecimalFormat("0.0000");
		return "Season: " + season + " | Games Played: " + gamesPlayed 
		+ " | Wins: " + wins + " | Shots Against: " + shotsAgainst + " | Goals Against: " + goalsAgainst 
		+ " | Saves: " + saves + " | Save %: " + df.format(savePercentage) + " | Avg Wins/GP: " + df.format(avgWinsGP); 	
	}
}

public class DataStorageV4{	
	
	HockeyPlayer backstrom = new HockeyPlayer("Backstrom", "Forward, C", "Sweden");
	Skater backstrom2017 = new Skater(backstrom, "2017 - 2018", 81, 21, 50, 5, 165);
	Skater backstrom2016 = new Skater(backstrom, "2016 - 2017", 82, 23, 63, 17, 162);
	Skater backstrom2015 = new Skater(backstrom, "2015 - 2016", 75, 20, 50, 17, 129);
	Skater backstrom2014 = new Skater(backstrom, "2014 - 2015", 82, 18, 60, 5, 153);
	Skater backstrom2013 = new Skater(backstrom, "2013 - 2014", 82, 18, 61, -20, 196);
	
	HockeyPlayer holtby = new HockeyPlayer("Holtby", "Goalie", "Canada");
	Goalie holtby2017 = new Goalie(holtby, "2017 - 2018", 54, 34, 153, 1495);
	Goalie holtby2016 = new Goalie(holtby, "2016 - 2017", 63, 42, 127, 1563);
	Goalie holtby2015 = new Goalie(holtby, "2015 - 2016", 66, 48, 141, 1661);
	Goalie holtby2014 = new Goalie(holtby, "2014 - 2015", 73, 41, 157, 1887);
	Goalie holtby2013 = new Goalie(holtby, "2013 - 2014", 48, 23, 126, 1349);
	
	HockeyPlayer carlson = new HockeyPlayer("Carlson", "Defense", "USA");
	Skater carlson2017 = new Skater(carlson, "2017 - 2018", 82, 15, 53, 0, 237);
	Skater carlson2016 = new Skater(carlson, "2016 - 2017", 72, 9, 28, 7, 180);
	Skater carlson2015 = new Skater(carlson, "2015 - 2016", 56, 8, 31, 16, 124);
	Skater carlson2014 = new Skater(carlson, "2014 - 2015", 82, 12, 43, 11, 193);
	Skater carlson2013 = new Skater(carlson, "2013 - 2014", 82, 10, 27, -3, 208);
	
	HockeyPlayer kuznetsov = new HockeyPlayer("Kuznetsov", "Forward, C", "Russia");
	Skater kuznetsov2017 = new Skater(kuznetsov, "2017 - 2018", 79, 27, 56, 3, 187);
	Skater kuznetsov2016 = new Skater(kuznetsov, "2016 - 2017", 82, 19, 40, 18, 170);
	Skater kuznetsov2015 = new Skater(kuznetsov, "2015 - 2016", 82, 20, 57, 27, 193);
	Skater kuznetsov2014 = new Skater(kuznetsov, "2014 - 2015", 80, 11, 26, 10, 127);
	Skater kuznetsov2013 = new Skater(kuznetsov, "2013 - 2014", 17, 3, 6, -2, 22);
	
	HockeyPlayer orlov = new HockeyPlayer("Orlov", "Defense", "Russia");
	Skater orlov2017 = new Skater(orlov, "2017 - 2018", 82, 10, 21, 10, 125);
	Skater orlov2016 = new Skater(orlov, "2016 - 2017", 82, 6, 27, 30, 125);
	Skater orlov2015 = new Skater(orlov, "2015 - 2016", 82, 8, 21, 8, 90);
	Skater orlov2014 = new Skater(orlov, "2014 - 2015", 54, 3, 8, -1, 59);
	Skater orlov2013 = new Skater(orlov, "2013 - 2014", 5, 0, 1, 5, 1);
	
	HockeyPlayer burakovsky = new HockeyPlayer("Burakovsky", "Forward, LW", "Austria");
	Skater burakovsky2017 = new Skater(burakovsky, "2017 - 2018", 56, 12, 13, 3, 84);
	Skater burakovsky2016 = new Skater(burakovsky, "2016 - 2017", 64, 12, 23, 13, 111);
	Skater burakovsky2015 = new Skater(burakovsky, "2015 - 2016", 79, 17, 21, 4, 126);
	Skater burakovsky2014 = new Skater(burakovsky, "2014 - 2015", 53, 9, 13, 12, 65);
	
	HockeyPlayer grubauer = new HockeyPlayer("Grubauer", "Goalie", "Germany");
	Goalie grubauer2017 = new Goalie(grubauer, "2017 - 2018", 35, 15, 73, 880);
	Goalie grubauer2016 = new Goalie(grubauer, "2016 - 2017", 24, 13, 43, 542);
	Goalie grubauer2015 = new Goalie(grubauer, "2015 - 2016", 22, 8, 43, 480);
	Goalie grubauer2014 = new Goalie(grubauer, "2014 - 2015", 1, 1, 2, 23);
	Goalie grubauer2013 = new Goalie(grubauer, "2013 - 2014", 17, 6, 35, 434);
	
	Object[][] rosterInfo = {
						{backstrom2017, backstrom2016, backstrom2015, backstrom2014, backstrom2013},
						{holtby2017, holtby2016, holtby2015, holtby2014, holtby2013},
						{carlson2017, carlson2016, carlson2015, carlson2014, carlson2013},
						{kuznetsov2017, kuznetsov2016, kuznetsov2015, kuznetsov2014, kuznetsov2013},
						{orlov2017, orlov2016, orlov2015, orlov2014, orlov2013},
						{burakovsky2017, burakovsky2016, burakovsky2015, burakovsky2014},
						{grubauer2017, grubauer2016, grubauer2015, grubauer2014, grubauer2013}
						};
						
	public void printRoster(Object[][] rosterData){
		int ctr = 0;
		for(Object[] player1DArray : rosterData){
			ctr = 0;
			for(Object info : player1DArray){
				if(ctr < 1){
					HockeyPlayer h = (HockeyPlayer)info;
					System.out.println(h.printInfo());
					System.out.println(info.toString());
				}
				else{
					System.out.println(info.toString());
				}
				ctr++;
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void printSeasonRoster(Object[][] rosterData, String season){
		System.out.println("**** " + season + " Roster ****");
		for(Object[] player1DArray : rosterData){
			for(Object info : player1DArray){
				if(info instanceof Goalie){
					Goalie g = (Goalie)info;
					if(g.getSeason().equals(season)){
						System.out.println(g.printInfo());	
					}
				}
				else if(info instanceof Skater){
					Skater s = (Skater)info;
					if(s.getSeason().equals(season)){
						System.out.println(s.printInfo());	
					}
				}
			}
		}
	}

	public static void main(String... args){
		DataStorageV4 ds = new DataStorageV4();
		ds.printRoster(ds.rosterInfo);
		ds.printSeasonRoster(ds.rosterInfo, "2017 - 2018");
		System.out.println();
		ds.printSeasonRoster(ds.rosterInfo, "2013 - 2014");
	}
}