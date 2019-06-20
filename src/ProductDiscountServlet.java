import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/calculate")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product=request.getParameter("product");
        Float price=Float.parseFloat(request.getParameter("price"));
        Float percent=Float.parseFloat(request.getParameter("percent"))/100;

        Float discountAmount= price*percent;
        Float discountPrice= price-discountAmount;

        PrintWriter writer= response.getWriter();

        writer.println("<html>");
        writer.println("<form>");
        writer.println("<h1> Product Discount Calculator <h1>");
        writer.println("<label> Product Description: "+ product+ "</label>");
        writer.println("<br/>");
        writer.println("<label> Price: "+ price+ "</label>");
        writer.println("<br/>");
        writer.println("<label> Discount Percent: "+ percent+ "</label>");
        writer.println("<br/>");
        writer.println("<label> Discount Amount: "+ discountAmount+ "</label>");
        writer.println("<br/>");
        writer.println("<label> Discount Price: "+ discountPrice+ "</label>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
