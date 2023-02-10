# Shop
Shop is a simulation of e-commerce cart, it also helps with product managing. This project is written in Spring.

## Table of contents
* [Technologies](#technologies)
* [Features](#features)
* [Database:](#database)
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
<img src="https://user-images.githubusercontent.com/66061781/218108313-9ad5e83c-e58e-4f26-9319-b51180a174e6.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218044335-99d826cc-ee40-48b1-85af-66f0c770a985.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218045396-a3e5e37d-caa1-4641-af1f-eeae3bd94417.png" width="600"/> </br>

### Displaying concrete product:
<img src="https://user-images.githubusercontent.com/66061781/218042775-dc51885a-7a68-4082-aca4-aa9b941c6499.png" width="600"/> </br>

#### Displaying concrete product validation:
<img src="https://user-images.githubusercontent.com/66061781/218043055-e40cb690-1ab9-431f-88c7-3edce925af10.png" width="600"/> </br>

### Displaying all products:
<img src="https://user-images.githubusercontent.com/66061781/218109671-98e72f07-2c03-465f-9ed6-620e67d22779.png" width="600"/> </br>

### Deleting concrete product:
<img src="https://user-images.githubusercontent.com/66061781/218045035-fa0f5eca-dc3a-43a3-a537-c7fca397eca1.png" width="600"/> </br>

#### Deleting concrete product validation:
<img src="https://user-images.githubusercontent.com/66061781/218046600-ecf09bf1-78c5-4c06-95b6-ec70db6c975d.png" width="600"/> </br>

### Modifying concrete product:
<img src="https://user-images.githubusercontent.com/66061781/218047045-794c92e0-d36f-4807-98ea-24ad4410571b.png" width="600"/> </br>

#### Modyfing concrete product validation:
<img src="https://user-images.githubusercontent.com/66061781/218047356-1dd337dd-423d-49e4-8e61-0e1b1077dec3.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218111412-8f8194a0-9e53-4267-961f-6d611b298433.png" width="600"/> </br>

### Creating cart:
<img src="https://user-images.githubusercontent.com/66061781/218111643-00ebb35d-0a0e-4037-8501-78d2f9899918.png" width="600"/> </br>

#### Creating cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218053625-50d372a1-10ce-4b44-b26d-eb29ac916154.png" width="600"/> </br>

### Modifying cart by adding products to cart:
<img src="https://user-images.githubusercontent.com/66061781/218112114-e9215a53-fc3c-4392-a0f5-5decf7a6ad3b.png" width="600"/> </br>

#### Modifying cart by adding products to cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218054333-5ea1442b-d795-4482-b909-e21e7279a7ba.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218054532-20e455ab-d48f-40c5-b467-7e186d1ff816.png" width="600"/> </br>

### Modifying cart by changing quantity of product in it:
<img src="https://user-images.githubusercontent.com/66061781/218120032-d58a4f9e-88a2-4f7e-9480-737da42c1219.png" width="600"/> </br>

#### Modifying cart by changing quantity of product in it validation:
<img src="https://user-images.githubusercontent.com/66061781/218120451-efa37a2e-0b37-4a10-977c-54bb6a47b4c9.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218120205-f9473aac-b6fa-4298-83aa-216c71e54144.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218119832-08d29472-f3f8-462c-a95c-68159249cfb3.png" width="600"/> </br>

### Displaying concrete cart:
<img src="https://user-images.githubusercontent.com/66061781/218121846-7bfce781-2973-4bb3-96f9-0eb13f1a3d87.png" width="600"/> </br>

#### Displaying concrete cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218121990-ad5925c7-ab41-42f4-a720-5eeaa7a93e52.png" width="600"/> </br>

### Displaying all carts:
<img src="https://user-images.githubusercontent.com/66061781/218121504-12b81964-37df-4015-8316-24b1780b186f.png" width="600"/> </br>

### Generating PDF document based on cart:
<img src="https://user-images.githubusercontent.com/66061781/218122892-c124ced5-e31d-4c2b-963c-9599b165228f.png" width="600"/> </br>

#### Generating PDF document based on cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218123015-4196ae25-de6d-495c-af93-a5ec2f74b284.png" width="600"/> </br>

### Deleting product from cart:
<img src="https://user-images.githubusercontent.com/66061781/218123407-9d41249e-6b53-445c-9eee-d670f691ab19.png" width="600"/> </br>

#### Deleting product from cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218123842-7f9c05f2-059c-4317-95c9-00b01b92d5d9.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218123544-21dd26a2-30d3-49c4-965e-75caaea08cd7.png" width="600"/> </br>
<img src="https://user-images.githubusercontent.com/66061781/218123697-7846fcae-fd1b-49fc-b9d0-e58f8d01a007.png" width="600"/> </br>

### Deleting concrete cart:
<img src="https://user-images.githubusercontent.com/66061781/218124132-bd1a5da7-2293-41eb-966e-d9ae4fa7d871.png" width="600"/> </br>

#### Deleting concrete cart validation:
<img src="https://user-images.githubusercontent.com/66061781/218122529-f5bce644-2fc7-4510-b6aa-dd12fcfa2686.png" width="600"/> </br>

