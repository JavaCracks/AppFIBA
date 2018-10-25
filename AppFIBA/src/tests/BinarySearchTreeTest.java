package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import dataStructures.BinarySearchTree;
import dataStructures.RedBlackTree;
import junit.framework.TestCase;
import model.Player;

class BinarySearchTreeTest extends TestCase{

	private BinarySearchTree<Player> tree;
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
		tree=new RedBlackTree<Player>();
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
	
	@Test
	public void testAdd() {
		stageOne();
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
		
				
		Player[] arr=new Player[10];
		arr[0]=player;
		arr[1]=playerFive;
		arr[2]=playerSix;
		arr[3]=playerEight;
		arr[4]=playerFour;
		arr[5]=playerTwo;
		arr[6]=playerThree;
		arr[7]=playerNine;
		arr[8]=playerOne;
		arr[9]=playerSeven;
		
		
		assertTrue(Arrays.equals(arr, tree.toCollection().toArray()));
	}
	
	@Test
	public void testRemove() {
		stageOne();
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
		
				
		Player[] arr=new Player[9];
		arr[0]=player;
		arr[1]=playerOne;
		arr[2]=playerSix;
		arr[3]=playerEight;
		arr[4]=playerFour;
		arr[5]=playerTwo;
		arr[6]=playerThree;
		arr[7]=playerNine;
		arr[8]=playerSeven;
		
		assertTrue(Arrays.equals(arr, tree.toCollection().toArray()));
	}
	
	@Test
	public void testClear() {
		stageOne();
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
		tree.clear();
		
		assertEquals(0, tree.size());
		
	}
	
	@Test
	public void testSize() {
		stageOne();
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
		
		
		assertEquals(10, tree.size());
	}
	
	@Test
	public void testSearch() {
		stageOne();
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
		tree.search(playerOne);
		tree.search(playerFive);
		
		assertEquals(playerOne, tree.search(playerOne).getID());
		assertEquals(null, tree.search(playerFive));
	}

}
