package model;

import dataStructures.*;


public class FibaApplication {

	
	private AVLTree<Player> playersByUSG;   //Search criteria stat
	private AVLTree<Player> playersByAST;	//Search criteria stat
	private RedBlackTree<Player> playersByDefense; // Search criteria stat 
	private RedBlackTree<Player> playersByOffense; // Search criteria stat
	private BinarySearchTree<Player> playersByYear; //Search criteria with Binary Search Tree 
	private BinarySearchTree<Player> playersByTeam; //Search criteria with Binary Search Tree
	private AVLTree<Player> playersByName; // Search criteria free
	private AVLTree<Player> playersByAge; // Search criteria free
	private AVLTree<Player> playersByDRB; // Search criteria free
	private AVLTree<Player> playersByWeight; // Search criteria free
	private AVLTree<Player> playersByHeight; // Search criteria free
	private AVLTree<Player> playersBySalary; // Search criteria free
	
	
	
	public FibaApplication() {
		
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
	
	
	
	
}
