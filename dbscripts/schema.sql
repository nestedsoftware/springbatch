\c batch_db
create table if not exists users (
  id serial primary key,
  username text unique not null,
  password text not null,
  email text not null,
  is_active boolean not null default true,
  created_instant timestamp default (now() at time zone 'utc'),
  updated_instant timestamp default (now() at time zone 'utc')
);