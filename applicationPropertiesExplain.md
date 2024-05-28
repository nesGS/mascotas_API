######################################
# 	Configuración de la base de datos H2 en memoria
######################################

# 	La DB se crea en memoria y se perderá cuando la aplicación se reinicie
#spring.datasource.url=jdbc:h2:mem:testdb
#spring.datasource.driverClassName=org.h2.Driver
#spring.datasource.username=sa
#spring.datasource.password=

######################################
# 	Configuración H2 Console
######################################

# 	Se utilizará H2 para ejecutar scripts SQL de inicialización si los hay en el proyecto
#spring.sql.init.platform=h2 
# 	Habilita la consola H2 en http://localhost:8080/h2-console
#spring.h2.console.enabled=true
# 	Se especifica la ruta de consola (si no se indica, sigue siendo esa por defecto)
#spring.h2.console.path=/h2-console

######################################
# 	Configuración de JPA y Hibernate
######################################

# 	Especifica el dialecto de Hibernate para H2.
#spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
# 	Opciones: none, validate, update, create, create-drop
#spring.jpa.hibernate.ddl-auto=none
# 	Muestra consultas SQL generadas por Hibernate en la consola
#spring.jpa.show-sql=true