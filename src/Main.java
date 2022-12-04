// 추상클래스와 인터페이스
class Main {
	public static void main(String[] args) {
		칼 a무기1 = new 칼();
		활 a무기2 = new 활();
		총 a무기3 = new 총();

		System.out.println("== 모든 무기 작동, 수동버전 ==");
		a무기1.작동();
		a무기2.작동();
		a무기3.작동();

		// 배열에 담기
		무기[] 무기들 = new 무기[3];
		무기들[0] = a무기1;
		무기들[1] = a무기2;
		무기들[2] = a무기3;

		System.out.println("== 모든 무기 작동, 자동버전 ==");
		for (int i = 0; i < 무기들.length; i++) {
			무기 a무기 = 무기들[i];
			a무기.작동();
		}
	}
}

// 단 1개라도 추상메서드를 가지는 클래스는 추상클래스로 만들어야 한다.
// abstract 키워드는 해당 클래스가 추상 클래스라는 뜻 이다.
// 추상클래스의 상위개념은 interface이다
// 순도 100%짜리 추상클래스를 interface로 사용한다
abstract class 무기 {
	// 추상메서드는 보통 이구간은 수정하지 마시오 라는 의미로도 사용된다
	abstract void 작동();

}

class 칼 extends 무기 {
	void 작동() {
		System.out.println("칼이 작동");
	}
}

class 활 extends 무기 {
	void 작동() {
		System.out.println("활 작동");
	}
}

class 총 extends 무기 {
	void 작동() {
		System.out.println("총 작동");
	}
}