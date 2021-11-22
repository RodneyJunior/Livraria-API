create table autores(
id bigint not null auto_increment,
nome varchar(50) not null,
email varchar(40) not null,
minicurriculo varchar(500) not null,
datanascimento date,
primary key (id)
);