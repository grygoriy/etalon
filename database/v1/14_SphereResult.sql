create table SphereResult (
    SphereResultId bigint(20) not null auto_increment,
    Score int,
    SphereId varchar(50),
    YovayshyResultId bigint(20),

    primary key (SphereResultId)
) engine=InnoDB default charset=utf8;