Simple demo application

Requirements:
- Docker engine
- Docker compose

Installation:
1. Create file with name `dbenv` on project root
1. Fill the content like below (replace accordingly)
> POSTGRES_USER=your-database-user-here<br/>
> POSTGRES_PASSWORD=your-database-password-here

How to run:
1. Start your docker engine or docker desktop
1. Open shell/command from this project root
1. Run `docker compose up -d`
> NOTE: If you encounter problem on step 4, try to run `docker compose up -d database` first since database service must run before application  