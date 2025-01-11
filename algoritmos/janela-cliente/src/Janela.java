import javax.swing.*;
import java.awt.*;

public class Janela {


    public Janela() {

    }

    BancodeDados banco = new BancodeDados();

    public void Janela(){

        JFrame janela = new JFrame();
        JPanel painel = new JPanel(new GridLayout(10,1));
        JTextField camponome = new JTextField();
        JTextField campocpf = new JTextField();
        JTextField campodescricao = new JTextField();

        JLabel rotulo = new JLabel("                                        Informações do Cliente");
        JLabel rotulonome = new JLabel("NOME:");
        JLabel rotulocpf = new JLabel("CPF:");
        JLabel rotulodescricao= new JLabel("DESCRIÇÃO:");

        JButton botaosalvar = new JButton("Salvar");
        JButton botaomostrat = new JButton("Mostrar dados salvos");
        JButton botaodeletar = new JButton("Deletar dados salvos");


        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLocationRelativeTo(null);

        painel.add(botaosalvar);
        painel.add(botaomostrat);
        painel.add(botaodeletar);
        painel.add(rotulo);
        painel.add(rotulonome);
        painel.add(camponome);
        painel.add(rotulocpf);
        painel.add(campocpf);
        painel.add(rotulodescricao);
        painel.add(campodescricao);

        janela.add(painel);


        botaosalvar.addActionListener(e->{

            Cliente cliente = new Cliente(camponome.getText(),campocpf.getText(),campodescricao.getText());
            banco.Adicionar(cliente.toString());
            banco.MostrarBanco();

        });

        botaomostrat.addActionListener(e->{

            janela.dispose();
            Janela_Mostrar();

        });

        botaodeletar.addActionListener(e->{

            banco.DeltarLista();

        });


        janela.setVisible(true);

    }

    public void Janela_Mostrar(){

        JFrame janelamostrar = new JFrame();
        JPanel painelmostrar = new JPanel(new BorderLayout());
        janelamostrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelamostrar.setLocationRelativeTo(null);
        janelamostrar.setSize(400,300);

        JButton btvoltar = new JButton("Voltar");

        JTextArea texto = new JTextArea();
        texto.setText(banco.MostrarBanco());
        texto.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(texto);

        painelmostrar.add(btvoltar,BorderLayout.NORTH);
        painelmostrar.add(scrollPane);



        btvoltar.addActionListener(e->{

            janelamostrar.dispose();
            Janela();

        });

        janelamostrar.add(painelmostrar);
        janelamostrar.setVisible(true);

    }
}
