create table articles
(
	id serial
		constraint articles_pk
			primary key,
	article varchar,
	name varchar not null,
	surname varchar not null,
	jname varchar not null,
	artname varchar not null,
	adddate date not null,
	publdate date not null
);

