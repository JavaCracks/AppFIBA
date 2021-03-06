package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import dataStructures.*;

public class FibaApplication {

	private ArrayList<BinarySearchTree<Player>> trees;

	private AVLTree<Player> playersByUSG; // Search criteria stat
	private AVLTree<Player> playersByAST; // Search criteria stat
	private RedBlackTree<Player> playersByDefense; // Search criteria stat
	private RedBlackTree<Player> playersByOffense; // Search criteria stat
	private BinarySearchTree<Player> playersByYear; // Search criteria with Binary Search Tree
	private BinarySearchTree<Player> playersByTeam; // Search criteria with Binary Search Tree
	private AVLTree<Player> playersByName; // Search criteria free
	private AVLTree<Player> playersByAge; // Search criteria free
	private AVLTree<Player> playersByDRB; // Search criteria free
	private AVLTree<Player> playersByWeight; // Search criteria free
	private AVLTree<Player> playersByHeight; // Search criteria free
	private AVLTree<Player> playersBySalary; // Search criteria free

	public FibaApplication() {

		trees = new ArrayList<>();

		playersByUSG = new AVLTree<>();
		playersByAST = new AVLTree<>();
		playersByDefense = new RedBlackTree<>();
		playersByOffense = new RedBlackTree<>();
		playersByYear = new BinarySearchTree<>();
		playersByTeam = new BinarySearchTree<>();
		playersByName = new AVLTree<>();
		playersByAge = new AVLTree<>();
		playersByDRB = new AVLTree<>();
		playersByWeight = new AVLTree<>();
		playersByHeight = new AVLTree<>();
		playersBySalary = new AVLTree<>();

		try {
			refillTrees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		putTreesInArrayList();
//		save();

//		recover();
//		assignTreesAfterRecover();

	}

	public void putTreesInArrayList() {

		trees.add(playersByName);
		trees.add(playersByYear);
		trees.add(playersByTeam);
		trees.add(playersByAge);
		trees.add(playersByUSG);
		trees.add(playersByAST);
		trees.add(playersByDRB);
		trees.add(playersByDefense);
		trees.add(playersByOffense);
		trees.add(playersBySalary);
		trees.add(playersByWeight);
		trees.add(playersByHeight);

	}

	public void save() {

		FileOutputStream fS = null;
		ObjectOutputStream oS = null;

		try {

			fS = new FileOutputStream("./data/dataPlayers.dat");
			oS = new ObjectOutputStream(fS);

			oS.writeObject(trees);
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		} finally {

			try {

				if (fS != null) {

					fS.close();
				}
				if (oS != null) {

					oS.close();
				}

			} catch (IOException ex) {

				System.out.println(ex.getMessage());
			}

		}

	}

	public void recover() {

		FileInputStream fS = null;
		ObjectInputStream oS = null;

		ArrayList<BinarySearchTree<Player>> theTrees = null;

		try {

			fS = new FileInputStream("./data/dataPlayers.dat");
			oS = new ObjectInputStream(fS);
			theTrees = (ArrayList<BinarySearchTree<Player>>) oS.readObject();
			setTrees(theTrees);

		} catch (Exception ex) {

			System.out.println(ex.getMessage());

		} finally {

			try {
				if (fS != null) {

					fS.close();
				}

				if (oS != null) {

					oS.close();

				}

			} catch (IOException e) {

				System.out.println(e.getMessage());
			}

		}

	}

	public void assignTreesAfterRecover() {

		playersByUSG = (AVLTree<Player>) trees.get(0);
//		playersByAST = (AVLTree<Player>) trees.get(1);
//		playersByDefense = (RedBlackTree<Player>) trees.get(2);
//		playersByOffense = (RedBlackTree<Player>) trees.get(3);
//		playersByYear = trees.get(4);
//		playersByTeam = trees.get(5);
//		playersByName = (AVLTree<Player>) trees.get(6);
//		playersByAge = (AVLTree<Player>) trees.get(7);
//		playersByDRB = (AVLTree<Player>) trees.get(8);
//		playersByWeight = (AVLTree<Player>) trees.get(9);
//		playersByHeight = (AVLTree<Player>) trees.get(10);
//		playersBySalary = (AVLTree<Player>) trees.get(11);

	}

	public void refillTrees() throws Exception {

		FileReader fr = null;
		BufferedReader br = null;

		fr = new FileReader("./data/data.txt");
		br = new BufferedReader(fr);

		String playerLine = "";

		while ((playerLine = br.readLine()) != null) {

			String[] z = playerLine.split("/");

			String name = z[0];
			int year = Integer.parseInt(z[1]);
			String team = z[2];
			int age = Integer.parseInt(z[3]);
			double usg = Double.parseDouble(z[4]);
			double ast = Double.parseDouble(z[5]);
			double drb = Double.parseDouble(z[6]);
			double defense = Double.parseDouble(z[7]);
			double offense = Double.parseDouble(z[8]);
			String salary = z[9];
			int weight = Integer.parseInt(z[10]);
			int height = Integer.parseInt(z[11]);

			Player a = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 1);
			Player b = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 2);
			Player c = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 3);
			Player d = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 4);
			Player e = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 5);
			Player f = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 6);
			Player g = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 7);
			Player h = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 8);
			Player i = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 9);
			Player j = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 10);
			Player k = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 11);
			Player l = new Player(name, year, team, age, usg, ast, drb, defense, offense, salary, weight, height, 12);

			playersByName.add(a);
			playersByYear.add(b);
			playersByTeam.add(c);
			playersByAge.add(d);
			playersByUSG.add(e);
			playersByAST.add(f);
			playersByDRB.add(g);
			playersByDefense.add(h);
			playersByOffense.add(i);
			playersBySalary.add(j);
			playersByWeight.add(k);
			playersByHeight.add(l);

		}

		if (br != null) {

			br.close();

		}

		if (fr != null) {

			fr.close();

		}

	}

	public AVLTree<Player> getPlayersByUSG() {
		return playersByUSG;
	}

	public void setPlayersByUSG(AVLTree<Player> playersByUSG) {
		this.playersByUSG = playersByUSG;
	}

	public AVLTree<Player> getPlayersByAST() {
		return playersByAST;
	}

	public void setPlayersByAST(AVLTree<Player> playersByAST) {
		this.playersByAST = playersByAST;
	}

	public RedBlackTree<Player> getPlayersByDefense() {
		return playersByDefense;
	}

	public void setPlayersByDefense(RedBlackTree<Player> playersByDefense) {
		this.playersByDefense = playersByDefense;
	}

	public RedBlackTree<Player> getPlayersByOffense() {
		return playersByOffense;
	}

	public void setPlayersByOffense(RedBlackTree<Player> playersByOffense) {
		this.playersByOffense = playersByOffense;
	}

	public BinarySearchTree<Player> getPlayersByYear() {
		return playersByYear;
	}

	public void setPlayersByYear(BinarySearchTree<Player> playersByYear) {
		this.playersByYear = playersByYear;
	}

	public BinarySearchTree<Player> getPlayersByTeam() {
		return playersByTeam;
	}

	public void setPlayersByTeam(BinarySearchTree<Player> playersByTeam) {
		this.playersByTeam = playersByTeam;
	}

	public AVLTree<Player> getPlayersByName() {
		return playersByName;
	}

	public void setPlayersByName(AVLTree<Player> playersByName) {
		this.playersByName = playersByName;
	}

	public AVLTree<Player> getPlayersByAge() {
		return playersByAge;
	}

	public void setPlayersByAge(AVLTree<Player> playersByAge) {
		this.playersByAge = playersByAge;
	}

	public AVLTree<Player> getPlayersByDRB() {
		return playersByDRB;
	}

	public void setPlayersByDRB(AVLTree<Player> playersByDRB) {
		this.playersByDRB = playersByDRB;
	}

	public AVLTree<Player> getPlayersByWeight() {
		return playersByWeight;
	}

	public void setPlayersByWeight(AVLTree<Player> playersByWeight) {
		this.playersByWeight = playersByWeight;
	}

	public AVLTree<Player> getPlayersByHeight() {
		return playersByHeight;
	}

	public void setPlayersByHeight(AVLTree<Player> playersByHeight) {
		this.playersByHeight = playersByHeight;
	}

	public AVLTree<Player> getPlayersBySalary() {
		return playersBySalary;
	}

	public void setPlayersBySalary(AVLTree<Player> playersBySalary) {
		this.playersBySalary = playersBySalary;
	}

	public ArrayList<BinarySearchTree<Player>> getTrees() {
		return trees;
	}

	public void setTrees(ArrayList<BinarySearchTree<Player>> trees) {
		this.trees = trees;
	}

	public ArrayList<Player> searchByCriteriaName(String p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] names = playersByName.getSorted();

//		int k = Arrays.binarySearch(names, new Player(p));

		String[] pFirst = p.split(" ");

		boolean stop = false;
		for (int i = 0; i < names.length && !stop; i++) {

			String name = names[i].getName();
			String[] first = name.split(" ");

			for (int l = 0; l < first.length; l++) {

				if (pFirst[0].equalsIgnoreCase(first[l])) {

					players.add(names[i]);

				}
			}
		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaYear(int p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] years = playersByYear.getSorted();

		for (int i = 0; i < years.length; i++) {

			if (years[i].getYear() == p) {

				players.add(years[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaTeam(String p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] teams = playersByTeam.getSorted();

		for (int i = 0; i < teams.length; i++) {

			if (teams[i].getTeam().equalsIgnoreCase(p)) {

				players.add(teams[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaAge(int p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] ages = playersByAge.getSorted();

		for (int i = 0; i < ages.length; i++) {

			if (ages[i].getAge() == p) {

				players.add(ages[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaUSG(double p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] usgs = playersByUSG.getSorted();

		for (int i = 0; i < usgs.length; i++) {

			if (usgs[i].getUsg() == p) {

				players.add(usgs[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaAST(double p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] asts = playersByAST.getSorted();

		for (int i = 0; i < asts.length; i++) {

			if (asts[i].getAst() == p) {

				players.add(asts[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaDRB(double p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] drbs = playersByDRB.getSorted();

		for (int i = 0; i < drbs.length; i++) {

			if (drbs[i].getDrb() == p) {

				players.add(drbs[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaDefense(double p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] defenses = playersByDefense.toCollection().toArray(new Player[0]);
		Arrays.sort(defenses);

		for (int i = 0; i < defenses.length; i++) {

			if (defenses[i].getDefense() == p) {

				players.add(defenses[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaOffense(double p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] offenses = playersByOffense.toCollection().toArray(new Player[0]);
		Arrays.sort(offenses);

		for (int i = 0; i < offenses.length; i++) {

			if (offenses[i].getOffense() == p) {

				players.add(offenses[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaSalary(String p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] salarys = playersBySalary.getSorted();

		for (int i = 0; i < salarys.length; i++) {

			if (salarys[i].getSalary().equalsIgnoreCase(p)) {

				players.add(salarys[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaWeight(int p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] w = playersByWeight.getSorted();

		for (int i = 0; i < w.length; i++) {

			if (w[i].getWeight() == p) {

				players.add(w[i]);

			}

		}

		return players;

	}

	public ArrayList<Player> searchByCriteriaHeight(int p) {

		ArrayList<Player> players = new ArrayList<>();

		Player[] h = playersByHeight.getSorted();

		for (int i = 0; i < h.length; i++) {

			if (h[i].getHeight() == p) {

				players.add(h[i]);

			}

		}

		return players;

	}

}
