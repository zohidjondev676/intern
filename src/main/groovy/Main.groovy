


public class ATMInterface {
  private static Scanner scanner = new Scanner(System.in);
  private static String userId = "1234";
  private static String userPin = "5678";
  private static  double totalAmount=70000;
  public static void main(String[] args) {
    System.out.println("Welcome to the ATM");

    System.out.print("Enter your user ID: ");
    String enteredUserId = scanner.nextLine();
    System.out.print("Enter your PIN: ");
    String enteredPin = scanner.nextLine();



  if (!authenticateUser(enteredUserId, enteredPin)) {
    System.out.println("Invalid user ID or PIN. Exiting...");
    return;
  } else {

    System.out.println("Login successful!");
  }

    while (true) {
      displayMenu();
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          System.out.println("Displaying transaction history...");
          println("user's userId "+userId+ " user's pinId "+userPin)
          break;
        case 2:

          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = scanner.nextDouble();
          scanner.nextLine();
          withdraw(withdrawAmount);
          break;
        case 3:

          System.out.print("Enter amount to deposit: ");
          double depositAmount = scanner.nextDouble();
          scanner.nextLine();
          deposit(depositAmount);
          break;
        case 4:

          System.out.print("Enter recipient's account number: ");
          String recipientAccount = scanner.nextLine();
          System.out.print("Enter amount to transfer: ");
          double transferAmount = scanner.nextDouble();
          scanner.nextLine();
          transfer(recipientAccount, transferAmount);
          break;
        case 5:

          System.out.println("Thank you for using the ATM. Goodbye!");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static boolean authenticateUser(String userId, String pin) {
    return userId.equals(ATMInterface.userId) && pin.equals(ATMInterface.userPin);
  }

  private static void displayMenu() {
    System.out.println("\nATM Menu:");
    System.out.println("1. Transactions History");
    System.out.println("2. Withdraw");
    System.out.println("3. Deposit");
    System.out.println("4. Transfer");
    System.out.println("5. Quit");
    System.out.print("Enter your choice: ");
  }

  private static void withdraw(double amount) {

    System.out.println(totalAmount-amount);
  }

  private static void deposit(double amount) {

    System.out.println( totalAmount+  amount);
  }

  private static void transfer( ) {
    println("Enter the user's cardId: ");
    String cardId=scanner.nextLine();

    println("Enter the amount of money: ");
    double amount=scanner.nextDouble();

    System.out.println("Transferred " + amount + " to  " + cardId);
  }
}
