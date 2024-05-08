let scoreArray = [];
const prompt = require("prompt-sync")();
for(let count = 0; count < 10; count++){
	let score = prompt("Enter score");
	//scoreArray[count] = score;
	scoreArray.push(score);

}
console.log(scoreArray);