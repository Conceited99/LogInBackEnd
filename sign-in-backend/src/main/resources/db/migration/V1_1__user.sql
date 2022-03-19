CREATE Table user(
id int not null auto_Increment primary key,
username varchar(50) unique ,
password varchar(50),
created_at timestamp
);