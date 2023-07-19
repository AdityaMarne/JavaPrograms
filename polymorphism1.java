import java.util.*;

public class polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone phone=new phone("Nokia 3310");
		phone.features();
		System.out.println(phone.getModel());
		
		SamsungNote8 note8=new SamsungNote8("Note 8");
		note8.features();
		System.out.println(note8.getModel());
	}

}
