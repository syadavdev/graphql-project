drop table if exists `employee`;
create table employee (
    employee_id int primary key not null unique auto_increment,
    first_name varchar(100) not null unique,
    last_name varchar(100) not null,
    password varchar(100) not null,
    phone_number varchar(100) not null
);

insert into employee(first_name, last_name, password, phone_number)
values ("sandeep" , "yadav", "password", "phone_number");

insert into employee(first_name, last_name, password, phone_number)
values ("vivek" , "tyagi", "password", "phone_number");

insert into employee(first_name, last_name, password, phone_number)
values ("vineet" , "kumar", "password", "phone_number");

insert into employee(first_name, last_name, password, phone_number)
values ("vijay" , "kumar", "password", "phone_number");