package variable;

public class Study1Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 12;
		System.out.println(apple);
		int year = 2025;
		System.out.println(year);
		int money = -1000;
		System.out.println(money);
		double length = 9.8;
		System.out.println(length);
		double score = 88.5;
		System.out.println(score);
		double minusValue = -4.6;
		System.out.println(minusValue);
		String food = "떡볶이";
		System.out.println(food);
		String city = "서울";
		System.out.println(city);
		String hobby = "코딩";
		System.out.println(hobby);
		boolean hascar = false;
		System.out.println(hascar);
		boolean isStudent = true;
		System.out.println(isStudent);
		boolean isWeekend = false;
		System.out.println(isWeekend);
		
		//int a=10, b=3;
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);
		//System.out.println(a%b);
		
		int sum = 12 + 8;
		System.out.println(sum);
		
		int total = 20 / 3;
		System.out.println(total);
		
		int mod = 14 % 5;
		System.out.println(mod);
		
		int exam1 = 5 % 5;
		System.out.println(exam1);
		// 5나누기 5는 1로 나머지 없이 딱 떨어지기 때문이다
		
		int exam2 = 5 % 4;
		System.out.println(exam2);
		// 5나누기 4는 몫은 1, 나머지는 1로 1이 된다

		int exam3 = 5 % 3;
		System.out.println(exam3);
		// 5나누기 3은 몫은 1, 나머지는 2로 2가 된다
		
		int exam4 = 5 % 2;
		System.out.println(exam4);
		// 5나누기 2는 몫은 2, 나머지는 1로 1이 된다
		
		int exam5 = 5 % 1;
		System.out.println(exam5);
		// 5나누기 1은 5로 나머지가 없기에 0이 된다
		
		int exam6 = 5 % 7;
		System.out.println(exam6);
		// 5나누기 7은 나눠지지 않기에 그냥 몫 5를 그대로 가져간다
		
		//int exam7 = 5 % 0;
		//System.out.println(exam7);
		// 5나누기 0은 오류가 난다
		
		boolean result1 = ( 15 > 20 );
		System.out.println(result1);
		
		boolean result2 = ( 10 == 10 );
		System.out.println(result2);
		
		boolean result3 = ( 7 <= 3 );
		System.out.println(result3);
		
		int a=5, b=7;
		boolean re1 = ( a == b );
		System.out.println(re1);
		boolean re2 = ( a != b );
		System.out.println(re2);
		boolean re3 = ( a >= b );
		System.out.println(re3);
		boolean re4 = ( a <= b );
		System.out.println(re4);
		boolean re5 = ( a > b );
		System.out.println(re5);
		boolean re6 = ( a < b );
		System.out.println(re6);
		
		boolean logic1 = ( 10 > 5 ) && ( 2 > 1 );
		System.out.println(logic1);
		
		boolean logic2 = ( 3 == 7 ) || ( 6 < 2 );
		System.out.println(logic2);
		
		boolean logic3 = !( 8 == 8 );
		System.out.println(logic3);
		
		
		boolean x = true, y = false;
		boolean a1 = ( x && y );
		System.out.println(a1);
		boolean a2 = ( x || y );
		System.out.println(a2);
		boolean a3 = !(x == y);
		System.out.println(a3);
	}
	
}





