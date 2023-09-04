# Songr Web Application

Songr is a simple web application built with Spring Boot to showcase various features of a web application, including routing, templates, and model management.

## Classes Overview

### Album Class (Album.java)

The `Album` class represents an album with the following attributes:
- `title`: The title of the album.
- `artist`: The name of the artist or band.
- `songCount`: The number of songs in the album.
- `length`: The length of the album in seconds.
- `imageUrl`: A link to the album's cover art.

### HelloController (HelloController.java)

- Responsible for handling the `/hello` route.
- Renders a Thymeleaf template to display a "Hello, World!" message.

### CapitalizeController (CapitalizeController.java)

- Handles the `/capitalize/{text}` route.
- Converts text to uppercase and renders it using a Thymeleaf template.

### SplashController (SplashController.java)

- Manages the root route (`/`) and displays a splash page.
- Uses Thymeleaf to render the splash page template.

### AlbumController (AlbumController.java)

- Handles the `/albums` route.
- Displays a list of three hardcoded album instances using Thymeleaf templates.

### album-list.html

- Thymeleaf HTML template for displaying a list of albums.
- Used by the `AlbumController` to render the album list.


