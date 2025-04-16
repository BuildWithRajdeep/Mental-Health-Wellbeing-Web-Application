@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try (Connection conn = ConnectServlet.connect()) {
            PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM Users WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                response.sendRedirect("dashboard.html");
            } else {
                response.getWriter().println("Login Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}