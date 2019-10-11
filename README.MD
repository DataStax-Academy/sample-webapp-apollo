# Apollo Sample Application

DataStax released Apollo Open Beta on October 9th ! To try it let's go to [http://apollo.datastax.com](http://apollo.datastax.com) and create your account.

## 1. Create the Database in Apollo 

- Select the *Create a DataBase* Button
- Chosse a name for your database (it will not be used in the connection)
- Chosse a Keyspace name (no space please) in the screenshot I chose `demo_apollo`
- Select the sizing
- Launch the Database creation

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/01.png" /> 

It will take about 20 to 30 minutes to initialize, (we are creating a full working 3 nodes cluster after all> You can go and grab a cup of coffee or start pulling the source code of this demo in the mean time. Well the screen shoul look like:

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/02.png" /> 

Once the Database is ready you receive a confirmation email. This is database will live for 72 hours and will be then terminated for you.

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/03.png" /> 

## 2. Browsing in Constellation

Boom ! Database is ready let's login to Constellation and explore a bit. Look at actions you can do on your Database. You can connect to DataStax Studio (service #2 in Constellation after Apollo)

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/04.png" /> 

Start working with the the notebook *Working with CQL in the Cloud* provided for you.

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/05.png" /> 

A pop up will appears asking you for your credentials, this is expected. You need to login to service DataStax Studio. Use the same credentials as when your created your db.

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/06.png" /> 

You will execute some cells to define tables like `videos` and insert data into it

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/07.png" /> 

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/08.png" /> 

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/09.png" /> 

Now back to the home page, in the `action` button select download your connection details. This will download a bundle as azip file, keep it somewhere we will need it for your app. We will call it the bundle

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/10.png" /> 

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/11.png" /> 

Ok let's get our hands dirty on your laptop


## 3. Starting the app.

To run the application you need *Maven* and *Java8+* Here is the installation procedure 

a. Clone the repository 

```
git clone https://github.com/DataStax-Academy/sample-webapp-apollo.git
```

b. Access the folder you just created:

```
cd sample-webapp-apollo
```

c. Locate the file `application.yaml` in the folder `src/main/resources` and edit the connection information to connect to your instance

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

d. You start the application by executing the following command at root level of your project 

```
mvn clean spring-boot:run
```

Open your browser on `http://localhost:8080`:

- First Screen will list dome details avout your cluster. As you can see this a 3 node cluster

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/12.png" /> 

- Second screen will list your your keyspace (single one here)

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/13.png" /> 

- Select the keyspace by clicking, This will list the tables available in the keyspace

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/14.png" /> 

- Chosse `videos` for instance (should be created by the cell in DataStax studio)

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/15.png" /> 


- You have some text to execute Queries. Run the EXECUTE button

<img src="https://github.com/DataStax-Academy/sample-webapp-apollo/blob/master/images/16.png" /> 


## Et VOILA !












