package com.basicsBank;

import java.util.Scanner;

public class BankingSystemApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        BankingService service = new BankingServiceImpl();

	        while (true) {
	            System.out.println("\n--- Banking System ---");
	            System.out.println("1. Add Customer");
	            System.out.println("2. Add Account");
	            System.out.println("3. Add Beneficiary");
	            System.out.println("4. Add Transaction");
	            System.out.println("5. Find Customer by ID");
	            System.out.println("6. List Accounts by Customer");
	            System.out.println("7. List Transactions by Account");
	            System.out.println("8. List Beneficiaries by Customer");
	            System.out.println("9. Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.print("Customer ID: ");
	                    int cid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Address: ");
	                    String addr = sc.nextLine();
	                    System.out.print("Contact: ");
	                    String contact = sc.nextLine();
	                    service.addCustomer(new Customer(cid, name, addr, contact));
	                    break;

	                case 2:
	                    System.out.print("Account ID: ");
	                    int aid = sc.nextInt();
	                    System.out.print("Customer ID: ");
	                    int accCid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Account Type: ");
	                    String type = sc.nextLine();
	                    System.out.print("Balance: ");
	                    double bal = sc.nextDouble();
	                    service.addAccount(new Account(aid, accCid, type, bal));
	                    break;

	                case 3:
	                    System.out.print("Beneficiary ID: ");
	                    int bid = sc.nextInt();
	                    System.out.print("Customer ID: ");
	                    int bcid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Name: ");
	                    String bname = sc.nextLine();
	                    System.out.print("Account Number: ");
	                    String accNum = sc.nextLine();
	                    System.out.print("Bank Details: ");
	                    String bank = sc.nextLine();
	                    service.addBeneficiary(new Beneficiary( bid, bcid, bname, accNum, bank));
	                    break;

	                case 4:
	                    System.out.print("Account ID: ");
	                    int taccid= sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Type (Deposit/Withdrawal): ");
	                    String ttype = sc.nextLine();
	                    System.out.print("Amount: ");
	                    double amt = sc.nextDouble();
	                    
	                    service.addTransaction(new Transaction(taccid,ttype,amt));
	                    break;

	                case 5:
	                    System.out.print("Customer ID: ");
	                    int fid = sc.nextInt();
	                    System.out.println(service.findCustomerById(fid));
	                    break;

	                case 6:
	                    System.out.print("Customer ID: ");
	                    int cacc = sc.nextInt();
	                    for (Account acc : service.getAccountsByCustomerId(cacc))
	                        System.out.println(acc);
	                    break;

	                case 7:
	                    System.out.print("Account ID: ");
	                    int accId = sc.nextInt();
	                    for (Transaction t : service.getTransactionsByAccountId(accId))
	                        System.out.println(t);
	                    break;

	                case 8:
	                    System.out.print("Customer ID: ");
	                    int bcid2 = sc.nextInt();
	                    for (Beneficiary b : service.getBeneficiariesByCustomerId(bcid2))
	                        System.out.println(b);
	                    break;

	                case 9:
	                    System.out.println("Thank you!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }

	}


