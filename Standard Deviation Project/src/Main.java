import java.util.*;
public class Main {
	
	
	private double [] arr;
	private int total;
	private double variance;
	private double std_deviation;
	
	public Main(double [] arr) {
		this.arr=arr;
		
	}
	
	public double findAverage() {
		for(int i=0;i<arr.length;i++) {
		 total+=arr[i];
		}
		return total/(double)arr.length;
	}
	
	public double findVariance(String type) {
		double average=findAverage();
		int numberOfTerms=arr.length;
		for(int i=0;i<arr.length;i++) {
			variance+=Math.pow(arr[i]-average, 2);
		}
		if(type.equals("s")) {
			numberOfTerms=numberOfTerms-1;
			return variance/(double)numberOfTerms;
		}else {
		return variance/(double)arr.length;
		}
	}
	
	public double findStandardDeviation(String type) {
		double variance=findVariance(type);
		return Math.sqrt(variance);
	}



public void quickSort(int arr[], int low,int high) {

	if(low<high) {
		int pivotIndex=partition(arr,low,high);
		quickSort(arr,low,pivotIndex-1);
		quickSort(arr,pivotIndex+1,high);
	}	
}
int partition(int array[],int low,int high)	{
	int pivot=array[high];

	int i=(low-1);
	for(int j=low;j<high;j++) {
		if(array[j]<pivot) {
			i++;
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}
	int temp = array[i+1]; 
    array[i+1] = array[high]; 
    array[high] = temp; 

    return i+1;
}
	

	
	
}
