​Component 5: Notification System
​Implemented by: Hassan Ahmed (Hassan-Ahmed24)
​Overview
​This component handles the delivery of notifications within the University Course Management System. It is designed to be extensible, allowing the system to send alerts via different channels like Email and SMS when important events occur, such as grade postings or enrollment updates.
​OOP Principles Applied
​Abstraction: Defined a clear contract using the NotificationService interface. This allows other components to send notifications without needing to know the underlying delivery logic.
​Inheritance: Both EmailNotification and SMSNotification classes implement the NotificationService, creating a structured hierarchy.
​Polymorphism: Demonstrated through method overriding. The sendNotification method behaves differently depending on whether it's an instance of EmailNotification or SMSNotification.
​Files Created
​NotificationService.java: The core interface (Abstraction).
​EmailNotification.java: Implementation for email alerts (Polymorphism).
​SMSNotification.java: Implementation for text message alerts (Polymorphism).

--------------------------------------------------------------------------------------------------------

Component 3: Worked on improving the University Management System structure.
Added and organized the Student class as a core part of the project.
Focused on making the code clear, simple, and easy to extend.
This step helps the team build other features more smoothly.
Lays a strong foundation for future development and collaboration.

-------------------------------------------------------------------------------------------------------
