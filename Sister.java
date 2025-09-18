package ch3;

 //자식클래스
public class Sister extends Parents {

	
	
    // 필드
    double field3;

    // 생성자
    public Sister () {}

    public Sister(int field1, String field2, double field3) {
    	super(field1, field2);
        this.field3 = field3;
    }

	//method2() 자매 메서드
    @Override
    public void method2() {
        System.out.println("자매 메서드2");
    }

    public void method3() {
        System.out.println("자매 메서드3");
        

    }
}
	
	
		
		
	
}
