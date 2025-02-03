package Chapter6.Question5;

public class CoffeeTest {
    public static void main(String[] args) {
        Customer kim = new Customer(5000, "김씨");
        Customer lee = new Customer(10000, "이씨");

        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffe = new BeanCoffee();

        kim.buyCoffee(starCoffee, 4000);
        starCoffee.showInfo();
        kim.showInfo();

        System.out.println("-------------------");

        lee.buyCoffee(beanCoffe, 4500);
        beanCoffe.showInfo();
        lee.showInfo();
    }
}
