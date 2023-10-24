package homeworkweek7;

public class Program_14Person {

        String FirstName;
        String LastName;

        int age = 10;

        public String getFirstName() {//instance method no parameters return first name
                return FirstName;
        }

        public String getLastName() {//instance method no parameters return lastname
                return LastName;
        }

        public int getAge() {//instance method no parameters return age
                return age;
        }

        public void setFirstName(String FirstName) {//instance method one parameter setting firstname
                this.FirstName = FirstName;
        }

        public void setLastName(String LastName) {//instance method-one parameter-set lastname
                this.LastName = LastName;
        }

        public void setAge(int age) {//instance method-one parameter
                if (age > 0 && age <= 100) {
                        this.age = age;
                } else {
                        this.age = 0;
                }
        }



        public boolean isTeen(int teen) {//instance method one parameter return true or false
                        if (age>12 && age <20){
                                return true;
                        }else {
                                return false;
                        }
                        }
                        public String getFullName(){//instance method no parameter
                        if (FirstName.isEmpty()&& LastName.isEmpty()){
                                return "" ;
                        }else {
                                return FirstName + " " + LastName;
                        }
                }

                public static void main(String[] args) {
                Program_14Person  person = new Program_14Person();
                person.setFirstName("");//firstname is set to empty string
                person.setLastName("");// Lastname is set to empty string
                person.setAge(10);
               // System.out.println("fullName =" + person.(getFullName));
                //System.out.println("teen=" + person.isTeen());
                person.setLastName("Smith");//lastName is set to Smith
                System.out.println("fullName=" + person.getFullName());

        }
        }





