
public class Conversor {

    private double dolarReal = 5.07;
    private double euroReal = 5.51;



    public double dolarToReal(double valor) {
        return dolarReal * valor;
    }
    public double realToDolar(double valor) {
        return valor / dolarReal;
    }
    public double euroToReal(double valor) {
        return euroReal * valor;
    }

    public double realToEuro(double valor) {
        return valor / euroReal;
    }
    public String converterMoeda(Double valor, String entrada, String saida) {
        Arredondador arredondar = new Arredondador();
        Double resultado;

        if(entrada == "Real") {
            if (saida == "Dolar") {
                resultado = arredondar.DuasCasasDecimais(this.realToDolar(valor));
                return "$ " + resultado;
            } else if(saida == "Euro"){
                resultado = arredondar.DuasCasasDecimais(this.realToEuro(valor));
                return "€ " + resultado;
            } else {
                return "R$ " + valor;
            }
        } else if(entrada == "Dolar") {
            if (saida == "Real") {
                resultado = arredondar.DuasCasasDecimais(this.dolarToReal(valor));
                return "R$ " + resultado;
            } else if (saida == "Euro"){
               double real = this.dolarToReal(valor);
               resultado = arredondar.DuasCasasDecimais(this.realToEuro(real));
               return "€ " + resultado;
            } else {
                return "$ " + valor;
            }
        } else {
            if (saida == "Real") {
                resultado = arredondar.DuasCasasDecimais(this.euroToReal(valor));
                return "R$ " + resultado;
            } else if (saida == "Dolar") {
                double real = this.euroToReal(valor);
                resultado = arredondar.DuasCasasDecimais(this.realToDolar(real));
                return "$ " + resultado;
            } else {
                return "€ " + valor;
            }
        }
    }

}
