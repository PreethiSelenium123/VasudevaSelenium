package day16;

public class BasicFunTest {

	public static void main(String[] args) 
	{
		//Calling Static Fun
		//appLaunch();
		//Calling Static fun with Return value
		String res=appLogin();		
System.out.println(res);
///System.out.println(appLogin());
	}
	//Static Fun without Return Value
	public static void appLaunch()
	{
		System.out.println("Static Fun With Out Return value");
	}
//Static fun With Retun Value
	
	public static String appLogin()
	{
		System.out.println("Static Fun With Retun Value");
		return "Pass";
	}
}
