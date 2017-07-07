/*
Comandos SQL para criação de uma pequena tabela para teste
da inserção de dados via IDE Java.

BD: bd_projeto
Tabela: cadusuario

Rodar a classe "model.TesteDeRegistro.java", 
será feita a conexão com o BD e a inserção de dados.

Para fins de teste, esta tabela possui menos atributos que o descrito em "model.UsuarioModel.java".
*/

use bd_projeto;
drop table cadusuario;

create table cadusuario (  
   matricula varchar(10),  
   nome varchar(45),  
   sobrenome varchar(45),
   idpessoal01 varchar(18),
   idpessoal02 varchar(18),
   primary key(matricula)         
);

insert into cadusuario values 
("0000000001", "Antonio", "Silva Oliveira", "12346790812", "1234732");
 
insert into cadusuario values 
("0000000002", "Jair", "Bolsonaro", "14567908102", "9234732");
 
insert into cadusuario values 
("0000000003", "Maria", "do Rosario", "21067908115", "4534732");
 
select * from cadusuario;