package TextInheritance02;

class Car {
	String carname;				// �� �̸�
	String color = "������";	// ��
	int velocity;

	void speedUp() { 			// �ӵ� �����ϴ�
		velocity += 5;
	}

	void speedDown() { 			// �ӵ� �����ϴ�
		velocity -= 5;
	}
}