@WebServlet("/chatbot")
public class ChatbotServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        String message = request.getParameter("message").toLowerCase();
        String reply;
        if (message.contains("stressed")) {
            reply = "Try to relax and breathe deeply. Would you like to evaluate your stress level?";
        } else {
            reply = "I'm here to help. Tell me more about how you're feeling.";
        }
        response.setContentType("text/plain");
        response.getWriter().write(reply);
    }
}