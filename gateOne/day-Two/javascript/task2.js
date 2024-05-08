let scoreArray = [];
const prompt = require("prompt-sync")();
for(var count = 0; count < 10; count++){
	var score = prompt("Enter score: ");
	scoreArray[count] = score;

}

for(var count = 0; count < scoreArray.length; count++){
	console.log(scoreArray[count]);
}
