package Assessment;

/**
 * Question3
 */
public class PersonClassVariant {

        String name;
        String ssn;
        int age;
    
        private void checkAge() {
            assert age >= 18 && age <= 150 : "Age must be between 18 and 150";
        }
    
        public void changeName(String fname) {
            checkAge();
            name = fname;
        }
    
        public static void main(String args[]) {
            PersonClassVariant person1 = new PersonClassVariant();
            person1.age = 1;
            person1.name = "dave";
            person1.changeName("David");
        }
    }
    
