public class wrapper_MaxMinInteger_ObjectWrapper
{
	public static void main(String x[])
	{
		Integer []a={12,4,56,8,3};
		Integer max=a[0];
		Integer min=a[0];
		
		//start loop from index 1
		
                  for(int i=1;i<a.length;i++)
		{
			if(a[i]>max){
				max=a[i];  //store maximum value 
			}
			if(a[i]<min){
				min=a[i];  //store minimum value
			}
		}
		
		/*
for (Integer num : a) 
{             //enhanced loop : simplifies iteration and is preferred when the index is not required.
            
if (num > max) {
                max = num;   
            }
            if (num < min) {
                min = num;
         }   }
     
		*/
		System.out.println("Max = "+max+", Min = "+min);
	}
}

