package week_7;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Person {
    String firstname, lastname;
    int age;
    private String firstName;

    public String getFirstname() {
        return firstName;
    }

    public String getlastname() {
        return lastname;

    }

    public int getAge() {
        return age;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;

        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;

        }
    }

    public String getFullName()
    {
        if(firstName.isEmpty())
        {
            return lastname;

        }
       if(lastname.isEmpty())
       {
           return firstName;
       }
       if(firstName.isEmpty() && lastname.isEmpty())
       {
           return"";


       }
else {
    return firstName+""+lastname;
       }
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("");//firstname is set to empty string
        person.setLastname("");//lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName="+person.getFullName());
        System.out.println("teen="+person.isTeen());
        person.setFirstName("John");//firstNmae is set to john
        person.setAge(18);
        System.out.println("fullName="+person.getFullName());
        System.out.println("teen="+person.isTeen());
        person.setLastname("Smith");//lastname is set to smith
        System.out.println("fullName="+person.getFullName());

    }
}


