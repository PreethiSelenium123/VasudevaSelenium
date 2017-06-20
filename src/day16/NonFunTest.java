package day16;

public class NonFunTest {

	public static void main(String[] args)
	{
		NonFunTest app=new NonFunTest();
		//app.appLaunch();
String res=app.appLogin();
System.out.println(res);
	}
//Non Static Fun with out return values
	public void appLaunch()
	{
		System.out.println("Non Static Fun With Out Return value");
	}
	
	//Non Static Fun with  return values
		public String appLogin()
		{
			System.out.println("Non Static Fun With  Return value");
			return "pass";
		}
}
