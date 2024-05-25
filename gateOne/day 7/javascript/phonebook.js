const prompt = require("prompt-sync")();
let firstName = [];
let lastName = [];
let phoneNo = [];

function addContact(){
	let userFirstName = prompt("Enter first name");
	firstName.push(userFirstName); 
	let userLastName = prompt("Enter last name");
	lastName.push(userLastName);
	let userPhoneNo = prompt("Enter phone number");
	phoneNo.push(userPhoneNo);  
	console.log(">>>>>>>>> Contact saved successfully <<<<<<<<<<<");
	let desicion = prompt("Do you want to continue? ");
	if(desicion == "yes"){
		menu();
	}
}

function findContactByPhoneNo(){
	let count = 0;
	let phoneNumber = prompt("Enter mobile number: ");
	for(let element : phoneNo){
		if(phoneNumber == element){
			console.log(firstName[count] + lastName[count] + "\n" + phoneNo[count]);
		} 
		count++;
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}

function findContactByFirstName(){
	let count = 0;
	let userFirstName = prompt("Enter mobile number: ");
	for(let element : firstName){
		if(userFirstName == element){
			console.log(firstName[count] + lastName[count] + "\n" + phoneNo[count]);
		} 
		count++;
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}