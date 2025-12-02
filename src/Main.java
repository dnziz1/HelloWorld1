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
    int il = s;
    long l = il;

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
    boolean isEmpty = false;
    boolean output3 = isEmpty && false; //false
    boolean output4 = isEmpty || true; //true

    // Idempotent Law
    // p && p = p
    // p || p = p
    boolean isSame = true;
    boolean output5 = isSame && isSame; //true => same as isSame
    boolean output6 = isSame || isSame; //true

    // Complement Law
    // p && !p = false
    // p || !p = true
    boolean output7 = isSame && !isSame; //false
    boolean output8 = isSame || !isSame; //true

    // Double Negation Law
    // !!p = p
    boolean output9 = !!isSame;

    // Commutative Law
    // p && q = q && p
    // p || q = q && p
    boolean isGreen = true;
    boolean isBlue = false;
    boolean output10 = isGreen && isBlue; //false
    boolean output11 = isBlue && isGreen; //false
    boolean output12 = isBlue || isGreen; //true
    boolean output13 = isGreen || isBlue; //true

    // Associative Law
    // p && (q && r) = (p && q) && r
    // p || (q || r) = (p || q) || r
    boolean isRed = true;
    boolean output14 = isGreen && (isBlue && isRed);
    boolean output15 = (isGreen && isBlue) && isRed;
    boolean output16 = isGreen || (isBlue || isRed);
    boolean output17 = (isGreen || isBlue) || isRed;

    // Distributive Law
    // p && (q || r) = (p && q) || (p && r)
    // p || (q && r) = (p || q) && (p || r)
    boolean output18 = isGreen && (isBlue || isRed); //true
    boolean output19 = (isGreen && isBlue) || (isGreen && isRed); //true
    boolean output20 = isGreen || (isBlue && isRed); //true
    boolean output21 = (isGreen || isBlue) && (isGreen || isRed); //true

    // Absorption Law
    // p || (p && q) = p
    // p && (p || q) = p
    boolean output22 = isGreen || (isGreen && isBlue); //true
    boolean output23 = isGreen && (isGreen || isBlue); //true

    // De Morgan's Law
    // !(p && q) = !p || !q
    // !(p || q) = !p && !q
    boolean output24 = !(isGreen && isBlue); //true
    boolean output25 = !isGreen || !isBlue; //true

    String weekday = "Tuesday";
    weekday = weekday.toUpperCase();

    switch(weekday) {
        case "MONDAY":
            IO.println("Start of the week.");
            break;
        case "FRIDAY":
            IO.println("End of the week.");
            break;
        default:
            IO.println("Mid week");
    }

    String level = "1";

    switch (level) {
        case "1": IO.println("Level 1"); break;
        case "2": IO.println("Level 2"); break;

        default: IO.println("Not a level");
    }

    String role = "ADMIN";
    switch (role) {
        case "ADMIN": IO.println("I am da boss!");
        case "SUPERUSER": IO.println("I am da Database boss!");
        break;
        default: IO.println("Not a boss!");
    }

    String cmd = "stop";

    if (cmd)

    // Menu : 1. Dogs, 2. Cats, 3. Gerbils, 4. Goldfish ...
    String option = "1";

    switch (option) {
        case "1" -> IO.println("Dogs"); // Using the -> automatically has a break implied in the case, do not use this format unless on each case there is an automatic break
        case "2" -> IO.println("Cats");
        case "3" -> IO.println("Gerbils");
        case "4" -> IO.println("Goldfish");
        default -> IO.println("What the hell is that");
    }

    int score = 0;
    switch (score) {
        case 0,1,2,3,4 -> IO.println("Very low."); //Using the comma will get around the block being the same
        case 5,6,7,8,9 -> IO.println("Average");
        case 10 -> IO.println("High");
        default -> IO.println("Out of scope");
    }
    // for odd numbers
    for (int i = 1; i < 10; i+=2) {
        IO.println(i);
    }


    byte count = 0;
    boolean useLoop = true;
    while (useLoop) {
        IO.println("Currently using the loop");
        count++;
        if (count < 10)
            useLoop = true;
        else
            useLoop = false;
    }

    // do while
    Scanner reader = new Scanner(System.in);
    String choice;
    do {
        IO.println("""
            Menu
            Option 1:
            Option 2:
            ...
            """);
        IO.println("Enter your name: ");
        choice = reader.nextLine();
        // validate your reader.
    }
    while (choice.isBlank());


    for (int i = 0; i < 30; i++) {
        if (i % 5 == 0) continue; // continue checks the condition then ignores it and carries on
            IO.println("Found 5 at index " + i);

    }

    // infinite loop
    while (true) {
        IO.println("Hello World");
    }
    // break out using the run stop option in your ide
    // in a shell use ctrl + c

    // Infinite loop inside a for loop
    for (byte i = 0; i >= 0; i++) {
        IO.println(i);
    }


    //Arrays
//    int[] numbers = new int[10];
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//    int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

//    int[] numbers;
//    numbers = new int[1_000_000];
//    IO.println(numbers[100_456]);

//    for (int i = 0; i < numbers.length; i++) {
//        IO.println(i + " ");
//    }

    // Using copy creates a new instance of the array
    int[] copy = Arrays.copyOf(numbers, 10);
    for (int i = 0; i < copy.length; i++) {
        IO.print(copy[i] + " ");
    }
    IO.println();
    IO.print(copy.length);

    int[] copyRange = Arrays.copyOfRange(numbers, 1, 4);
    for (int i = 0; i < copyRange.length; i++) {
        IO.print(copyRange[i] + " ");
    }

    IO.println();

    int[] copyOfNumbers = numbers;
    for (int i = 0; i < copyOfNumbers.length; i++) {
        IO.print(copyOfNumbers[i] + " ");
    }

    // They use the same reference point thus numbers will have the same value at position 9
    copyOfNumbers[9] = 1000;
    IO.println(numbers[9] + " " + copyOfNumbers[9] + " " + copy[9]);

    int[] clonedArray = numbers.clone();
    clonedArray[9] = 1000;
    IO.println(numbers[9] + " " + clonedArray[9]);



    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    for(int numb : numbers) {
        IO.println(numb);
    }


    int[] numbers = new int[1_000_000];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i + 1;
    }

    binarySearch(numbers, 499_999);



    // Parallel Arrays
    String[] names = {"Max", "Bella", "Rocky"};
    int[] ages = {5,3,7};
    String[] types = {"Dog","Cat","Dog"};

    for (int i = 0; i < names.length; i++) {
        System.out.printf("The %s is called %s and is %d years old.\n", types[i], names[i], ages[i]);
    }

    int[][] grid = new int[3][10];
    grid[0][1] = 5;

    // Changes the format of the array (Jagged Array)
    grid[1] = new int[]{6, 7, 8};
    grid[2] = new int[]{1,2,3,4,5,6,7,8,9,10,11};
    IO.println(grid[0][1]);

    // Traditional for loop
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            IO.print(grid[i][j] + " ");
        }
        IO.println();
    }

    IO.println();

    // Enhanced for loop
    for (int[] row : grid) {
        for (int cell : row) {
            IO.print(cell + " ");
        }
        IO.println();
    }

    int[][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[5];
    jaggedArray[1] = new int[]{1,2,3,4};
    jaggedArray[2] = new int[1];

    for (int[] row : jaggedArray) {
        for (int cell : row) {
            IO.print(cell + " ");
        }
        IO.println();
    }
     */

    ArrayList<Integer> list = new ArrayList<>();
    list.add(45);
    list.add(56);
    list.add(3);
//    IO.println(list.get(0));

    for (int i = 0; i < list.size(); i++) {
        IO.println(list.get(i));
    }

//    ExtractSubstrings();
//    ValidateUserCommands();
//    ConvertNamesToUpperCase();
//    CheckContentEquality();
}

public static int binarySearch(int[] arr, int target){

    int left = 0;
    int right = arr.length - 1;
    int count = 0;

    while (left <= right) {
        count++;
        IO.print(" " + count);
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return -1;
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



