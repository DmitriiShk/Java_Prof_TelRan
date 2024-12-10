package Homework.October.HW_221024;

public interface JobActions {

    void doTask(Task task);

    void haveRest();

    class Task{                                 //Класс внутри интерфейса - статический
        private String name;
        private String description;

        public Task(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}


