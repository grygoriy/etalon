create table MotivationResult (
    MotivationResultId bigint(20) not null auto_increment,
    Speciality varchar(200),
    TestResultsId bigint(20),

    primary key (MotivationResultId)
) engine=InnoDB default charset=utf8;