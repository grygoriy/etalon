create table HollandResult (
    HollandResultId bigint(20) not null auto_increment,
    Score int,
    Type varchar(50),
    TestResultsId bigint(20),


    primary key (HollandResultId)
) engine=InnoDB default charset=utf8;