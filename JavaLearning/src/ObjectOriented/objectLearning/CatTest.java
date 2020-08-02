package ObjectOriented.objectLearning;

/**
 * @author ONE
 *
 */
public class CatTest {

	public static void main(String[] args) {
		Cat one = new Cat();
//		Cat two = new Cat();
		Cat two = one;
		one.name = "狗子";
		one.month = 3;
		one.species = "英短";
		one.weight = 800;

		two.name = "兔子";
		two.month = 3;
		two.species = "加菲";
		two.weight = 1500;

		System.out.println("昵称: " + one.name);
		System.out.println("年龄: " + one.month);
		System.out.println("品种: " + one.species);
		System.out.println("体重: " + one.weight);
		System.out.println("-------------------------------------");

		System.out.println("昵称: " + two.name);
		System.out.println("年龄: " + two.month);
		System.out.println("品种: " + two.species);
		System.out.println("体重: " + two.weight);

	}

}
