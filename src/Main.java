void main() {
    IO.println("Hello World!");
    IO.println("Hello Daniel");
    String name = "dan"; // is not a datatype but an object
    int age = 12;
    byte smallNumber = (byte) -129;
    short shortValue = 3000;
    int number = 100_000;
    long distance = 500_000_000_000l;

    float temp = 36.6f;
    double pi = 3.141592654;

    char grade = 'A';
    boolean isActive = true; //false
    IO.println();

    Byte smallNumberW = Byte.MAX_VALUE;
    byte maxNumber = Byte.MAX_VALUE;

    float maxDec = Float.MAX_VALUE;

    IO.println(smallNumberW);
    IO.println(maxNumber);

    IO.println(maxDec);

    int x = 20;
    Integer boxed = x; // autoboxing

    Integer y = 25;
    int unboxed = y; // unboxing

    Integer w = null; // primitive does not accept null values so we use wrapper

    int primitiveValue = 8;
    Integer wrapperValue = primitiveValue;

    byte b = 120;
    short s = b;
    int i = s;
    long l = i;

    long ls = 64_000; //
    short iq = (short)ls;
    IO.println(ls);
    IO.println(iq);

    int k = (int) 1_000_000_000_000l; // uninitialised
    IO.println(k);

    String caveman1 = "Fred Flintstone"; // They point to the same object inside the heap
    String caveman2 = "Fred Flintstone";

    IO.println(caveman1);
    caveman1 = "Wilma Flintstone";
    String caveman3 = "Wilma Flintstone";
    IO.println(caveman1);

    String customer = "Alice";
    byte positionInQueue = 5;
    float debt = 100.00f;
    byte percentage = 30;

    IO.println("Hello " + customer + ", you are number " + positionInQueue + " on my list");

    // Using a filler %
    String formattedText = String.format("Hello %s you are number %d on my list! You owe us £%.2f, you have paid %d%%", customer, positionInQueue, debt, percentage);

    IO.println(formattedText);
    System.out.printf("Hello %s you are number %d on my list! You owe us £%.2f, you have paid %d%%\n", customer, positionInQueue, debt, percentage);

    IO.println(String.format("[%10s]", "cat")); // Padding to the left
    IO.println(String.format("[%-10s]", "dog")); // Padding to the right
    IO.println(String.format("%d%%", 10)); // Using a double percentage sign to add it to the string

    String multiline = """
            Hello
            World
            """;
    IO.println(multiline);
/*
    Scanner reader = new Scanner(System.in);
    IO.print("What is your name: ");
    String yourName = reader.nextLine();
    IO.print("What is your age: ");
    byte yourAge = reader.nextByte();
    yourAge++;
    System.out.printf("Your name is %s and you will be %d years old next year", yourName, yourAge);
*/
    Short type1 = 128;
    Short type2 = 128;
    IO.println(type1 == type2); // Why is it true at 127 and false at 128?

    ExtractSubstrings();
    ValidateUserCommands();
    ConvertNamesToUpperCase();
    CheckContentEquality();
}

private void ExtractSubstrings() {
    String fullName = "Daniel Nkurunziza";

    // Getting the first name of full name using substring
    IO.println("Your first name is " + fullName.substring(0,7));
    // Removing the first name of full name using substring
    IO.println("Your last name is " + fullName.substring(7));
}

private void ValidateUserCommands() {
    
}

private void ConvertNamesToUpperCase() {
    String firstName = "Daniel";
    String middleName = "Clu"; // Not my middle name
    String lastName = "Nkurunziza";

    System.out.printf("\nThe first name %s and last name %s are uppercase. Middle name %s is not.", firstName.toUpperCase(), lastName.toUpperCase(), middleName);
}

private void CheckContentEquality() {
}



