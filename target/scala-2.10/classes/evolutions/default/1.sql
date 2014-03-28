# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table visitor (
  visitor_id                varchar(255) not null,
  password                  varchar(255),
  firstname                 varchar(255),
  last_name                 varchar(255),
  dateof_birth              timestamp,
  male                      boolean,
  occupation                varchar(255),
  apartment_no              varchar(255),
  street_no                 varchar(255),
  locality                  varchar(255),
  city                      varchar(255),
  post_box_no               varchar(255),
  constraint pk_visitor primary key (visitor_id))
;

create sequence visitor_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists visitor;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists visitor_seq;

