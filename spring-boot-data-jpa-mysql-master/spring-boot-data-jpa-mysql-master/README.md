# Spring Boot JPA MySQL - Building Rest CRUD API example

create database with name vacc

CREATE DATABASE vacc;

How to use :
Open postman and hit biven below API

1. Add vaccines 
http://localhost:9596/api/vaccines
Method:POST

Payload:

{
    "id":3,
	
    "vaccine_name":"Covishield"
}

2 Get All added vaccines

http://localhost:9596/api/vaccines

Method:GET

3. create branch 

http://localhost:9596/api/branches

Method:POST
Payload:

{
    "id":3,
	
    "branch_name": "abc11",
	
    "vaccines_quantity":"150",
	
    "available_date":"2021-01-23T17:04:57",
	
    "vaccines":1,
	
    "availability":true
}

4. Get All branch

http://localhost:9596/api/branches

Method:GET

