let arr = [12, 3, 18, 5, 7, 9];
function displayEvenIndex(numbers){
	let evenIndex = [];
	for(let count = 0; count < numbers.length; count++){
		if(count % 2 == 0){
			evenIndex.push(numbers[count]);
		}

	}
	return evenIndex;

}

let result = displayEvenIndex(arr);
console.log(result);