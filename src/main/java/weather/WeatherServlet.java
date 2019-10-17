package weather;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pogoda")
public class WeatherServlet extends HttpServlet {
    private String miastoParam;
    private TemperaturaPomocnicza tp;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        miastoParam = request.getParameter("miasto");
        if (miastoParam == null || miastoParam.equals("")) {
            miastoParam = "wroclaw";
//            response.sendRedirect("pogoda");
        }
        double tempMiasto = App.tempMiasto(miastoParam);
        tp = new TemperaturaPomocnicza(tempMiasto);
        request.setAttribute("tempera", tp);

        request.getRequestDispatcher("index.jsp").forward(request, response);
//        response.sendRedirect("pogoda");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
