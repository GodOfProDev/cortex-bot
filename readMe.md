# Cortex Bot
This is a discord bot for the Cortex Development community: https://discord.gg/qzcNTYt

## Technology Stack
 - Spring Boot
    - Spring Data JPA
    - Spring Data MongoDB
 - H2/MySQL 
 - JDA/JDAUtils

## How does it work?
The discord bot library used is JDA and JDA Utils. For development, the dev branch
should be selected in the application.properties which will run the bot on a test server
of your choice.

One of the main roles of this bot is to do bot things but also to serve as a bridge
between the discord community and the cortex website. With that in mind, it will
grab data from a central MongoDB database. The main thing being stored in the database
is Member's which are created for everyone who joins the discord server. This is where
all things related to each member in the discord server will be stored.

The Leaderboard(https://cortexdev.us/leaderboard) grabs it's information from that Member
collection(automatically generated by Spring btw). 


## Setting up the application-dev.properties

The first thing you need to do is setup a mongodb cluster and database. A free and easy service
you can use is MongoDB Atlas(https://www.mongodb.com/cloud/atlas/lp/try2?utm_source=bing&utm_campaign=bs_americas_united_states_search_brand_atlas_desktop&utm_term=mongodb%20atlas&utm_medium=cpc_paid_search&utm_ad=e&utm_ad_campaign_id=355813668&msclkid=a4334462e3ee1c7724461bc9eaadd986).
You then need to take the connection string and put it in place of ${MONGODB_URI_DEV} or otherwise make a environmental variable
called MONGODB_URI_DEV on your system and assign the connection uri string to that. 

The other big thing you need is the bot token. You can create one in the discord developer portal. Make the bot you made there join a test server on discord
and then put the bot token in place of ${DISCORD_BOT_TOKEN_DEV} or again make an environmental variable.

The other options in the application-dev.properties file are tedious to do, but the bot relies on these id's to do things.
Replace the default ones with the id's from your own discord test server.

Video here: Coming soon


## Contribution
1. Fork the project
2. Make a dev branch
3. Choose an issue and assign yourself to it
4. Clone the project onto your machine
5. Go into the application-dev.properties file and input your test server info and db
6. Code (MAKE SURE YOU ARE IN DEV PROFILE in application.properties)
7. Make a pull request and look out for responses on it after