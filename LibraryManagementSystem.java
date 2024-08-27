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
           switch (choice) 
