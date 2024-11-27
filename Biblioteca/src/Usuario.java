public class Usuario
{
    private String nome;
    private int id;
    private Livro[] livrosEmprestados;

    public Usuario(String nome, int id, Livro[] livrosEmprestados)
    {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
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

    public Livro[] getLivrosEmprestados()
    {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Livro[] livrosEmprestados)
    {
        this.livrosEmprestados = livrosEmprestados;
    }
}
