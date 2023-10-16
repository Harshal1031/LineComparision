package com.line;

public class LineComparision {
	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public LineComparision(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double getLength() {
		double defX = x2 - x1;
		double defY = y2 - y1;
		return Math.sqrt(defX * defX + defY * defY);

	}

	public String toString() {
		return Double.toString(getLength());
	}

	public static int compareLength(String length1, String length2) {
		// TODO Auto-generated method stub
		return length1.compareTo(length2);
	}

	public static void main(String[] args) {
		LineComparision line1 = new LineComparision(2, 4, 4, 2);
		LineComparision line2 = new LineComparision(2, 4, 4, 2);
		String length1 = line1.toString();
		String length2 = line2.toString();
		boolean ifEqual = length1.equals(length2);
		if (ifEqual) {
			System.out.println("The lengths are equal");
		} else {
			System.out.println("The lengths are  Not equal");
		}
		int check = compareLength(length1, length2);
		if (check == 0) {
			System.out.println("The lenght of two lines are equla");
		} else if (check < 0) {
			System.out.println("Lenght of line1 is shorter than line2");
		} else {
			System.out.println("Lenght of line1 is longer than line2");
		}

	}

}
