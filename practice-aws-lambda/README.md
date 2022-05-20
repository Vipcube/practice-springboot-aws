# Practice AWS Lambda with SpringBoot

## Modules

| Module | Depiction |
| -------- | -------- |
| hello-lambda  | Hello World for Lambda. |
| lambda-jpa-example  | Example for function router to trigger router Lambda. (Can't integrate with API Gateway, Because timeout is 30 sec, maybe change to Spring Native or Quake?) |
| lambda-s3-trigger  | Example receive S3 event to trigger lambda. |

## Project Use

- Spring Cloud Function
- AWS Java SDK

## Lambda Requirements:

- 256 MB ~ 512 MB of Memory.
- Timeout 1 min.
- Execution Role
  - Access to S3 objects Policy
  - Access to Cloud watch for logging Policy
