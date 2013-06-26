# --- First database schema

# --- !Ups

create sequence s_user_id;

create table users(
  id    bigint DEFAULT nextval('s_user_id'),
  name  varchar(255),
  email varchar(255),
  encrypted_password varchar(255)
);

create sequence s_task_id;
create table tasks(
    id          bigint DEFAULT nextval('s_task_id'),
    title       varchar(255),
    complete   SMALLINT DEFAULT 0,
    note        varchar(1000)
);



# --- !Downs
drop table tasks;
drop sequence s_task_id;

drop table users;
drop sequence s_user_id;