package xcompanyims;

//  @ File Name : Claim.java

import java.util.ArrayList;
import java.util.Calendar;

//  @ Date : 11.10.2011




public class Claim {
	private Customer owner;
	private String description;
	private int id;
	private ClaimHandler claimHandler;
	private String status;
	private String type;
	private Form form;
	private double damage;
	private Calendar dateOfCrash;
	private Garage garage;
	private Financer financer;
	private ArrayList<Email> emailsList;
	public int generateId() {
            return 1;
	}
	
	public void emailGarage() {
	
	}
	
	public void notifyUser() {
	
	}
}
