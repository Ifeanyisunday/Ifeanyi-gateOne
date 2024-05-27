const prompt = require("prompt-sync")();
let firstName = [];
let lastName = [];
let phoneNo = [];

function addContact(){
	let userFirstName = prompt("Enter first name: ");
	firstName.push(userFirstName); 
	let userLastName = prompt("Enter last name: ");
	lastName.push(userLastName);
	let userPhoneNo = prompt("Enter phone number: ");
	phoneNo.push(userPhoneNo);  
	console.log(">>>>>>>>> Contact saved successfully <<<<<<<<<<<");
	let desicion = prompt("Do you want to continue? ");
	if(desicion == "yes"){
		menu();
	}
}

function findContactByPhoneNo(){
	let phoneNumber = prompt("Enter mobile number: ");
	for(let element = 0; element < phoneNo.length; element++){
		if(phoneNumber == phoneNo[element]){
			console.log(firstName[element] + " " + lastName[element] + "\n" + phoneNo[element]);
		} 
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}

function findContactByFirstName(){
	let userFirstName = prompt("Enter first name: ");
	for(let index = 0; index < firstName.length; index++){
		if(userFirstName == firstName[index]){
			console.log(firstName[index] + " " + lastName[index] + "\n" + phoneNo[index]);
		} 
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}

function findContactByLastName(){
	let userLastName = prompt("Enter last name: ");
	for(let index1 = 0; index1 < lastName.length; index1++){
		if(userLastName == lastName[index1]){
			console.log(firstName[index1] + " " + lastName[index1] + "\n" + phoneNo[index1]);
		} 
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}


function editContact(){
	let contactName = prompt("Enter contact first name: ");
	for(let index2 = 0; index2 < firstName.length; index2++){
		if(contactName == firstName[index2]){
			console.log(firstName[index2] + " " + lastName[index2]);
			console.log("");
			console.log("Edit contact");
			let newFirstName = prompt("Enter new first name: ");
			firstName[index2] = newFirstName;
			
			let newLastName = prompt("Enter new last name: ");
			lastName[index2] = newLastName;

			let newPhoneNumber = prompt("Enter new phone number: ");
			phoneNo[index2] = newPhoneNumber;
		}
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}


function menu(){
	console.log("CHOOSE PERFERRED OPTION","\n", "1 -> Add contact","\n", "2 -> Remove contact", "\n", "3 -> Find contact by phone number","\n", "4 -> Find contact by first name","\n", "5 -> Find contact by last name","\n", "6 -> Edit contact","\n", "7 -> Back to menu");

let select = Number(prompt("Enter preferred number: "));
switch(select){
	case 1: 
		addContact();
		break;
	case 2: 
		console.log("remove contact");
		break;

	case 3: 
		findContactByPhoneNo();
		break;
	case 4: 
		findContactByFirstName();
		break;
	case 5: 
		findContactByLastName();
		break;
	case 6: 
		editContact();
		break;
	case 6: 
		menu();
		break;
}
}


console.log("CHOOSE PERFERRED OPTION","\n", "1 -> Add contact","\n", "2 -> Remove contact", "\n", "3 -> Find contact by phone number","\n", "4 -> Find contact by first name","\n", "5 -> Find contact by last name","\n", "6 -> Edit contact","\n", "7 -> Back to menu");

let select = Number(prompt("Enter preferred number: "));
switch(select){
	case 1: 
		addContact();
		break;
	case 2: 
		console.log("remove contact");
		break;

	case 3: 
		findContactByPhoneNo();
		break;
	case 4: 
		findContactByFirstName();
		break;
	case 5: 
		findContactByLastName();
		break;
	case 6: 
		editContact();
		break;
	case 6: 
		menu();
		break;
}