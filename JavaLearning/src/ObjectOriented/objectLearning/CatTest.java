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
		one.name = "����";
		one.month = 3;
		one.species = "Ӣ��";
		one.weight = 800;

		two.name = "����";
		two.month = 3;
		two.species = "�ӷ�";
		two.weight = 1500;

		System.out.println("�ǳ�: " + one.name);
		System.out.println("����: " + one.month);
		System.out.println("Ʒ��: " + one.species);
		System.out.println("����: " + one.weight);
		System.out.println("-------------------------------------");

		System.out.println("�ǳ�: " + two.name);
		System.out.println("����: " + two.month);
		System.out.println("Ʒ��: " + two.species);
		System.out.println("����: " + two.weight);

	}

}
