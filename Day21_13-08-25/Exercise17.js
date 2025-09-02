const questions = [
  {
    question: "Who was the eldest Pandava?",
    options: ["Bhima", "Yudhishthira", "Arjuna", "Nakula"],
    answer: "Yudhishthira"
  },
  {
    question: "Who was the teacher of both Pandavas and Kauravas?",
    options: ["Kripacharya", "Dronacharya", "Bhishma", "Ashwatthama"],
    answer: "Dronacharya"
  },
  {
    question: "What was the name of Arjuna's bow?",
    options: ["Pinaka", "Sharanga", "Gandiva", "Vajra"],
    answer: "Gandiva"
  },
  {
    question: "Who narrated the Bhagavad Gita to Arjuna?",
    options: ["Krishna", "Vyasa", "Bhishma", "Narada"],
    answer: "Krishna"
  },
  {
    question: "Who was the mother of Karna?",
    options: ["Kunti", "Gandhari", "Radha", "Draupadi"],
    answer: "Kunti"
  },
  {
    question: "Which Pandava was known for his strength?",
    options: ["Arjuna", "Bhima", "Nakula", "Sahadeva"],
    answer: "Bhima"
  },
  {
    question: "Who was the commander of the Kaurava army on the first day of war?",
    options: ["Duryodhana", "Bhishma", "Karna", "Dronacharya"],
    answer: "Bhishma"
  }
];

let currentQuestion = 0;
let score = 0;
let answered = false;

function loadQuestion() {
  const q = questions[currentQuestion];
  document.getElementById("question").textContent = q.question;

  const optionsList = document.getElementById("options");
  optionsList.innerHTML = "";

  q.options.forEach(option => {
    const li = document.createElement("li");
    const btn = document.createElement("button");
    btn.textContent = option;
    btn.onclick = () => checkAnswer(option);
    li.appendChild(btn);
    optionsList.appendChild(li);
  });

  document.getElementById("feedback").textContent = "";
  answered = false;
}

function checkAnswer(selected) {
  if (answered) return;

  const correct = questions[currentQuestion].answer;
  const feedback = document.getElementById("feedback");

  if (selected === correct) {
    feedback.textContent = "Correct!";
    score++;
  } else {
    feedback.textContent = "Wrong!";
  }

  document.getElementById("score").textContent = `Score: ${score}`;
  answered = true;
}

function nextQuestion() {
  if (currentQuestion < questions.length - 1) {
    currentQuestion++;
    loadQuestion();
  } else {
    document.getElementById("question").textContent = "Quiz Completed!";
    document.getElementById("options").innerHTML = "";
    document.getElementById("feedback").textContent = `Final Score: ${score}/${questions.length}`;
    document.querySelector("button").disabled = true;
  }
}


loadQuestion();