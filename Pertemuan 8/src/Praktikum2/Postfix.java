/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

public class Postfix {
    int n,top;
    char stack [];

    public Postfix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }
    
    public void push(char c){
        top++;
        stack[top]= c;
    }
    
    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }
    
    public boolean IsOperand(char c){
        if((c >= 'A' && c <= 'Z')||(c >= 'a'&& c <= 'z')
                ||(c >= '0' && c <= '9')|| c== ' ' || c == '.'){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean IsOperator(char c){
        if(c == '^' || c == '%' || c == '/' || c == '*' 
                || c == '-' || c == '+'){
            return true;
        }else{
            return false;
        }
    }
    
    public int derajat(char c){
        switch (c){
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;   
        }
    }
    
    public String konversi(String Q){
        String p = "";
        char c;
        for(int i= 0;i <n;i++){
            c = Q.charAt(i);
            if(IsOperand(c)){
                p = p+c;
            }
            if(c == '('){
                push(c);
            }
            if(c == ')'){
                while (stack[top] != '('){
                    p = p + pop();
                }
                pop();//hapus kurung buka
            }
            if(IsOperator(c)){
                while(derajat(stack[top]) >= derajat(c)){
                    p = p+pop();
                }
                push(c);
            }         
        }
        return p;
    }
    
}
