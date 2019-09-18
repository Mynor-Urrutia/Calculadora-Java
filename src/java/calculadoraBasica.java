
public class calculadoraBasica {
    private int resultadoSuma;
    private int resultadoResta;
    
    public int sumar(int primerNumero, int segundoNumero){
        this.resultadoSuma = primerNumero + segundoNumero;
        return this.resultadoSuma;
    }
    
    public int resta(int primerNumero, int segundoNumero){
        this.resultadoResta = primerNumero - segundoNumero;
        return this.resultadoResta;
    }
}
