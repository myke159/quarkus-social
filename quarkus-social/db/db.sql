create table quarkus-social;

create table USERS (
	id bigserial not null primary key,
	name varchar(100) not null,
	age integer not null
)