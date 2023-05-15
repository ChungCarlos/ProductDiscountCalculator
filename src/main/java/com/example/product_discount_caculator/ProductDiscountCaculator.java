package com.example.product_discount_caculator;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCaculator", value = "/index")
public class ProductDiscountCaculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float amount = (float) (price * discount * 0.01);
        float discountPrice = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /></head>");
        writer.println("<h1>Description: " + str + "</h1>");
        writer.println("<h1>Discount Amount: " + amount + "</h1>");
        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
        writer.println("</html>");
    }
}
