create table livros(
id bigint not null auto_increment,
titulo varchar(100) not null,
numeroPagina int not null,
dataLancamento date not null,
autorId int not null,
primary key (id)
);
