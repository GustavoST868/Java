import javax.swing.*;
import java.awt.*;

public class Janela {

    BANCODEDADOS bd = new BANCODEDADOS();
    public Janela() {
    }
    public void Janela1(){

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300,300);
        janela.setTitle("Cadastro de Cliente");
        janela.setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(7,1));
        JButton proximo = new JButton("Mostar dados  registrados");
        JLabel rotulonome = new JLabel("Nome:");
        JLabel rotulocpf = new JLabel("Cpf:");
        JLabel rotulodescricao= new JLabel("Descrição:");
        JTextField camponome =new JTextField();
        JTextField campocpf =new JTextField();
        JTextField campodescricao =new JTextField();


        proximo.addActionListener(e->{

            bd.Adicionar("Nome           = "+ camponome.getText());
            bd.Adicionar("Cpf                = "+campocpf.getText());
            bd.Adicionar("Descrição    = "+campodescricao.getText()+"\n\n\n");
            janela.dispose();
            Janela2();

        });

        painel.add(proximo);
        painel.add(rotulonome);
        painel.add(camponome);
        painel.add(rotulocpf);
        painel.add(campocpf);
        painel.add(rotulodescricao);
        painel.add(campodescricao);

        janela.add(painel);
        janela.setVisible(true);

    }

    public void Janela2(){

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300,300);
        janela.setTitle("Cadastro de Cliente");
        janela.setLocationRelativeTo(null);

        JPanel painel = new JPanel(new BorderLayout());
        JButton proximo = new JButton("Voltar");
        JTextArea texto = new JTextArea();
        JScrollPane scrollPane =  new JScrollPane(texto);
        texto.setText(bd.Mostrar());


        proximo.addActionListener(e->{

            janela.dispose();
            Janela1();

        });

        painel.add(proximo,BorderLayout.NORTH);
        painel.add(scrollPane);

        janela.add(painel);
        janela.setVisible(true);

    }
}
