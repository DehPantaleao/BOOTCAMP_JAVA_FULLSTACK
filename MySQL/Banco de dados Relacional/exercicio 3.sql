create database db_escola;
use db_escola;

create table tb_estudantes(
id bigint auto_increment,
nome varchar(255),
idade int,
classe varchar(255),
nota decimal not null,
primary key (id)
);

insert into tb_estudantes(nome, idade, classe, nota) value("Deborah", 3, "Infantol", 5.0);
insert into tb_estudantes(nome, idade, classe, nota) value("Sofia", 3, "Infantil", 5.5);
insert into tb_estudantes(nome, idade, classe, nota) value("Alanis", 3, "Infantil", 6.0);
insert into tb_estudantes(nome, idade, classe, nota) value("Felipe", 3, "Infantil", 7.0);
insert into tb_estudantes(nome, idade, classe, nota) value("Ana", 3, "Infantil", 7.5);
insert into tb_estudantes(nome, idade, classe, nota) value("Lucas", 3, "Infantil", 8.0);
insert into tb_estudantes(nome, idade, classe, nota) value("Vinicius", 3, "Infantil", 5.5);
insert into tb_estudantes(nome, idade, classe, nota) value("Luiz", 3, "Infantil", 9.0);

select * from tb_estudantes;
select * from tb_estudantes where nota < 7; 
select * from tb_estudantes where nota > 7;

alter table tb_estudantes modify nota decimal(6,2);
