const prompt = require("prompt-sync")();

let profile = [];
let phoneNo = [];
let pin = [];
let accountBalance = [];





function header(){

		console.log("===============================");

		console.log("WELCOME TO BANKE BANK");

		console.log("===============================");

}

function createAccountName(){
	const prompt = require("prompt-sync")();
	let userNames = prompt("Enter first name and last name: ");
	return userNames;
}

function phoneNumber(){
	const prompt = require("prompt-sync")();
	let userPhoneNumber = prompt("Enter phone number: ");
	return userPhoneNumber;
}

function createPin(){
	const prompt = require("prompt-sync")();
	let userPin = prompt("Enter pin: ");
	let pinLength = userPin.length;
	if(pinLength < 4 || pinLength > 4){
		console.log("Wrong pin!!! logging out");
	}else{
	return userPin;
	}
}

function createAccount(){
	let createNewAccount;
	let counter = 0;
	let balance = 0;
	do{
		profile.push(createAccountName());
		phoneNo.push(phoneNumber());
		pin.push(createPin());
		accountBalance.push(balance);
		console.log(">>>>>>>>Account created successfully<<<<<<<<<<<<");
		createNewAccount = prompt("Do you want to create a new Account? ");
		counter++;
	}while(createNewAccount == "yes");
	let desicion = prompt("Do you want to continue? ");
	if(desicion == "yes"){
		menu();
	}

}


function deposit(){
	let name2 = prompt("Enter account name: ");
	let userDepositAmount = Number(prompt("Enter deposit amount: "));
	for(let count2 = 0; count2 < accountBalance.length; count2++){
		if(name2 == profile[count2]){
			accountBalance[count2] = accountBalance[count2] + userDepositAmount;
			console.log("You just deposited " + userDepositAmount);
			console.log("Your account balance is " + accountBalance[count2]);
		}
	}
	let desicion2 = prompt("Do you want to continue? ");
	if(desicion2 == "yes"){
		menu();
	}
}


function withdrawal(){
	let name3 = prompt("Enter account name: ");
	let userWithdrawAmount = Number(prompt("Enter withdraw amount: "));
	for(let count3 = 0; count3 < accountBalance.length; count3++){
		if(name3 == profile[count3]){
			accountBalance[count3] = accountBalance[count3] - userWithdrawAmount;
			console.log("You have been debited " + userWithdrawAmount);
			console.log("Your account balance is " + accountBalance[count3]);
		}
	}
	let desicion3 = prompt("Do you want to continue? ");
	if(desicion3 == "yes"){
		menu();
	}
}

function transfer(){
	let enterRecipentName = prompt("Enter Recipent account name: ");
	let name4 = prompt("Enter your account name: ");
	let inputPin = prompt("Enter your pin: ");
	let userTransferAmount = Number(prompt("Enter transfer amount: "));
	for(let index4 = 0; index4 < accountBalance.length; index4++){
		if(inputPin == pin[index4]){
			if(userTransferAmount <= accountBalance[index4]){
				accountBalance[index4] -= userTransferAmount;
				for(let count4 = 0; count4 < accountBalance.length; count4++){
					if(enterRecipentName == profile[count4]){
					accountBalance[count4] = accountBalance[count4] + userTransferAmount;
					console.log("Dear " + enterRecipentName + " You just received " + userTransferAmount + " from " + name4);
					}
				}
			}else{
				console.log("Transaction failed!!! Account balance is too low")
			}

		}else{
			console.log("Account doesn't exist");
		}
		
	let desicion4 = prompt("Do you want to continue? ");
	if(desicion4 == "yes"){
		menu();
	}
	}
}


function changePin(){
let oldPin = prompt("Enter old pin: ");
for(let index5 = 0; index5 < accountBalance.length; index5++){
	if(oldPin == pin[index5]){
		let newPin = prompt("Enter new pin: ");
		pin[index5] = newPin;
		console.log("Your new pin is " + pin[index5]);
		break;
	}
}
	let desicion5 = prompt("Do you want to continue? ");
	if(desicion5 == "yes"){
		menu();
	}
}

function checkBalance(){
	let name6 = prompt("Enter account name: ");
	for(let index6 = 0; index6 < accountBalance.length; index6++){
		if(name6 == profile[index6]){
			console.log("Your account balance is " + accountBalance[index6]);
			break;
		}else
	}
	let desicion6 = prompt("Do you want to continue? ");
	if(desicion6 == "yes"){
		menu();
	}
}

function menu(){
	console.log("");
console.log("CHOOSE YOUR PREFERED OPTION", "\n", "1. Create Account", "\n", "2. Deposit", "\n", "3. Withdraw", "\n", "4. Transfer", "\n", "5. Change pin", "\n", "6. Check Balance", "\n", "7. Back to Main Menu");
console.log("");
let select = Number(prompt("Enter number: "));
	switch(select){
		case 1:
			createAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdrawal();
			break;
		case 4:
			transfer();
			break;
		case 5:
			changePin();
			break;
		case 6:
			checkBalance();
			break;
		case 7:
			menu();
			
	}
}


header()
console.log("");
console.log("CHOOSE YOUR PREFERED OPTION", "\n", "1. Create Account", "\n", "2. Deposit", "\n", "3. Withdraw", "\n", "4. Transfer", "\n", "5. Change pin", "\n", "6. Check Balance", "\n", "7. Back to Main Menu");
console.log("");
let select = Number(prompt("Enter number: "));
	switch(select){
		case 1:
			createAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdrawal();
			break;
		case 4:
			transfer();
			break;
		case 5:
			changePin();
			break;
		case 6:
			checkBalance();
			break;
		case 7:
			menu();
			
	}


