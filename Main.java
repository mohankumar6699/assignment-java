/* Assignment -1
 * Full name and ID - Mohan Kumar Ramalingaiah Neerakallu - 19493389
 * I pledge by honor that this program is solely my own work
 */
package assignmentone;
import static java.lang.System.out;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q1();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		q7();
		input.close();


	}
	public static void q1() {
		String fmt = "%-20s%-30s\n";                       //formatting code 
		String spaceline = String.format("%40s","");       //creating space for content
		String dashline = spaceline.replace(" ", "-");     //replacing the space created with "-" symbols
		out.printf(fmt, "Escape sequence", "Description"); 
		out.println(dashline);
		out.printf(fmt,"\\n", "New line character");
		
		out.printf(fmt, "\\t", "Horizontal tab character");
		
		out.printf(fmt, "\\\"", "Double quote character");
		
		out.printf(fmt, "\\b", "Backspace character");


	}

	public static void q2() {
		
		System.out.print("Enter the radius of circle: "); //print line(ask user input)
		double radius = input.nextDouble();  

		double Area = radius*radius * Math.PI; //Code to find the area

		double Perimeter = 2* Math.PI*radius;  //finding the perimeter

		//formatting code 
		String fmt = "%-10s%-20s%-30s\n";
		String fmt1 ="%-10.2f%-20.2f%-30.2f\n";
		out.printf(fmt, "Radius", "Perimeter", "Area");
		String spaceline = String.format("%40s", " "); //creating space for content
		String dashline = spaceline.replace(" ", "-"); //replacing the space created with "-" symbols
		out.println(dashline);
		out.printf(fmt1, radius, Perimeter, Area);

	}



	public static void q3() {

		System.out.print("Enter a score: "); //asks user input
		double score = Double.parseDouble(input.nextLine()); // reads and converts the string to number
		 

		if (score >= 80 && score <= 100) {               //elseif condition starts, score between 80 - 100(inclusive)
			out.printf("Score %.1f is in grade A", score); //prints the output

		}

		else if (score >= 70 && score <= 80) {           //score between 70 - 80(inclusive)
			out.printf("Score %.1f is in grade B", score); //prints the output


		}
		else if (score >= 50 && score <= 70) {           //score between 50 - 70(inclusive)
			out.printf("Score %.1f is in grade C", score); //prints the output

		}
		else if (score <= 50 && score >= 0) {            //score between 50 - 0(inclusive)
			out.printf("Score %.1f is in grade D", score); //prints the output
		}
		else {                                           //if user inputs values other than asked in question, else condition is executed
			out.printf("There is no grade for score %.1f", score);  //prints the output

		}


	}
	
	public static void q4() {
		out.print("Please enter season name(summer/spring/winter/autumn)): "); //prompting user for input
		String season = input.nextLine(); //reads the input
		//using while loop to check for invalid input
		while((!season.equalsIgnoreCase("summer"))&&(!season.equalsIgnoreCase("spring"))&&(!season.equalsIgnoreCase("winter"))&&(!season.equalsIgnoreCase("autumn"))) {
			out.print("Invalid season name.");
			out.print("Please enter season name(summer/spring/winter/autumn)): ");
			season = input.nextLine(); //reads input from user
			
		}
		if(season.equalsIgnoreCase("summer")) {              //if and else if condition starts 
			out.println("Summer is an oil painting.");       
		}
		else if(season.equalsIgnoreCase("spring")) {        
			out.println("Spring is water color.");           
		}
		else if(season.equalsIgnoreCase("winter")) {         
			out.println("Winter is cool.");                  
		}
		else if(season.equalsIgnoreCase("autumn")) {         
			out.println("Autumn is a mosaic of them all.");  

		}                                                    //if and else if condition ends
	
	}
		
		
	public static void q5() {

		String first_line;                          //variable string declared
		int count =0;                               //initial count value will be 0.

		out.println("Enter the first line: ");       //asks for user input
		first_line = input.nextLine();               //reads the user input in first_line

		String[] line1 = first_line.split(",");          //we split line into an array of numeric strings
		double[] double_array = new double[line1.length];       //converting line1 into double values array
		for(int i=0; i<line1.length; i++){
			double_array[i] = Double.parseDouble(line1[i]);
		}

		String second_line;
		out.println("Enter the second  line: ");
		second_line = input.nextLine();

		String[] line2 = second_line.split(",");               //we split line into an array of numeric strings
		double[] double_array2 = new double[line2.length];     //converting line2 into double values array
		for(int i=0; i<line2.length; i++){
			double_array2[i] = Double.parseDouble(line2[i]);
		}
		for(double n1 : double_array) {                    //nested for each loop starts
			for(double n2 : double_array2 ) {
				if(n1 == n2) {                             //if any numbers match.,
					count++;                               //increment the count
				}
			}

		}
		out.printf("Number of overlapping values: %d", count);  //prints final output
	}


	public static void q6() {
		
		String[] country = {"New Zealand","India", "Germany", "Thailand", "Greece", "Netherlands"};   //arrays of country names
		String[] capital = {"Wellington", "New delhi", "Berlin", "Bangkok"," Athens", "Amsterdam"};   //arrays of capital city names

		int number = ThreadLocalRandom.current().nextInt(0, 6); //randomly picks values based on index number
		String choosed_country = country[number]; 
		String choosed_capital = capital[number];
		

		out.printf("Which country has the Capital city %s?\n",choosed_capital); //prints on screen, by displaying randomly picked capital city name
		out.print("Enter up to 3 names, Comma-separated: ");  //asks for user input

		
		String guessed = input.nextLine();  //reads the guessed country name

		String[] country_guess = guessed.split(","); //guessed country names are split with comma and stored in a variable

		if (country_guess.length > 3){                //if condition to check length of input
			out.println("Too many names. Game over");  //prints on screen
		}
		else {                                                   //else guessing game continues
			out.printf("The country is %s\n", choosed_country);
			boolean correct = false;
            //for loop for checking logic if country name entered is in country array.
			for(int i = 0; i < country_guess.length; i++) {
				String country_name = country_guess[i];
				if (country_name.equals(choosed_country)) {   
					correct = true;
				}
			}
            //if condition used to display result to the user
			if(correct == true){
				out.println("You’re correct. Well done."); 
			}

			else {
				out.println("Your answer is incorrect.");
			}
		}
	}

	public static void q7() {
		out.println("How many sensors in use:"); //asks user input for number of sensors
		int sensors_total = input.nextInt();     //reads the input from user and stores in variable            
		double[] temp = new double[sensors_total];    //stores in array temp        
        
		//for loop for asking temperature and reading the input and storing in temp array
		for(int i = 0; i < sensors_total; i++) {
			out.printf("Enter temprature #%d : ",i);
			temp[i]=input.nextDouble();               
		}
		double sum = 0; 
		int count = 0;
		//for loop for calculating number of temperatures between 10-20
		for(int i = 0; i < sensors_total; i++) {

			if(temp[i] >= 10 && temp[i] <= 20) {
				count = count + 1;
			}
			sum = sum + temp[i];

		}
		out.println("");
		out.println("== Display statistics ==");
		//printing the average, maximum and temperature between 10-20
		double avg = sum/sensors_total;
		out.printf("Average temprature : %s\n",avg);
		double maxtemp = temp[0];

		// for each loop
		for (double num : temp)  
		{
			if (num > maxtemp)
			{
				maxtemp = num;
			}
		}

		out.printf("Maximum temprature : %s",maxtemp);
		out.printf("\nNumbers of temprature between 10-20 : %s\n",count);
		
		out.println("");
		out.println("==Query sensor temperature==");
		

        //while loop used to display user queries
		while(true) {

			out.printf("Enter sensor number (1-%d):", sensors_total);

			int sensors_total1 = input.nextInt();//1

			if(sensors_total1<=sensors_total && sensors_total1>=1) {
				out.printf("\nTemperature for sensor #%d: %f\n",sensors_total1, temp[sensors_total1-1]);
				break;
			}
			else {


				out.printf("\nSensor doesn’t exist. Enter again.");

				

			}

		}
	}
}









	

