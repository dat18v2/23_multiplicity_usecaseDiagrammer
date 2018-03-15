# Bank Example
An example of Object Oriented Analysis, Design and Programming.   

## Description
A Customer opens a bank account in a bank.   
After opening the account the customer can withdraw, deposit and check his balance at any time he wants.    
The bank charges a fee of 10kr. for every withdraw a customer makes.    
The Customer can not withdraw more money than is on the account including the fee.    
The bank also has an interest rate of 8.5%, which is used for calculating a certain amount of interest on the amount deposited by the customer.    
The Customer are allowed to have several accounts in this bank.     


> **Task:** Define the actor(s) and the possible _Use Cases_ from the Description above    


## Use Cases
>**Task:** Write the Use Cases   

#### UC#1: Withdraw Money   
Actor: Customer   
Customer requests to withdraw money from his account and specifies the amount.    
The bank puts on a fee of 10 kr. when a withdrawal is made, so the customer gets the requested amount, and the fee is subducted on the remaining balance of the account.  

#### UC#2: Deposit Money
Actor: Customer    
The Customer requests to deposit money. The bank calculates the interest based on the interest rate and the amount just deposited, the interest and the amount is summed. The sum is then added to the account balance.

#### UC#3: Check Balance
Actor: Customer    
Customer requests to see the balance of his account.     
The account number and name of the customer together with the balance is displayed.   

## Noun List
>**Task:** From the Use Cases you should identify all the _Nouns_. These nouns are the objects and 
attributes of the object in a Domain Model.

<pre>
Customer, Money, 
Account, Amount, 
Bank, Fee, Balance, 
Error message, 
interest, interest rate, Account Number, 
Customer Name     
</pre>
   
## Domain Model
>**Task:** Based on the Noun List, create a  _Domain Model_      

![](https://github.com/dat16j/bank_example/blob/master/img/DomainModelBank-3.png)

## Verb List
>**Task:** Create a _Verb List_    
The verbs, like the nouns, are found in the Use Cases. They are the named assosiations in the domain model and the methods in the Classes   

Verbs = Actions = Methods   

Withdraw   
Display error message  
Deposit   
Calculate interest   
Add to balance   
Check Balance   

## Class Methods
>**Task:** Where would you put these methods?    
_(Hint: Methods should either **read** or **change** the data of the object)_     

<table>
<tr>
<td><img src="https://github.com/dat16j/bank_example/blob/master/img/MethodAccont.png" width="200"></td>
<td><h3>withdraw()</h3> 
<h3>deposit()</h3>
<h3>checkBalance()</h3> 
</td>
<td><img src="https://github.com/dat16j/bank_example/blob/master/img/MethodCustomer.png" width="200"></td>
</tr>
</table>

>**Solution**      
      
      
They all goes into _Account_ Class, hence they either _read_ or _change_ the attributes of this class
<table>
<tr>
<td><img src="https://github.com/dat16j/bank_example/blob/master/img/MethodAccountII.png" width="200"></td>
<td><h3></h3> 
<h3></h3>
<h3></h3> 
</td>
<td><img src="https://github.com/dat16j/bank_example/blob/master/img/MethodCustomer.png" width="200"></td>
</tr>
</table>



## Class Diagram
>**Task:** Create a _Class Diagram_ containing _Customer_ and _Account_
      

![Class Diagram](https://github.com/dat16j/bank_example/blob/master/img/bank_class_1.png)



## Class Relations
>**Task:** Add an association to the Class Diagram above.    
It should either be of the type: _Assosiation_, _Aggregation_ or _Composition_     
      
![Composition](https://github.com/dat16j/bank_example/blob/master/img/class_composition.png)


## Code
>**Task:** Based on your Class Diagram, create the Java _Classes_ with _Methods_ and _Attributes_    
    
* [Account.java](https://github.com/dat16j/bank_example/blob/master/Account.java)
* [Customer.java](https://github.com/dat16j/bank_example/blob/master/Customer.java)

## Finnish your program
This concludes the Object Oriented Analasys, Design and Programming circle.     
As you will have noticed a lot of code is still missing for you to have a fully working bank example.    

>**Task:** Finish the program, and remember to update the affected diagram and use cases if somthing changes.    
    
        
&copy; Kea, clbo@kea.dk 2016
