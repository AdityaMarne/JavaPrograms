
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInterFace p=new OnePlusInterFace();
		System.out.println("One plus processor :"+p.processor());
		System.out.println("One plus Space  :"+p.spaceInGB());
		System.out.println("One plus OS :"+p.OS());
		
		PhoneInterFace p1=new IphoneInterFace();
		System.out.println("Iphone processor :"+p1.processor());
		System.out.println("Iphone Space  :"+p1.spaceInGB());
		System.out.println("Iphone OS :"+p1.OS());
	}

}
