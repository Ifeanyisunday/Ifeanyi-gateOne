let scoreArray = [];
const prompt = require("prompt-sync")();
for(var count = 0; count < 10; count++){
	var score = prompt("Enter score");
	scoreArray.push(score);

}

console.log(scoreArray);

