import java.util.Random;

public class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;

        System.out.println("Roll #\tDie1\tDie2\tDie3");
        do
        {
           die1 = gen.nextInt(6) +1;
           die2 = gen.nextInt(6) +1;
           die3 = gen.nextInt(6) +1;
           dieRoll ++;
            System.out.printf("%4d\t%4d\t%4d%4d\n", dieRoll, die1, die2, die3);

        }while(!(die1==die2 && die2==die3));

    }
}
