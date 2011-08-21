
create table School (
    SchoolId bigint(20) not null auto_increment,
    Name varchar(50) not null,

    primary key (SchoolId)
) engine=InnoDB default charset=utf8;