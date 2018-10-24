package model;

import java.io.Serializable;

public class Player implements Comparable<Player>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name; // Criteria 1
	private int year; // Criteria 2
	private String team; // Criteria 3
	private int age; // Criteria 4
	private double usg; // Criteria 5
	private double ast; // Criteria 6
	private double drb; // Criteria 7
	private double defense; // Criteria 8
	private double offense; // Criteria 9
	private String salary; // Criteria 10
	private int weight; // Criteria 11
	private int height; // Criteria 12

	private int criteria;

	public Player(String name, int year, String team, int age, double usg, double ast, double drb, double defense,
			double offense, String salary, int weight, int height, int criteria) {

		super();
		this.name = name;
		this.year = year;
		this.team = team;
		this.age = age;
		this.usg = usg;
		this.ast = ast;
		this.drb = drb;
		this.defense = defense;
		this.offense = offense;
		this.salary = salary;
		this.weight = weight;
		this.height = height;
		this.criteria = criteria;
	}
	
	public Player(double usg) {
		this.usg=usg;
		name=null;
		year=0;
		team=null;
		age=0;
		ast=0.0;
		drb=0.0;
		defense=0.0;
		offense=0.0;
		salary=null;
		weight=0;
		height=0;
		criteria=5;
	}
	
	public Player(String name) {
		this.name=name;
		year=0;
		team=null;
		age=0;
		ast=0.0;
		usg=0.0;
		drb=0.0;
		defense=0.0;
		offense=0.0;
		salary=null;
		weight=0;
		height=0;
		criteria=1;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getUsg() {
		return usg;
	}

	public void setUsg(double usg) {
		this.usg = usg;
	}

	public double getAst() {
		return ast;
	}

	public void setAst(double ast) {
		this.ast = ast;
	}

	public double getDrb() {
		return drb;
	}

	public void setDrb(double drb) {
		this.drb = drb;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public double getOffense() {
		return offense;
	}

	public void setOffense(double offense) {
		this.offense = offense;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCriteria() {
		return criteria;
	}

	public void setCriteria(int criteria) {
		this.criteria = criteria;
	}

	@Override
	public int compareTo(Player p) {

		int r = 0;

		switch (criteria) {

		case 1:
			r = this.name.compareTo(p.name);
			break;

		case 2:
			r = this.year - p.year;
			break;

		case 3:
			r = this.team.compareTo(p.team);
			break;

		case 4:
			r = this.age - p.age;
			break;

		case 5:

			if ((this.usg - p.usg) < 0) {

				r = -1;

			} else if ((this.usg - p.usg) > 0) {

				r = 1;

			} else {

				r = 0;

			}

			break;

		case 6:

			if ((this.ast - p.ast) < 0) {

				r = -1;

			} else if ((this.ast - p.ast) > 0) {

				r = 1;

			} else {

				r = 0;

			}

			break;

		case 7:

			if ((this.drb - p.drb) < 0) {

				r = -1;

			} else if ((this.drb - p.drb) > 0) {

				r = 1;

			} else {

				r = 0;

			}

			break;

		case 8:

			if ((this.defense - p.defense) < 0) {

				r = -1;

			} else if ((this.defense - p.defense) > 0) {

				r = 1;

			} else {

				r = 0;

			}

			break;

		case 9:

			if ((this.offense - p.offense) < 0) {

				r = -1;

			} else if ((this.offense - p.offense) > 0) {

				r = 1;

			} else {

				r = 0;

			}

			break;

		case 10:

			r = this.salary.compareTo(p.salary);

			break;

		case 11:

			r = this.weight - p.height;

			break;

		case 12:

			r = this.height - p.height;

		}

		return r;
	}
	
	@Override
	public String toString() {
		return usg +" ";
	}

}
