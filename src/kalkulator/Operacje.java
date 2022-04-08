package kalkulator;

public enum Operacje {
    DODAWANIE ('+'){
        double licz(double a, double b){
            return a + b;
        }
    },
    ODEJMOWANIE ('-'){
        double licz(double a, double b){
            return a - b;
        }
    },
    MNOZENIE('*'){
        double licz(double a, double b){
            return a * b;
        }
    },
    DZIELENIE('/'){
        double licz(double a, double b){
            return a / b;
        }
    };

    private final char znak;

    Operacje(char znak) {
        this.znak = znak;
    }

    abstract double licz(double a, double b);

    public char getZnak() {
        return znak;
    }

    @Override
    public String toString() {
        return "Operacje{" +
                "znak=" + znak +
                '}';
    }
}
