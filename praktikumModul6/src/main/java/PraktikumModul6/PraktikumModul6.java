package PraktikumModul6;


abstract class BangunRuang
{
    abstract double hitungVolume();
}

class Balok extends BangunRuang {
    double p, l, t;
    
    Balok(double p, double l,double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    double hitungVolume(){
        return p*l*t;
    }
}

class Bola extends BangunRuang {
    double r;

    Bola(double r) {
        this.r = r;
    }

    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}

public class PraktikumModul6 {
public static void main(String[] args) {
         Balok balok = new Balok(34, 25, 16);
        Bola bola = new Bola(24);

        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Bola: " + bola.hitungVolume());
    }
}
