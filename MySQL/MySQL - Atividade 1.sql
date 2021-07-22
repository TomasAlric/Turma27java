create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe (
 -- ATRIBUTOS
	id bigint auto_increment,
	classe varchar (30),
	nivel varchar (30),
	reino varchar (30),

	primary key (id)

);

create table tb_personagem (
	-- ATRIBUTOS
    id bigint auto_increment,
	nome varchar(30) not null,
    vida bigint not null,
    ataque bigint not null,
    defesa bigint not null,
    magia bigint not null,
    classe_id bigint not null,
    
    primary key(id),
    foreign key (classe_id) references tb_classe(id)
    


);


-- POULANDO TABELA CLASSE
insert into tb_classe (classe,nivel,reino) values ("guerreiro", 5, "bronze");
insert into tb_classe (classe,nivel,reino) values ("mago", 10, "cobre");
insert into tb_classe (classe,nivel,reino) values ("clérico", 7," titanio");
insert into tb_classe (classe,nivel,reino) values ("arqueiro",9,"platina");
insert into tb_classe (classe,nivel,reino) values ("piromântico", 6,"ouro");


-- POULANDO TABELA PERSONAGEM
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id) 
values ("marlon", 16000, 8000, 5000, 7000, 4 );
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id) 
values ("fábio", 3000, 2000, 5000, 12000, 2);
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id)
values ("bárbara", 20000, 5000, 6000, 9000, 3);
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id)
values ("andré", 10000, 8000, 2000, 7000, 2);
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id)
values ("jaqueline", 90000, 4000, 1000, 7000, 1);
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id)
values ("marques", 6000, 2000, 500, 9000, 2);
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id)
values ("kuster", 30000, 15000, 8000, 17000, 5);
insert into tb_personagem (nome,vida,ataque,defesa,magia, classe_id)
values ("alric", 80000, 2000, 5000, 7000, 3);

select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like "a%";

 -- JUNTANDO AS TABELAS
select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

 -- JUNTANDO AS TABELAS, SOMENTE MOSTRANDO A CLASSE ARQUEIRO
select tb_personagem.nome, tb_classe.classe from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.classe_id
where tb_classe.classe like "arqueiro";
