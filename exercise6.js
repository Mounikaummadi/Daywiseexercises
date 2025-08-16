
const movie = {
    movieName: "Inception",
    movieLanguage: "English",
    imdbRating: 8.8
};

const { movieName, movieLanguage, imdbRating } = movie;

document.getElementById("output").innerHTML = `
<b>Movie Name:</b> ${movieName} <br>
<b>Language:</b> ${movieLanguage} <br>
<b>IMDB Rating:</b> ${imdbRating}
`;


console.log("Movie Name:", movieName);
console.log("Language:", movieLanguage);
console.log("IMDB Rating:", imdbRating);

