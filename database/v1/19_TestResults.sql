create table TestResults (
    TestResultsId bigint(20) not null auto_increment,
    StudentName varchar(250),
    SchoolId bigint(20),
    ActualityResults int,
    YovayshyResultId bigint(20),
    DateCreated timestamp,
    LidershipResultId bigint(20),
    MotivationResultId bigint(20),

    primary key (TestResultsId)
) engine=InnoDB default charset=utf8;