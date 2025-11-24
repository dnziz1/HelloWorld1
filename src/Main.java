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
//    IO.println(type1 == type2); // Why is it true at 127 and false at 128?

//    long longNum = 100;
//    int num = (int)longNum;

    /*
    int numInt1 = 2;
    short numShort2 = 3;
    float result= (float)numInt1 / numShort2;

    long numLong3 = 342_934_092l;
    float pi3 = 3.999999999999999999999999999999f;
    double result1 = numInt1 + pi3;
    IO.println(result1);


    double price = 1.49; // litre price for petrol
    int capacity = 20; // in litres
    double totalCostToFillTankFromEmpty = capacity * price;
    IO.println(totalCostToFillTankFromEmpty);


    char letter = 'D';
    int giveMeTheNum = (int)letter;
    IO.println(giveMeTheNum);

    int letterValue = 97;
    char giveMeTheCharacter = (char)letterValue;
    IO.println(giveMeTheCharacter);

    char digit = '7';
    int value = digit - '0';
    IO.println(value);

    char newLetter = (char)(letter + 32);
    IO.println(newLetter);


    final float VAT_RATE = 0.20f;


    int quantity = 1_000; // literals
    int total = quantity * 5; // expression
    IO.println(quantity);

    byte b1 = 1;
    byte b2 = b1;
    IO.println(b2);




    byte age1 = 14;
    if (age1 >= 16)
        IO.println("Can vote!");
    else if (age1 == 15)
        IO.println("Can't vote, can next year!");
    else
        IO.println("Not eligible for voting at the moment!");


    final short SCORE = 160;

    if (SCORE >= 150) {
        IO.println("You're a genuis!");
    }



    String user = "Admin";
    String pwd = "Password";

    String userInput = "admin";
    String userPassword = new String("Password");

    if (user.toLowerCase().equals(userInput.toLowerCase()) && (pwd.equals(userPassword))) {
        IO.println("Both matches");
//        if (!(pwd == userPassword)) {
//            IO.println("Password doesn't match");
//        }
    }



    int age1 = 18;
    boolean isMember = false;

    if (age1 >= 18) {
        if (isMember) {
            IO.println("Eligible for member perks");
        } else {
            IO.println("Not a member, but meets age restriction.");
        }
    } else {
        IO.println("Too young to be a member.");
    }

     */

    // AND
    byte age1 = 19;
    boolean isAdult = age1 >= 18;
    boolean hasID = true;
    boolean canEnter = isAdult && hasID;

    // NAND
    boolean p = true;
    boolean q = false;
    boolean result = !(p && q);

    // OR
    boolean isAdmin = true;
    boolean isEditor = false;
    boolean canModify = isAdmin || isEditor;

    // NOR
    p = false;
    q = false;
    result = !(p || q);

    // BUFFER
    p = false;
    result = p;

    // NOT
    result = !p;

    // XOR
    p = false;
    q = false;
    result = p ^ q;

    // XNOR
    p = true;
    q = false;
    result = !(p ^ q);

//    true  ^ true  = false
//    true  ^ false = true
//    false ^ true  = true
//    false ^ false = false

    // Boolean algebra

    // Identity Law
    // p && true => p
    // p || false => p
    boolean isEnabled = true;
    boolean output1 = isEnabled && true; //true ## boolean output1 = isEnabled;
    boolean output2 = isEnabled || false; //true ## boolean output2 = isEnabled;

    // Null (Domination) Law
    // p && false => false
    // p || true => true

    // Idempotent Law
    // p && p = p
    // p || p = p

    // Complement Law
    // p && !p = false
    // p || !p = true

    // Double Negation Law
    // !!p = p

    // Commutative Law
    // p && q = q && p
    // p || q = q && p

    // Associative Law
    // p && (q && r) = (p && q) && r
    // p || (q || r) = (p || q) || r

    // Distributive Law
    // p && (q || r) = (p && q) || (p && r)
    // p || (q && r) = (p || q) && (p || r)

    // Absorption Law
    // p || (p && q) = p
    // p && (p || q) = p

    // De Morgan's Law
    // !(p && q) = !p || !q
    // !(p || q) = !p && !q

//    ExtractSubstrings();
//    ValidateUserCommands();
//    ConvertNamesToUpperCase();
//    CheckContentEquality();
}

private void ExtractSubstrings() {
    String fullName = "Daniel Nkurunziza";

    // Getting the first name of full name using substring
    IO.println("Your first name is " + fullName.substring(0,7));
    // Removing the first name of full name using substring
    IO.println("Your last name is " + fullName.substring(7));
}

private void ValidateUserCommands() {
    Scanner reader = new Scanner(System.in);
    IO.println("Who is the owner of this repository?");
    String ownerValidation = reader.nextLine().trim(); // Remove spaces after and before

    if (ownerValidation.equals("Daniel"))
        IO.println("Correct!");
    else
        IO.println("Wrong, bye-bye :(");
}

private void ConvertNamesToUpperCase() {
    String firstName = "Daniel";
    String middleName = "Clu"; // Not my middle name
    String lastName = "Nkurunziza";

    System.out.printf("\nThe first name %s and last name %s are uppercase. Middle name %s is not.\n", firstName.toUpperCase(), lastName.toUpperCase(), middleName);
}

private void CheckContentEquality() {
    String firstName1 = "Daniel";
    String firstName2 = "Daniel";
    String firstName3 = "Daniel ";

    IO.println(firstName1 == firstName2); // true
    IO.println(firstName1.equals(firstName2)); // true
    IO.println(firstName1 == firstName3); // false
    IO.println((firstName1.substring(0,3) + firstName3.substring(3,6)) == firstName2); // false
    IO.println((firstName1.substring(0,3) + firstName3.substring(3,6)).equals(firstName2)); // true
}



