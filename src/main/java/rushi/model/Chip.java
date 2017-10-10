package rushi.model;

import javax.persistence.*;

@Entity
public class Chip {
	@Id
	private Long chipID;
	
	//Name
	private String chipName;
	
	//Frames
	private String frameA;
	private double framePercentA;
	private String frameB;
	private double framePercentB;
	
	//Element
	//1: Fire, 2: Ice, 3: Lightning, 4: Wind, 5: Light, 6: Dark.
	private int elementA;
	private int elemAmountA;
	private int elementB;
	private int elemAmountB;
	
	//Unique, MultipliesWith, etc. For Future Use.
	private int multipliesWithElem;
	private int overrideMultiplier;
	
	public Chip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chip(Long chipID, String chipName) {
		super();
		this.chipID = chipID;
		this.chipName = chipName;
	}
	
	public Long getChipID() {
		return chipID;
	}
	public String getChipName() {
		return chipName;
	}
	public String getFrameA() {
		return frameA;
	}
	public double getFramePercentA() {
		return framePercentA;
	}
	public String getFrameB() {
		return frameB;
	}
	public double getFramePercentB() {
		return framePercentB;
	}
	public int getElementA() {
		return elementA;
	}
	public int getElemAmountA() {
		return elemAmountA;
	}
	public int getElementB() {
		return elementB;
	}
	public int getElemAmountB() {
		return elemAmountB;
	}
	
}
