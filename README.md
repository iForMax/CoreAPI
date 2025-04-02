# Wystern Core API  

## Overview  
**Wystern Core API** is an extension of **WysternCore**, designed for developers who want to integrate and interact with the core functionalities of the Wystern Server. This API provides essential tools and methods to enhance development within the Wystern ecosystem.  

⚠ **Note:** This API is **not standalone**. It requires **WysternCore** to function correctly.  

## Features  
- Seamless integration with **WysternCore**  
- Essential utilities for plugin development  
- Optimized for **Wystern Server**  

## Installation  

### Maven  
Add JitPack as a repository:  
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Add the dependency:  
```xml
<dependency>
    <groupId>com.github.iForMax</groupId>
    <artifactId>CoreAPI</artifactId>
    <version>v1</version>
</dependency>
```

### Gradle (Groovy DSL)  
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.iForMax:CoreAPI:v1'
}
```

### Gradle (Kotlin DSL)  
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.iForMax:CoreAPI:v1")
}


## Support  
For issues, suggestions, or contributions, please open an [issue](https://github.com/iForMax/CoreAPI/issues) or submit a pull request.  

## License  
This project follows the licensing terms of **Wystern Server**.  

---

This README keeps it professional and informative while making it clear that **WysternCore** is required. Let me know if you need any modifications! 🚀
