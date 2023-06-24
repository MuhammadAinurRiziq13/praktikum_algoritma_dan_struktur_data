/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

public class Sum {
    public int perusahaan;
    public int elemen;
    public double keuntungan[][];
    public double total;

    Sum(int perusahaan,int elemen){
        this.perusahaan = perusahaan;
        this.elemen = elemen;
        this.keuntungan=new double[perusahaan][elemen];
        this.total = 0;
    }
    double totalBF(double arr[]){
        for(int i=0; i<elemen; i++){
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r)    
            return arr[l];
        else if(l<r){
            int mid=(l+r)/2;
            double lsum=totalDC(arr, l, mid-1);
            double rsum=totalDC(arr, mid+1, r);
            return lsum+rsum+arr[mid];
        }
        return 0;
    }

}
