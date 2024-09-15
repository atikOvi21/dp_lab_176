package org.example;
//
//public class Admin
//{
//
//
//        public void manageDriver(Admin admin, String driverId) {
//        }
//
//        public void manageRider(Admin admin, String riderId) {
//        }
//
//
//}


public class Admin {
    private String id;
    private String name;
    private String role;
    public Admin(String id, String name, String role)
    {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver, boolean activate) {
        if (activate) {
            driver.setAvailable(true);
            System.out.println("Driver " + driver.getName() + " is activated.");
        } else {
            driver.setAvailable(false);
            System.out.println("Driver " + driver.getName() + " is deactivated.");
        }
    }

    public void manageRider(Rider rider, boolean activate)
    {
         if (activate) {
            System.out.println("Rider " + rider.getName() + " is activated.");
        } else {
            System.out.println("Rider " + rider.getName() + " is deactivated.");
        }
    }

     public void viewTripHistory(Trip trip)
     {
        System.out.println("Trip History for Trip ID: " + trip.getId());
        System.out.println("Pickup Location: " + trip.getPickupLocation());
        System.out.println("DropOff Location: " + trip.getDropOffLocation());
        System.out.println("Fare: " + trip.getFare());
        System.out.println("Status: " + trip.getStatus());
    }
     public void handleDispute(String riderId, String driverId, String disputeDetails) {
        System.out.println("Dispute between Rider ID: " + riderId + " and Driver ID: " + driverId);
        System.out.println("Dispute Details: " + disputeDetails);
     }

     public String getId()
     {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }
}
