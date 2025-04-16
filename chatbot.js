function sendMessage() {
  const input = document.getElementById("userInput").value;
  const chatbox = document.getElementById("chatbox");
  chatbox.innerHTML += "<div>User: " + input + "</div>";

  fetch('chatbot', {
    method: 'POST',
    headers: {'Content-Type': 'application/x-www-form-urlencoded'},
    body: 'message=' + encodeURIComponent(input)
  })
  .then(response => response.text())
  .then(reply => {
    chatbox.innerHTML += "<div>Bot: " + reply + "</div>";
    document.getElementById("userInput").value = '';
    chatbox.scrollTop = chatbox.scrollHeight;
  });
}