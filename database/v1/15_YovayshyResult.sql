create table YovayshyResult (
    YovayshyResultId bigint(20) not null auto_increment,
    ProffecionalSphere varchar(200),
    ProffecionalIntrests varchar(200),

    primary key (YovayshyResultId)
) engine=InnoDB default charset=utf8;