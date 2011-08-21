create table LidershipResult (
    LidershipResultId bigint(20) not null auto_increment,
    Score int,
    Message varchar(250),

    primary key (LidershipResultId)
) engine=InnoDB default charset=utf8;