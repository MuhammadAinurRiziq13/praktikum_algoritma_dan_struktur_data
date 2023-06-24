/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class UlarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Ular ular = new Ular(10, 10);
        
        System.out.println("GAME ULAR");
        System.out.println("bergerak ke mana ? ");
            System.out.println("1.atas");
            System.out.println("2.bawah");
            System.out.println("3.kiri");
            System.out.println("4.kanan");
        do{            
            System.out.print("masukkan gerakan [1/2/3/4]: ");
            int gerakan = sc.nextInt();
            if(gerakan == 1){
                ular.moveUp();
            }else if(gerakan == 2){
                ular.moveDown();
            }else if(gerakan == 3){
                ular.moveLeft();
            }else if(gerakan == 4){
                ular.moveRight();
            }
            ular.printPosition();
            
        }while(ular.x >= 0 && ular.x <= ular.height && ular.y >=0 && ular.y <= ular.height );
            ular.detectColicion();
        
    }
    
}

