package com.company;
import java.util.Random;

public class RandomPrimeNumber{
    private Random random = new Random();

    public int getRandomNumberInRange(int range){
        return random.nextInt(range);
    }

    public boolean isPrime(int inputNum){
        for (int i = 2; i < (Math.sqrt(inputNum)); i++) { //factors <sqrt of the number
            if (inputNum % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        RandomPrimeNumber a = new RandomPrimeNumber();
        for(int i = 0; i<15; i++){
            int randomNumber = a.getRandomNumberInRange(1000);
            if(a.isPrime(randomNumber)){
                System.out.print(randomNumber + " (Prime)" + ", ");
            }
            else{
                System.out.print(randomNumber + ", ");
            }
        }
    }
}
