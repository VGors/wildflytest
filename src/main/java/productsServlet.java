import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "productsServlet", urlPatterns = "/products")
public class productsServlet extends HttpServlet {
    private Product product;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><body>");
        for (int i = 0; i < 10; i++) {
            product = new Product(i, "Asics" + i, 34.5f * i);
            resp.getWriter().printf("<h2>" + product.toString() + "<h2>");
        }
        resp.getWriter().println("<body><html>");
    }

}
