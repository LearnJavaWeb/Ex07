import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/product")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mota = request.getParameter("mota");

        float gia = Float.parseFloat(request.getParameter("gia"));
        float giamgia = Float.parseFloat(request.getParameter("giamgia"));

        float amount = (float) (gia * giamgia * 0.1);

        float saugiamgia = gia-amount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("Product Description: "+mota);
        writer.println("Price: "+gia);
        writer.println("Percent: "+giamgia);
        writer.println("Amount: "+amount);
        writer.println("Discount Price: "+saugiamgia);

        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
