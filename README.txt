sudo docker build -t spring/win-one:3 .
sudo docker run -p 8080:8080 -d spring/win-one:3

sudo docker-compose up -d
sudo docker-compose down

