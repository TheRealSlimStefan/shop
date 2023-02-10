# Shop
Shop is a simulation of e-commerce cart, it also helps with product managing. This project is written in Spring.

## Table of contents
* [Technologies](#technologies)
* [Features](#features)
* [Planned data model](#planned-data-model)
* [Setup](#setup)
* [Examples of use](#examples-of-use)

## Technologies
- Spring
- Java 19
- PostgreSQL

## Features:
- Product managing by implemented CRUD operations - user can add products, edit their content, delete them, get whole list of products or just get one of them. All operations are performed on PostgreSQL database, which is used to store data.

- Simulation of real cart - user can perform also CRUD operations upon cart, adding product to cart and deleting products from it will cause change of total sum. 

- Data validation - every endpoint has default Spring or custom written validation, which throws exceptions when input from user is not valid.

- Aspect programming - every thrown exception is handled by special methods, which return errors with clear message for user what to change to perform given operation. Every error has adequate status code. 

- PDF document generating - user has a possibility to generate PDF document, which will contain content of cart in it.

## Database:
<img src="https://user-images.githubusercontent.com/66061781/218042065-d4b6318f-9638-403e-b905-6d042d976ddf.png" width="600"/> </br>

## Setup:
To run Shop application:
1. You need to download zip project from my GitHub repository.
2. Then you can unpack it and open with your IDE.
3. Next, you can run application.
4. After starting application you can start using it, with Postman or your custom Front-end.

## Examples of use:
### Adding a product:
<img src="https://user-images.githubusercontent.com/66061781/218041263-1290af2d-11a3-4681-be52-28ea32c0c29e.png" width="600"/> </br>

#### Adding product validations:
<img src="https://user-images.githubusercontent.com/66061781/218044335-99d826cc-ee40-48b1-85af-66f0c770a985.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218045396-a3e5e37d-caa1-4641-af1f-eeae3bd94417.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218044853-a6cce2f1-0c7d-44e6-a435-61e94e555140.png" width="600"/> </br>

### Displaying concrete product:
<img src="https://user-images.githubusercontent.com/66061781/218042775-dc51885a-7a68-4082-aca4-aa9b941c6499.png" width="600"/> </br>

#### Displaying concrete product validation:
<img src="https://user-images.githubusercontent.com/66061781/218043055-e40cb690-1ab9-431f-88c7-3edce925af10.png" width="600"/> </br>

### Displaying all products:
<img src="https://user-images.githubusercontent.com/66061781/218046025-0745e813-1732-434d-bca9-238397337753.png" width="600"/> </br>

### Deleting concrete product:
<img src="https://user-images.githubusercontent.com/66061781/218045035-fa0f5eca-dc3a-43a3-a537-c7fca397eca1.png" width="600"/> </br>

#### Deleting concrete product validation:
<img src="https://user-images.githubusercontent.com/66061781/218046600-ecf09bf1-78c5-4c06-95b6-ec70db6c975d.png" width="600"/> </br>

### Modifying concrete product:
<img src="https://user-images.githubusercontent.com/66061781/218047045-794c92e0-d36f-4807-98ea-24ad4410571b.png" width="600"/> </br>

#### Modyfing concrete product validation:
<img src="https://user-images.githubusercontent.com/66061781/218047356-1dd337dd-423d-49e4-8e61-0e1b1077dec3.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218047830-7f1d4476-79f3-420e-bc4e-fb9311ee9be4.png" width="600"/> </br>

### Creating cart:
<img src="https://user-images.githubusercontent.com/66061781/218048645-b9c1aa18-5068-4bae-b5f9-601c6bd3abad.png" width="600"/> </br>

#### Creating cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218053625-50d372a1-10ce-4b44-b26d-eb29ac916154.png" width="600"/> </br>

### Modifying cart by adding products to cart:
<img src="https://user-images.githubusercontent.com/66061781/218049205-df6e8a4b-e91c-40f7-8b10-a0df75f3c20e.png" width="600"/> </br>

#### Modifying cart by adding products to cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218054333-5ea1442b-d795-4482-b909-e21e7279a7ba.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218054532-20e455ab-d48f-40c5-b467-7e186d1ff816.png" width="600"/> </br>





