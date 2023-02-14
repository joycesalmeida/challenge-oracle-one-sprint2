import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arredondador {
    public double DuasCasasDecimais(double valor) {
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }
}
