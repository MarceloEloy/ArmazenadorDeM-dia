package Aula3;

public class MainB {
    int x;
    int y;
    MainB(int x, int y){
        this.x = x;
        this.y = y;
    }
    Double media(){
        int x;
        int y;
        x = this.x;
        y = this.y;
        Double media = (x+y)/2.0;
        return media;
    }
    static Double media(int x, int y){
        MainB z = new MainB(x, y);
        Double med = (z.x + z.y)/2.0;
        return med;
    }
}
