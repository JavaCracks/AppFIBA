package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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

	}

	public void putTreesInArrayList() {

		trees.add(playersByUSG);
		trees.add(playersByAST);
		trees.add(playersByDefense);
		trees.add(playersByOffense);
		trees.add(playersByYear);
		trees.add(playersByTeam);
		trees.add(playersByName);
		trees.add(playersByAge);
		trees.add(playersByDRB);
		trees.add(playersByWeight);
		trees.add(playersByHeight);
		trees.add(playersBySalary);

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

				if (trees != null) {

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

		ArrayList<BinarySearchTree<Player>> theTrees  = null;

		try {

			fS = new FileInputStream("./Archivos/data/dataJuego.dat");
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
		
	playersByUSG = (AVLTree<Player>)trees.get(0);
	playersByAST = (AVLTree<Player>)trees.get(1);
	playersByDefense = (RedBlackTree<Player>)trees.get(2);
	playersByOffense = (RedBlackTree<Player>)trees.get(3);
	playersByYear = trees.get(4);
	playersByTeam = trees.get(5);
	playersByName = (AVLTree<Player>)trees.get(6);
	playersByAge = (AVLTree<Player>)trees.get(7);
	playersByDRB = (AVLTree<Player>)trees.get(8);
	playersByWeight = (AVLTree<Player>)trees.get(9);
	playersByHeight = (AVLTree<Player>)trees.get(10);
	playersBySalary = (AVLTree<Player>)trees.get(11);
		
		
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

}
