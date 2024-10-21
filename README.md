
A simple Spring Boot application that demonstrates how to send emails using JavaMailSender.

## Features
- Send plain text emails.
- Configurable email settings.
- Easy to integrate with any Spring Boot application.

## Technologies Used
- Spring Boot
- JavaMailSender
- Maven (or Gradle, if you're using that)

## Prerequisites
- Java 11 or higher
- Maven (or Gradle)
- A Gmail account (or SMTP service of your choice)

## Setup Instructions
1. **Clone the repository:**
   ```
   git clone https://github.com/your-username/SpringBoot-email-sender.git
   cd SpringBoot-email-sender
   ```

2. **Update application properties:**
   Open `src/main/resources/application.properties` (or `application.yml`) and add your email configuration:

   ```properties
   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=your_email@gmail.com
   spring.mail.password=your_password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```
   > **Note:** Make sure to enable "Less secure app access" in your Gmail account settings or use an App Password if you have 2-Step Verification enabled.

3. **Build the project:**
   If using Maven:
   ```
   mvn clean install
   ```
 
4. **Run the application:**
   If using Maven:
   ```
   mvn spring-boot:run
   ```

   If using Gradle:
   ```
   ./gradlew bootRun
   ```

## Usage

You can use the `EmailService` to send emails. Heres an example of how to call the `sendEmail` method:

```java
@Autowired
private EmailService emailService;

public void sendTestEmail() {
    emailService.sendEmail("recipient@example.com", "Test Subject", "This is a test email.");
}
```

