package java_logics.logics;

public class Min_Max_Values_Arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {0,2,2,2,1,17};
int low=arr[0];
int high=arr[0];

for(int i=0;i<arr.length; i++)
{
	if(arr[i]>high)
	{
		high=arr[i];
	}
	if(arr[i]<low)
	{
		low=arr[i];
	}
		
}
System.out.println(high+" Hiegst value in the array");
System.out.println(low+" lowest value in the array");
	}

}
