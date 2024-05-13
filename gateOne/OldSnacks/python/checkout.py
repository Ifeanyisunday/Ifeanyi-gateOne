customername = str(input("what is the customer's name: "))

storeitem = []
storequantity = []
totalprice = []
totalamount = []
total = 0

count = 1
item = str(input("what did the user buy?: "))
storeitem.append(item)	

quantity = int(input("How many pieces?: "))
storequantity.append(quantity)

price = float(input("how many units?: "))
totalamount.append(price * quantity)
totalprice.append(price)
total += price * quantity
additem = str(input("Add more items?: "))

while additem.lower() == "yes":
	count += 1  
	item = str(input("what did the user buy?: "))
	storeitem.append(item)	
	quantity = int(input("How many pieces?: "))
	storequantity.append(quantity)
	price = float(input("how many units?: "))
	totalprice.append(price)
	totalamount.append(price * quantity)
	total += price * quantity

	additem = str(input("Add more items?: "))
	if additem.lower() != "yes":
		break
print()
cashiername = str(input("what is your name?: "))
print()
discount_rate = int(input("How much discount will he/she get?: "))
print()
get_discount = total * discount_rate / float(100)
vat = total * 17.50 / 100
print()
print(" SEMICOLON STORES\n","MAIN BRANCH\n","LOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n","TEL: 03293828343\n","Date : 18-Dec-24 8:48:11pm")
print("===========================================================================================================================================")
print(f"{"ITEM":<5}   {"QTY":<5}   {"PRICE":<}   {"TOTAL":<5}");
print("-------------------------------------------------------------------------------------------------------------------------------------------")

index = 0
while index < count:
	print(f"{storeitem[index]:<7} {storequantity[index]:<7} {totalprice[index]:<7} {totalamount[index]:<5}") 
	index += 1
print()
print(f"Sub-total:   {total:<9}")
print(f"Discount:    {get_discount:<9}")
print(f"VAT @17.50:  {vat:.2f}")

print("===========================================================================================================================================")
total_bill = total + vat - get_discount
print(f"Bill Total:  {total_bill:<9}")
print("===========================================================================================================================================")
print(f"THIS IS NOT A RECEIPT KINDLY PAY  {total_bill}")
print()

customer_cash = float(input("How did the customer give to you?: "))
balance = customer_cash - total_bill
print()
print(" SEMICOLON STORES\n","MAIN BRANCH\n","LOCATION: HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n","TEL: 03293828343\n","Date : 18-Dec-24 8:48:11pm")
print("===========================================================================================================================================")
print(f"{"ITEM":<5}   {"QTY":<5}   {"PRICE":<}   {"TOTAL":<5}");
print("-------------------------------------------------------------------------------------------------------------------------------------------")

index = 0
while index  < count:
	print(f"{storeitem[index]:<7} {storequantity[index]:<7} {totalprice[index]:<7} {totalamount[index]:<5}")  
	index += 1
print()
print(f"Sub-total:   {total:<9}")
print(f"Discount:    {get_discount:<9}")
print(f"VAT @17.50:  {vat:.2f}")
print("===========================================================================================================================================")
print(f"Bill Total:  {total_bill}")
print(f"Amount paid:  {customer_cash:<9}")
print(f"Balance:  {balance:<9}")
print("===========================================================================================================================================")
print(f"THANK YOU FOR YOUR PATRONAGE")
print("===========================================================================================================================================")