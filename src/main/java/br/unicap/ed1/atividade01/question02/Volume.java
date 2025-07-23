package br.unicap.ed1.atividade01.question02;

public class Volume {

    public static String getName(int volume) {
        if(volume <= 0){
            return "Min Volume";
        }
        if(volume > 0 && volume<= 25 ){
            return "Low Volume";
        }
        if(volume > 25 && volume <= 75){
            return "Medium Volume";
        }
        if(volume>75 && volume < 100){
            return "High Volume";
        }
        else{
            return"Max Volume";
        }
    }

}
