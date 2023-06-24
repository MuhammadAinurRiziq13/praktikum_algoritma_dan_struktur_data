/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Ular {
    int x,y,width,height;
    
    Ular(int width,int height){
        this.width = width;
        this.height = height;
        x = 0;
        y = 0;
    }
    
    void moveLeft(){
        x -= 1;
    }
    void moveRight(){
        x+= 1;
    }
    void moveUp(){
        y+= 1;
    }
    void moveDown(){
        y-=1;
    }
    void printPosition(){
        System.out.println("posisi x : "+x);
        System.out.println("posisi y : "+y);
    }
    void detectColicion(){
        if(x <0 || x >width){
            System.out.println("game over");
        }else if(y <0 || y >height){
            System.out.println("game over");
        }
    }
    
    
}

