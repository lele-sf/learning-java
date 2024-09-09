public class App {
    public static void main(String[] args) throws Exception {
        Autor a1 = new Autor("Joe", "Abercrombie");
        System.out.println(a1.toString());

        Autor a2 = new Autor("J.R.R.", "Tolkien");

        Autor a3 = new Autor("Christopher", "Buehlman");
        
        Livro l1 = new Livro("The Blade Itself", a1, 25.99);
        System.out.println(l1.toString());

        Livro l2 = new Livro("The Hobbit", a2, 45.56);
        System.out.println(l2.toString());

        Livro l3 = new Livro("Between Two Fires", a3, 36.62);
        System.out.println(l3.toString());
    }
}
