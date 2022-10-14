public class finalandprivate {
    private String name;
    final  String value="hello";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }



    public static void main(String[] args) {
        finalandprivate test = new finalandprivate();
    test.setName("test");
    test.setName("test1");
        System.out.println(test.getName()+""+test.getValue());

    }
}
