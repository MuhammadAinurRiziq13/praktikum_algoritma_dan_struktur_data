/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengayaan;

public class MergeSorting {
    
    public void mergeSort(int [] data){
        int left = 0;
        int right = data.length-1;
        sort(data, left, right);
    }
    public void merge(int [] data,int left,int middle,int right){
        int [] temp = new int[data.length];
        for(int i = left;i<=right;i++){
            temp[i]= data[i];
        }
        int a = left;
        int b = middle+1;
        int c = left;     
        //membandingkan setiap bilangan
        while(a <= middle && b <= right){
            if(temp[a] <= temp[b]){
                data[c] = temp[a];
                a++;
            }else{
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle-a;
        for(int i = 0; i <= s;i++){
            data[c+i]= temp[a+i];
        } 
    } 
    private void sort (int data[],int left,int right){
        if(left < right){
            int middle = (left+right)/2;
            sort(data, left, middle);
            sort(data, middle+1, right);
            merge(data, left, middle, right);
        }
    }
    public void printArray(int arr[]){
        int n = arr.length;
        for(int i =0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
