Assignment01

1.Design a course management system (Like Canvas);

- *-CourseManagementSystem*

  

  - Data：SystemManager,Student,Professor,Course
  - Behavior：notice,commit,punishAssignment,showCourseInfo,punishFile,checkAssignments

​                                    punishAssignment,showAssignment,checkAssignment

- *-Student*
  - Data:Name,Id,Course
  -    Behaviors:logIn,searchCourse,changeOtherCourse,registerCourse,searchAssignments
                    commitAssignments,searchGrade

- *SystemManager*
  -   Data：Name,Id
  - Behavior:checkOut,reAccess

- *-Course*
  -  Data:Name,Id,Professor,CourseTime,CourseLocation
  -  Behavior:

- *-File*
  -  Data:name,format,size
  - Behavior:

- *-Teacher*
  - Data: Name,Id
  - Behaviors:logIn,punishSyllabus,punishAssignment
- *-TA*
  - Data: Name,Id
  - Behaviors:logIn,rankAssignments,download,makeComments,logOut

```java
Student cindy;
CourseManagementSystem blackboard;
Course database;
SystemManager mike;
Teacher peters;
TA max;

cindy.logIn(loginCredentials);
if cindy come across problems when login their account
   mike.checkOut(cindy.name,cindy.id,cindy.password)
   mike.reAccess(cindy);
else
   if cindy is interested in database
      Course database = cindy.searchCourse(course.name,course.id);
      blackboard.showCourseInfo(database);
         if the schedule is conflict
            cindy.changeOtherCourse();
         else
            cindy.registerCourse(peters,database);
            if the number of student full
               blackboard.notice("the course is full");
            else
               blackboard.notice("you registered database successfully");


//professor commit academic material
peters.logIn(peters.name,peters.id);
File databaseFile = peters.punishSyllabus(files);
blackboard.checkFiles(databaseFile);
  if the oodFile is a good size and format
     blackboard.punishFile(databaseFile);
  else
     blackboard.notice("your files' format is wrong");

//professor punish assignment
File databaseAssignment = peters.punishAssignments(files);
blackboard.checkAssignments(databaseAssignment);
  if the oodAssignment is a good size and format
     blackboard.punishAssignment(databaseAssignment);
  else
    blackboard.notice("your files' format is wrong");
peters.logOut;

//student commit assignment
cindy.searchAssignments(database.name);
blackboard.showAssignment
File assignmentFile = cindy.commitAssignments(file)
blackboard.checkAssignments(assignmentFile.name,assignmentFile.
                                 format,assignmentFile.size,assignmentFile.time);
  if the assignmentFile is a good size and format
     if the assignmentFile.time is within the deadline
        blackboard.notice("commit successful");
        blackboard.commit(assignmentFile);
     else
        blackboard.notice("commit late");
  else
     blackboard.notice("your files' format is wrong");

//TA rank assignment.login(name,id);
max.download(assignmentFile)
max.rankAssignments(assignmentFile);
max.makeComments("****");
max.logOut;

//student search grades
cindy.searchGrade(ood.name);
cindy.logOut;
```

------

2.Design a pet adoption platform

- -*Pet*
  - Data:breed,name,age,gender,size,length,color,location,fee
  - behavior:

- *-Adopter*
  - Data:loginCredentials,location,email,phone,name,applicationInfo
  - Behavior:log,search,adopt,accessAnimalRescueOrganization,submitApplication,payAdoptionfees,submitApplicationAgain, askAboutPet,favoritePet,chooseHowToGetThePet

- *-AnimalRescueOrganization*
  - Data:Pet,email,phoneNumber, Adoptionfees
  - Behavior:sendReceipt

- *-adoptionPlatform*
  - Data:Pet,AnimalRescueOrganization
  - Behavior:checkout,showinfo,savePetToFavorite

```java
Adopter xinyi;
AnimalRescueOrganization wgs;
Pet dexter;
adoptionPlatform petfinder;

xinyi.logIn(loginCredentials);
Pet dexter = xinyi.search(breed,age,gender,size,length,color,location);
petfinder.showinfo;
xinyi.askAboutPet(location,email,phone,name,question);
xinyi.favoritePet(dexter);
petfinder.savePetToFavorite(dexter);
xinyi.accessAnimalRescueOrganization(dexter,email,phoneNumber);
xinyi.submitApplication(applicationInfo)
if application doesn't passed
   xinyi.submitApplicationAgain(applicationInfo);
else
   xinyi.payAdoptionfees(dexter);
   petfinder.checkout(xinyi.location,xinyi.email,xinyi.phone,xinyi.name);
   AnimalRescueOrganization.sendReceipt(xinyi.email);
   xinyi.chooseHowToGetThePet;
   if the dog xinyi adopted doesn't work out and xinyi have given the dog your best effort
      xinyi.tryAnotherPet;
```

3.Design an app to book airline ticket.

- *-Passenger*
  - Data:loginCredentials,Gender,Name,DateOfBirth,PhoneNumber,creditCard,idCard,account
  - Behavior:logIn,searchTickets,comparePrice,chooseFight,selectSeat,buy,dropTickets,
             selectOtherFight,chooseVipService,getTicket,needHelp,confirmTicket

- *-Fight*
  - Data: flyDate,starPoint,destination,ticket,fightCompany,fightId,price
  - Behavior:

- *-Ticket*
  - Data:SeatNumber,price,id
  - Behavior:

- *-App*
  - Data:name,Fight,Ticket,passenger
  - Behavior:checkOut,printOutTickets,refund,providePhoneNumber,provideOnlineService

```

Customer mike;
App justFly;
Fight OntarioToMiami;

mike.logIn(loginCredentials);
Fight OntarioToMiami = mike.searchTickets(flyDate,starPoint,destination);
mike.chooseFight(OntarioToMiami);
mike.comparePrice;
Fight.id 1833 = mike.chooseFight;
if have tickets
   if mike change his mind
      mike.dropTickets(1833);
      justFly.refund(ticket,mike);
   else
      mike.selectSeat;
      SeatNumber 6B = justFly.provideSeatNumber;
      mike.buy(1833);
      if mike wants VIPservice
         mike.chooseVipService;                      
      justFly.checkOut(mike.name,mike.gender,mike.DateOfBirth,mike.PhoneNumber,
                       mike.creditCard)
      justFly.printOutTickets();
      mike.confirmTicket(mike.account);
else
   mike.selectOtherFight(OntarioToMiami);
   if mike come across some problem when book tickets
   mike.needHelp;
   justFly.provideOnlineService(mike.account);
   mike.getTicket(ticket.id,mike.idCard);
```

------

4.Design a course registration platform.

- *-Student*
  - Data:loginCredentials,name,id,password,email
  - Behavior:logIn,searchCourse,registerCourse,changeOtherCourse,dropCourse

- *-course registration platform*
  - Data:name,Course,Student
  - Behavior:notice,showCourseInfo

- *-Course*
  - Data:name,id,schedule,room,location,Professor
  - Behavior:

- *-Professor*
  - Data:name,id
  - Behavior:

- *-SystemManager*
  - Data:name,id
  - Behavior:checkOut,reAccess

```java

courseRegistrationPlatform stCourse
Student cindy
Course course;
Professor peters;
Professor mark;
SystemManager mike;

cindy.logIn(loginCredentials);
if cindy come across problems when login their account
   mike.checkOut(cindy.name,cindy.id,cindy.password)
   mike.reAccess(cindy);
else
   if cindy is interested in database
      Course database = cindy.searchCourse(course.name,course.id);
      stCourse.showCourseInfo(database);
      if cindy is interested in professor Peters;
         if the schedule is conflict
            cindy.changeOtherCourse();
         else
            cindy.registerCourse(peters,database);
            if the number of student full
               stCourse.notice("the course is full");
            else
               stCourse.notice("you registered database successfully");
      else
         cindy.registerCourse(mark,database);
         if the schedule is conflict
               cindy.changeOtherCourse();
            else
               cindy.registerCourse(mark,database);
            if the number of student full
               stCourse.notice("the course is full");
            else
               stCourse.notice("you registered database successfully");
            if cindy wants to drop course before deadline
               cindy.dropCourse(database);
               stCourse.notice("the course dropped");
            else
               stCourse.notice("you can't drop the course");
   else
      cindy.searchCourse(course.name,course.id);
```

------

5.Order food in a food delivery app.(Like Uber Eats)

- *-Customer*
  - Data:loginCredentials,name,Address,Phone
  - Behavior:logIn,GroupOrder,search,order,review,selectOtherFood,callDeliver
             receiveFood,filter,receivefood,note

- *-OnlineShop*
  - Data:name,location,Food
  - Behavior:checkOut,sendToCustomer,notice

- *-Food*
  - Data:type,price,rank,number,
  - Behavior:

- *-Physical restaurant*
  - Data:Food,rank
  - Behavior:receiveOrder,cook,sentToDeliver

- *-Deliver*
  - Data:Phone,name,id
  - Behavior:receiveOrder,deliverFood

```java

Customer cindy;
Customer tom;
OnlineShop UberEats;
Deliver mike;
Deliver peter;
PhysicalRestaurant wendy;

cindy.logIn(loginCredentials);
food pizza = cindy.search(type);
food fruitPizza = cindy.filter(food.type,food.price,food.rank);
food seafoodPizza = tom.filter(food.type,food.price,food.rank);
if cindy want to order food by herself
   UberEats.checkout(cindy.address,wendy.address);
   if the restaurant is too far to deliver
      UberEats.notice("the restaurant is too far to deliver");
      cindy.selectOtherFood;
   else
      cindy.order(fruitPizza);
      cindy.note("****")
      UberEats.checkOut(cindy.address,cindy.phone,cindy.name);
      if wendy have fruitPizza
         wendy.receiveOrder(mike.phone,cindy.address);
         wendy.cook(fruitPizza);
         mike.receiveOrder(cindy.address,wendy.location);
         UberEats.sentToCustomer(mike,fruitPizza);
         mike.deliverFood(fruitPizza,cindy.address);
         cindy.receivefood;
         if the order doesn't deliver at a right time
            cindy.callDeliver(mike.phone)
         else
            cindy.receiveFood;
         if cindy satisfied with the food
            cindy.review("*****");
         else
            cindy.review("#####");
      else
         wendy.notice("fruitPizza sold out");
     
else( cindy want to group order)
   UberEats.checkout(cindy.address,tom.address,wendy.address);
   if the restaurant is too far to deliver
      cindy.selectOtherFood;
      tom.selectOtherFood;
   else
      cindy.order(fruitPizza);
      tom.order(seafoodPizza);
      UberEats.checkOut(cindy.address,tom.address,wendy.address);
      mike.receiveOrder()
      wendy.receiveOrder(mike.phone,cindy.address,tom.address);
      wendy.cook(fruitPizza,seafoodPizza);
      UberEats.sentToCustomer(mike,fruitPizza);
      mike.deliverFood(fruitPizza,cindy.address);
      peter.deliverFood(seafoodPizza,tom.address);
      if the order doesn't deliver at a right time
         cindy.callDeliver(mike.phone);
         or
         tom.callDeliver(peter.phone) ;
      else
         cindy.receiveFood;
         tom.receiveFood;
      if cindy/tom satisfied with the food
         cindy.review("*****");
         tom.review("***");
      else
         cindy.review("#####");
         tom.review("###");
```