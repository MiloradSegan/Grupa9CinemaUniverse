create database if not exists cinema2;
use cinema2;
/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     4/1/2017 2:33:39 PM                          */
/*==============================================================*/


drop table if exists FILM9;

drop table if exists KARTA9;

drop table if exists KOMENTAR9;

drop table if exists KORISNIK9;

drop table if exists REPERTOAR9;

drop table if exists REZERVACIJA9;

drop table if exists ZAPOSLENI9;

/*==============================================================*/
/* Table: FILM9                                                 */
/*==============================================================*/
create table FILM9
(
   IDFIL                int not null auto_increment,
   NAZIV                varchar(20),
   TRAILER              varchar(40),
   OPIS                 varchar(80),
   ZANR                 varchar(20),
   GLUMCI               varchar(80),
   SLIKA                longblob,
   REDITELJ             varchar(20),
   primary key (IDFIL)
);

/*==============================================================*/
/* Table: KARTA9                                                */
/*==============================================================*/
create table KARTA9
(
   IDKAR                int not null auto_increment,
   IDREP                int not null,
   IDZAP                int not null,
   DATUMPRODAJE         date,
   CENAKARTE            float(20),
   SUMA                 float(20),
   BROJKARATA           int,
   primary key (IDKAR)
);

/*==============================================================*/
/* Table: KOMENTAR9                                             */
/*==============================================================*/
create table KOMENTAR9
(
   IDKOM                int not null auto_increment,
   IDKOR                int not null,
   IDFIL                int not null,
   DATUM                date,
   TEKST                varchar(80),
   primary key (IDKOM)
);

/*==============================================================*/
/* Table: KORISNIK9                                             */
/*==============================================================*/
create table KORISNIK9
(
   IDKOR                int not null auto_increment,
   PASSWORDKOR          varchar(20),
   USERNAMEKOR          varchar(20),
   IMEKOR               varchar(20),
   PREZIMEKOR           varchar(20),
   EMAILKOR             varchar(20),
   primary key (IDKOR)
);

/*==============================================================*/
/* Table: REPERTOAR9                                            */
/*==============================================================*/
create table REPERTOAR9
(
   IDREP                int not null auto_increment,
   IDFIL                int not null,
   DATUMPRO             date,
   VREME                time,
   DAN                  varchar(20),
   SALA                 varchar(20),
   MESTA                int,
   CENA                 int,
   TIPPROJEKCIJE        varchar(20),
   primary key (IDREP)
);

/*==============================================================*/
/* Table: REZERVACIJA9                                          */
/*==============================================================*/
create table REZERVACIJA9
(
   IDREZ                int not null auto_increment,
   IDREP                int not null,
   IDKOR                int not null,
   MESTAREZ             int,
   primary key (IDREZ)
);

/*==============================================================*/
/* Table: ZAPOSLENI9                                            */
/*==============================================================*/
create table ZAPOSLENI9
(
   IDZAP                int not null auto_increment,
   USERNAMEZAP          varchar(20),
   PASSWORDZAP          varchar(20),
   IMEZAP               varchar(20),
   PREZIMEZAP           varchar(20),
   TIPZAP               varchar(10),
   primary key (IDZAP)
);

alter table KARTA9 add constraint FK_RELATIONSHIP_8 foreign key (IDZAP)
      references ZAPOSLENI9 (IDZAP) on delete restrict on update restrict;

alter table KARTA9 add constraint FK_RELATIONSHIP_9 foreign key (IDREP)
      references REPERTOAR9 (IDREP) on delete restrict on update restrict;

alter table KOMENTAR9 add constraint FK_RELATIONSHIP_10 foreign key (IDFIL)
      references FILM9 (IDFIL) on delete restrict on update restrict;

alter table KOMENTAR9 add constraint FK_RELATIONSHIP_4 foreign key (IDKOR)
      references KORISNIK9 (IDKOR) on delete restrict on update restrict;

alter table REPERTOAR9 add constraint FK_RELATIONSHIP_7 foreign key (IDFIL)
      references FILM9 (IDFIL) on delete restrict on update restrict;

alter table REZERVACIJA9 add constraint FK_RELATIONSHIP_5 foreign key (IDKOR)
      references KORISNIK9 (IDKOR) on delete restrict on update restrict;

alter table REZERVACIJA9 add constraint FK_RELATIONSHIP_6 foreign key (IDREP)
      references REPERTOAR9 (IDREP) on delete restrict on update restrict;

