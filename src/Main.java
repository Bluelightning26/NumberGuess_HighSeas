import java.util.Scanner;

class NumberGuess
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       //end if true
       boolean showSystemProperties = false;

       //Welcome

        System.out.println("\nWelcome " + System.getProperty("user.name") + "!\n"); //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
       // System.out.println("\nWelcome! \n"); //USED IN VIDEO FOR PRIVACY - Del this for actual use
        System.out.println("""
                This is a number guessing game\s
                
                \
                Your objective is to guess the right number in three tries""");
        System.out.println("__________");
        System.out.println();

        //difficulty selector
        System.out.println("Please select your difficulty");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        byte level = sc.nextByte();
        System.out.println("\n\n");

        //difficulties
        //easy level (numbers 0-10

        if (level == 1)
        {

            System.out.println("Easy Difficulty Selected!");
            System.out.println("__________");
            System.out.println();

            //Randomizer
            byte randomNum = (byte) (Math.random() * 11);
            //DEBUG CODE System.out.print(randomNum + " ");

            byte attempt = 1;

            //Input 1
            if (attempt == 1)
            {

                System.out.print("Please Type in your first guess (0-10): ");
                byte guess1 = sc.nextByte();

                //Guess Correct
                if (guess1 == randomNum) level = 127;

                //Guess Less Than Correct
                if (guess1 < randomNum)
                {
                    System.out.println("Guess Higher!");
                    System.out.println();
                    attempt = 2;
                }

                //Guess More Than Correct
                if (guess1 > randomNum)
                {
                    System.out.println("Guess Lower!");
                    System.out.println();
                    attempt = 2;
                }
            }

            //Input Two
            if (attempt == 2)
            {
                System.out.print("Please Type in your second guess (0-10): ");
                byte guess2 = sc.nextByte();

                //Guess Correct
                if (guess2 == randomNum) level = 127;

                //Guess Less Than Correct
                if (guess2 < randomNum)
                {
                    System.out.println("Guess Higher!");
                    System.out.println();
                    attempt = 3;
                }

                //Guess More Than Correct
                if (guess2 > randomNum)
                {
                    System.out.println("Guess Lower!");
                    System.out.println();
                    attempt = 3;
                }

                //Input Three
                if (attempt == 3)
                {
                    System.out.print("Please Type in your third and final guess (0-10): ");
                    byte guess3 = sc.nextByte();

                    //Guess Correct
                    if (guess3 == randomNum) level = 127;

                    //Guess Less Than Correct
                    if (guess3 < randomNum)
                    {
                        System.out.println("Should've Guessed Higher!");
                        System.out.println();
                        attempt = 4;
                    }

                    //Guess More Than Correct
                    if (guess3 > randomNum)
                    {
                        System.out.println("Should've Guessed Lower!");
                        System.out.println();
                        attempt = 4;
                    }

                    //No Correct Guesses
                    if (attempt == 4)
                    {
                        System.out.println();
                        System.out.println();
                        System.out.println("The random number wasn't guessed");
                        System.out.println("This time the number was " + randomNum + "!");

                        //End
                        showSystemProperties = true;
                    }
                }
            }
        }

        //Medium Level (Numbers 0-20)
        if (level == 2)
        {

            System.out.println("Medium Difficulty Selected!");
            System.out.println("__________");
            System.out.println();

            //Randomizer
            byte randomNum = (byte) (Math.random() * 21);
            //DEBUG CODE System.out.print(randomNum + " ");

            byte attempt = 1;

            //Input 1
            if (attempt == 1)
            {

                System.out.print("Please Type in your first guess (0-20): ");
                byte guess1 = sc.nextByte();

                //Guess Correct
                if (guess1 == randomNum) level = 127;

                //Guess Less Than Correct
                if (guess1 < randomNum)
                {
                    System.out.println("Guess Higher!");
                    System.out.println();
                    attempt = 2;
                }

                //Guess More Than Correct
                if (guess1 > randomNum)
                {
                    System.out.println("Guess Lower!");
                    System.out.println();
                    attempt = 2;
                }
            }

            //Input Two
            if (attempt == 2)
            {
                System.out.print("Please Type in your second guess (0-20): ");
                byte guess2 = sc.nextByte();

                //Guess Correct
                if (guess2 == randomNum) level = 127;

                //Guess Less Than Correct
                if (guess2 < randomNum)
                {
                    System.out.println("Guess Higher!");
                    System.out.println();
                    attempt = 3;
                }

                //Guess More Than Correct
                if (guess2 > randomNum)
                {
                    System.out.println("Guess Lower!");
                    System.out.println();
                    attempt = 3;
                }

                //Input Three
                if (attempt == 3)
                {
                    System.out.print("Please Type in your third and final guess (0-20): ");
                    byte guess3 = sc.nextByte();

                    //Guess Correct
                    if (guess3 == randomNum) level = 127;

                    //Guess Less Than Correct
                    if (guess3 < randomNum)
                    {
                        System.out.println("Should've Guessed Higher!");
                        System.out.println();
                        attempt = 4;
                    }

                    //Guess More Than Correct
                    if (guess3 > randomNum)
                    {
                        System.out.println("Should've Guessed Lower!");
                        System.out.println();
                        attempt = 4;
                    }

                    //No Correct Guesses
                    if (attempt == 4)
                    {
                        System.out.println();
                        System.out.println();
                        System.out.println("The random number wasn't guessed");
                        System.out.println("This time the number was " + randomNum + "!");

                        //End
                        showSystemProperties = true;
                    }
                }
            }
        }

        //Hard Level (Numbers 0-30)
        if (level == 3)
        {

            System.out.println("Hard Difficulty Selected!");
            System.out.println("__________");
            System.out.println();

            //Randomizer
            byte randomNum = (byte) (Math.random() * 31);
            //DEBUG CODE System.out.print(randomNum + " ");

            byte attempt = 1;

            //Input 1
            if (attempt == 1)
            {

                System.out.print("Please Type in your first guess (0-30): ");
                byte guess1 = sc.nextByte();

                //Guess Correct
                if (guess1 == randomNum) level = 127;

                //Guess Less Than Correct
                if (guess1 < randomNum)
                {
                    System.out.println("Guess Higher!");
                    System.out.println();
                    attempt = 2;
                }

                //Guess More Than Correct
                if (guess1 > randomNum)
                {
                    System.out.println("Guess Lower!");
                    System.out.println();
                    attempt = 2;
                }
            }

            //Input Two
            if (attempt == 2)
            {
                System.out.print("Please Type in your second guess (0-30): ");
                byte guess2 = sc.nextByte();

                //Guess Correct
                if (guess2 == randomNum) level = 127;

                //Guess Less Than Correct
                if (guess2 < randomNum)
                {
                    System.out.println("Guess Higher!");
                    System.out.println();
                    attempt = 3;
                }

                //Guess More Than Correct
                if (guess2 > randomNum)
                {
                    System.out.println("Guess Lower!");
                    System.out.println();
                    attempt = 3;
                }

                //Input Three
                if (attempt == 3)
                {
                    System.out.print("Please Type in your third and final guess (0-30): ");
                    byte guess3 = sc.nextByte();

                    //Guess Correct
                    if (guess3 == randomNum) level = 127;

                    //Guess Less Than Correct
                    if (guess3 < randomNum)
                    {
                        System.out.println("Should've Guessed Higher!");
                        System.out.println();
                        attempt = 4;
                    }

                    //Guess More Than Correct
                    if (guess3 > randomNum)
                    {
                        System.out.println("Should've Guessed Lower!");
                        System.out.println();
                        attempt = 4;
                    }

                    //No Correct Guesses
                    if (attempt == 4)
                    {
                        System.out.println();
                        System.out.println();
                        System.out.println("The random number wasn't guessed");
                        System.out.println("This time the number was " + randomNum + "!");

                        //End
                        showSystemProperties = true;
                    }
                }
            }
        }

        if (level == 127)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            //System.out.println("Congratulations!"); //USED IN VIDEO FOR PRIVACY - Del this for actual use
            System.out.println("Congratulations " + System.getProperty("user.name")); //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.println("You guessed the right number!");

            //End
            showSystemProperties = true;
        }

        //Incorrect difficulty selected by user
        if (level !=1 && level !=2 && level !=3 && level !=127)
        {

            System.out.println();
            System.out.println("Not a valid difficulty type");
            System.out.println();
            System.out.println("ERROR");
            System.out.println("Please Enter a number between 1 and 3");
            System.out.println();

            //End
            showSystemProperties = true;
        }

        // System Properties
        if (showSystemProperties)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name")); //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu!");
            System.out.println ("Coded for Hack Club High Seas (November 26 2024)");
        }


    }
}