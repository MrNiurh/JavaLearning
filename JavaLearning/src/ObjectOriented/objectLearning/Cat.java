package ObjectOriented.objectLearning;

/**
 * @author ONE
 *
 */
public class Cat {
	
	//各种属性	
	String name;
	int month;
	double weight;
	String species;
	
	//无参构造方法
	public Cat() {
		System.out.println("无参构造方法");
	}
	
	//带参构造方法
	public Cat(String name) {
		this.name = name;
	}
	
	//成员方法
	public void run(){
		System.out.println("跑");
	}
	
	public void run(String name ) {
		System.out.println(name + "跑");
	}
	
	public void eat() {
		System.out.println("吃");
	}

}
