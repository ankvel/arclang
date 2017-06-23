create table "some" (
    id      integer,
    name    varchar(40),
    primary key(id)
);

create sequence some_seq start with 1 increment by 1;

insert into "some" (id, name) values (nextval('some_seq'), 'ankvel');