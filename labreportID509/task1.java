class Drive49 {
    public double Total_capacity, used, free;

    public Drive49(double Total_capacity) {
        this.Total_capacity = Total_capacity;
        used = 0;
        free = 10;
    }

    public void upload(double filesize) {
        if (filesize <= free) {
            used = used + filesize;
            free = free - filesize;
            System.out.println("upload successful ");
        } else {
            System.out.println("upload unsuccessful for insufficient storage");

        }
    }

    public void upgradePlan(double extratorage) {
        Total_capacity = Total_capacity + extratorage;
        free = free + extratorage;
        System.out.println("Plan upgraded successfully. Total capacity increased to " + Total_capacity + "GB.");
    }

    public void viewStatus() {
        System.out.println("Total Capacity: " + Total_capacity + "GB");
        System.out.println("Used: " + used + "GB");
        System.out.println("Free: " + free + "GB");
    }

}

class task1 {
    public static void main(String[] args) {

        Drive49 drive = new Drive49(10);

        System.out.println("Created new user account");

        System.out.println("Uploading a file...");
        double fileSize = 3.6;
        drive.upload(fileSize);

        System.out.println("Viewing status");
        drive.viewStatus();

        System.out.println("Upgrading plan");
        double extratorage = 5;
        drive.upgradePlan(extratorage);

        System.out.println("status after upgrade :");
        drive.viewStatus();
    }
}