import java.util.Scanner;
public class Mainn {

	  private static boolean okayy;
	public static void main(String[] args) {
		
        boolean okayy = false;
        Scanner scan = new Scanner(System.in);
        String[][]names = new String[][] {
        	
        	{"Davao ","Buhangin","City"},
        	{"Manila ","Miami ","City"},
        	{"Cebu ","Dallas ","City"},
        	{"Iloilo ","New Orleans ","City"},
        	{"Lakers ","Los Angeles ","City"},
        	{"USA ","Phoneix ","City"},
        	{"Mulberry ","Milwuquake ","City"},
        	{"Avenue ","Vikings ","City"},
        	{"Street ","Portland ","City"},
        	{"Orleans ","Sacramento ","City"},
        	
        };
        System.out.println("Welcome to the City");
        System.out.println("Enter a number 0-9");
        while(!okayy) {
        	try {
        		int x = scan.nextInt();
        		System.out.println(names[x][0]+names[x][1]+names[x][2]);
        		okayy = false;
        		
        	}catch (Exception e) {
        		System.out.println("Not Valid !");
        	}
        }
	}

}
