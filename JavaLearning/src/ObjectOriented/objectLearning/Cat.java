package ObjectOriented.objectLearning;

/**
 * @author ONE
 *
 */
public class Cat {
	
	//��������	
	String name;
	int month;
	double weight;
	String species;
	
	//�޲ι��췽��
	public Cat() {
		System.out.println("�޲ι��췽��");
	}
	
	//���ι��췽������һ�����εĹ��췽�����޷�ʹ��Ĭ�ϵ��޲ι��췽������Ҫ���¶���һ���޲ι��췽��
	public Cat(String name) {
		this.name = name;
	}
	
	//��Ա����
	public void run(){
		System.out.println("��");
	}
	
	public void run(String name ) {
		System.out.println(name + "��");
	}
	
	public void eat() {
		System.out.println("��");
	}

}
