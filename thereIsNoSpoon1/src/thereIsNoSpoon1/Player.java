package thereIsNoSpoon1;

import java.util.Scanner;

public class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        if (in.hasNextLine()) {
            in.nextLine();
        }
        ///
        boolean[][] lines=new boolean[31][31];
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); 
            for (int j = 0; j < line.length();j++) {
            	if (line.charAt(j)=='0') {
            			lines[i][j]=true;
            	}
            }
        }
        
        boolean bool;
        int k;
        for (int i = 0; i<height; i++) {
        	for (int j = 0; j<width;j++) {
        		if (lines[i][j]) {
        			System.out.print(String.valueOf(j)+" "+String.valueOf(i)+" ");
        			bool=false;
        			for (k = j+1;k < width; k++) {
        				if (lines[i][k]) {
        					bool=true;
        					break;
        				}
        			}
	        		if (bool) System.out.print(String.valueOf(k)+" "+String.valueOf(i)+" ");
	        		else System.out.print("-1 -1 ");
	        		bool=false;
	        		for (k = i+1;k < height;k++) {
        				if (lines[k][j]) {
        					bool=true;
        					break;
        				}
        			}
	        		if (bool) System.out.println(String.valueOf(j)+" "+String.valueOf(k)+" ");
	        		else System.out.println("-1 -1");
	        		
        		}
        	}
        in.close();
        }
        
    }
}
