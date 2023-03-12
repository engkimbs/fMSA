-- CREATE USER EQUIPMENT IDENTIFIED BY EQUIMENT;
--
-- GRANT CONNECT, DBA, RESOURCE TO EQUIPMENT;

-- CREATE USER factory IDENTIFIED BY factory;
--
-- GRANT CONNECT, DBA, RESOURCE TO factory;

insert into area_mst (id, area, description, created, created_by, last_modified, last_modified_by)
values (1, 'DIFF', 'DIFF desciption', systimestamp, 'SA', systimestamp, 'SA');
insert into area_mst (id, area, description, created, created_by, last_modified, last_modified_by)
values (2, 'CHAMBER', 'CHAMBER desciption', systimestamp, 'SA', systimestamp, 'SA');
insert into area_mst (id, area, description, created, created_by, last_modified, last_modified_by)
values (3, 'ATTACH', 'ATTACH desciption', systimestamp, 'SA', systimestamp, 'SA');

commit;