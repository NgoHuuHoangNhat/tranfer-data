drop table if exists products;

create table products(
    id serial primary key,
    name varchar(255) not null,    
    price numeric(10,2) not null default 0,
    quantity int not null default 0,
    created_by varchar(255) ,
    updated_by varchar(255) ,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    is_deleted boolean default false
)
