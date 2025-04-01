class Course
{
	String courseName,Instructor;
	int duration;
	Course(String courseName,String Instructor,int duration)
	{
	  this.courseName=courseName;
	  this.Instructor=Instructor;
	  this.duration=duration;
	}
	
	void getDetails()
	{
		System.out.println("Course Name: "+courseName+","+" Instructor: "+Instructor+","+" Duration: "+duration );
	}
} 

 class VideoCourse extends Course
 {
	 int hrs;
    VideoCourse(String courseName,String Instructor,int duration,int hrs)
	{
		super(courseName,Instructor,duration);
		this.hrs=hrs;
	}
	
	void getDetails()
	{
		System.out.println("Course Name: "+courseName+","+" Instructor: "+Instructor+","+" Duration: "+duration+","+" Video Length: "+hrs+" hours");
	}
 }
 
 class TextCourse extends Course
 {
	 int pages;
	 TextCourse(String courseName,String Instructor,int duration,int pages)
	 {
		super(courseName,Instructor,duration); 
		this.pages=pages;
	 }
	 
   void getDetails()
	{
		System.out.println("Course Name: "+courseName+","+" Instructor: "+Instructor+","+" Duration: "+duration+","+" Number of pages: "+pages );
	}
	 
 }
public class D_CourseManagementSystem 
{
	public static void main(String x[])
	{
	 Course c1[]=new Course[2];
	 c1[0]=new VideoCourse(courseName,Instructor,duration,hrs);
	 c1[0].getDetails();
	 
	 c1[1]=new TextCourse(courseName,Instructor,duration,pages);
	 c1[1].getDetails();
	}
}