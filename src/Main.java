public class Main {

//    num birthMonth
//    output “What month were you born in [1-12]? ”
//            if birthMonth = = 1 then
//    output “Your birth month is: January”
//            else if birthMonth = = 2 then
//    output “Your Birth Month is: February”
//            else if birthMonth = = 3 then
//    output “Your birth month is: March”
//            else if birthMonth = = 4 then
//    output “Your Birth Month is: April”
//            else if birthMonth = = 5 then
//    output “Your birth month is: May”
//            else if birthMonth = = 6 then
//    output “Your Birth Month is: June”
//            else if birthMonth = = 7 then
//    output “Your birth month is: July”
//            else if birthMonth = = 8 then
//    output “Your Birth Month is: August”
//            else if birthMonth = = 9 then
//    output “Your birth month is: September”
//            else if birthMonth = = 10 then
//    output “Your Birth Month is: October”
//            else if birthMonth = = 11 then
//    output “Your birth month is: November”
//            else if birthMonth = = 12 then
//    output “Your Birth Month is: December”
//            else
//    output “You entered an incorrect month value: ” + birthMonth
//            endIf

    public static void main(String[] args)
    {
	int birthMonth = 0;

    System.out.println("What month where you born in [1-12]?");
    birthMonth = 7; // user input
    System.out.println("The simulated birth month is " + birthMonth);

    if (birthMonth == 1)
    {
        System.out.println("You were born in January!");
    }
    else if (birthMonth == 2)
    {
        System.out.println("You were born in February!");
    }
    else if (birthMonth == 3)
    {
        System.out.println("You were born in March!");
    }
    else if (birthMonth == 4)
    {
        System.out.println("You were born in April!");
    }
    else if (birthMonth == 5)
    {
        System.out.println("You were born in May!");
    }
    else if (birthMonth == 6)
    {
        System.out.println("You were born in June!");
    }
    else if (birthMonth == 7)
    {
        System.out.println("You were born in July!");
    }
    else if (birthMonth == 8)
    {
        System.out.println("You were born in August!");
    }
    else if (birthMonth == 9)
    {
        System.out.println("You were born in September!");
    }
    else if (birthMonth == 10)
    {
        System.out.println("You were born in October!");
    }
    else if (birthMonth == 11)
    {
        System.out.println("You were born in November!");
    }
    else if (birthMonth == 12)
    {
        System.out.println("You were born in December!");
    }
    else
    {
        System.out.println("You entered an invalid month value: " + birthMonth);
    }
    }
}
