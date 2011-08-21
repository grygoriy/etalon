create table IMResult (
    IMResultId bigint(20) not null auto_increment,
    Result int,
    JobNameId bigint(20),
    TestResultsId bigint(20),

    primary key (IMResultId)
) engine=InnoDB default charset=utf8;