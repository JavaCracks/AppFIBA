package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import dataStructures.*;
import dataStructures.BinarySearchTree.DepthFirstSearchOrder;
import junit.framework.TestCase;
import model.Player;



class AVLTreeTest extends TestCase{
	
	private AVLTree<Player> tree;
	private Player player;
	private Player playerOne;
	private Player playerTwo;
	private Player playerThree;
	private Player playerFour;
	private Player playerFive;
	private Player playerSix;
	private Player playerSeven;
	private Player playerEight;
	private Player playerNine;
	
	
	
	public void stageOne() {
		tree=new AVLTree<Player>();
		player=new Player(23.3);
		playerOne=new Player(18.7);
		playerTwo=new Player(24.5);
		playerThree=new Player(29.7);
		playerFour=new Player(22.2);
		playerFive=new Player(21.8);
		playerSix=new Player(27.4);
		playerSeven=new Player(24.6);
		playerEight=new Player(17.6);
		playerNine=new Player(17.4);
	}
	
	public void stageTwo() {
		tree=new AVLTree<Player>();
		player=new Player("Juan");
		playerOne=new Player("Daniel");
		playerTwo=new Player("Gabriela");
		playerThree=new Player("Bryan");
		playerFour=new Player("Camilo");
		playerFive=new Player("Alejandro");
		playerSix=new Player("Duvan");
		playerSeven=new Player("Sebastian");
		playerEight=new Player("Camila");
		playerNine=new Player("Fabian");
	}
	
	@Test
	public void testAddValue() {
		
		stageOne();
		Player[] arr=new Player[10];
		arr[0]=player;
		arr[1]=playerFive;
		arr[2]=playerEight;
		arr[3]=playerNine;
		arr[4]=playerOne;
		arr[5]=playerFour;
		arr[6]=playerSix;
		arr[7]=playerTwo;
		arr[8]=playerSeven;
		arr[9]=playerThree;
		
		
		tree.add(player);
		tree.add(playerOne);
		tree.add(playerTwo);
		tree.add(playerThree);
		tree.add(playerFour);
		tree.add(playerFive);
		tree.add(playerSix);
		tree.add(playerSeven);
		tree.add(playerEight);
		tree.add(playerNine);
		//System.out.println(Arrays.toString(tree.getDFS(DepthFirstSearchOrder.preOrder)));
		assertArrayEquals(arr, tree.getDFS(DepthFirstSearchOrder.preOrder));
	}
	
	@Test
	//Do for comprobate the tree in Strings
	public void testAddValueString() {
		stageTwo();
		Player[] arr=new Player[10];
		arr[0]=playerFive;
		arr[1]=playerThree;
		arr[2]=playerEight;
		arr[3]=playerFour;
		arr[4]=playerOne;
		arr[5]=playerSix;
		arr[6]=playerNine;
		arr[7]=playerTwo;
		arr[8]=player;
		arr[9]=playerSeven;
				
		
		
		tree.add(player);
		tree.add(playerOne);
		tree.add(playerTwo);
		tree.add(playerThree);
		tree.add(playerFour);
		tree.add(playerFive);
		tree.add(playerSix);
		tree.add(playerSeven);
		tree.add(playerEight);
		tree.add(playerNine);
		//System.out.println(Arrays.toString(tree.getDFS(DepthFirstSearchOrder.inOrder)));
		assertArrayEquals(arr, tree.getDFS(DepthFirstSearchOrder.inOrder));
		
		
		
		
	}
	
	
	@Test
	public void testRemove() {
		
		stageOne();
		Player[] arr=new Player[9];
		arr[0]=playerNine;
		arr[1]=playerEight;
		arr[2]=playerOne;
		arr[3]=playerFour;
		arr[4]=player;
		arr[5]=playerTwo;
		arr[6]=playerSeven;
		arr[7]=playerSix;
		arr[8]=playerThree;
		
		tree.add(player);
		tree.add(playerOne);
		tree.add(playerTwo);
		tree.add(playerThree);
		tree.add(playerFour);
		tree.add(playerFive);
		tree.add(playerSix);
		tree.add(playerSeven);
		tree.add(playerEight);
		tree.add(playerNine);
		tree.remove(playerFive);
		System.out.println(Arrays.toString(tree.getDFS(DepthFirstSearchOrder.inOrder)));
		assertArrayEquals(arr, tree.getDFS(DepthFirstSearchOrder.inOrder));

		
	}


	

	
	

}
