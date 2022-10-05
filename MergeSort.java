import java.util.*;
public class Main {
   static void merge(int arr[],int s,int mid,int e){
        int n1=mid-s+1;
        int n2=e-mid;
        int a[];int b[];
        a=new int[n1];b=new int[n2];
        for(int i=0;i<n1;i++)
        a[i]=arr[s+i];
        for(int i=0;i<n2;i++)
        b[i]=arr[mid+i+1];
        int i=0,j=0,k=s;
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n1)arr[k++]=a[i++];
        while(j<n2)arr[k++]=b[j++];
        return ;
    }
    static void mergeSort(int arr[],int s,int e){
        if(s<e){
            int mid=(s+e)/2;
            mergeSort(arr,s,mid);
            mergeSort(arr,mid+1,e);
            merge(arr,s,mid,e);
        }
    }
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[];
     arr=new int[n];
     
     for(int i=0;i<n;i++){
         int x=sc.nextInt();
         arr[i]=x;
     }
     mergeSort(arr,0,n-1);
     for(int i=0;i<n;i++)
   System.out.println(arr[i]+" ");
     
    }
}