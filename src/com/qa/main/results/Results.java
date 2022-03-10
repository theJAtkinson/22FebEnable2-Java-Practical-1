package com.qa.main.results;

public class Results {
	private int physMark;
	private int chemMark;
	private int bioMark;
	private int totalMark;
	private float percentageMark = ((physMark + chemMark + bioMark) / totalMark * 100);
	
	/**Basic constructor for results
	 * 
	 * @param chemMark the mark in Chemistry
	 * @param bioMark the mark in Biology
	 * @param physMark the mark in Physics
	 */
	public Results(int chemMark, int bioMark, int physMark) {
		this.physMark = physMark;
		this.chemMark = chemMark;
		this.bioMark = bioMark;	
		totalMark = physMark + chemMark + bioMark;
		percentageMark = ((totalMark*100F)/450F);
	}
	
	/**
	 * Prints to console the marks in each subject in a nice format.
	 */
	public void showMarks() {
		totalMark = physMark + chemMark + bioMark;
		System.out.println("Physics mark is: " + physMark + "/150");
		System.out.println("Chemistry mark is: " + chemMark + "/150");
		System.out.println("Biology mark is: " + bioMark + "/150");
		System.out.println("Total mark is: " + totalMark + "/450");
	}
	
	/**
	 * Prints to console percentage total mark in a nice format.
	 */
	public void showPercentage() {
		System.out.println("Percentage mark is: " + percentageMark);
	}
	
	/**
	 * Prints to console whether or not the person has passed based on total grade,
	 * and each of their individual subject grades.
	 */
	public void passCheck() { 
		if(percentageMark<60) {
			System.out.println("Overall grade too low to progress.");
		}else if(bioMark < 90 ) {
			System.out.println("Biology grade too low to progress.");			
		}else if(chemMark < 90) {
			System.out.println("Chemistry grade too low to progress.");
		}else if (physMark < 90) {
			System.out.println("Physics grade too low to progress.");
		}else {
			System.out.println("Passed.");
		}	
	}
}
