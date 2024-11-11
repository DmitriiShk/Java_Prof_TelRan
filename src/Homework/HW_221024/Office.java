package Homework.HW_221024;

import static Homework.HW_221024.JobActions.Task;

public class Office {

    public static void main(String[] args) {

        //JobActions.Task task = new JobActions.Task("Web Application", "Create Web Application");

        Task task = new Task("Web Application", "Create Web Application");

        JobActions manager = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Manager says: we need to " + task.getDescription());
            }
            @Override
            public void haveRest() {
                System.out.println("Drinks coffee");
            }
        };

        JobActions worker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println("Is executing task " + "\""+task.getDescription()+"\".");
            }

            @Override
            public void haveRest() {
                System.out.println("Is having rest and smoking.");
            }
        };

        JobActions lazyWorker = new JobActions() {
            @Override
            public void doTask(Task task) {

            }

            @Override
            public void haveRest() {
                System.out.println("Doing nothing.");
            }
        };

        manager.doTask(task);
        manager.haveRest();
        worker.doTask(task);
        worker.haveRest();
        lazyWorker.doTask(task);
        lazyWorker.haveRest();


        Employee developer = new Employee("John") {
            @Override
            public void doTask(Task task) {
                System.out.println("Employee " + this.getName() + " executes the task " + "\""+task.getDescription()+"\"");
            }

            @Override
            public void haveRest() {
                System.out.println("Employee " + this.getName() + " is driking coffee and smoking.");
            }
        };

        developer.doTask(task);
        developer.haveRest();

    }

}
