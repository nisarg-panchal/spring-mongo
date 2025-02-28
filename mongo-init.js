db = db.getSiblingDB("admin");

db.createUser({
    user: "user1",
    pwd: "user1",
    roles: [
        { role: "root", db: "admin" },                 // Full admin access
        { role: "readWrite", db: "people-db" },        // Read/write access to your app DB
        { role: "readAnyDatabase", db: "admin" },      // Allow reading any database
        { role: "clusterMonitor", db: "admin" }     ]
});