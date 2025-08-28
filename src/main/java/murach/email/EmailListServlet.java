package murach.email;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        // Lấy dữ liệu từ form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String source = request.getParameter("source");
        String offers = request.getParameter("offers");
        String emailOffers = request.getParameter("emailOffers");
        String contactMethod = request.getParameter("contactMethod");

        // Tạo User object và set dữ liệu
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setDob(dob);
        user.setSource(source);
        user.setOffers(offers);
        user.setEmailOffers(emailOffers);
        user.setContactMethod(contactMethod);

        // Gửi object sang JSP
        request.setAttribute("user", user);

        // Forward sang trang cảm ơn
        String url = "/thanks.jsp";
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
