create table MotivationQuestion (
    MotivationQuestionId bigint(20) not null auto_increment,
    Question varchar(250) not null,
    MotivationVector varchar(50) not null,

    primary key (MotivationQuestionId)
) engine=InnoDB default charset=utf8;

INSERT INTO `MotivationQuestion` VALUES (1,'Вимагає спілкування  з різними людьми','InternalIndividual'),(2,'Подобається батькам','ExternalNegative'),(3,'Передбачає високу відповідальність','InternalSocial'),(4,'Вимагає переїзду на нове місце проживання','ExternalPositive'),(5,'Відповідає моїм здібностям','InternalIndividual'),(6,'Дозволяє обмежитися наявним устаткуванням','ExternalNegative'),(7,'Дає можливість приносити користь людям','InternalSocial'),(8,'Сприяє розумовому і фізичному розвитку','InternalIndividual'),(9,'Високооплачувана  професія','ExternalPositive'),(10,'Дозволяє працювати  близько від будинку','ExternalPositive'),(11,'Престижна професія','ExternalNegative'),(12,'Дає можливості для зростання професійної майстерності','InternalSocial'),(13,'Єдино можлива  в обставинах, що склалися','ExternalNegative'),(14,'Дозволяє реалізувати  здібності до керівної роботи','ExternalPositive'),(15,'Приваблива','InternalIndividual'),(16,'Близька до улюбленого шкільного предмету','ExternalPositive'),(17,'Дозволяє відразу  отримати добрий результат праці  для інших','InternalSocial'),(18,'Вибрана моїми  друзями','ExternalNegative'),(19,'Дозволяє використовувати  професійні уміння поза роботою','ExternalPositive'),(20,'Дає великі можливості проявити творчість','InternalIndividual');