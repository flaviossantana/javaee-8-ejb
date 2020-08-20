# Java EE / EJB 

Projeto EJB com Java EE 8: API Rest com WildFly 15 e MySQL 8

### Instalando MySql Server

Passo a pass para instalação do [MySql Server](https://phoenixnap.com/kb/install-mysql-on-windows) v8+.

### Conectando MySql pelo linha de comando

[Iniciando o MySQL a partir da linha de comando do Windows](https://phoenixnap.com/kb/connect-to-mysql-windows-command-line)

verificar se o MySQL está sendo executado no Windows

```sh
$ net start
Estes serviços do Windows foram iniciados:
  ...
   MySQL80
   ...
```

verificar se o MySQL está sendo executado no Windows
Entre na pasta de instalação do MySql:

```sh
\Program Files\MySQL\MySQL Server 8.0\bin
```

```sh
$ mysql.exe –u<username> –p
```

### Conectando MySql pelo linha de comando

Para adicionar o JAR como module use:

```sh
$ module add --name=com.mysql --resources=path\mysql-connector-java-8.0.21\mysql-connector-java-8.0.21.jar --dependencies=javax.api,javax.transaction.api
```

Para definir o module como driver:

```sh
/subsystem=datasources/jdbc-driver=mysql:add(driver-name=mysql,driver-module-name=com.mysql,driver-xa-datasource-class-name=com.mysql.cj.jdbc.MysqlXADataSource)
```

Criando datasource no standalone.xml

```sh
data-source add --name=AgendamentoDS --jndi-name=java:jboss/datasources/AgendamentoDS --driver-name=mysql  --connection-url=jdbc:mysql://localhost:3306/agendamentobd --user-name=SEU-USUARIO --password=SUA-SENHA --min-pool-size=10 --max-pool-size=20
```
