# syafiqbank-api

This API is the backend for integration with syafiqbank-react project:-

https://github.com/syafiqnazim/syafiqbank-react

## Endpoint

After cloning this project, run it through your localhost and the default endpoint will be:-

http://localhost:8080

This project is being done using Java Spring Boot framework.

Database used for this project is H2 which has been embedded in Spring Boot. Each time you restart this project the database will refresh too.

## API List

<!-- CUSTOMER -->

## Customer

### Create Customer

- POST: /customer

Body:

- name: `<String>`

### Read Customer

- GET: /customer/{customersId}

### Update Customer

- PUT: /customer

Body:

- id: `<String>`
- name: `<String>`

### Delete Customer

- DELETE: /customer/{customersId}

---

### Get ALL Customer

- GET: /customers

---

<!-- ACCOUNT -->

## Account

### Create Account

- POST: /account

Body:

- accountType: `<String>`
- accountStatus: `<String>`
- customerId: `<int>`

### Read Account

- GET: /account/{accountnumber}

### Update Account

- PUT: /account/{accountnumber}

Body:

- accountNumber: `<int>`
- accountType: `<String>`
- accountStatus: `<String>`
- customerId: `<int>`

### Delete Account

- DELETE: /account/{accountnumber}

---

### Get ALL Accounts for user

- GET: /accounts/{customersId}

---

<!-- TRANSACTION -->

## Transaction

### Create Transaction

- POST: /transaction

Body:

- transactionType: `<String>`
- accountNumber: `<int>`
- amount: `<int>`

### Read Transaction

- GET: /transaction/{transactionId}

---

### Get ALL Transactions for account

- GET: /transactions/{accountnumber}

---
