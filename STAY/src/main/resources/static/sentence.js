// setence js and data entered sound line 4
var sentenceElement = document.getElementById("sentence");
var soundElement= document.getElementById("sound");
soundElement.play(); //sound
document.addEventListener("DOMContentLoaded", function() {
    var sentences = [
        sentenceElement,
        sentenceElement,
        sentenceElement
    ];

    var index = 0;
    
   
    var intervalId = setInterval(function() {
        sentenceElement.textContent = sentences[index];
        index = (index + 1) % sentences.length;
    }, 3000); // Change sentence every 2 seconds
   
    setTimeout(function() {
        clearInterval(intervalId); // Stop the interval after 10 seconds
        // Hide the sentence
        sentenceElement.style.display = "none"; 
        
    }, 3000); // 10 seconds in milliseconds
});
