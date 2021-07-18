package pk6;

import javax.swing.JOptionPane;

public class TwoDimension03 {

	public static void main(String[] args) {
		
		/*int[][] javascore= new int[2][3];
		
		int java=0;
		
		for(int i=0; i<javascore.length; i++ ) {
			for(int n=0; n<javascore[i].length;n++) {
				java=Integer.parseInt(JOptionPane.showInputDialog("javascore"));
				javascore[i][n]=java;
				System.out.println( " javascore["+i+"]["+n+"]="+javascore[i][n]++ );
			}
		}
		System.out.println(); */
		 
		/*int python=0;
		int[][] pythonscore= new int[2][3];
		
		
		for(int i=0; i<pythonscore.length; i++) {
			for(int j=0; j<pythonscore[i].length; j++) {
				python=Integer.parseInt(JOptionPane.showInputDialog("pythonscore"));
				pythonscore[i][j]=python;
				System.out.println( " pythoncore["+i+"]["+j+"]="+pythonscore[i][j] );
				System.out.println(); */
				
		int[][] bigdata= {{70},{80},{92,96,80}};
		for(int i=0; i<bigdata.length; i++) {
			for(int j=0; j<bigdata[i].length; j++) {
				System.out.println("bigdata["+i+"]["+j+"]="+bigdata[i][j]);
		}
				
			}
		}
	}


