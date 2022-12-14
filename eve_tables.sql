
create table eve_main
(
	eve_main_id numeric(10,0) primary key not null,
	eve_main_uu character varying(35) default null::character varying,
	ad_client_id numeric(10,0) not null,
	ad_org_id numeric(10,0) not null,
	isactive character(1) not null default 'Y'::bpchar,
	created timestamp without time zone not null default now(),
	createdby numeric(10,0) not null,
	updated timestamp without time zone not null default now(),
	updatedby numeric(10,0) not null,
	value character varying(40) not null,
	name character varying(255) not null,
	description character varying(255),
	m_product_id numeric(10,0)
);

create unique index eve_main_uu_idx
on eve_main
using btree
(eve_main_uu collate pg_catalog."default");

create unique index eve_main_value
on eve_main
using btree
(ad_client_id, value collate pg_catalog."default");

create table eve_sub
(
	eve_sub_id numeric(10,0) primary key not null,
	eve_sub_uu character varying(36) default null::character varying,
	ad_client_id numeric(10,0) not null,
	ad_org_id numeric(10,0) not null,
	isactive character(1) not null default 'Y'::bpchar,
	created timestamp without time zone not null default now(),
	createdby numeric(10,0) not null,
	updated timestamp without time zone not null default now(),
	updatedby numeric(10,0) not null,
	eve_main_id numeric(10,0) not null,
	value varchar(40) not null,
	name varchar(255) not null,
	description varchar(255)
);

create unique index eve_sub_uu_idx
on eve_sub
using btree
(eve_sub_uu collate pg_catalog."default");

create unique index eve_sub_value
on eve_sub
using btree
(ad_client_id, value collate pg_catalog."default");



