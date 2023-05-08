public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson", 34, 180,73.5);
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2);
        Person Person03 = new Person("Paolo Cappuccini", 38, 171, 73);
        System.out.println("First person is: " + Person01.getName() + ", age is " + Person01.getAge() + " old, is " + Person01.getHeight() + " cm tall and it weights " + Person01.getWeight() + "kg.");
        Person01.growOlder();
        System.out.println("First person is: " + Person01.getName() + ", age is " + Person01.getAge() + " old, is " + Person01.getHeight() + " cm tall and it weights " + Person01.getWeight() + "kg.");
        System.out.println("Second person is: " + Person02.getName() + ", age is " + Person02.getAge() + " old, is " + Person02.getHeight() + " cm tall and it weights " + Person02.getWeight() + "kg.");
        Person01.growOlder();
        System.out.println("Second person is: " + Person02.getName() + ", age is " + Person02.getAge() + " old, is " + Person02.getHeight() + " cm tall and it weights " + Person02.getWeight() + "kg.");
        System.out.println("Third person is: " + Person03.getName() + ", age is " + Person03.getAge() + " old, is " + Person03.getHeight() + " cm tall and it weights " + Person03.getWeight() + "kg.");
        Person01.growOlder();
        System.out.println("Third person is: " + Person03.getName() + ", age is " + Person03.getAge() + " old, is " + Person03.getHeight() + " cm tall and it weights " + Person03.getWeight() + "kg.");

    }
}
