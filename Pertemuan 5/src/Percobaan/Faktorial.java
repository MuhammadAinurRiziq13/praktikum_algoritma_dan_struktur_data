/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

public class Faktorial {
    public int nilai;
    
    public int faktorialBF(int n){
        int fakto = 1;
        for(int i = 1;i <= n ;i++){
            fakto = fakto *i;
        }
        return fakto;
    }
    
    public int faktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
}
