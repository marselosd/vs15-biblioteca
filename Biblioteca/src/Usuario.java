import java.util.ArrayList;

public class Usuario
{
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id)
    {
        this.nome = nome;
        this.id = id;
    }

    public void emprestarLivro(String titulo, ArrayList<Livro> livros)
    {
        for(Livro livro : livros)
        {
            if(livro.isDisponibilidade())
            {
                livro.setDisponibilidade(false);
                livrosEmprestados.add(livro);
            }
            else
            {
                System.out.println("LIVRO INDISPONIVEL");
            }
        }
    }

    public void devolverLivro(String titulo)
    {
        for(Livro livro : livrosEmprestados)
        {
            if(livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isDisponibilidade() )
            {
                livro.setDisponibilidade(true);
            }
        }
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public ArrayList<Livro> getLivrosEmprestados()
    {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados)
    {
        this.livrosEmprestados = livrosEmprestados;
    }
}
