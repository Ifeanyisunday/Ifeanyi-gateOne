const prompt = require("prompt-sync")();
let userInput = prompt("Enter your date of birth: ");

function findAge(numbers){
	let charAtZero = numbers.charAt(0);
	let charAtOne = numbers.charAt(1);	
	
	let charAtThree = numbers.charAt(3);
	let charAtFour = numbers.charAt(4);

	let charAtSix = numbers.charAt(6);
	let charAtSeven = numbers.charAt(7);
	let charAtEight = numbers.charAt(8);
	let charAtNine = numbers.charAt(9);

	let day1 = Number(charAtZero);
	let day2 = Number(charAtOne);

	let month1 = Number(charAtThree);
	let month2 = Number(charAtFour);

	let year1 = Number(charAtSix);
	let year2 = Number(charAtSeven);
	let year3 = Number(charAtEight);
	let year4 = Number(charAtNine);

	if(day1 >= 1){
		getDate = (day1 * 10) + day2;
	}else{
		getDate = day2;
	}

	if(month1 >= 1){
		getMonth =  (month1 * 10) + month2;	
	}else{
		getMonth = month2;
	}

	if(year1 >= 1){
		getYear =  (year1 * 1000) + (year2 * 100) + (year3 * 10) + year4 ;	
	}else{
		getYear = year4;
	}

	const currentYear = 2024;
	let numberOfMonthInYear = 12;
	let yearRange = currentYear - getYear;
	let monthRange = yearRange * numberOfMonthInYear;
	let getMonthCount = getMonth;
	let countAge = 0;

	for(let index = getMonth; index < monthRange; index+=12){
		getMonthCount += 12;
		if(getMonthCount > monthRange){
			break;
		}
		countAge += 1;	
	}
	
	return countAge;
}

console.log("You are " + findAge(userInput) + "years old");