# Application Flow


### User Sign up

1. User chooses sign up on the menu.
2. User fills out the sign up form and submits.
3. Request goes to sign up servlet.
4. Servlet creates a user object and then creates user in the database.
5. Response to user confirming addition (display confirmation on jsp).

### User Sign In

1. User chooses sign in on the menu.
2. User enters username and password on form and submits.
3. If user is authenticated, the server will handle allowing access to edit
pages.  JDBCRealm used for authentication (users, users_roles, and roles table).
4. If authentication fails, display error message/page.

### View Profile

1. Page sends a request to view profile.
2. User can add event details.
3. User can save changes and update (display confirmation update message?).

### View Photo

1. Page sends a request to view photos.
2. User can view all saved photos.

### About

1. Static page
2. Consider making contact info configurable
3. Donation link?

### Add photos
1. User uploads photos
2. Details are sent to Add photo servlet
3. Servlet creates photo object
4. Servlet sends object to dao
5. Dao adds photo to the database
6. Servlet sends confirmation to report page that photo has been added.

### Add Event
1. User enters event details
1. Details are sent to Add event servlet
1. Servlet creates event  object
1. Servlet sends object to dao
1. Dao adds event to the database
1. Servlet sends confirmation to event page that event has been added.

### Add Guest
1. User enters guest details
1. Details are sent to Add guest servlet
1. Servlet creates guest object
1. Servlet sends object to dao
1. Dao adds event to the database
1. Servlet sends confirmation to guest page that guest has been added.






