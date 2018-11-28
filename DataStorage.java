public class DataStorage{
	
	String[][] rosterInfo = {
							{"Backstrom", "Forward, C", "Sweden"},
							{"Holtby", "Goalie", "Canada"},
							{"Carlson", "Defense", "USA"},
							{"Kuznetsov", "Forward, C", "Russia"},
							{"Connolly", "Forward, RW", "Canada"},
							{"Oshie", "Forward, RW", "USA"},
							{"Orlov", "Defense", "Russia"},
							{"Burakovsky", "Forward, LW", "Austria"},
							{"Copley", "Goalie", "USA"},
							{"Siegenthaler", "Defense", "Switzerland"}
						};
						
	public void printRoster(String[][] rosterData){
		for(String[] playerArray : rosterData){
			for(String info : playerArray){
				System.out.print(info + " | ");	
			}
			System.out.println();
		}
	}

	public static void main(String... args){
		DataStorage ds = new DataStorage();
		ds.printRoster(ds.rosterInfo);
	}
}