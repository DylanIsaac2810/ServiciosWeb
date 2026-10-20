Para ejecutar el proyecto, en la terminal desde la raíz de proyecto ".../P6_ServiciosWeb" se debe de ejecutar "mvn clean spring-boot:run"

Para consultar saldo y realizar deposito/retiro, desde un navegador poner:
http://localhost:8080/api/banco/saldo
http://localhost:8080/api/banco/depositar?cantidad=400
http://localhost:8080/api/banco/retirar?cantidad=150
