create table livros(
id bigint not null auto_increment,
titulo varchar(100) not null,
numeroPagina int not null,
dataLancamento date not null,
autor_id bigint not null,
primary key (id)
);
alter table livros add foreign key (autor_id) references autores(id);