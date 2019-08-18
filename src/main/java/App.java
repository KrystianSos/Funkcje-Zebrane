import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//------------------------------------------------------------------
        // 1.1 Pętla While
        System.out.println("While p.1");
        int value = 0;

        while(value < 10)
        {
            System.out.println("hello " + value );
            value = value + 1;
        }
//------------------------------------------------------------------
        // 1.2 Pętla for
        System.out.println("For p.1");
        for(int i=0; i<5; i++)
        {
            System.out.printf("Hello I is: %d\n", i);
        }
//------------------------------------------------------------------
        // 1.3 Pętla while
        System.out.println("While p.2");
        int loop=0;
        while(true)
        {
            System.out.println("Looping "+ loop);

            if(loop==5)
            {
                break;
            }
            loop++;
        }
//------------------------------------------------------------------
        // 2. Scanner

        //Create scanner object
        Scanner in = new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter a floating point value: ");

        //Wait the use to enter something
        double value1 = in.nextDouble();

        //Thell them what they entered
        System.out.println("You entered: "+value1);
//------------------------------------------------------------------
        // 3. Pętla do while

        Scanner scanner = new Scanner(System.in);

		/*
		System.out.println("Enter a number: ");

		int value2 = scanner.nextInt();

		while(value2 != 5){

			System.out.println("Enter a number: ");

			value2 = scanner.nextInt();
		}
		*/
        int value2 = 0;
        do {
            System.out.println("Enter a number: ");
            value2 = scanner.nextInt();
        }

        while(value2 != 5);

        System.out.println("Got 5!");
//------------------------------------------------------------------
        // 4. Switch
       /* Scanner in = new Scanner(System.in);

        System.out.println("Please enter a command: ");

        String text = in.nextString();

        switch(text) {
            case "start":
                System.out.println("Machine started");
                break;

            case "stop":
                System.out.println("Machine stopped");
                break;

            default:
                System.out.println("Command not recognized");
*/
    }
}
