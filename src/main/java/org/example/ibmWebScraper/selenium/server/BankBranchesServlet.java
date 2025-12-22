package org.example.ibmWebScraper.selenium.server;

//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class BankBranchesServlet /*extends HttpServlet*/ {
//    private static List<String> emails = new ArrayList<>();
//    private static List<String> mobiles = new ArrayList<>();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setHeader("Cache-Control", "private, no-cache");
//        response.setHeader("Pragma", "no-cache");
//        response.setCharacterEncoding("UTF-8");
//
//        if (request.getParameter("emailAddresses") != null) {
//            emails = Arrays.asList(request.getParameter("emailAddresses").split(","));
//            mobiles = Arrays.asList(request.getParameter("mobileNumbers").split(","));
//            response.getWriter().write("Done");
//        } else {
//            String file = new String(Files.readAllBytes(Paths.get("website/home.html")));
//            for (int i = 0; i < 12; i++) {
//                if (i < emails.size()) {
//                    file = file.replaceAll("\\bENA" + (i + 1) + "\\b", emails.get(i));
//                }
//                if (i < mobiles.size()) {
//                    file = file.replaceAll("\\bMNA" + (i + 1) + "\\b", mobiles.get(i));
//                }
//            }
//            response.getWriter().write(file);
//        }
//    }
}
