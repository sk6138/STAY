document.getElementById("contact-form").addEventListener("submit", function(event) {
    event.preventDefault();
  
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var message = document.getElementById("message").value;
  
    // Here you can perform actions like sending the form data to a server using AJAX
    // For demonstration purposes, let's just show a success message
    document.getElementById("status").innerHTML = "Thank you, " + name + "! Your message has been sent.";
    document.getElementById("contact-form").reset();
  });
  