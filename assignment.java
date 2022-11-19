package bank;

//import java.awt.image.PackedColorModel;
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {

        BankService b1 = new BankService();

        Scanner sc = new Scanner(System.in);






        do {
            System.out.println("enter your choice");
            System.out.println("1: Create acount");
            System.out.println("2: deposite amount");
            System.out.println("3: Withdraw amount");
            System.out.println("4: Check balance");

            System.out.println();
            System.out.println("Enter input");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("how many accounts you have to create");
                    int n = sc.nextInt();
                    for (int i= 0;i<n;i++ ) {
                        System.out.println("enter acc number");
                        int accno = sc.nextInt();

                        System.out.println("Enter name");
                        String name = sc.next();

                        System.out.println("Enter amount");
                        float amount = sc.nextFloat();
                        System.out.println(b1.createAcc(accno, name, amount));
                    }

                }
                 break;
                case 2: {
                    System.out.println("Welcome to withdraw section");
                    System.out.println("enter acc num");
                    int accno = sc.nextInt();

                    System.out.println("Enter amount");
                    float amount = sc.nextFloat();

                    System.out.println(b1.depositeAmm(accno,amount));
                    break;
                }
                case 3: {
                    System.out.println("Welcome to deposite section");
                    System.out.println("Enter accno");
                    int accno = sc.nextInt();

                    System.out.println("Enter amount");
                    float amount = sc.nextFloat();

                    System.out.println(b1.withdrawAmm(accno,amount));
                    break;
                }
                case 4: {
                    System.out.println("Welcome to check balance section");
                    System.out.println("Enter accno");
                    int accno = sc.nextInt();

                    System.out.println(b1.checkBal(accno));
                    break;
                }
                case 5: {
                    System.out.println("Invalid input");
                    break;
                }

            }

        } while (true);
    }
        }


