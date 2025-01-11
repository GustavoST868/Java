import javax.swing.*;
import java.awt.*;

public class Janela {
    public Janela() {

    }

    Bancodedados bd = new Bancodedados();

    public void Janela1() {

        JFrame janela = new JFrame();


        //janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(300, 130);

        JPanel painelsuperior = new JPanel(new FlowLayout());
        JButton btmostrar = new JButton("Mostrar");
        JButton btregistrar = new JButton("Registrar");
        JButton btalterar = new JButton("Alterar");
        painelsuperior.add(btalterar);
        painelsuperior.add(btmostrar);
        painelsuperior.add(btregistrar);

        JPanel painelinferior = new JPanel(new GridLayout(2, 1));
        JLabel nome = new JLabel("Nome : ");
        JTextField camponome = new JTextField();
        painelinferior.add(nome);
        painelinferior.add(camponome);


        janela.getContentPane().setLayout(new BorderLayout());
        janela.getContentPane().add(painelsuperior, BorderLayout.NORTH);
        janela.getContentPane().add(painelinferior, BorderLayout.SOUTH);


        btregistrar.addActionListener(e -> {
            String dado = camponome.getText();
            Cliente c = new Cliente(dado);
            bd.Adicionar(c.toString());
        });

        btmostrar.addActionListener(e -> {
            janela.dispose();
            Janela2();
        });

        btalterar.addActionListener(e -> {
            janela.dispose();
            Janela_Alterar();
        });


        janela.setVisible(true);
    }

    public void Janela2() {
        JFrame janela = new JFrame();


        //janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(300, 300);

        JPanel painel = new JPanel(new BorderLayout());
        JButton voltar = new JButton("Voltar");
        JTextArea area = new JTextArea();

        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);
        painel.add(voltar, BorderLayout.NORTH);
        area.setText(bd.Mostrar());
        painel.add(scrollPane);

        janela.add(painel);

        voltar.addActionListener(e -> {
            janela.dispose();
            Janela1();
        });

        janela.setVisible(true);
    }

    public void Janela_Alterar() {
        JFrame janelaalterar = new JFrame();
        JPanel painel = new JPanel(new GridLayout(6,1));
        janelaalterar.setSize(300,150);
        janelaalterar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaalterar.setLocationRelativeTo(null);
        JButton btvolta = new JButton("Voltar");
        JButton alretarmmostrar = new JButton("Alterar e mostrar");
        JLabel rotuloId = new JLabel("Id:");
        JTextField idcampo = new JTextField();
        JLabel totuloddo = new JLabel("Dado:");
        JTextField dadocampo = new JTextField();
        painel.add(btvolta);
        painel.add(alretarmmostrar);
        painel.add(rotuloId);
        painel.add(idcampo);
        painel.add(dadocampo);
        painel.add(totuloddo);
        painel.add(dadocampo);

        btvolta.addActionListener(e -> {
            janelaalterar.dispose();
            Janela1();
        });
        alretarmmostrar.addActionListener(e -> {
            int id = Integer.parseInt(idcampo.getText());
            String banco = "\nCliente"+"{" + "Nome =" + dadocampo.getText() + '}';
            bd.Alterar(id-1,banco);
            janelaalterar.dispose();
            Janela2();
        });

        janelaalterar.add(painel);
        janelaalterar.setVisible(true);
    }
}


