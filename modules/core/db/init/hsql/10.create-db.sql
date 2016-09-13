-- begin EXAMPLEDBSCRIPTS_A
create table EXAMPLEDBSCRIPTS_A (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    E varchar(255),
    B varchar(255),
    --
    primary key (ID)
)^
-- end EXAMPLEDBSCRIPTS_A
