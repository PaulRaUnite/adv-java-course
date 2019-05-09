create table uni_group (
    id serial not null primary key,
    name varchar(128) not null
);

create table student (
                        id serial not null primary key,
                        first_name varchar(20) not null,
                        last_name varchar(20) not null,
                        average_mark float not null,
                        group_fk int not null references uni_group(id)
);

insert into uni_group (id, name)
values (1, 'G1'), (2, 'G2');
insert into student (id, first_name, last_name, average_mark, group_fk) values
(1, 'Vlad', 'Boyarskiy', 3.6, 1),
(2,'Oksi', ' Bahatskaya', 4.2, 1),
(3,'Vadim', ' Vadimich', 5 ,2 );

