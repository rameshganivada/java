package tasks_oops;

class Book{
	String title;
	String author;
	double price;
	
	void display_details()
	{
		System.out.println("Title " + title);
		System.out.println("Author "+author);
		System.out.println("Price "+price);
	}
}
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book obj_b1 = new Book();
        obj_b1.title = "wings of fire";
        obj_b1.author= "A.P.J.Abdul Kalam";
        obj_b1.price = 306.5;
        
        Book obj_b2 = new Book();
        obj_b2.title = "Atomic habbits";
        obj_b2.author = "James Clear";
        obj_b2.price = 423.23;
        
        obj_b1.display_details();
        System.out.println("\t");
        obj_b2.display_details();
        
        
	}

}
