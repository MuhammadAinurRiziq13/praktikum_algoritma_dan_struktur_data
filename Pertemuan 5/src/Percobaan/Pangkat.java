/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class Pangkat {
    public int nilai,pangkat;
    
    Pangkat(int n,int p){
        n=nilai;
        p=pangkat;
    }
    public int PangkatBF(int a,int n){
        int hasil = 1;
//        int i = 1;
        for(int i = 0;i < n;i++){
            hasil = hasil *a;

        }
//        do{
//            hasil = hasil *a;
//            i++;
//        }while(i <= n);
        return hasil;
    }
    
    public int PangkatDC(int a,int n){
        if(n==0){
            return 1;
        }else{
            if(n%2==1)//bilangan ganjil
                return (PangkatDC(a, n/2)*PangkatDC(a, n/2)*a);
            else //bilangan genap
                return (PangkatDC(a, n/2)*PangkatDC(a, n/2));
            
        }   
    }   
  
}
