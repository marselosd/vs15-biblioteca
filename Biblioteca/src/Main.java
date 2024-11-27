import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    private static ArrayList<Livro> acervo = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int opcao;
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Remover livro");
        System.out.println("3 - Listar livros");
        System.out.println("4 - Buscar livro");
        System.out.println("5 - Emprestar livro");
        System.out.println("6 - Devolver livro");
        System.out.println("7 - Adicionar usuário");
        System.out.println("8 - Listar usuários");
        System.out.println("9 - Sair");

        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    System.out.println("Insira o titulo: ");
                    String titulo = scanner.nextLine();
                    removerLivro(titulo, acervo);
                    break;
                case 3:
                    listarLivros();
                    break;
                case 4:
                    buscarLivro();
                    break;
                case 5:
                    emprestarLivro();
                    break;
                case 6:
                    devolverLivro();
                    break;
                case 7:
                    adicionarUsuario();
                    break;
                case 8:
                    listarUsuarios();
                    break;
                case 9:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 9);
    }

    public static void adicionarLivro()
    {

        System.out.println("Digite o nome do livro: ");
        String adicionarTitulo = scanner.nextLine();

        System.out.println("Digite o nome do livro: ");
        String adicionarAutor = scanner.nextLine();

        System.out.println("Digite o nome do livro: ");
        int adicionarAnoPublicacao = scanner.nextInt();

        Livro adicionarLivro = new Livro(adicionarTitulo, adicionarAutor, adicionarAnoPublicacao, true);
        acervo.add(adicionarLivro);
    }

    public static void removerLivro(String titulo, ArrayList<Livro> livros)
    {
        for(Livro livro : livros)
        {
            if( livro.getTitulo().equalsIgnoreCase(titulo))
            {
                livro = null;
            }
        }
    }

    public static void listarLivro(ArrayList<Livro> livros)
    {
        for(Livro livro : livros)
        {
            System.out.println("Titulo: " + livro.getTitulo() + " " +
                        "Autor: " + livro.getAutor() + " " +
                        "Ano de Publicação: " + livro.getAnoPublicacao() + " " +
                        "Disponibilidade: " + livro.isDisponibilidade());
        }
    }

    public static void buscarLivro(String titulo, ArrayList<Livro> livros)
    {
        for(Livro livro : livros)
        {
            if(livro.getTitulo().equalsIgnoreCase(titulo))
            {
                System.out.println("Titulo: " + livro.getTitulo() + '\n' +
                        "Autor: " + livro.getAutor() + '\n' +
                        "Ano de Publicação: " + livro.getAnoPublicacao() + '\n' +
                        "Disponibilidade: " + livro.isDisponibilidade() + '\n');
            }
        }
    }

    public static void adicionarUsuario()
    {

        scanner.nextLine();
        System.out.println("Digite o nome do usuario: ");
        String adicionarNome = scanner.nextLine();

        int id = usuarios.size();

        Usuario adicionandoUsuario = new Usuario(adicionarNome, id);
        usuarios.add(adicionandoUsuario);
    }

    public void listarUsuarios()
    {
        for(Usuario usuario : usuarios)
        {
            System.out.println("Nome: " + usuario.getNome() + " ID: " + usuario.getId());
        }
    }
}
