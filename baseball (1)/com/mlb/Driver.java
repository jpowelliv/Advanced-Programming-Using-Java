package com.mlb;

/**
 * Joseph E Powell
 * CIS315
 * Practice Exam II
 * 
 * @jpowelliv
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.mlb.ConfigurationError;
import com.mlb.League;
import com.mlb.Player;
import com.mlb.ReadError;
import com.mlb.Team;

public class Driver {

	public static void main(String[] args) {

		// TODO: create a league object w/ name MLB
		League mlb = new League("MLB");
		
		// read data from file into various objects
		try {
			read(mlb);
		} catch (ConfigurationError e) {
			System.err.println(e);;
		}

		// get the team names from the league
		Set<String> teamNames = mlb.getTeamNames();
		
		// TODO: loop over the team names; print each team name
		// if the team is in the World Series (which I had to miss because of Comcast)
		// get the team object from the league and display the players
		// display one in natural order and the other in sorted order
		for (String tn : teamNames) {
			System.out.println(tn);
			if (tn.equals("WAS")) {
				// get team from league
				Team team = mlb.getTeam(tn);
				
				// display players
				team.displayTeam(false);
			} else if (tn.equals("HOU")) {
				// get team from league
				Team team2 = mlb.getTeam(tn);
				// display players
				team2.displayTeam(true);
			}
		}


	}
	
	private static void read(League league) throws ConfigurationError {
		String[] header = null;
		
		try {
			BufferedReader br = 
					new BufferedReader(
							new FileReader("mlb-player-stats-Batters.csv"));
			
			// the first line of the file is a header line
			if (br.ready()) {
				String columnLabels = br.readLine();
				header = columnLabels.split(",");
			}

			while (br.ready()) {
				String line = br.readLine();
				
				// column 2 is the team name
				String[] data = line.split(",");
				String teamName = data[1];
				Team currentTeam = league.getTeam(teamName);
				if (currentTeam == null) {
					currentTeam = new Team(teamName);
					league.add(currentTeam);
				}

				// column 1 is the name (split name into first and last)
				String name = data[0];
				String[] partsName = name.split(" ");
				String pos = data[2];
				Player p = new Player(partsName[0], partsName[1], pos);
				
				// the rest of the columns are stats (use the column header
				// for the key)
				Map<String, Double> stats = new HashMap<>();
				for (int i = 3; i < data.length; i++) {
					Double value = 0.0;
					if (data[i].length() > 0) {
						value = Double.parseDouble(data[i]);
					}
					stats.put(header[i], value);
				}
				p.setStats(stats);

				currentTeam.addPlayer(p);
			}
		} catch (FileNotFoundException e) {
			// TODO throw a new ConfigurationError and add throws clause to method header
			// use try/catch in main to display the error to standard error and exit
			throw new ConfigurationError();
		} catch (IOException ioe) {
			// TODO throw a new ConfigurationError and add throws clause to method header
			// use try/catch in main to display the error to standard error and exit
			throw new ConfigurationError();
		} catch (RuntimeException re) {
			// TODO throw a ReadError
			throw new ReadError(re.getMessage());
		}
	}

}
