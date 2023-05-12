CREATE DATABASE db_rh;
USE db_rh;

create table tb_colaboradores(
id bigint auto_increment,
nome varchar(255) not null,
idade int,
salario decimal not null,
funcao varchar(255),
primary key (id)
);

insert into tb_colaboradores(nome, idade, salario, funcao) values ("deborah", 30, 1000, "gerente");
insert into tb_colaboradores(nome, idade, salario, funcao) values ("maria", 25, 5000, "supervisor");
insert into tb_colaboradores(nome, idade, salario, funcao) values ("jose", 18, 1800, "estagiario");
insert into tb_colaboradores(nome, idade, salario, funcao) values ("ana", 25, 2000, "operador");
insert into tb_colaboradores(nome, idade, salario, funcao) values ("marlene", 27, 2000, "operador");

select * from tb_colaboradores;

select * from tb_colaboradores where salario < 2000;
select * from tb_colaboradores where salario > 2000;