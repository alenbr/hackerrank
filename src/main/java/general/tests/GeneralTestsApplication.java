package general.tests;

import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeneralTestsApplication {
	class Student{
	    private String name;
	    private String id;
	    private String email;

	    public String getName() {
	        return name;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void anothermethod(){  }
	}
	public static void main(String[] args) {
		SpringApplication.run(GeneralTestsApplication.class, args).close();;
	}

	@PostConstruct
	public void testLambda() {
//		System.out.println(oddNumber(1,10));
//		System.out.println(findValue(5, Arrays.asList(1,2,3,4,5,6,7,8,9)));
//		System.out.println(ifTeste(1));
//		System.out.println(ifTeste(2));
//		System.out.println(ifTeste(5));
//		System.out.println(ifTeste(10));
//		System.out.println(ifTeste(20));
//		System.out.println(ifTeste(22));
//		multiplo(2);
//		fatorial(5,3,5);
//		eofTest();
//		testeReduce();
//		calendarTest();
//		currentyFormat();
//        addNumbers(1,2,3);
//        addNumbers(1,2,3,4);
//        addNumbers(1,2,3,4,5);
//         reflectionTest();
//		stringTest();
//		stringSubstrTest();
//		lexSubstrTest();
		try {
			VanHackTest3.teste() ;
		} catch(Exception ex) {
			ex.printStackTrace();
		}
//		pallindromeTest();
	}
	
	public List<Integer> oddNumber(Integer l, Integer r) {
		return IntStream.rangeClosed(l, r).filter(i -> (i % 2) != 0).boxed().collect(Collectors.toList());		
	}
	public String findValue(Integer l, List<Integer> arr) {
		return (arr.stream().anyMatch(i -> i == l)) ? "YES" : "NO" ;
	}
	public String ifTeste(Integer N) {
		System.out.println (N);
       	return ((N % 2) != 0) ? "Weird" : (((N >= 2 && N <= 5) || (N > 20)) ? "Not Weird"  : "Weird"); 
	}
	public void multiplo(Integer N) {
		IntStream.rangeClosed(1, 10).forEach(p ->  System.out.printf("%d x %d = %d\n",N,p, (N*p)));
	}
	public void fatorial(Integer A, Integer B, Integer N) {
		IntStream.rangeClosed(1, N)
        		.forEach(x -> System.out.printf("%d ", A + IntStream.range(0, x).reduce(0, (a1,b1) -> a1 + ((int)Math.pow(2, b1)) * B)));
	}
	public void fitType(long x) {
		
		if(x>=-128 && x<=127) System.out.println("* byte");
		if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
		if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
		if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
	}
	public void eofTest() {
		
			Scanner sc = new Scanner(System.in);
			int x = 1;
			do {
				String s = sc.nextLine();
				System.out.printf("%d %s\n",x++, s);
			} while(sc.hasNext());
				
			sc.close();
	}
	public void calendarTest(){
        String day_of_week[] = {"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 02, 6);
		System.out.println(day_of_week[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 2);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 3);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 4);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 5);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 6);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 7);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2020, 02, 8);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
	}//end of main
	public void currentyFormat(){
		double payment = 123456.78;
		Locale indiaLocale = new Locale("en","IN");
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		System.out.println("US:" + us);
		System.out.println("India:" + india);
		System.out.println("China:" + china);
		System.out.println("France:" + france);
		
	}
	public void addNumbers(int... num){
		String sep = "";
		int sum = 0;
		for (int n : num) {
			sum += n;
			System.out.print(sep + n);
			sep = "+";
		}
		System.out.println("=" + sum);
	}
	public void reflectionTest() {
		Class<Student> student = Student.class;
		Method [] methods = student.getDeclaredMethods();
		List<String> methodList = new ArrayList<String>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}
	public void stringTest() {
		String A = "hello",B = "java";
		
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println((A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1)));
	}
	public void stringSubstrTest() {
		String A = "Helloworld";
		System.out.println(A.substring(3,7));
	}
	public void lexSubstrTest() {
		String A = "welcometojava";
		String smallest = "";
		String largest = "";
		int k = 3;
		for (int x =0; x <= (A.length() - k);x++) {
			String piece = A.substring(x,x+k);
			if (smallest == "") smallest = piece;
			if (largest == "")	largest = piece;
			if (piece.compareTo(smallest) <=  0)
				smallest = piece;
			if (piece.compareTo(largest) >= 0)
				largest = piece;
		}
		System.out.println(smallest + "\n" + largest);
	}
	public void pallindromeTest() {
		String A = "welcometojava";
		System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
		A = "madam";
		System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
	}

}
