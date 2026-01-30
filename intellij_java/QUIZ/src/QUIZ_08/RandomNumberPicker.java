package QUIZ_08;

import java.util.Random;

public class RandomNumberPicker {
    int number;


    RandomNumberPicker(){
        number = (int)(Math.random() * 10) + 1;
    }

    int decideNumber(int number){
        if(this.number > number){
            return 1;
        } else if(this.number < number){
            return 2;
        }
        return -1;
    }

}
