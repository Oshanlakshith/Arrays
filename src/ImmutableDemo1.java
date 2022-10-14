public class ImmutableDemo1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Hellow");
        String pancardNumber = employee1.getPancardNumber();
        employee1.pancardNumber="123";
        System.out.println(pancardNumber);

    }
}
