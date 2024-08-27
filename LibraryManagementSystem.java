public static void main(String[] args) {
       LibraryManagementSystem library = new LibraryManagementSystem();
       Scanner scanner = new Scanner(System.in);
       boolean running = true;
       while (running) {
           System.out.println("Library Management System:");
           System.out.println("1. Add Book");
           System.out.println("2. Remove Book");
           System.out.println("3. Search Book");
           System.out.println("4. Display Total Books");
           System.out.println("5. Exit");
           System.out.print("Choose an option: ");
           int choice = scanner.nextInt();
           scanner.nextLine();  // Consume newline
           switch (choice) {
               case 1:
                   System.out.print("Enter title: ");
                   String title = scanner.nextLine();
                   System.out.print("Enter author: ");
                   String author = scanner.nextLine();
                   System.out.print("Enter ISBN: ");
                   String isbn = scanner.nextLine();
                   library.addBook(title, author, isbn);
                   break;
               case 2:
                   System.out.print("Enter index of the book to remove: ");
                   int removeIndex = scanner.nextInt();
                   library.removeBook(removeIndex);
                   break;
               case 3:
                   System.out.print("Enter index of the book to search: ");
                   int searchIndex = scanner.nextInt();
                   library.searchBook(searchIndex);
                   break;
               case 4:
                   library.displayTotalBooks();
                   break;
               case 5:
                   running = false;
                   break;
               default:
                   System.out.println("Invalid option. Please try again.");
                   break;
           }
       }
       scanner.close();
   }
}
