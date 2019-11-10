/*
 * 
 * Group Class
 * 
 * This has all the details of a group / Event
 * 
 * 
 */
package com.example.matchcomet;
import java.util.*;

public class GroupComets {
	
	private String groupTitle;
	// Insert picture here
	private String groupCreator;
	private String groupDesc;
	private String groupDate;
	private int count;
	public String getGroupTitle() {
		return groupTitle;
	}
	
	
	public GroupComets() {
		this.groupCreator = "";
		this.groupTitle = "";
		this.groupDesc = "";
		this.count = 0;
	}
	
	public GroupComets(String title, String name, String when, String desc) {
		this.groupCreator = name;
		this.groupDate = when;
		this.groupTitle = title;
		this.groupDesc = desc;
		this.count = 0;
	}
	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}
	public  String getGroupDate() { return groupDate;}
	public String getGroupCreator() {
		return groupCreator;
	}
	public void setGroupCreator(String groupCreator) {
		this.groupCreator = groupCreator;
	}
	public String getGroupDesc() {
		return groupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
	
}
