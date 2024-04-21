import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ResistenciaColorida extends JFrame {

    private JComboBox<String> primeiraFaixaBox;
    private JComboBox<String> segundaFaixaBox;
    private JComboBox<String> multiplicadorBox;
    private JComboBox<String> toleranciaBox;

    private JLabel valorResistorLabel;

    private Map<String, Integer> faixaValores;
    private Map<String, Integer> multiplicadorValores;
    private Map<String, Double> toleranciaValores;

    public ResistenciaColorida() {
        
        inicializarMapas();

        setTitle("Resistência Colorida");
        setSize(200, 200); // Aumentei a altura para acomodar melhor as JComboBoxes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2)); // Ajustei para 7 linhas para acomodar todas as JComboBoxes

        JLabel faixasLabel = new JLabel("Escolha as faixas de cores:");
        panel.add(faixasLabel);

        primeiraFaixaBox = criarFaixaBox();
        segundaFaixaBox = criarFaixaBox();
        multiplicadorBox = criarMultiplicadorBox();
        toleranciaBox = criarToleranciaBox();

        panel.add(primeiraFaixaBox);
        panel.add(segundaFaixaBox);
        panel.add(multiplicadorBox);
        panel.add(toleranciaBox);

        JButton calcularButton = new JButton("Calcular Resistência");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResistencia();
            }
        });

        valorResistorLabel = new JLabel("Valor da Resistência: ");
        panel.add(valorResistorLabel);

        panel.add(calcularButton);

        add(panel);
   
        setVisible(true);
    }

    private void inicializarMapas() {
    
        faixaValores = new HashMap<>();
        faixaValores.put("Preto", 0);
        faixaValores.put("Marrom", 1);
        faixaValores.put("Vermelho", 2);
        faixaValores.put("Laranja", 3);
        faixaValores.put("Amarelo", 4);
        faixaValores.put("Verde", 5);
        faixaValores.put("Azul", 6);
        faixaValores.put("Violeta", 7);
        faixaValores.put("Cinza", 8);
        faixaValores.put("Branco", 9);

        multiplicadorValores = new HashMap<>();
        multiplicadorValores.put("Preto", 1);
        multiplicadorValores.put("Marrom", 10);
        multiplicadorValores.put("Vermelho", 100);
        multiplicadorValores.put("Laranja", 1000);
        multiplicadorValores.put("Amarelo", 10000);
        multiplicadorValores.put("Verde", 100000);
        multiplicadorValores.put("Azul", 1000000);
        multiplicadorValores.put("Violeta", 10000000);
        multiplicadorValores.put("Cinza", 100000000);
        multiplicadorValores.put("Branco", 1000000000);

        toleranciaValores = new HashMap<>();
        toleranciaValores.put("Sem Tolerância", 0.0);
        toleranciaValores.put("Marrom", 1.0);
        toleranciaValores.put("Vermelho", 2.0);
        toleranciaValores.put("Verde", 0.5);
        toleranciaValores.put("Azul", 0.25);
        toleranciaValores.put("Violeta", 0.1);
        toleranciaValores.put("Cinza", 0.05);
        toleranciaValores.put("Ouro", 5.0);
        toleranciaValores.put("Prata", 10.0);
    }

    private JComboBox<String> criarFaixaBox() {
        JComboBox<String> box = new JComboBox<>(faixaValores.keySet().toArray(new String[0]));
        box.setSelectedIndex(0);
        return box;
    }

    private JComboBox<String> criarMultiplicadorBox() {
        JComboBox<String> box = new JComboBox<>(multiplicadorValores.keySet().toArray(new String[0]));
        box.setSelectedIndex(0);
        return box;
    }

    private JComboBox<String> criarToleranciaBox() {
        JComboBox<String> box = new JComboBox<>(toleranciaValores.keySet().toArray(new String[0]));
        box.setSelectedIndex(0);
        return box;
    }

    private void calcularResistencia() {
        
        String corFaixa1 = (String) primeiraFaixaBox.getSelectedItem();
        String corFaixa2 = (String) segundaFaixaBox.getSelectedItem();
        String corMultiplicador = (String) multiplicadorBox.getSelectedItem();
        String corTolerancia = (String) toleranciaBox.getSelectedItem();

        
        int valorResistencia = (faixaValores.get(corFaixa1) * 10 + faixaValores.get(corFaixa2)) * multiplicadorValores.get(corMultiplicador);
        
        double tolerancia = toleranciaValores.get(corTolerancia);
        double valorComTolerancia = valorResistencia * (1 + tolerancia / 100);

        valorResistorLabel.setText("Valor da Resistência: " + valorResistencia + " ohms com tolerância de " + tolerancia + "% (entre "
                + (valorResistencia - valorComTolerancia) + " e " + (valorResistencia + valorComTolerancia) + " ohms)");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ResistenciaColorida());
    }
}
