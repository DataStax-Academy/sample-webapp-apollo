# Apollo Sample Application

DataStax released Apollo Open Beta on October 9th ! Simply fo the apollo.datastax.com and create an account.

## 1. Create the Database in Apollo 

- Select the *Create a DataBase* Button
- Chosse a name for your database (it will not be used in the connection)
- Chosse a Keyspace name (no space please) in the screenshot I chose `demo_apollo`
- Select the sizing
- Launch the Database creation

PIC1

- It take from 20 to 30 minutes to initialize, well we are creating a full working 3 nodes cluster after all :)

The screen look like

Once the Database is ready you receive a confirmation email. This is database will live for 72 hours and will be then terminated for you.

## 2. Browsing in Constellation

Login to Constellation and explore a little bit. You can connect to DataStax Studio (service #2 in Constellation after Apollo) and start executing cells of the notebook *Working with CQL in the Cloud*. This will create some `videos` and `tables with some data in there 



In the `action` button select download your connection details. This will download a bundle as azip file, keep it somewhere we will need it for your app. We will call it the bundle

## 3. Starting the app.

To run the application you simply need maven and Java8+. Here is the installation procedure 

Clone the repository 

```
git clone https://github.com/DataStax-Academy/sample-webapp-apollo.git
```

Access the folder you just created:

```
cd sample-webapp-apollo
```

Locate the file `application.yaml` in the folder src/main/resources and edit the connection information to connect to your instance

```
# ----------------------------------------------------------
# Connectivity to Constellation Apollo
# ----------------------------------------------------------
constellation:
  apollo:
    username: cedrick
    password: cedrick
    keyspace: demo_apollo
    zipfile: src/main/resources/connection-apollo-demo.zip
```

As you can see I copy my zip file in src/main/resources but you can also reference a complete path on the disk.

Then you start the application. At root level simply do:

```
mvn clean spring-boot:run
```

Open your browser on `http://localhost:8080`:
- First Screen will list dome details avout your cluster. As you can see this a 3 node cluster
- Second screen will list your your keyspace (single one here)
- Select the keyspace by clicking
- This will list the tables available in the keyspace
- Chosse `videos` for instance (should be created by the cell in DataStax studio)
- You have some text to execute Queries. Run the EXECUTE button


Et VOILA !



<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/01.png" /> 
<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/02.png" /> 









