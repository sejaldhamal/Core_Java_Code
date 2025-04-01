public class boxingUnboxing
{
  public static void main(String x[])
  {
    Double dObj=Double.valueOf(92500);
	double d=dObj.doubleValue();
	System.out.println("Double value is"+d);
	
	Integer iObj=Integer.valueOf(23);
	int i=iObj.intValue();
	System.out.println("Integer value is"+i);
	
	Float fObj=Float.valueOf(4.5f);
       float f=fObj.floatValue();
	System.out.println("Float value is"+f);
	
	}
}
	