# sw_phase2
Prerequisite:
1-We Use Intellj IDE 
2-All Steps We Use To Make This Project Were Taken From (ENG: Ahmed Hassan 's Reference Video)
To Open Project 
  1- Open Intellj
  2- From File -> Open -> project path on your pc 
  3- Run Project 
  4- Open APIs Collection On Postman (in project Ziped file)
  5- Run each API As follow:
       

Most Complex Example
--------------------------------------------
1- User Sign Up
   --Open "signup" API Request--
URL : POST http://localhost:8080/User/Signup
Input With Json:
{
    "userName":"safa",
    "email":"semail",
    "password":"2020"
    
}
Output :
"Signed Up Successfully"
--------------------------------------------
2- User Sign In
   --Open "signin" API Request--
input in URL:
GET http://localhost:8080/User/Signin/semail/2020

Output :
"signed In Successfully"
--------------------------------------------
3- User Search For Service
   --Open "Search For Service" API Request--
input in URL:
GET http://localhost:8080/User/SearchServices/mobile
Output :
Etisalat Mobile Service 
Orange Mobile Service 
Vodafone Mobile Service 
WE Mobile Service
--------------------------------------------
4- User Make Transactions
   --Open "User Make Communications (mobile,internet) Service" API Request--
URL:
POST http://localhost:8080/User/Service/Communications
Input With Json:
{
     
    "id":1,
    "FirstUse":true,
    "phoneNumber":"123",
    "ServiceName" :"mobile",
    "ServiceProvider" : "we",
    "amount" : 100.0,
    "PaymentWay": "wallet"

   
}
Output :
"Your Transaction Added To System Successfully"

note: you can enter many transaction but you must change id variable
--------------------------------------------
5- Admin Review All System Transaction
  --Open "Admin Review All System Transactions" API Request--
Input In URL:
GET http://localhost:8080/Admin/Review/Transactions
Output:

[
    {
        "id": 1,
        "FirstUse": true,
        "phoneNumber": "123",
        "ServiceName": "mobile",
        "ServiceProvider": "we",
        "amount": 100.0,
        "PaymentWay": "wallet",
        "FoundationeName": "",
        "RefundStatus": false,
    }
]
--------------------------------------------
6- User Add Fund To Wallet  --> so he can use it for pay for his transaction latter
  --Open "User Add Fund To Wallet" API Request--
URL : POST http://localhost:8080/User/AddToWallet
Input with json :
{
    "balance" :6000,
    "cardid" : 1
}
 output: "Funds has been added successfully ;)"
--------------------------------------------------------------------------------------
7- Admin Review Add To Wallet Transactions
  --Open "Admin Review Add To Wallet Transactions" API Request--
input in URL : GET http://localhost:8080/Admin/Review/AddToWallet/Transaction

output:
[
    {
        "balance": 6000.0,
        "cardid": 1
    }
]
--------------------------------------------
8- User Pay For First Transaction (Trnasaction With ID = 1) By His Wallet
  --Open "user pay for Sevice by wallet" API Request--
input in URL : GET http://localhost:8080/User/pay/Wallet/1

output:
100.0
----------------------------------------------------------------------------
9- User Check Discount On Payment Transaction 
  --Open "user Get wallet discount" API Request--
input in URL : GET http://localhost:8080/User/Get/walletDiscount/1

output:
70.0

Explaination :
we discount 30% from transaction fees because
1- this first time for this user to use our system
2- he use we mobile service
details of transaction:
        "id": 1,
        "FirstUse": true,
        "ServiceName": "mobile",
        "ServiceProvider": "we",
        "amount": 100.0,
        "PaymentWay": "wallet",
-----------------------------------------------
10- User Check Fund in his wallet
  --Open "user check balance" API Request--
input in URL: GET http://localhost:8080/User/CheckBalance

output:
5930.0
--------------------------------------------
11- User Make Refund Request On First Transaction (Trnasaction With ID = 1)
  --Open "User Make Refund" API Request--
input in URL: GET http://localhost:8080/User/Make/RefundRequest/1

output:
"your request has been sent to admin to check it"
-----------------------------------------------------------------------------
12- Admin Review All system Refund Request Transactions 
  --Open "Admin Review Refund Request Transactions" API Request--
input in URL :GET http://localhost:8080/Admin/Check/RefundRequests

output:
[
    {
        "id": 1,
        "FirstUse": true,
        "phoneNumber": "123",
        "ServiceName": "mobile",
        "ServiceProvider": "we",
        "amount": 100.0,
        "PaymentWay": "wallet",
        "FoundationeName": "",
        "RefundStatus": true,
    }
]

--------------------------------------------------------
13- Admin Accept OR Reject Refund Request Transaction 
----if you want to accept refund request do followings----
  --Open "Admin Accept Refund Request" API Request--
input in URL : DELETE http://localhost:8080/Admin/Accept/RefundRequest/1

output:
"This Refund Request Transaction Accepted"

OR

----if you want to reject refund request do followings----
  --Open "Admin Reject Refund Request" API Request--
input in URL : DELETE http://localhost:8080/Admin/Reject/RefundRequest/1

output:
"This Refund Request Transaction Rejected

--------------------------------------------------------
