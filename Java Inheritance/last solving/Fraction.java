public class Fraction{
    int Numerator;
    int Denominator;

    public(int Numerator, int Denominator){
        this.Numerator=Numerator;
        this.Denominator=Denominator;
    }
}

public class DevidedbyZero extends Exception{
    public Fraction(int Numerator, int Denominator)throw DevidedbyZero {
            if(Denominator==0)throws new DevidedbyZero("denominator cannot bee zero");
    }
    this.Numerator=Numerator;
    this.Denominator=Denominator;
}

public void seekinfinity(int n,int d){
    try{
        Fraction f = new Fraction(n,d);

        System.out.println(f.tostring);
    }catch(DevidedbyZero){
        
    }
}