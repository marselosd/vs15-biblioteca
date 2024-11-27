public class Main
{
    public void buscarLivro(String titulo, Livro[] livros)
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
    public static void main(String[] args)
    {

    }
}
