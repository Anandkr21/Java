
public class Client {

	public static void main(String[] args) {
		//create object of the facebook page
		
		FacebookPage fb = new FacebookPage();
		fb.name = "Hompage";
		fb.pageviews = 1001;
		
		FacebookPage fb1 = new FacebookPage();
		fb1.name = "ProfilePage";
		fb1.pageviews = 2001;
		
		FacebookPage fb2 = new FacebookPage();
		fb2.name = "FriendPage";
		fb2.pageviews = 2001;
		
		
		System.out.println(fb.name);
		System.out.println(fb1.name);
		System.out.println(fb2.name);
		
		fb=fb1;
		System.out.println("------------------------");
		System.out.println(fb.name);
		System.out.println(fb1.name);
		System.out.println(fb2.name);
		
		fb.name="Logout page";
		System.out.println("------------------------------");
		System.out.println(fb.name);
		System.out.println(fb1.name);
		System.out.println(fb2.name);
		System.out.println("------------------------------");
		fb.printPageDetails();
		fb1.printPageDetails();
		fb2.printPageDetails();
		
		FacebookPage.printCompanyDetails();
		// fb2.printCompanyDetails();
		System.out.println("------------------------------");
		fb1.increasePageViews(100);
		fb2.increasePageViews(200);
		fb1.printPageDetails();
		fb2.printPageDetails();
		
		
		FacebookPage fb3 = null;
		System.out.println(fb3.name);
		fb3 = new FacebookPage();
		fb3.name = "Setting Page";
		
	}

}
