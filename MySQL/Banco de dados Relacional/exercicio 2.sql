create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
tipo varchar(255),
tamanho char(10),
preco decimal not null,
cor varchar(255),
primary key (id)
);

insert into tb_produtos(tipo, tamanho, preco, cor) values ("camiseta", "G", 200, "vermelha");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("calca", "M", 600, "rosaa");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("saia", "GG", 800, "amarela");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("casaco", "P", 100, "roxa");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("bermuda", "PP", 350, "azul");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("jaqueta", "G", 750, "azul claro");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("bermuda", "M", 1000, "laranja");
insert into tb_produtos(tipo, tamanho, preco, cor) values ("casaco", "M", 50, "azul");

select * from tb_produtos;

select * from tb_produtos where preco < 500;
select * from tb_produtos where preco > 500;


