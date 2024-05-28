import dao.ProductsDAO;

public class App {
    public static void main(String[] args) throws Exception {
        ProductsDAO test = new ProductsDAO();
        System.out.println(test.findAll());
    }
}
