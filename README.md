📘 API REST - Foro de Alura

Este proyecto es parte del Challenge de Alura, donde se desarrolla una API RESTful utilizando Java y Spring Boot. La aplicación permite gestionar tópicos en un foro, implementando operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

🚀 Tecnologías utilizadas

    Java 17 : Lenguaje de programación principal.

    Spring Boot : Framework para facilitar el desarrollo de aplicaciones Java.

    Spring Web : Módulo de Spring para construir aplicaciones web, incluyendo RESTful.

    Spring Data JPA : Abstracción para el acceso a datos con JPA.

    Maven : Herramienta de gestión y construcción de proyectos.

    H2 Database : Base de datos en memoria para pruebas y desarrollo rápido.

    Postman : Herramienta para probar y documentar APIs. 


📂 Estructura del proyecto 

apirestALURA/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── alura/
│       │           └── foro/
│       │               ├── controller/
│       │               ├── model/
│       │               └── repository/
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md


🧰 Características

    Crear un nuevo tópico : Permite agregar un nuevo tema de discusión al foro.

    Listar todos los tópicos : Muestra una lista de todos los tópicos disponibles.

    Obtener un tópico específico : Recupera la información de un tópico mediante su ID.

    Actualizar un tópico : Modifica los detalles de un tópico existente.

    Eliminar un tópico : Elimina un tópico del foro. 

🧪 Pruebas con Postman

Para probar los endpoints de la API, puedes utilizar Postman :

    Crear un tópico : Enviar una solicitud POST a /topicos con el cuerpo adecuado.

    Listar tópicos : Enviar una solicitud GET a /topicos.

    Obtener un tópico : Enviar una solicitud GET a /topicos/{id}.

    Actualizar un tópico : Enviar una solicitud PUT a /topicos/{id} con los datos actualizados.

    Eliminar un tópico : Enviar una solicitud DELETE a /topicos/{id}. 
    
Punto #1 Crear un nuevo topico
![1](https://github.com/user-attachments/assets/ec3984f6-c208-44e9-b681-c7b2eee3d08a)

Punto #2 Mostrar todos los topicos creados
![2](https://github.com/user-attachments/assets/836afc95-0de4-4101-bcbe-a0a93030c505)

Punto #3 Mostrar topico especifico
![3](https://github.com/user-attachments/assets/436e2682-6a3c-4155-99a5-99ed6e8c5940)

Punto #4 Actualizar un topico
![4](https://github.com/user-attachments/assets/5af780cf-13e0-450b-a62a-f223903bd769)

Punto #5 Eliminar un topico
![5](https://github.com/user-attachments/assets/efaa4d55-c59a-4ccb-be4d-b23d879be3e7)






