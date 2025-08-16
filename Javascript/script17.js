
const quiz = [
  { 
    question: "Who invented Java?", 
    options: ["James Gosling","Dennis Ritchie","Bjarne Stroustrup","Guido van Rossum"], 
    answer: "James Gosling" 
  },
  { 
    question: "Which planet is known as the Red Planet?", 
    options: ["Earth","Mars","Jupiter","Venus"], 
    answer: "Mars" 
  },
  { 
    question: "What is the largest mammal on Earth?", 
    options: ["Elephant","Blue Whale","Giraffe","Hippopotamus"], 
    answer: "Blue Whale" 
  },
  { 
    question: "Which country gifted the Statue of Liberty to the USA?", 
    options: ["France","England","Germany","Italy"], 
    answer: "France" 
  },
  { 
    question: "Which is the fastest land animal?", 
    options: ["Lion","Tiger","Cheetah","Leopard"], 
    answer: "Cheetah" 
  }
];

let currentIndex = 0;
let score = 0;
function showQuestion(index) {
  const q = quiz[index];
  document.getElementById("question").textContent = q.question;
  const optionsDiv = document.getElementById("options");
  optionsDiv.innerHTML = ""; 
  
  q.options.forEach(option => {
    const btn = document.createElement("button");
    btn.textContent = option;
    btn.className = "option";
    btn.onclick = () => checkAnswer(option);
    optionsDiv.appendChild(btn);
  });
  
  document.getElementById("feedback").textContent = "";
}
function checkAnswer(selected) {
  const correct = quiz[currentIndex].answer;
  const feedback = document.getElementById("feedback");
  
  if (selected === correct) {
    feedback.textContent = "Correct!";
    feedback.style.color = "green";
    score++;
  } else {
    feedback.textContent = "Wrong!";
    feedback.style.color = "red";
  }
  
  document.getElementById("score").textContent = score
  const buttons = document.querySelectorAll(".option");
  buttons.forEach(btn => btn.disabled = true);
}
function nextQuestion() {
  currentIndex++;
  if (currentIndex >= quiz.length) {
    alert(`Quiz finished! Your score: ${score}/${quiz.length}`);
    currentIndex = 0;
    score = 0;
  }
  showQuestion(currentIndex);
}
showQuestion(currentIndex);
