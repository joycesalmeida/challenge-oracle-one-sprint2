import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaSaida extends JFrame{
    private JTextField valorTextField;
    private JComboBox moedaDeSaida;
    private JTextArea resultadoTextArea;
    private JButton converterButton;
    private JPanel telaPrincipal;
    private JComboBox moedaDeEntrada;

    public telaSaida() {
        setContentPane(telaPrincipal);
       setTitle("Conversor de moedas");
       setSize(600, 400);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);

        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String me = moedaDeEntrada.getModel().getSelectedItem().toString();
                String ms = moedaDeSaida.getModel().getSelectedItem().toString();
                String valor = valorTextField.getText();
                String newValor;
                if(valor.contains(",")){
                    if (valor.contains(".")) {
                        String valorPontoVirgula = valor.replace(".", "");
                        newValor = valorPontoVirgula.replace(",", ".");
                    } else {
                        newValor = valor.replaceAll(",", ".");
                    }

                } else {
                    newValor = valor;
                }
                Double valorDouble = Double.parseDouble(newValor);

                Conversor convert = new Conversor();
                String valorConvertido = convert.converterMoeda(valorDouble, me, ms);
                resultadoTextArea.setText(valorConvertido);
            }
        });
    }
    public static void main(String[] args) {
        telaSaida tela = new telaSaida();
    }
}
