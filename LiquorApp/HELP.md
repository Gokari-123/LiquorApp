# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.0/reference/web/servlet.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.0/reference/data/sql.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.


### Testing in Postman

### 1 Get Api--> getAllLiquors 
url : http://localhost:8080/api/liquors/

response :
[
{
"id": 1,
"name": "Johnnie Walker",
"type": "Whisky",
"price": 1500.0
},
{
"id": 2,
"name": "Old Monk",
"type": "Rum",
"price": 500.0
},
{
"id": 3,
"name": "Kingfisher",
"type": "Beer",
"price": 150.0
},
{
"id": 4,
"name": "Remy Martin",
"type": "Brandy",
"price": 790.0
},
{
"id": 5,
"name": "BP",
"type": "Brandy",
"price": 1350.0
}
]

### 2 Get Api--> gettype

url: http://localhost:8080/api/liquors/type/Beer

Response :
[
{
"id": 3,
"name": "Kingfisher",
"type": "Beer",
"price": 150.0
}
]

### 3 Post Api--> bill
url : http://localhost:8080/api/liquors/bill

Request : 
{
"1": 3,
"2": 3,
"3": 3,
"4": 3
}

Response :

8820.0



