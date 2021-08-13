import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroApplication {
    // Function to add x in arr
    public static String[] addX(String heroArray[], String newHeroName) {
        // Create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));
        // Add the new element
        arrlist.add(newHeroName);
        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        // Return the array
        return heroArray;
    }

    // Function to remove a hero from an array
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);

        // return the array
        return heroArray;
    }

    public static void main(String[] args) {

        //  Create seven heroes as the objects and two Districts as the objects.

        Hero hero1 = new Hero("Marta", "Dice", "Superman", 12345, HeroType.Hero, 23);
        Hero hero2 = new Hero("Annija", "Pukite", "Batman", 124545, HeroType.Hero, 2);
        Hero hero4 = new Hero("Janis", "Ozolins", "Spiderman", 123568, HeroType.Villain, 7);
        Hero hero5 = new Hero("Ricards", "Berzins", "Hulk", 123778, HeroType.Villain, 72);
        Hero hero6 = new Hero("Egija", "Vanis", "Lemonman", 124568, HeroType.Hero, 23);
        Hero hero7 = new Hero("Peteris", "Calis", "Flowerman", 123558, HeroType.Hero, 33);
        Hero hero8 = new Hero("Baiba", "Sirds", "Heartman", 123338, HeroType.Villain, 11);
        Hero hero3 = new Hero();
        hero3.setName("Elina");
        hero3.setSurname("Dice");
        hero3.setNickname("IRonman");
        hero3.setHeroType(HeroType.Villain);
        hero3.setDeedTime(34);
        hero3.setHeroID(12345);

        ArrayList<Hero> heroesInTheDistrict1 = new ArrayList<Hero>();
        ArrayList<Hero> heroesInTheDistrict2 = new ArrayList<Hero>();
        District district1 = new District("Lauki", "Ergli", 124589, heroesInTheDistrict1);
        District district2 = new District("Pilseta", "Riga", 124568, heroesInTheDistrict2);

        district1.addNewHero(hero1);
        district1.addNewHero(hero2);
        district1.addNewHero(hero3);
        district2.addNewHero(hero4);
        district2.addNewHero(hero5);
        district2.addNewHero(hero6);
        district2.addNewHero(hero7);
        district2.addNewHero(hero8);

//        Print out all information about each District.
        System.out.println(district1.toString());
        System.out.println(district2.toString());

        Hero[] metropole = new Hero[3];
        metropole[0] = hero1;
        metropole[1] = hero2;
        metropole[2] = hero3;
        int counter = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " 1st level heroes.");

        int counter2 = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() > 1) {
                counter2++;
            }
        }
        System.out.println("There are " + counter2 + " other level heroes.");

        boolean isJohn = false;
        for (Hero hero : metropole) {
            if (hero.getName().matches("John")) {
                isJohn = true;
                break;
            }
        }
//        booleans are not compared to true/false
        if (isJohn) {
            System.out.println("Hero name is equal to John.");
        } else {
            System.out.println("Hero name is not equal to John.");
        }

//        VARIABLES
        String[] heroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};
        Double[] heroSalaries = {100.34d, 111.00d, 234.345d, 233.5d, 111.45d, 444.34d, 666.23d, 777.21d, 8765.65d, 453.09d, 123.23d};
        String[] heroCities = {"Dobele", "Rīga", "Cēsis", "Sigulda", "Ventspils", "Mālpils", "Jelgava", "Liepāja", "Ainaži", "Ogre", "Majori"};

        for (String hero : heroList) {
            System.out.println(hero);
        }

        showMenuEntry(heroList);
    }

    private static void showListOfHeroes(String[] heroList) {
        System.out.println("____________Superhero list ___________");
        for (String heroName : heroList) {
            System.out.println(heroName);
        }
        System.out.println("");
    }

    private static void addNewHero(Scanner scanner, String[] heroList) {
        System.out.println("Please enter a hero's name");
        String newHeroName = scanner.next().toString();
        heroList = addX(heroList, newHeroName);
    }

    private static void showSpecificHeroInformation(Scanner scanner, String[] heroList) {
//      Show different information based on selected superhero
        System.out.println("Which superhero information to print?");
        int superheroIndex = scanner.nextInt();
        String superHeroName = scanner.next();

        System.out.println("Hero name:" + heroList[superheroIndex]);

        String heroName;
        String heroCity;
        String heroPower1, heroPower2, heroPower3;
        Boolean isEvil;
        double heroSalary;
        String realName;
        String universe;

//Variable Assignment
        heroName = "Blossom";
        heroCity = "Aizkraukle";
        heroPower1 = "Nice person";
        heroPower2 = "Smiling";
        heroPower3 = "";
        isEvil = false;
        heroSalary = 155.45;
        realName = "Marta";
        universe = "Mars";

//Printout hero information card
        System.out.println("************");
        System.out.println("**** HERO INFORMATION ****");
        System.out.println("************");
        System.out.println("Hero Name:" + heroName);
        System.out.println("This hero lives in " + heroCity + ".");
        System.out.println("------------------");
        System.out.println("Hero Superpowers:");
        System.out.println("++++++" + heroPower1);
        System.out.println("++++++" + heroPower2);
        System.out.println("++++++" + heroPower3);
        System.out.println("This superhero is evil? " + isEvil);
        System.out.println("This hero earns " + heroSalary + " EUR.");
        System.out.println(realName + " hides her identitiy.");
        System.out.println("Hero lives in " + universe + " universe.");

        if (isEvil) {
            System.out.println("Hero is a villain. He is stealing cookies");
        } else {
            System.out.println("Hero protects the city!!");
        }

        heroCity = "Metropolis";
        switch (heroCity) {
            case "New York":
                heroSalary = 1000;
                break;
            case "Riga":
                heroSalary = 1200.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 100;

//        How many cookies superhero can purchase for her salary?
//        1 cookie costs 1.29

                System.out.println("***************************************");
                System.out.println("******************Financials***************");
                int numOfCookies = (int) Math.floor(heroSalary / 1.29);
                System.out.println("Hero can purchase " + numOfCookies + " cookies.");
                double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100;
                System.out.println("Hero average daily salary is " + averageDailySalary + " euro.");
        }
    }

    private static void removeHero(String[] heroList) {
        heroList = removeX(heroList, 0);
        for (String hero : heroList) {
            System.out.println(hero);
        }
    }

    private static void showMenuEntry (String[] heroList) {
        //      Business requirements for Lesson Nr.12
//      1.I would like to see a Menu to select different parts of superhero information card
//      2. A list of superheroes using Arrays
//      3. Add new superhero
//      4. Show specific superhero information
//      5. Delete a superhero from the list
//      6. Exit superheroes using Arrays
//      3. Add new superhero
//      4. Show specific superhero information
//      5. Delete a superhero from the list
//      6. Print about heroes
//      7. Exit

//      MENU
        int menuEntry;
        Scanner scanner = new Scanner(System.in);
        do {
//            EXIT ==0
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheroes!");
            System.out.println("2 - Add a new superhero!");
            System.out.println("3 - Show specific superhero information!");
            System.out.println("4 - Delete the superhero from the list!");
            System.out.println("0 - Exit!");
            menuEntry=scanner.nextInt();

            switch ( menuEntry) {
                case 1:
                    showListOfHeroes(heroList);
                    break;
                case 2:
                    addNewHero(scanner,heroList);
                    break;
                case 3:
                    showSpecificHeroInformation(scanner,heroList);
                    break;
                case 4:
                    removeHero(heroList);
                    break;
                default:
                    System.out.println("Menu item doesn't exist!");

            }
//      EXIT != 0;
        }while (menuEntry != 0);


    }
}
