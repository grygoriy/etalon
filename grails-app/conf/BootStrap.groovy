import com.ca.etalon.Role
import com.ca.etalon.School
import com.ca.etalon.User
import com.ca.etalon.tests.actualization.ActualQuestion
import com.ca.etalon.tests.interestmap.IMQuestion
import com.ca.etalon.tests.interestmap.JobName
import com.ca.etalon.tests.yovayshy.YovayshyQuestion
import com.ca.etalon.tests.lidership.LidershipQuestion
import com.ca.etalon.tests.motivation.MotivationQuestion
import com.ca.etalon.test.motivation.MotivationVector
import com.ca.etalon.test.yovayshy.YovayshySphere
import com.ca.etalon.tests.holland.HollandQuestion
import com.ca.etalon.test.holland.HollandVector
import com.ca.etalon.test.holland.HollandType
import org.codehaus.groovy.grails.plugins.codecs.SHA256Codec

class BootStrap {

     def springSecurityService
     def init = { servletContext ->

//       def adminPass = springSecurityService.encodePassword("admin")
//       println "admin: ${adminPass}"
//       def studentPass = springSecurityService.encodePassword("student")
//       println "student: ${studentPass}"
//
//       def admin = new Role(name:"Administrator").save()
//       def student = new Role(name:"Student").save()
//
//       new User(username:"admin", name:"ttt", email:"www@com.com", role:admin,
//               password: adminPass).save()
//
//       new User(username:"student", name:"student", email:"student@com.com", role:student,
//               password: springSecurityService).save()

//       initInterestQuestionary();
//       initAcuality();
//       initYovayshy();
//
//       initLidership();
//       initMotivation();
//
//       initHolland();
//
//       initSchools();
                                                                              
     }
  
     def destroy = {
     }

    private void initInterestQuestionary() {
      def biology = new com.ca.etalon.tests.interestmap.JobName(name:"Біологія").save()
      def geography = new com.ca.etalon.tests.interestmap.JobName(name:"Географія").save()
      def geology = new JobName(name:"Геологія").save()
      def medecin = new JobName(name:"Медецина").save()
      def foodProducton = new JobName(name:"Легка і харчова промисловість").save()
      def physics = new JobName(name:"Фізика").save()
      def chemistry = new JobName(name:"Хімія").save()
      def technique = new JobName(name:"Техніка").save()
      def electronics = new JobName(name:"Електрорадіотехніка").save()
      def metalCraft = new JobName(name:"Металообробка").save()
      def woodCraft = new JobName(name:"Деревообробка").save()
      def building = new JobName(name:"Будівнитцво").save()
      def transport = new JobName(name:"Транспорт").save()
      def aviation = new JobName(name:"Авіація, морські спеціалісти").save()
      def militarySpecialist = new JobName(name:"Військові спеціалісти").save()
      def history = new JobName(name:"Історія").save()
      def litereture = new JobName(name:"Література").save()
      def journalist = new JobName(name:"Журналістика").save()
      def publicActivity = new JobName(name:"Громадська діяльність").save()
      def pedagogic = new JobName(name:"Пелагогіка").save()
      def jourist = new JobName(name:"Правоб юристпруденція").save()
      def sayling = new JobName(name:"Торгівля").save()
      def mathematics = new JobName(name:"Математика").save()
      def economics = new JobName(name:"Економіка").save()
      def languages = new JobName(name:"Іноземні мови").save()
      def art = new JobName(name:"Образотворче мистецтво").save()
      def sceneArt = new JobName(name:"Сценічне мистецтво").save()
      def music = new JobName(name:"Музика").save()
      def sport = new JobName(name:"Фізкультура, спорт").save()

      new IMQuestion(question:"Знайомитись з життям рослин чи тварин?", category:biology).save();

      new IMQuestion(question:"Уроки географії, читання підручника з географії?", category:geography).save()

      new IMQuestion(question:"Читати художню або науково-популярну літературу про геологічні експедиції?", category:geology).save()

      new IMQuestion(question:"Уроки і читання підручника з анатомії та фізіології людини?", category:medecin).save()

      new IMQuestion(question:"Уроки домоводства чи домашні заняття з домоводства?", category:foodProducton).save()

      new IMQuestion(question:"Читати науково-популярну літературу про фізичні відкриття, про життя та діяльність видатних фізиків?", category:physics).save()

      new IMQuestion(question:"Читати про відкриття в хімії чи про життя і діяльність видатних хіміків?", category:chemistry).save()

      new IMQuestion(question:"Читати технічні журнали?", category:technique).save()

      new IMQuestion(question:"Читати статті у науково-популярних журналах про досягнення в галузі електротехніки та радіоелектроніки?", category:electronics).save()

      new IMQuestion(question:"Знайомитися із різними металами та їх властивостями?", category:metalCraft).save()

      new IMQuestion(question:"Дізнаватися про різні породи деревини та про практичне їх застосування?", category:woodCraft).save()

      new IMQuestion(question:"Дізнаватися про досягнення в галузі будівництва?", category:building).save()

      new IMQuestion(question:"Читати книги, дивитися фільми про водіїв різного виду транспорту?", category:transport).save()

      new IMQuestion(question:"Читати книги, дивитися фільми про льотчиків, космонавтів?", category:aviation).save()

      new IMQuestion(question:"Знайомитися із воєнною технікою, зустрічатися з учасниками бойових дій?", category:militarySpecialist).save()

      new IMQuestion(question:"Читати книги про історичні події та історичних діячів?", category:history).save()

      new IMQuestion(question:"Читати твори класиків української та зарубіжної літератури?", category:litereture).save()

      new IMQuestion(question:"Читати та обговорювати газетні, журнальні статті та. нариси?", category:journalist).save()

      new IMQuestion(question:"Обговорювати біжучі події, справи у школі та класі?", category:publicActivity).save()

      new IMQuestion(question:"Читати книги про життя школи (про роботу вчителя, вихователя)?", category:pedagogic).save()

      new IMQuestion(question:"Читати книги, дивитися фільми про роботу міліції?", category:jourist).save()

      new IMQuestion(question:"Піклуватися про порядок у речах, про гарний вигляд приміщення, у якому навчається, живе, працює?", category:sayling).save()

      new IMQuestion(question:"Читати такі книги, як \"Цікава математика\" чи \"Математичне дозвілля\"?", category:mathematics).save()

      new IMQuestion(question:"Вивчати економічну географію? Вивчати іноземну мову?", category:economics).save()

      new IMQuestion(question:"Вивчати іноземну мову?", category:languages).save()

      new IMQuestion(question:"Знайомитися із життям видатних художників, із історією розвитку образотворчого мистецтва?", category:art).save()

      new IMQuestion(question:"Знайомитися із життям видатних майстрів сцени і кіно, зустрічатися з артистами, колекціонувати їхні фотографії?", category:sceneArt).save()

      new IMQuestion(question:"Знайомитися із життям і творчістю видатних музикантів, з питаннями теорії музичного мистецтва?", category:music).save()

      new IMQuestion(question:" Читати спортивні газети, журнали, книги про спорт і видатних спортсменів?", category:sport).save()
      //
      new IMQuestion(question:" Вивчати ботанику, зоологію, біологію?", category:biology).save()

      new IMQuestion(question:" Знайомитися із різними країнами за описами та географічними картами?", category:geography).save()

      new IMQuestion(question:" Читати про життя і діяльність відомих геологів?", category:geology).save()

      new IMQuestion(question:" Читати по те, як люди навчались боротися із хворобами, про лікарів та досягнення в галузі медицини?", category:medecin).save()

      new IMQuestion(question:"Відвідувати з екскурсією підприємства легкої промисловості (швейне, взуттєве, текстильне та ін.)?", category:foodProducton).save()

      new IMQuestion(question:"Читати книги типу \"Цікава фізика\", \"Фізики жартують\"?", category:physics).save()

      new IMQuestion(question:"Знаходити хімічні явища у природі, проводити досліди з хімії,слідкувати за перебігом хімічних явищ?", category:chemistry).save()

      new IMQuestion(question:"Знайомитися з найновішими досягненнями сучасної техніки?", category:technique).save()

      new IMQuestion(question:"Відвідувати радіотехнічний гурток чи знайомитися з роботою електрика?", category:electronics).save()

      new IMQuestion(question:" Знайомитися з різними вимірювальними інструментами для металообробки і працювати з ними?", category:metalCraft).save()

      new IMQuestion(question:"Спостерігати за виготовленням виробів із дерева, розглядати нові зразки меблів?", category:woodCraft).save()

      new IMQuestion(question:" Зустрічатися з будівельниками, спостерігати за їх роботою?", category:building).save()

      new IMQuestion(question:" Читати популярну літературу про засоби та правила пересування?", category:transport).save()

      new IMQuestion(question:"Читати книги, дивитися фільми про річників, моряків?", category:aviation).save()

      new IMQuestion(question:"Читати книги, дивитися фільми на воєнні теми, знайомитись із історією війн, великих битв і долями видатних полководців?", category:militarySpecialist).save()

      new IMQuestion(question:"Обговорювати біжучі політичні події у нас і за рубежем?", category:history).save()
      

      new IMQuestion(question:"Читати літературно-критичні статті?", category:litereture).save()
      

      new IMQuestion(question:"Слухати радіо- й теленовини, дивитись тематичні телепередачі?", category:journalist).save()
      

      new IMQuestion(question:"Дізнаватися про події, які відбуваються в селі, місті, області, державі?", category:publicActivity).save()
      

      new IMQuestion(question:"Давати пояснення товаришам, як виконувати навчальне завдання, коли вони не розуміють чогось?", category:pedagogic).save()
      

      new IMQuestion(question:"Справедливо оцінити вчинок друга, знайомого чи літературного героя?", category:jourist).save()
      

      new IMQuestion(question:"Забезпечувати сім'ю продуктами, організовувати харчування всіх під час походу?", category:sayling).save()
      

      new IMQuestion(question:"Читати науково-популярну літературу про відкриття в математиці, про життя та діяльність видатних математиків?", category:mathematics).save()
      

      new IMQuestion(question:"Цікавитися у пресі, на радіо і телебаченні про хід виконання економічних реформ?", category:economics).save()
      

      new IMQuestion(question:"Читати художню літературу іноземною мовою?", category:languages).save()
      

      new IMQuestion(question:"Бути членом редколегії, займатися художнім оформленням газет?", category:art).save()
      

      new IMQuestion(question:"Відвідувати драматичний театр або театр юного глядача?", category:sceneArt).save()
      

      new IMQuestion(question:"Слухати оперу та симфонічну музику?", category:music).save()
      

      new IMQuestion(question:"Відвідувати спортивні змагання, слухати радіо і дивитися телепередачі?", category:sport).save()
      

      //section 3
      new IMQuestion(question:"Відвідувати біологічний гурток?", category:biology).save()
      

      new IMQuestion(question:"Займатися в географічному гуртку, вивчати природу і життя рідного краю?", category:geography).save()
      

      new IMQuestion(question:"Складати і збирати описи, зображення геологічних об'єктів (мінералів, шарів землі тощо)?", category:geology).save()
      

      new IMQuestion(question:"Вивчати функції організму людини, причини виникнення хвороб і шляхи їх лікування?", category:medecin).save()
      

      new IMQuestion(question:"Відвідувати гурток кулінарії, готувати вдома обіди?", category:foodProducton).save()
      

      new IMQuestion(question:"Проводити досліди з фізики?", category:physics).save()
      

      new IMQuestion(question:"Готувати розчини, зважувати реактиви?", category:chemistry).save()
      

      new IMQuestion(question:"Розбирати, ремонтувати, збирати різні механізми (годинник, праску,велосипед, швейну машину та інше)?", category:technique).save()
      

      new IMQuestion(question:"Користуватися точними вимірювальними приладами (вольтметром,амперметром, ін.) і виконувати розрахунки?", category:electronics).save()
      

      new IMQuestion(question:"Майструвати різні деталі і предмети з металу?", category:metalCraft).save()
      

      new IMQuestion(question:"Збирати різні зразки деревини чи художньо обробляти дерево (випилювати, випалювати, вирізати, полірувати і ін.)?", category:woodCraft).save()
      

      new IMQuestion(question:"Накидати будівельний ескіз чи виконувати креслення різних будівель?", category:building).save()
      

      new IMQuestion(question:"Відвідувати гурток юних залізничників, юних автолюбителів?", category:transport).save()
      

      new IMQuestion(question:"Брати участь у секції парашутистів, у гуртку авіамоделістів чи у роботі авіаклубу?", category:aviation).save()
      

      new IMQuestion(question:"Займатися у стрілковій секції?", category:militarySpecialist).save()
      

      new IMQuestion(question:"Вивчати історію виникнення різних народів і держав?", category:history).save()
      

      new IMQuestion(question:"Писати класні чи домашні твори з літератури?", category:litereture).save()
      

      new IMQuestion(question:"Спостерігати за вчинками, поведінкою, життям інших людей, аналізувати життєві явища і події?", category:journalist).save()
      

      new IMQuestion(question:"Виконувати громадську роботу (організовувати, згуртовувати товаришів на певну справу)?", category:publicActivity).save()
      

      new IMQuestion(question:" Проводити час з маленькими дітьми (читати їм книги, що-небудь їм розповідати, допомагати їм у чомусь)?", category:pedagogic).save()
      

      new IMQuestion(question:"Встановлювати дисципліну серед ровесників чи молодших?", category:jourist).save()
      

      new IMQuestion(question:"Спостерігати за роботою продавця, повара, офіціанта?", category:sayling).save()
      

      new IMQuestion(question:"Займатися у математичному гуртку?", category:mathematics).save()
      

      new IMQuestion(question:"Вивчати питання розвитку промисловості та бізнесу, дізнаватись про нові досягнення в галузі економіки?", category:economics).save()
      

      new IMQuestion(question:"Працювати із іншомовними словниками, розбиратися у мовних зворотах маловідомої мови?", category:languages).save()
      

      new IMQuestion(question:"Відвідувати музеї, художні виставки?", category:art).save()
      

      new IMQuestion(question:"Виступати на сцені перед глядачами?", category:sceneArt).save()
      

      new IMQuestion(question:"Грати на одному з музичних інструментів?", category:music).save()
      

      new IMQuestion(question:"Грати у спортивні ігри?", category:sport).save()
      

      //section 4
      new IMQuestion(question:"Спостерігати за ростом і розвитком тварин і рослин, вести записи спостережень?", category:biology).save()
      

      new IMQuestion(question:"Самостійно складати географічні карти, збирати різні географічні матеріали?", category:geography).save()
      

      new IMQuestion(question:"Збирати колекції мінералів, експонати для географічного музею?", category:geology).save()
      

      new IMQuestion(question:"Займатись з роботою медсестри, лікаря чи фармацевта?", category:medecin).save()
      

      new IMQuestion(question:"Відвідувати гурток крою та шиття, шити собі і членам сім'ї?", category:foodProducton).save()
      

      new IMQuestion(question:"Займатися у фізичному гуртку або відвідувати факультативні заняття з фізики?", category:physics).save()
      

      new IMQuestion(question:"Займатися у хімічному гуртку або відвідувати факультативні заняття з хімії?", category:chemistry).save()
      

      new IMQuestion(question:"Займатися у одному з технічних гуртків (моделювати літаки, пароплави, машини і т.н.)?", category:technique).save()
      

      new IMQuestion(question:"Займатися із влаштуванням електроприладів, електроапаратури й електричних машин, збирати, ремонтувати радіоприлади (підсилювачі, осцилографи та ін.), радіоапаратуру (приймачі, програвачі) та телеапаратуру (телевізори, відеомагнітофони тощо)?", category:electronics).save()
      

      new IMQuestion(question:"Уроки праці в шкільних майстернях?", category:metalCraft).save()
      

      new IMQuestion(question:"Брати участь у гуртку \"Умілі руки\" або в столярному?", category:woodCraft).save()
      

      new IMQuestion(question:"Бувати на будівництві, спостерігати за ходом будівництва, за оздоблювальними роботами?", category:building).save()
      

      new IMQuestion(question:"Контролювати дотримання правил руху пішоходами та водіями транспортних засобів?", category:transport).save()
      

      new IMQuestion(question:"Брати участь у секції веслярів, вітрильників, аквалангістів, серфінгу або в загоні рятівників потопаючих?", category:aviation).save()
      

      new IMQuestion(question:"Брати участь у воєнізованих іграх?", category:militarySpecialist).save()
      

      new IMQuestion(question:"Відвідувати історичні музеї, знайомитись з пам'ятками культури народу?", category:history).save()
      

      new IMQuestion(question:"Займатися в літературному гуртку, відвідувати факультативні заняття з мови чи літератури?", category:litereture).save()
      

      new IMQuestion(question:"Вести особистий щоденник?", category:journalist).save()
      

      new IMQuestion(question:"Виступати в класі з повідомленнями про міжнародне становище, з бесідами чи доповідями на різні теми?", category:publicActivity).save()
      

      new IMQuestion(question:"Виконувати роботу організатора дитячих справ?", category:pedagogic).save()
      

      new IMQuestion(question:"Встановлювати причини поведінки і вчинків людей, які вони хотіли б приховати?", category:jourist).save()
      

      new IMQuestion(question:"Допомагати покупцеві у магазині вибирати покупку?", category:sayling).save()
      

      new IMQuestion(question:"Розв'язувати складні задачі з математики?", category:mathematics).save()
      

      new IMQuestion(question:"Точно вести підрахунки своїх грошових витрат і доходів?", category:economics).save()
      

      new IMQuestion(question:"Займатися вивченням іноземних мов у гуртку чи факультативі?", category:languages).save()
      

      new IMQuestion(question:"Займатися в художньому гуртку?", category:art).save()
      

      new IMQuestion(question:"Брати участь в огляді художньої самодіяльності?", category:sceneArt).save()
      

      new IMQuestion(question:"Займатися в хорі або в одному з музичних гуртків?", category:music).save()
      

      new IMQuestion(question:"Займатися в певній спортивній секції?", category:sport).save()
      

      //section 5
      new IMQuestion(question:"Брати участь в біологічних олімпіадах або готувати виставки рослин чи тварин?", category:biology).save()
      

      new IMQuestion(question:"Брати участь у географічних експедиціях?", category:geography).save()
      

      new IMQuestion(question:"Брати участь у геологічній експедиції?", category:geology).save()
      

      new IMQuestion(question:"Спостерігати і доглядали хворих, надавати їм допомогу, полегшувати їх стан?", category:medecin).save()
      

      new IMQuestion(question:"Брати участь у виставках (ярмарках) кулінарних або кондитерських виробів (чи відвідувати їх)?", category:foodProducton).save()
      

      new IMQuestion(question:"Брати участь у фізичних олімпіадах?", category:physics).save()
      

      new IMQuestion(question:"Розв'язувати складні задачі з хімії? Брати участь у хімічних олімпіадах?", category:chemistry).save()
      

      new IMQuestion(question:"Розбиратися у технічних кресленнях і схемах, креслити або складати малюнки?", category:technique).save()
      

      new IMQuestion(question:"Розбиратися у складних радіосхемах?", category:electronics).save()
      

      new IMQuestion(question:"Відвідувати з екскурсією промислові підприємства, знайомитися з новими типами верстатів, спостерігати за їх роботою чи ремонтом?", category:metalCraft).save()
      

      new IMQuestion(question:"Майструвати що-небудь із дерева своїми руками?", category:woodCraft).save()
      

      new IMQuestion(question:"Брати посильну участь у будівельних роботах?", category:building).save()
      

      new IMQuestion(question:"Брати посильну участь в обслуговуванні та ремонті автомобіля?", category:transport).save()
      

      new IMQuestion(question:"Управляти літаками громадянської авіації?", category:aviation).save()
      

      new IMQuestion(question:"Жити за жорстко встановленим режимом, строго дотримуючись щоденного розпорядку?", category:militarySpecialist).save()
      

      new IMQuestion(question:"Займатися в історичному гуртку (збирати матеріали, працювати в архіві, виступати з доповідями на історичні теми)?", category:history).save()
      

      new IMQuestion(question:"Працювати з літературними джерелами, бібліографічними довідниками, вести щоденник вражень про прочитане?", category:litereture).save()
      

      new IMQuestion(question:"Брати участь у диспутах і читацьких конференціях?", category:journalist).save()
      

      new IMQuestion(question:"Готувати і проводити вечори відпочинку чи дискотеки?", category:publicActivity).save()
      

      new IMQuestion(question:"Брати шефство над важковиховуваними, обговорювати з ким-небудь питання виховання дітей та підлітків?", category:pedagogic).save()
      

      new IMQuestion(question:"Допомагати в роботі міліції?", category:jourist).save()
      

      new IMQuestion(question:"Постійно спілкуватися з багатьма різними людьми?", category:sayling).save()
      

      new IMQuestion(question:"Брати участь у математичних олімпіадах?", category:mathematics).save()
      

      new IMQuestion(question:"Цікавитися вартістю товарів, намагатися зрозуміти питання ціноутворення, зарплати, організації праці?", category:economics).save()
      

      new IMQuestion(question:"Розмовляти із знайомими іноземною мовою?", category:languages).save()
      

      new IMQuestion(question:"Брати участь у виставках образотворчого мистецтва?", category:art).save()
      

      new IMQuestion(question:"Відвідувати театральний гурток?", category:sceneArt).save()
      

      new IMQuestion(question:"Брати участь у музичних оглядах, конкурсах?", category:music).save()
      

      new IMQuestion(question:"Брати участь у спортивних змаганнях?", category:sport).save()
      

      //section 6
      new IMQuestion(question:"Вирощувати в саду, на городі рослини чи виховувати тварин і доглядати їх?", category:biology).save()
      

      new IMQuestion(question:"Проводити топографічну зйомку місцевості?", category:geography).save()
      

      new IMQuestion(question:"Здійснювати тривалі й важкі походи, під час яких доводиться напружено працювати за заданою програмою?", category:geology).save()
      

      new IMQuestion(question:"Працювати в лікарні, поліклініці, аптеці?", category:medecin).save()
      

      new IMQuestion(question:"Працювати спеціалістом на підприємстві легкої чи харчової промисловості?", category:foodProducton).save()
      

      new IMQuestion(question:"Розв'язувати складні задачі з фізики", category:physics).save()
      

      new IMQuestion(question:"Працювати на хімічному виробництві або в хімлабораторії?", category:chemistry).save()
      

      new IMQuestion(question:"Брати участь у виставках технічної творчості?", category:technique).save()
      

      new IMQuestion(question:"Працювати в галузі електроенергетики чи радіотехніки?", category:electronics).save()
      

      new IMQuestion(question:"Працювати біля верстата (в основному стоячи), виготовляти різні металеві деталі до виробів?", category:metalCraft).save()
      

      new IMQuestion(question:"Виконувати за кресленням столярні чи модельні роботи?", category:woodCraft).save()
      

      new IMQuestion(question:"Працювати у будівельній бригаді?", category:building).save()
      

      new IMQuestion(question:"Возити пасажирів або вантажі, дотримуватися правил вуличного руху?", category:transport).save()
      

      new IMQuestion(question:"Працювати в штормову погоду на великій річці або у відкритому морі?", category:aviation).save()
      

      new IMQuestion(question:"Працювати воєнним спеціалістом?", category:militarySpecialist).save()
      

      new IMQuestion(question:"Ходити в походи історичними місцями рідного краю?", category:history).save()
      

      new IMQuestion(question:"Писати оповідання, складати вірші, байки тощо?", category:litereture).save()
      

      new IMQuestion(question:"Писати замітки чи нариси до стінгазети або в пресу?", category:journalist).save()
      

      new IMQuestion(question:"Керувати бригадою під час трудового десанта?", category:publicActivity).save()
      

      new IMQuestion(question:"Організовувати ігри і свята для дітей?", category:pedagogic).save()
      

      new IMQuestion(question:"Працювати в юридичному закладі (в суді, адвокатурі, прокуратурі)?", category:jourist).save()
      

      new IMQuestion(question:"Надавати людям різні послуги?", category:sayling).save()
      

      new IMQuestion(question:"Виконувати роботу, яка вимагає постійного використання математичних знань?", category:mathematics).save()
      

      new IMQuestion(question:"Працювати в галузі економіки, планування або фінансування різних підприємств, банківської справи?", category:economics).save()
      

      new IMQuestion(question:"Брати участь в олімпіадах, конкурсах, конференціях іноземною мовою?", category:languages).save()
      

      new IMQuestion(question:"Організовувати виставки образотворчого мистецтва, вчити малювати?", category:art).save()
      

      new IMQuestion(question:"Грати на сцені або зніматися в кіно чи телефільмах?", category:sceneArt).save()
      

      new IMQuestion(question:"Працювати музикантом, музичним режисером, викладати музику?", category:music).save()
      

      new IMQuestion(question:"Працювати викладачем фізкультури або тренером?", category:sport).save()

//      def testInfo = new TestInfo()
//      testInfo.name = "Карта інтрересів"
//      testInfo.description = "description"
//      testInfo.instructions = "some fake insructions"
//
//      testInfo.save()
    }

    private void initAcuality() {
      new ActualQuestion(question:"Я не соромлюся  жодної зі своїх емоцій", isReverted:false).save()
      new ActualQuestion(question:"Я відчуваю, що мушу робити те, що очікують від мене інші", isReverted:true).save()
      new ActualQuestion(question:"Я вірю, що люди самі по собі є добрими, тому їм можна довіряти", isReverted:false).save()
      new ActualQuestion(question:"Я можу гніватися на тих, кого люблю", isReverted:false).save()
      new ActualQuestion(question:"Завжди необхідно, щоб інші схвалювати те, що я роблю", isReverted:true).save()
      new ActualQuestion(question:"Я не приймаю своїх слабких сторін", isReverted:true).save()
      new ActualQuestion(question:"Мені можуть подобатися люди, вчинки яких я не схвалюю", isReverted:false).save()
      new ActualQuestion(question:"Я боюся невдач", isReverted:true).save()
      new ActualQuestion(question:"Я намагаюся не аналізувати і не спрощувати складні сторони життя", isReverted:true).save()
      new ActualQuestion(question:"Краще бути самим собою, ніж популярним", isReverted:false).save()
      new ActualQuestion(question:"В моєму житті нема чогось такого, чому я особливо хочу присвятити себе", isReverted:true).save()
      new ActualQuestion(question:"Я можу виразити свої почуття, навіть якщо це призведе до небажаних наслідків", isReverted:false).save()
      new ActualQuestion(question:"Я не зобов’язана/зобов’язаний допомагати іншим", isReverted:true).save()
      new ActualQuestion(question:"Я стомилася/стомився  від страхів і неадекватності", isReverted:true).save()
      new ActualQuestion(question:"Мене люблять, тому що люблю я", isReverted:false).save()
      
    }

    private void initSchools() {
     1.upto (20) { schoolNumber ->
      new School(name:"СЗШ " + schoolNumber).save()
     }

    }

    private void initYovayshy() {
      new YovayshyQuestion(question:"Уявіть, що  ви на виставці. Що вас більше  привабить в експонатах"
                           ,caseA:"колір, досконалість форм"
                           ,caseB:"як і з чого вони зроблені"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Technical).save()

      new YovayshyQuestion(question:"Які риси  в людині вам більше подобаються"
                           ,caseA:"дружелюбність, чуйність, безкорисливість;"
                           ,caseB:"мужність, сміливість, витривалість."
                           ,keyOnA:YovayshySphere.Poepleware
                           ,keyOnB:YovayshySphere.Handwork
                            ).save()

      new YovayshyQuestion(question:"Побутові послуги надають людям різні послуги. Чи вважаєте за необхідне"
                           ,caseA:"надалі розвивати цю галузь, аби всесторонньо обслуговувати людей"
                           ,caseB:"створювати таку техніку, якою можна було б самим користуватися в побуті"
                           ,keyOnA:YovayshySphere.Material
                           ,keyOnB:YovayshySphere.Technical
                          ).save()

      new YovayshyQuestion(question:"Яка з нагород Вас більше порадує"
                           ,caseA:"за суспільно-корисну діяльність"
                           ,caseB:"за науковий винахід"
                           ,keyOnA:YovayshySphere.Poepleware
                           ,keyOnB:YovayshySphere.Intelligence 
                            ).save()

      new YovayshyQuestion(question:"Ви дивитеся  військовий або спортивний парад.  Що більше привабить вашу увагу"
                           ,caseA:"злагодженість ходьби, граціозність учасників параду"
                           ,caseB:"зовнішнє оформлення колон (прапори, одяг і ін.)"
                           ,keyOnA:YovayshySphere.Handwork
                           ,keyOnB:YovayshySphere.Art
                           ).save()

      new YovayshyQuestion(question:"Уявіть, що  у вас багато вільного часу. Чим би ви більш охоче зайнялись"
                           ,caseA:"чим-небудь практичним (ручною працею)"
                           ,caseB:"суспільною роботою (на добровільних засадах)"
                           ,keyOnA:YovayshySphere.Technical
                           ,keyOnB:YovayshySphere.Poepleware 
                           ).save()

      new YovayshyQuestion(question:"Яку виставку  ви б з великим задоволенням  переглянули"
                           ,caseA:"новинок наукової техніки (в області фізики, хімії, біології)"
                           ,caseB:"нових продовольчих товарів"
                           ,keyOnA:YovayshySphere.Intelligence
                           ,keyOnB:YovayshySphere.Material 
                          ).save()

      new YovayshyQuestion(question:"Якби в школі були два гуртки, який би ви вибрали"
                           ,caseA:"музичний"
                           ,caseB:"технічний"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Technical 
                            ).save()

      new YovayshyQuestion(question:"Якби ви були на посаді директора школи, на що б ви звернули більше уваги"
                           ,caseA:"на згуртованість колективу"
                           ,caseB:"на створення необхідних зручностей"
                           ,keyOnA:YovayshySphere.Poepleware
                           ,keyOnB:YovayshySphere.Technical).save()

      new YovayshyQuestion(question:"Які журнали  ви б з великим задоволенням  читали"
                           ,caseA:"літературно-художні"
                           ,caseB:"науково-популярні"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Intelligence 
                            ).save()

      new YovayshyQuestion(question:"Що важливіше  для людини"
                           ,caseA:"створювати собі зручний побут"
                           ,caseB:"жити без деяких зручностей, але мати можливість користуватися скарбницею мистецтва, створювати мистецтво"
                           ,keyOnA:YovayshySphere.Handwork
                           ,keyOnB:YovayshySphere.Art
                          ).save()

      new YovayshyQuestion(question:"Для благополуччя суспільства необхідно"
                           ,caseA:"техніка"
                           ,caseB:"правосуддя"
                           ,keyOnA:YovayshySphere.Technical
                           ,keyOnB:YovayshySphere.Poepleware
                           ).save()

      new YovayshyQuestion(question:"Яку з двох книг ви б з більшим задоволенням читали"
                           ,caseA:"про розвиток науки в нашій країні"
                           ,caseB:"про досягнення спортсменів нашої країни"
                           ,keyOnA:YovayshySphere.Intelligence
                           ,keyOnB:YovayshySphere.Handwork
                            ).save()

      new YovayshyQuestion(question:"У газеті  дві статті різного змісту. Яка викличе у Вас більшу зацікавленість"
                           ,caseA:"про новітню машину"
                           ,caseB:"про нову наукову теорію"
                           ,keyOnA:YovayshySphere.Technical
                           ,keyOnB:YovayshySphere.Intelligence
                           ).save()

      new YovayshyQuestion(question:"Яка з двох  робіт на свіжому повітрі Вас  більше б приваблює"
                           ,caseA:"робота, пов'язана з постійними рухом (агроном, лісничий, дорожній майстер)"
                           ,caseB:"робота з машинами"
                           ,keyOnA:YovayshySphere.Handwork
                           ,keyOnB:YovayshySphere.Technical
                          ).save()

      new YovayshyQuestion(question:"Яке, на ваш погляд, завдання школи важливіше"
                           ,caseA:"підготувати дітей до роботи з людьми, аби вони могли допомагати іншим створювати матеріальні блага"
                           ,caseB:"підготувати дітей до практичної діяльності, до уміння створювати матеріальні блага"
                           ,keyOnA:YovayshySphere.Poepleware
                           ,keyOnB:YovayshySphere.Handwork
                           ).save()

      new YovayshyQuestion(question:"Що, на ваш  погляд, слід більше цінувати  у учасників самодіяльності"
                           ,caseA:"те, що вони несуть людям мистецтво і красу"
                           ,caseB:"те, що вони виконують суспільно корисну роботу"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Poepleware ).save()

      new YovayshyQuestion(question:"Яка, на  ваш погляд, область діяльності  людини надалі матиме домінуюче  значення"
                           ,caseA:"фізика"
                           ,caseB:"фізична культура"
                           ,keyOnA:YovayshySphere.Intelligence
                           ,keyOnB:YovayshySphere.Handwork
                          ).save()


      new YovayshyQuestion(question:"Що суспільству  принесе більше користі"
                           ,caseA:"турбота про добробут громадян"
                           ,caseB:"вивчення поведінки людей"
                           ,keyOnA:YovayshySphere.Handwork
                           ,keyOnB:YovayshySphere.Poepleware
                            ).save()

      new YovayshyQuestion(question:"Якого характеру  наукову роботу ви б вибрали"
                           ,caseA:"роботу з книгами в бібліотеці"
                           ,caseB:"роботу на свіжому повітрі в експедиції"
                           ,keyOnA:YovayshySphere.Intelligence 
                           ,keyOnB:YovayshySphere.Handwork 
                           ).save()

      new YovayshyQuestion(question:"Уявіть, що  ви професор університету. Чому  ви віддали б перевагу у  вільний від роботи час"
                           ,caseA:"заняттям по літературі"
                           ,caseB:"дослідам по фізиці, хімії"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Intelligence
                           ).save()

      new YovayshyQuestion(question:"Вам надається  можливість зробити подорож в  різні країни. Куди б ви більш охоче поїхали"
                           ,caseA:"як відомий спортсмен на міжнародні змагання"
                           ,caseB:"як відомий фахівець зовнішньої торгівлі з метою покупки необхідних товарів для нашої країни"
                           ,keyOnA:YovayshySphere.Handwork
                           ,keyOnB:YovayshySphere.Material
                          ).save()

      new YovayshyQuestion(question:"Які лекції  ви б слухали з великим задоволенням"
                           ,caseA:"про видатних художників"
                           ,caseB:"про видатних учених"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Poepleware
                            ).save()

      new YovayshyQuestion(question:"Що вас більше  приваблює при читанні книг"
                           ,caseA:"яскраве зображення сміливості і хоробрості героїв"
                           ,caseB:"прекрасний літературний стиль"
                           ,keyOnA:YovayshySphere.Handwork 
                           ,keyOnB:YovayshySphere.Art
                            ).save()

      new YovayshyQuestion(question:"Вам надається  можливість вибору професії. Який з них ви б віддали перевагу"
                           ,caseA:"роботі малорухливої, але пов'язаної із створенням нової техніки"
                           ,caseB:"фізичній культурі або іншій роботі, пов'язаній з рухом"
                           ,keyOnA:YovayshySphere.Technical
                           ,keyOnB:YovayshySphere.Handwork
                           ).save()

      new YovayshyQuestion(question:"Якими видатними  ученими ви більше цікавитеся"
                           ,caseA:"Поповим і Ціолковським"
                           ,caseB:"Менделєєвим і Павловим"
                           ,keyOnA:YovayshySphere.Technical
                           ,keyOnB:YovayshySphere.Intelligence
                          ).save()

      new YovayshyQuestion(question:"Як вам здається, на що слід було б в школі  звернути більше уваги"
                           ,caseA:"на спорт, оскільки це потрібно для зміцнення здоров'я"
                           ,caseB:"на успішність учнів, оскільки це необхідно для їх майбутнього"
                           ,keyOnA:YovayshySphere.Handwork   
                           ,keyOnB:YovayshySphere.Material
                           ).save()

      new YovayshyQuestion(question:"Що б вас  більше зацікавило в ЗМІ"
                           ,caseA:"повідомлення про художню виставку, що відбулася"
                           ,caseB:"звістка про минулий мітинг в захист прав людини"
                           ,keyOnA:YovayshySphere.Art
                           ,keyOnB:YovayshySphere.Poepleware 
                            ).save()

      new YovayshyQuestion(question:"Якби вам  трапилася нагода зайняти певний  пост, який би ви вибрали"
                           ,caseA:"головного інженера заводу"
                           ,caseB:"директора супермаркету"
                           ,keyOnA:YovayshySphere.Material
                           ,keyOnB:YovayshySphere.Technical
                          ).save()

      new YovayshyQuestion(question:"Як ви вважаєте, що важливіше"
                           ,caseA:"багато знати"
                           ,caseB:"створювати матеріальні цінності"
                           ,keyOnA:YovayshySphere.Intelligence
                           ,keyOnB:YovayshySphere.Material
              
                           ).save()
    }

    private void initLidership() {
      new LidershipQuestion(question:"Чи часто ви перебуваєте у центрі уваги навколишніх?", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви, що багато хто з оточуючих вас людей мають більш високе становище серед оточуючих?", keyCase:1).save()
      new LidershipQuestion(question:"Перебуваючи у компанії людей, чи відчуваєте ви бажання не висловлювати своєї думки, навіть, коли це необхідно?", keyCase:2).save()
      new LidershipQuestion(question:"Чи подобається вам бути лідером серед однолітків?", keyCase:1).save()
      new LidershipQuestion(question:"Чи відчуваєте ви задоволення, коли вам вдається переконати когось у чомусь?", keyCase:1).save()
      new LidershipQuestion(question:"Чи трапляється так, що вас називають нерішучою людиною?", keyCase:2).save()
      new LidershipQuestion(question:"Чи згодні ви з твердженням: «Усе найкорисніше у світі є результатом діяльності невеликої кількості видатних людей»?", keyCase:1).save()
      new LidershipQuestion(question:"Чи відчуваєте ви нагальну потребу в пораднику, який міг би спрямувати вашу діяльність?", keyCase:2).save()
      new LidershipQuestion(question:"Чи отримуєте ви задоволення від того, що оточуючі побоюються вас?", keyCase:2).save()
      new LidershipQuestion(question:"Чи намагаєтесь ви займати за столом (у компанії, зборах тощо) таке місце, що дозволяло б вам бути у центрі уваги і контролювати ситуацію? ", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви, що викликаєте у людей враження значущості (імпозантності)?", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви себе мрійником?", keyCase:1).save()
      new LidershipQuestion(question:"Чи губитеся ви, якщо люди, що оточують вас, виражають незгоду з вами?", keyCase:2).save()
      new LidershipQuestion(question:"Чи траплялося вам з особистої ініціативи займатися організацією трудових, спортивних та інших команд і колективів?", keyCase:2).save()
      new LidershipQuestion(question:"Якщо те, що ви запланували, не дало очікуваних результатів, тоді ви:"
              , caseA:"будете раді, якщо відповідальність за цю справу покладуть  на кого-небудь іншого;"
              , caseB:"візьмете на себе відповідальність, самі доведете справу до кінця;"
              , keyCase:1).save()

      new LidershipQuestion(question:"Яка з двох думок вам ближче?"
              , caseA:"справжній  керівник повинен сам робити ту справу, якою він керує й особисто брати  участь у ній;"
              , caseB:"справжній  керівник повинен тільки вміти керувати іншими і не обов’язково робити справу сам?"
              , keyCase:2).save()

      new LidershipQuestion(question:"Уявіть, що ви керівник. З ким ви прагнете працювати?"
              , caseA:"з покірними  людьми;"
              , caseB:"з незалежними  самостійними людьми;"
              , keyCase:1).save()
      new LidershipQuestion(question:"Чи намагаєтесь ви уникати гострих дискусій?", keyCase:2).save()
      new LidershipQuestion(question:"Чи часто ви зіштовхувалися з владністю вашого батька?", keyCase:2).save()
      new LidershipQuestion(question:"Чи вмієте ви у дискусії на тему, яку ви добре знаєте, залучити на свою сторону тих, хто раніше був з вами не згодний?", keyCase:1).save()
      new LidershipQuestion(question:"Уявіть собі таку ситуацію: під час прогулянки з друзями у лісі ви загубилися. Вечір, потрібно приймати рішення. Які ваші дії?"
              , caseA:"надасте  ухвалити рішення компетентному  з вас;"
              , caseB:"просто не будете нічого робити, розраховуючи на інших;"
              , keyCase:1).save()
      new LidershipQuestion(question:"Є таке прислів’я: «Краще бути першим у селі, ніж останнім у місті». Чи вірне воно?", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви себе людиною, що має вплив на інших?", keyCase:1).save()
      new LidershipQuestion(question:"Чи може невдача у прояві ініціативи змусити вас більше ніколи цього не робити?", keyCase:2).save()
      new LidershipQuestion(question:"Хто, на ваш погляд, справжній лідер?"
              , caseA:"найбільш компетентний чоловік;"
              , caseB:"той, у  кого найсильніший характер?"
              , keyCase:1).save()
      new LidershipQuestion(question:"Чи завжди ви намагаєтесь зрозуміти і вірно оцінити людей?", keyCase:2).save()
      new LidershipQuestion(question:"Чи поважаєте ви дисципліну?", keyCase:1).save()
      new LidershipQuestion(question:"Якому з наступних двох керівників ви віддасте перевагу?"
              , caseA:"тому, хто  все вирішує сам;"
              , caseB:"тому, хто завжди радиться і прислухається до думок інших;"
              , keyCase:2).save()

      new LidershipQuestion(question:" Який з наступних стилів керівництва, на вашу думку, найкращий для роботи з колективом?"
              , caseA:"колегіальний"
              , caseB:"авторитарний"
              , keyCase:2).save()
      new LidershipQuestion(question:"Чи часто у вас виникає враження, що інші зловживають вами?", keyCase:1).save()
      new LidershipQuestion(question:"Який з наступних портретів більше нагадує вас?"
              , caseA:"людина у  якої сильний голос, виразні жести, за словом у кишеню не лізе"
              , caseB:"людина, яка  має спокійний, тихий голос, стримана, замислена"
              , keyCase:1).save()

      new LidershipQuestion(question:"Як ви поводитиметеся на зборах, у колективі, якщо вважаєте свою думку правильною, але інші з вами не згодні?"
              , caseA:"промовчите"
              , caseB:"будете обстоювати свою думку"
              , keyCase:2).save()

      new LidershipQuestion(question:"Чи підкоряєте ви свої інтереси і поводження інших людей справі, якою займаєтесь?", keyCase:1).save()
      new LidershipQuestion(question:"Чи виникає у вас почуття тривоги, якщо на вас покладено відповідальність за яку-небудь важливу справу?", keyCase:2).save()
      new LidershipQuestion(question:"Чому б ви віддали перевагу?"
              , caseA:"працювати  під керівництвом гарної людини"
              , caseB:"працювати  самостійно, без керівників"
              , keyCase:1).save()

      new LidershipQuestion(question:"Як ви ставитеся до твердження: «Для того, щоб сімейне життя було гарним, необхідно, щоб рішення в родині приймав один з подружжя?"
              , caseA:"згодний"
              , caseB:"не згодний"
              , keyCase:2).save()
      new LidershipQuestion(question:"Чи траплялось вам купувати що-небудь під впливом думки інших людей, а не виходячи з власної потреби?", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви свої організаторські здібності гарними?", keyCase:1).save()
      new LidershipQuestion(question:"Як поводитесь, зіштовхнувшись з труднощами?", keyCase:1).save()
      new LidershipQuestion(question:"Чи дорікаєте ви людям, якщо вони на це заслуговують?", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви, що ваша нервова система здатна витримати життєве навантаження?", keyCase:1).save()
      new LidershipQuestion(question:"Уявіть, що ви керівник великої компанії. Як ви вчините, якщо вам запропонують реорганізувати вашу установу або організацію?"
              , caseA:"запроваджу потрібні зміни негайно"
              , caseB:"не буду квапитися  і спочатку все ретельно обміркую"
              , keyCase:1).save()
      new LidershipQuestion(question:"Чи зумієте ви перервати занадто балакучого співрозмовника, якщо це необхідно?", keyCase:1).save()
      new LidershipQuestion(question:"Чи вважаєте ви, що людина повинна зробити що-небудь видатне?", keyCase:1).save();
      new LidershipQuestion(question:"Ким би ви прагнули стати?"
              , caseA:"художником, поетом, композитором, ученим"
              , caseB:"видатним керівником, політичним діячем"
              , keyCase:1).save()
      new LidershipQuestion(question:"Яку музику вам приємніше слухати?"
              , caseA:"гучну  і урочисту"
              , caseB:"тиху і  ліричну"
              , keyCase:1).save()

      new LidershipQuestion(question:"Чи відчуваєте ви хвилювання, очікуючи зустрічі з важливими і відомими людьми?", keyCase:1).save()
      new LidershipQuestion(question:"Чи часто ви зустрічали людей з більш сильною волею, ніж ваша?", keyCase:1).save()

    }

    private void initMotivation() {
       	new MotivationQuestion(question:"Вимагає спілкування  з різними людьми"
                              , motivationVector:MotivationVector.InternalIndividual).save()

       	new MotivationQuestion(question:"Подобається батькам"
                              , motivationVector:MotivationVector.ExternalNegative).save()

       	new MotivationQuestion(question:"Передбачає високу відповідальність"
                              , motivationVector:MotivationVector.InternalSocial).save()

       	new MotivationQuestion(question:"Вимагає переїзду на нове місце проживання"
                              , motivationVector:MotivationVector.ExternalPositive).save()

       	new MotivationQuestion(question:"Відповідає моїм здібностям"
                              , motivationVector:MotivationVector.InternalIndividual).save()

       	new MotivationQuestion(question:"Дозволяє обмежитися наявним устаткуванням"
                              , motivationVector:MotivationVector.ExternalNegative).save()

       	new MotivationQuestion(question:"Дає можливість приносити користь людям"
                              , motivationVector:MotivationVector.InternalSocial).save()

       	new MotivationQuestion(question:"Сприяє розумовому і фізичному розвитку"
                              , motivationVector:MotivationVector.InternalIndividual).save()

       	new MotivationQuestion(question:"Високооплачувана  професія"
                              , motivationVector:MotivationVector.ExternalPositive).save()

       	new MotivationQuestion(question:"Дозволяє працювати  близько від будинку"
                              , motivationVector:MotivationVector.ExternalPositive).save()

       	new MotivationQuestion(question:"Престижна професія"
                              , motivationVector:MotivationVector.ExternalNegative).save()

       	new MotivationQuestion(question:"Дає можливості для зростання професійної майстерності"
                              , motivationVector:MotivationVector.InternalSocial).save()

       	new MotivationQuestion(question:"Єдино можлива  в обставинах, що склалися"
                              , motivationVector:MotivationVector.ExternalNegative).save()

       	new MotivationQuestion(question:"Дозволяє реалізувати  здібності до керівної роботи"
                              , motivationVector:MotivationVector.ExternalPositive).save()

       	new MotivationQuestion(question:"Приваблива"
                              , motivationVector:MotivationVector.InternalIndividual).save()

       	new MotivationQuestion(question:"Близька до улюбленого шкільного предмету"
                              , motivationVector:MotivationVector.ExternalPositive).save()

       	new MotivationQuestion(question:"Дозволяє відразу  отримати добрий результат праці  для інших"
                              , motivationVector:MotivationVector.InternalSocial).save()

       	new MotivationQuestion(question:"Вибрана моїми  друзями"
                              , motivationVector:MotivationVector.ExternalNegative).save()

       	new MotivationQuestion(question:"Дозволяє використовувати  професійні уміння поза роботою"
                              , motivationVector:MotivationVector.ExternalPositive).save()

       	new MotivationQuestion(question:"Дає великі можливості проявити творчість"
                              , motivationVector:MotivationVector.InternalIndividual).save()
    }


    private void initHolland() {
        new HollandQuestion(question:"Курси навчання робіт  з деревом", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Робота на легковому  автомобілі", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Ремонт господарських  споруд	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Ремонт електроприладів	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Налаштування музичних стереосистем	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Домашня майстерність	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Роботи на дачній ділянці	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Курси навчання на автомеханіка	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Ремонт квартири	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Вирішення технічних  проблем	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Відновлення старих речей, приладів... 	", vector:HollandVector.ILikeIt, type:HollandType.Realistic).save();
        new HollandQuestion(question:"Гра на музичному  інструменті	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"Писати для газети або журналу	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Втілення в драматичних  творах розповіді або художнього задуму	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Гра в ансамблі, групі, оркестрі...	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Конструювати меблі, одяг...	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Писати портрети або займатися фотографією	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Пройти курси дизайну	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Видавництво журналу  або газети	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Займатися малюнком або живописом	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Читати або писати поетичні твори	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Створювати декоративні вироби 	", vector:HollandVector.ILikeIt, type:HollandType.Artistic).save();
        new HollandQuestion(question:"	Робота в науково-дослідній  лабораторії	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Застосовувати математику для вирішення практичної проблеми	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Вивчати наукові  теорії	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Аналізувати інформацію для розробки нових пропозицій, робіт	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Читати наукові  книги і журнали	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Знаходити вирішення  складних проблем	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Відвідувати наукові  музеї, семінари	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Систематизувати дані по різних проблемах, питаннях	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Вивчати курс математичної статистики	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Розмірковувати над науковими проблемами	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	Освоювати нову наукову  дисципліну 	", vector:HollandVector.ILikeIt, type:HollandType.Investication).save();
        new HollandQuestion(question:"	 Працювати у  сфері соціальної підтримки і  захисту	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Вивчати психології людських відносин	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Вивчати факти  порушення закону неповнолітніми	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Дискутувати в питаннях стосунків між людьми	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Навчати інших виконувати яку-небудь роботу	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Читати книги по соціології, статті про закономірності людського спілкування	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Допомагати людям, з фізичними вадами	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Допомагати людям  порадами у важких для них  ситуаціях	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	Викладати в навчальних закладах	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Піклуватися про  дітей або допомагати людям	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Вчитися на курсах гідів або екскурсоводів 	", vector:HollandVector.ILikeIt, type:HollandType.Social).save();
        new HollandQuestion(question:"	 Бути керівником  проекту або якого-небудь заходу	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Навчатися на курсах або семінарі для керівників	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Читати про  керівництво в бізнесі або  уряді	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Брати участь  в політичних кампаніях	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Організовувати власну справу і керувати нею	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Приймати рішення  у важливих і відповідальних  справах	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Впливати на інших людей	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Брати участь в аукціонах, торгах	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Стежити за  попитом і пропозицією на ринках	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Організовувати  і проводити виборчі кампанії 	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Тримати свій робочий стіл і приміщення у повному порядку	", vector:HollandVector.ILikeIt, type:HollandType.Comerce).save();
        new HollandQuestion(question:"	 Працювати з розрахунково-обчислювальними машинами	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Проводити інвентаризацію матеріальних ресурсів	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Записувати свої  витрати	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Проводити перевірку  документації або продукції для  виявлення помилок або пропаж	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Проводити математичні розрахунки в бухгалтерії або бізнесі	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Вести ділове  листування	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Управляти оргтехнікою (комп'ютером, ксероксом, факсом...) в установі	", vector:HollandVector.ILikeIt).save();
        new HollandQuestion(question:"	 Заповнювати стандартні форми (бланки, анкети, таблиці цифрові...)	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();
        new HollandQuestion(question:"	 Вчитися на бухгалтерських курсах 	", vector:HollandVector.ILikeIt, type:HollandType.Conventional).save();

             new HollandQuestion(question:"Простий ремонт  телевізора або радіоприймача", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Ремонт меблів", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Використовувати  електромеханічні інструменти", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Прочитати креслення,  схеми", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Зробити простий електричний ремонт", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Замінити мастило або дрібну деталь в автомобілі", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Виконати креслення", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Користуватися  столярними інструментами", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Проводити слюсарний (по металу) ремонт", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Розрахувати кількість  необхідного матеріалу для ремонту,  будівництва...", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Використовувати  прилади електровимірювання", vector:HollandVector.ICanDoIt, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Написати розповідь,  статтю...", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Створити рекламний  плакат", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Писати фарбами,  ліпити...", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Змалювати або  описати людину так, що його можна відразу ж упізнати...", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Поставити виставу, зняти фільм...", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Написати рекламне  оголошення", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Розробити дизайн  для упаковок продуктів", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Декорувати робочу установу або приміщення для відпочинку", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Грати в спектаклі,  п'єсі, фільмі...", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Виготовити прості прикраси", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Виконати художні  фотознімки", vector:HollandVector.ICanDoIt, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Використовувати комп'ютер при вирішенні якоїсь проблеми", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Розібратися у фізичних властивостях багатьох речовин, матеріалів", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Зрозуміти і розшифрувати прості хімічні формули", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Використовувати калькулятор  і ін. обчислювальну техніку", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Застосовувати мікроскоп  для вирішення якихось наукових завдань", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Описувати роботу основних органів людського організму", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Застосовувати для  розрахунків різні цифрові таблиці", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Написати реферат  на задану тему...", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Назвати три страви з високим вмістом білка (жирів, вуглеводів...)", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Коротко, чітко, зрозуміло  викласти яку-небудь теорію або відповісти на поставлене питання  ", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Добре приймати  гостей", vector:HollandVector.ICanDoIt, type:HollandType.Investication).save();
             new HollandQuestion(question:"Легко допомагати  іншим в прийнятті рішень", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Брати участь  в благодійних акціях", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Легко пояснювати  якісь речі іншим", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Очолити групову  дискусію", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Легко створити  людям гарний настрій", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Легко розмовляти  з будь-якими людьми", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Легко допомагати  людям планувати їх майбутнє", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Тренувати інших", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Легко вчити інших", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Дуже добре  знатися на людях, їх вчинках,  настрої", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Організувати роботу інших", vector:HollandVector.ICanDoIt, type:HollandType.Social).save();
             new HollandQuestion(question:"Оцінити власні  переваги", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Зацікавити інших", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Організувати  і управляти компанією по продажах", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Здібності продавати  і рекламувати", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Планувати стратегію  (заходи) для досягнення мети", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Здібності публічно  виступати", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Знання, як стати  лідером, що добивається успіхів", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Грамотно і  аргументовано відстоювати свою  точку зору", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Почати свою  власну справу", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Розвинути в  собі бажані якості", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Працювати з  документами і кореспонденцією", vector:HollandVector.ICanDoIt, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Легко отримати  необхідну інформацію по телефону", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Вести облік  доходів і витрат", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Використовувати комп'ютер для аналізу даних бізнесу", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Друкувати на  пристрої, що пише", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Складати ділові  листи і інші документи", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Використовувати  редактори текстів на комп'ютері", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Створювати обстановку  для ділових зустрічей", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Працювати на  копіювальних, розмножувальних машинах", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Швидко помічати  помилки в розрахунках або тексті", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Успішно користуватися  каталогами, довідниками", vector:HollandVector.ICanDoIt, type:HollandType.Conventional).save();
            
             new HollandQuestion(question:"Тесляр", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Фермер", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Автомеханік", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Фахівець з  електронної апаратури", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Лісник", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Шофер", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Зварювальник", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Радіоінженер", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Інженер-механік", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Гравер", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Економіст", vector:HollandVector.Proffetion, type:HollandType.Realistic).save();
             new HollandQuestion(question:"Інженер-конструктор", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Ювелір", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Оператор енергетичних установок", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Письменник", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Фотограф", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Музикант", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Художник", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Автор художніх творів", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Артист", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Співець", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Фахівець з  різних творів мистецтва", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Журналіст", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Художник-копіст", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Видавець газети журналу", vector:HollandVector.Proffetion, type:HollandType.Artistic).save();
             new HollandQuestion(question:"Акто", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Архітектор", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Дизайнер", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Інженер-конструктор", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Технік медичної лабораторії", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Фізик", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Хімік", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Видавець наукового  журналу", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Ботанік", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Хірург", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Антрополог", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Родинний лікар", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Метеоролог", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Науковець в області  соціальних наук (вивчає закономірності життя суспільства і людини) ", vector:HollandVector.Proffetion, type:HollandType.Investication).save();
             new HollandQuestion(question:"Біолог", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Науковець дослідницької лабораторії", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Автор науково-популярних книг і статей", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Викладач інституту, коледжу...", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Працівник в  соціальної області", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Логопед", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Вчитель школи", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Психолог", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Фахівець з  родинного консультування", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Викладач суспільних і соціальних наук", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Співробітник  служби соціальної підтримки", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Інструктор молодіжного табору", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Консультант по  вибору професії", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Соціолог", vector:HollandVector.Proffetion, type:HollandType.Social).save();
             new HollandQuestion(question:"Інспектор у  справах неповнолітніх", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Співробітник  служби \"Телефон довіри\"", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Священник", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Керівник фірмою", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Керівник готелем", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Директор радіо і телебачення", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Агент з продажу  нерухомості", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Керівник розпродажів", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Завідувач відділом  маркетингу", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Керівник магазином", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Адвокат", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Директор рекламного агентства", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Посередник в торгівельних операціях", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Продавець (торгівельний  працівник)", vector:HollandVector.Proffetion, type:HollandType.Comerce).save();
             new HollandQuestion(question:"Суддя", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Брокер на біржі", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Керівник спортивної команди", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Економіст", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Рахівник", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Секретар", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Касир", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Інспектор в  банці", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Податковий інспектор", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Ревізор, аудитор  (перевіряє фінансову діяльність  організацій)", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Контролер-кредитор", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Оператор ПК", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Судовий виконавець", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Архіваріус", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Бухгалтер", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Нотаріус", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
             new HollandQuestion(question:"Бібліотекар", vector:HollandVector.Proffetion, type:HollandType.Conventional).save();
    }

} 