class Employee {
   public String pancardNumber;

    public Employee(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }

    public void setPancardNumber(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }
}

/*
public class ImmutableDemo {
    public static void main(String ar[]) {
        Employee e = new Employee("ABC123");
        e.setPancardNumber("hellow");
        e.setPancardNumber("oooo");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}*/
