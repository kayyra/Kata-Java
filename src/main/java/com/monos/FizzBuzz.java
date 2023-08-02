package com.monos;

public class FizzBuzz {
   //constantes 
   //Variables o Atributos
   //constructor
   //métodos

   public String checkIfisDivisible(int num) {
    if (num % 3 == 0) {
        return "Fizz";
    }

    if (num % 5 == 0){
        return "Buzz";
    }

    if(num % 3 == 0 && num % 5 ==0){
        return "FizzBuzz";
    }else if (num % 3 == 0 ){
        return "Fizz";    
    }else if (num % 5 == 0){
        return "Buzz";
    } else {
        return Integer.toString(num);
    }    
   }
}
