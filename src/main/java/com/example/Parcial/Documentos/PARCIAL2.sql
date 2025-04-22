--
-- PostgreSQL database cluster dump
--

-- Started on 2025-04-22 17:26:38

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE anon;
ALTER ROLE anon WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB NOLOGIN NOREPLICATION NOBYPASSRLS;
CREATE ROLE authenticated;
ALTER ROLE authenticated WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB NOLOGIN NOREPLICATION NOBYPASSRLS;
CREATE ROLE authenticator;
ALTER ROLE authenticator WITH NOSUPERUSER NOINHERIT NOCREATEROLE NOCREATEDB LOGIN NOREPLICATION NOBYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:qxo/KlTBopFO3lJE3Hvy5Q==$i7rRY1f352b8fLNXW9qj8y2VqARPdDDIwR3UgR4K0ug=:3o2+9f1JijOWxf8EToRtnnobYxRRC7WWtOItdWVdTYE=';
CREATE ROLE dashboard_user;
ALTER ROLE dashboard_user WITH NOSUPERUSER INHERIT CREATEROLE CREATEDB NOLOGIN REPLICATION NOBYPASSRLS;
CREATE ROLE pgbouncer;
ALTER ROLE pgbouncer WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB LOGIN NOREPLICATION NOBYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:YbEc4rKcZmwuexYl2TmP2A==$LiZSEx7d6QErNgiR9DS4NVL+dto0iI6o1nsR8Dy7MFs=:EePPJUrnma5EZVNaqF9L5FkJrZp168Nk2qRxD7aPy9s=';
CREATE ROLE postgres;
ALTER ROLE postgres WITH NOSUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:3A0S9ETEMQAyxB2miv2Fnw==$32XLPuOn7OmUYDROK8Uc10T2MwT/c5mzaY3aApcJc5Y=:vz8nLJKmse0kZaIzLxm/sSEEjyHZt9io9JXFbSMtwI8=';
CREATE ROLE service_role;
ALTER ROLE service_role WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB NOLOGIN NOREPLICATION BYPASSRLS;
CREATE ROLE supabase_admin;
ALTER ROLE supabase_admin WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:/gnnfnwDSLsjU8wOwZ6SRA==$xAR9+8AsdWEjhmq+ifwEAbrpzXCWBpl/fx3+/6+A5WQ=:mF1B0jnWaY646RJd/FTGe1Ru4pUf0uBUW9iWafLWZ/Y=';
CREATE ROLE supabase_auth_admin;
ALTER ROLE supabase_auth_admin WITH NOSUPERUSER NOINHERIT CREATEROLE NOCREATEDB LOGIN NOREPLICATION NOBYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:JZiQNaLZJppYlOFht5tbqQ==$H41i7oeFVAHAuL0HYrlQVx/gyRdHpOEpx5Vwxn/a6As=:5AbCCgGuSd0ek5scD3muES3aSIWUt123t/uKOiawB50=';
CREATE ROLE supabase_read_only_user;
ALTER ROLE supabase_read_only_user WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB LOGIN NOREPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:k3RgJLv+PAQo0WBOuDufkg==$UmPCHXMKnvedtOv1mkicjqlPcklasr+1gEX7ki1javQ=:Ok/WG29F9UErANwwYVU1pyfbYB/z/aMmrPEf2RyMBCE=';
CREATE ROLE supabase_realtime_admin;
ALTER ROLE supabase_realtime_admin WITH NOSUPERUSER NOINHERIT NOCREATEROLE NOCREATEDB NOLOGIN NOREPLICATION NOBYPASSRLS;
CREATE ROLE supabase_replication_admin;
ALTER ROLE supabase_replication_admin WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB LOGIN REPLICATION NOBYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:PskV3DlSTyy33wjufnNfgQ==$FdsD6S0wjjYVgbbi/LrOZf+F0HGaYqj0tr7Ybk+RqPE=:vJV3T+538F35URtCP7tVONzmg1zMqXTKOOLl7JvG2LY=';
CREATE ROLE supabase_storage_admin;
ALTER ROLE supabase_storage_admin WITH NOSUPERUSER NOINHERIT CREATEROLE NOCREATEDB LOGIN NOREPLICATION NOBYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:Ui8ocAKtjmv8stcQFdLqJA==$vWFErVFqMB/mK4GKry63DefmUChKGacyoEx/EMnf9w8=:P+t23JX/vE5sLpK3XoQmyKKhJdBMeOFhY9BwmuCIfkg=';

--
-- User Configurations
--

--
-- User Config "anon"
--

ALTER ROLE anon SET statement_timeout TO '3s';

--
-- User Config "authenticated"
--

ALTER ROLE authenticated SET statement_timeout TO '8s';

--
-- User Config "authenticator"
--

ALTER ROLE authenticator SET session_preload_libraries TO 'safeupdate';
ALTER ROLE authenticator SET statement_timeout TO '8s';
ALTER ROLE authenticator SET lock_timeout TO '8s';

--
-- User Config "postgres"
--

ALTER ROLE postgres SET search_path TO E'\\$user', 'public', 'extensions';

--
-- User Config "supabase_admin"
--

ALTER ROLE supabase_admin SET search_path TO '$user', 'public', 'auth', 'extensions';
ALTER ROLE supabase_admin SET log_statement TO 'none';

--
-- User Config "supabase_auth_admin"
--

ALTER ROLE supabase_auth_admin SET search_path TO 'auth';
ALTER ROLE supabase_auth_admin SET idle_in_transaction_session_timeout TO '60000';
ALTER ROLE supabase_auth_admin SET log_statement TO 'none';

--
-- User Config "supabase_storage_admin"
--

ALTER ROLE supabase_storage_admin SET search_path TO 'storage';
ALTER ROLE supabase_storage_admin SET log_statement TO 'none';


--
-- Role memberships
--

GRANT anon TO authenticator;
GRANT anon TO postgres;
GRANT authenticated TO authenticator;
GRANT authenticated TO postgres;
GRANT authenticator TO supabase_storage_admin;
GRANT pg_monitor TO postgres;
GRANT pg_read_all_data TO postgres;
GRANT pg_read_all_data TO supabase_read_only_user;
GRANT pg_signal_backend TO postgres;
GRANT service_role TO authenticator;
GRANT service_role TO postgres;
GRANT supabase_auth_admin TO postgres;
GRANT supabase_realtime_admin TO postgres;
GRANT supabase_storage_admin TO postgres;






-- Completed on 2025-04-22 17:26:40

--
-- PostgreSQL database cluster dump complete
--

