create table arc_user(
    id integer primary key,
    name character varying(200)
);

create table article(
    id integer primary key,
    title character varying(200),
    content text,
    author_id integer references arc_user
);

create sequence article_seq start with 1 increment by 1;
create sequence arc_user_seq start with 1 increment by 1;

insert into arc_user(id, name) values (nextval('arc_user_seq'), 'ankvel');
insert into article(id, author_id, title, content)
    values (nextval('article_seq'), currval('arc_user_seq'), 'First Article', 'Just small text for the article content.');