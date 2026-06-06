public class LibrarayInterfaceDemo {
    interface LibraryUser {
        void registerAccount();
//interface method is by default , public , abstract 
        void registerBook();
    }

   static class KidUser implements LibraryUser {
        int age;
        String bookType;

        public void registerAccount() {
            if (age < 12) {
                System.out.println("You have successfully registered under a Kids Account");
            } else {
                System.out.println("Sorry, Age must be less than 12 to register as a kid");
            }
        }

        public void registerBook() {
            if (bookType.compareTo("Kids") == 0) {
                System.out.println("Book Issued successfully, please return the book within 10 days");
            } else {
                System.out.println("Oops, you are allowed to take only kids books");
            }
        }
    }
     static class AdultUser implements LibraryUser {
        int age;
        String bookType;

            public  void registerAccount() {
            if (age > 12) {
                System.out.println("You have successfully registered under an Adult Account");
            } else {
                System.out.println("Sorry, Age must be greater than 12 to register as an adult");
            }
        }

        public void registerBook() {
            if (bookType.compareTo("Fiction") == 0) {
                System.out.println("Book Issued successfully, please return the book within 7 days");
            } else {
                System.out.println("Oops, you are allowed to take only adult Fiction books");
            }
        }
    }
    public static void main(String[] args) {
        KidUser p1 = new KidUser();
        KidUser p2 = new KidUser();
        p1.age = 10;
        p2.age = 18;
        p1.registerAccount();
        p2.registerAccount();
        p1.bookType = "Kids";
        p2.bookType = "Fiction";
        p1.registerBook();
        p2.registerBook();

        System.out.println();
        
        AdultUser p3 = new AdultUser();
        AdultUser p4 = new AdultUser();
        p3.age = 5;
        p4.age = 23;
        p3.registerAccount();
        p4.registerAccount();
        p3.bookType = "Kids";
        p4.bookType = "Fiction";
        p3.registerBook();
        p4.registerBook();
    }
    
}
