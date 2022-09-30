# Elide Swagger UI prolem MWE

This project provides a MWE for a problem with the Swagger UI.
Build and start the application via:

```console
mvn spring-boot:run
```

Navigate to `localhost:8080/docs` and see the generated swagger.json.
Now navigate to `localhost:8080` and see an error page.
Going by [Elides documentation](https://elide.io/pages/guide/v6/13-swagger.html) and its [elide-spring-boot-example](https://github.com/yahoo/elide-spring-boot-example) this should display the well known Swagger UI.

