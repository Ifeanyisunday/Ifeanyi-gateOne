const prompt = require("prompt-sync")();
let boxList = new Array(9);

	for(let index = 0; index < boxList.length; index++){
		let userInput = prompt("Enter X or O ");
		let boxNumber = prompt("Enter box number ");

		for(let count = 0; count < boxList.length; count++){
			if(boxNumber == 1){
				boxList[0] = userInput;	
			}else if(boxNumber == 2){
				boxList[1] = userInput;	
			}else if(boxNumber == 3){
				boxList[2] = userInput;	
			}else if(boxNumber == 4){
				boxList[3] = userInput;	
			}else if(boxNumber == 5){
				boxList[4] = userInput;	
			}else if(boxNumber == 6){
				boxList[5] = userInput;	
			}else if(boxNumber == 7){
				boxList[6] = userInput;	
			}else if(boxNumber == 8){
				boxList[7] = userInput;	
			}else if(boxNumber == 9){
				boxList[8] = userInput;	
			}
		}


	}

		
console.log(`|${boxList[0]}||${boxList[1]}||${boxList[2]}|\n|${boxList[3]}||${boxList[4]}||${boxList[5]}|\n|${boxList[6]}||${boxList[7]}||${boxList[8]}|`);

