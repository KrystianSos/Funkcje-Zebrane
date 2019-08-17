public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1.1 Pętla While
        System.out.println("While p.1");
        int value = 0;

        while(value < 10)
        {
            System.out.println("hello " + value );
            value = value + 1;
        }

        // 1.2 Pętla for
        System.out.println("For p.1");
        for(int i=0; i<5; i++)
        {
            System.out.printf("Hello I is: %d\n", i);
        }

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

    }
}
