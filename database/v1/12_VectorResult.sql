create table VectorResult (
    VectorResultId bigint(20) not null auto_increment,
    MotivationVector varchar(30),
    Score int,
    MotivationResultId bigint(20) not null, 

    primary key (VectorResultId)
) engine=InnoDB default charset=utf8;