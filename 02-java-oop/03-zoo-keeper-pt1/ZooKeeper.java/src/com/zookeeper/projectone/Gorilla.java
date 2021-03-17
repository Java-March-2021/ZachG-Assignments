package com.zookeeper.projectone;

  public class Gorilla extends Mammal {
	  
	  private int defaultEnergyLevel = 100;
	  
	  public Gorilla() {
		  this.energyLevel = defaultEnergyLevel;
	  }
	  public void throwSomething() {
	        this.energyLevel -= 5;
	        System.out.println("Gorilla throws something");
	    }

	    public void climb() {
	        this.energyLevel -= 10;
	        System.out.println("Gorilla climbs a tree.");
	    }

	    public void eatBananas() {
	        this.energyLevel += 10;
	        System.out.println("Gorilla eats a banana.");
	    }

	   
	}