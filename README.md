# Rl-Pal



## Introduction
The goal of the RL-Pal app is to help introverts who have difficulty making friends connect with others who share similar interests and hobbies. The app aims to provide a platform for users to post their plans to go out to a specific location, such as a coffee shop or restaurant, and invite strangers to join them. Through these meetings, users can get to know each other and potentially form new friendships. The app also includes a feature that allows users to rate their experience after the meeting.

## Features

These are the requirements specifying the input/output behavior of the system.

**Creation of the user's profile :**  
RL-Pal would require users to create a profile that includes information such as their name, interests, hobbies and location.

**Posting Events :**  
Users should be able to create events by posting the location, date, and time of the planned activity, as well as a description of the event.

**Location-based recommendations :**
The application should be able to recommend places and activities based on the user's interests and location.

**Event Discovery :**
Users should be able to browse events created by others, filter them based on their location and interests, and RSVP to events they want to attend.

**In-app messaging :** 
RL-Pal would need a messaging system to allow users to communicate with each other before and during events.

**Security features :** main features are :
The application should include security features such as user verification, a reporting system and moderation of event announcements.

**Personalization :**
The application should provide personalized recommendations based on the user's interests and activity history.

**User settings :**
Users should be able to manage their privacy settings, notification preferences and event visibility.

## Development Environment

Following libraries were used during the development of this starter kit :

Spring Boot : Server side framework
Postgres : SQL database managment system
Hibernate: Data Base framework
Swagger : API documentation
JWT : Authentication mechanism for REST APIs

## installation 
Create the postgres Database using 
``` 
sudo -u postgres psql
postgres=# CREATE DATABASE [Database Name];
``` 
and run the serve.

For more details about database connexion, you can check this [Article](https://chartio.com/resources/tutorials/how-to-set-the-default-user-password-in-postgresql/) .
Create a user manually from Database using Dbeaver or any other database administration system.

Its as important to document(as is the development) and make your APIs available in a readable manner for frontend teams or external consumers. The tool for API documentation used in this starter kit is Swagger 2

