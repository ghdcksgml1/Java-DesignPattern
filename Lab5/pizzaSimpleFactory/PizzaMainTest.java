package pizzaSimpleFactory;

public class PizzaMainTest {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName());
		System.out.println(pizza);
		System.out.println();

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName());
		System.out.println(pizza);

	}

}
