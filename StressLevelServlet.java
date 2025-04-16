@WebServlet("/stress-level")
public class StressLevelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        int level = Integer.parseInt(request.getParameter("level"));
        int userId = Integer.parseInt(request.getParameter("user_id"));

        try (Connection conn = ConnectServlet.connect()) {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO StressReports (user_id, level, timestamp) VALUES (?, ?, NOW())");
            ps.setInt(1, userId);
            ps.setInt(2, level);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}