import java.util.Scanner;

//------------------------------------------------
// 5. Klasy, obiekty i metody
class Person {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain:
    // 1. Data
    // 2. subroutines (methods)
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }
}

//------------------------------------------------------------------
// 6. Getters and Return Values

class Person2 {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }


    int calculateYearsToRetirement() {

        int yearsLeft = 65 - age;


        return yearsLeft;
    }

    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }

}

//------------------------------------------------------------------
// 7. Method parameters

class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " metres in direction " + direction);
    }
}

//------------------------------------------------------------------
// 8. Setters and "this"
class Frog {
    private String name;
    private int age;

    public void setName(String dowolna) {
        this.name = dowolna;
    }

    public void setAge(int znowu) {
        this.age = znowu;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

//------------------------------------------------------------------
// 9. Constructors
class Machine {
    private String name;
    int ok;

    public Machine() {
        System.out.println("Constructor running!");
    }

    public Machine(String name) {
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine(String name, int ok) {
        System.out.println("Third constructor running!");
        this.ok = ok;
        this.name = name;
    }
}

//------------------------------------------------------------------
// 10. Static and Final
class Thing {
    public String name;
    public static String description;

    public void showName() {
        System.out.println(description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
        // System.out.println(name); - to nie zadziała bo nie ma static
    }
}


public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//------------------------------------------------------------------
        // 1.1 Pętla While
        System.out.println("While p.1");
        int value = 0;

        while (value < 10) {
            System.out.println("hello " + value);
            value = value + 1;
        }
//------------------------------------------------------------------
        // 1.2 Pętla for
        System.out.println("For p.1");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Hello I is: %d\n", i);
        }
//------------------------------------------------------------------
        // 1.3 Pętla while
        System.out.println("While p.2");
        int loop = 0;
        while (true) {
            System.out.println("Looping " + loop);

            if (loop == 5) {
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
        System.out.println("You entered: " + value1);
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

        while (value2 != 5);

        System.out.println("Got 5!");
//------------------------------------------------------------------
        // 4. Switch
        Scanner in2 = new Scanner(System.in);

        System.out.println("Please enter a command: ");

        String text = in2.nextLine();

        switch (text) {
            case "start":
                System.out.println("Machine started");
                break;

            case "stop":
                System.out.println("Machine stopped");
                break;

            default:
                System.out.println("Command not recognized");

        }
        //------------------------------------------------------------------
        // 4.1 Arrays

        int value3 = 7;

        int[] values;

        values = new int[3];

        System.out.println(values[0]);

        values[0]=10;
        values[1]=20;
        values[2]=30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5, 6, 7};

        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //------------------------------------------------------------------
        // 4.2 Arrays
        String[] words = new String[3];

        words[0]="Hello";
        words[1]="to";
        words[2]="you";

        System.out.println(words[2]);

        for (int i=0; i<words.length; i++) {
            System.out.println(words[i]);
        }

        String[] fruits= {"spple", "banana", "kiwi", "pear"};

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        int value4 = 0;

        String text2 = null;

        System.out.println(text2);

        String[] texts2 = new String[2];

        System.out.println(texts2[0]);
        //------------------------------------------------------------------
        // 4.3 Multi-Dimensional Arrays
        //		one dimension
        int[] values2 = {3, 5, 2343};
        System.out.println(values2[2]);

//		two dimension
        int[][] grid = {
                {3, 5, 2343},
                {2,4},
                {1,2,3,4}
        };

        System.out.println(grid[0][2]);
        System.out.println(grid[1][1]);

        String[][] text3 = new String[2][3];

        text3[0][1]="Hello there!";

        System.out.println(text3[0][1]);

        for(int row=0; row<grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");

            }

            System.out.println(); // nowa linia
        }

//			decydowanie samemu ile dany wiersz ma kolumn

            String[][] words2 = new String[2][0];

            words2[0] = new String[3];

            words2[0][1]="hi there";
            System.out.println(words2[0][1]);
        //------------------------------------------------------------------
        // 5. Klasy, obiekty i metody
        Person person1 = new Person();

        person1.name = "Joe Bloggs";
        person1.age = 47;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();

        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();

        System.out.println(person1.name);
//------------------------------------------------------------------
        // 6. Getters and Return Values

        Person2 person3 = new Person2();

        person3.name = "Joe";
        person3.age = 25;

        person3.speak();

        int years = person3.calculateYearsToRetirement();

        System.out.println("Years to retirement: " + years);

        int age = person3.getAge();

        String name = person3.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
//------------------------------------------------------------------
        // 7. Method parameters
        Robot sam = new Robot();
        sam.speak("Hi I'm Sam.");
        sam.jump(7);
        sam.move("West", 12.2);

        String greeting = "Hello there";
        sam.speak(greeting);

        int value5 = 14;
        sam.jump(value5);

        //------------------------------------------------------------------
        // 8. Setters and "this"
        Frog frog1 = new Frog();

//		frog1.name="Bertie";
//		frog1.age = 1;

        frog1.setName("Bartie");
        frog1.setAge(1);

        System.out.println(frog1.getAge());

        //------------------------------------------------------------------
        // 9. Constructors
        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Bertie", 3);

/*
class Machine {
	private String name;
	int ok;

	public Machine() {
		this("Arnie", 0);

		System.out.println("Constructor running!");
	}

	public Machine(String name) {
		this(name, 0);

		System.out.println("Second constructor running!");
		this.name = name;
	}

	public Machine(String name, int ok) {
		System.out.println("Third constructor running!");
		this.ok = ok;
		this.name = name;
	}
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Bertie");

		Machine machine3 = new Machine("Bertie", 3);

	}

}
*/
        //------------------------------------------------------------------
        // 10. Static and Final

        // Tak można się odwołąć ze static (nie tworzymy obiektu)
        Thing.description = "I'm thing";
        System.out.println(Thing.description);

        Thing.showInfo();

        // Poniżej trzeba utworzyć obiet bo nie ma static przy zmiennej w klasie

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();


    }
}
