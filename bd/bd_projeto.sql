/*
Comandos SQL para criação de uma das tabelas do projeto.

BD: bd_projeto
Tabela: cadusuario

Todos os atributos ainda estão como "varchar", para ajuste em versões futuras do projeto.
*/

use bd_projeto;
drop table cadusuario;

create table cadusuario (  
   matricula varchar(10),  
   nome varchar(45),  
   sobrenome varchar(45),
   idpessoal01 varchar(18),
   idpessoal02 varchar(18),
   sexo varchar(1),
   datanasc varchar(8),   
   filpai varchar(45),
   filmae varchar(45),
   telefone01 varchar(11),
   telefone02 varchar(11),
   logradouro varchar(45),
   lognumero varchar(6), 
   logcomplemento varchar(45),
   bairro varchar(45),
   cidade varchar(45),
   estado varchar(45),
   planosaude01 varchar(20),  
   numplanosaude01 varchar(20),
   planosaude02 varchar(20),  
   numplanosaude02 varchar(20),
   primary key(matricula)         
);

insert into cadusuario values
 ("0000000001", "Antonio", "Silva Ferreira", "12346790812", "1234732", "M", "07021980", 
 "Antonio Pinto", "Maria da Silva", "33350214", "999045520", "Rua dos Pombos", "201", "Casa", 
 "Estancia", "Recife", "PE", "Bradesco Saude", "134657", "Nenhum", "0");
 
 insert into cadusuario values
 ("0000000002", "Jair", "Bolsonaro", "14567908102", "9234732", "M", "05021960", 
 "Joao Pinto", "Maria Santos", "33351014", "999046680", "Rua da Aurora", "100", "Casa", 
 "Centro", "Recife", "PE", "Amil", "132547", "Nenhum", "0");
 
 insert into cadusuario values
 ("0000000003", "Maria", "do Rosario", "21067908115", "4534732", "F", "20021975", 
 "Ferreia Costa", "Maria Rosario Santos", "38851010", "992546680", "Conde da Boa Vista", "200", "Casa", 
 "Centro", "Recife", "PE", "Amil", "002547", "Nenhum", "0");
 
 select * from cadusuario;