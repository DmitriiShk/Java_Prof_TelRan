package PracticeLessons.Lesson101024;

import Lessons.Lesson_5_ENUM.Lesson.Season;

public enum Days_of_Week {
    MONDAY("Modnay", "Workday"),
    TUESDAY("Tuesday", "Workday"),
    WEDNESDAY("Wednesday", "Workday"),
    THURSDAY("Thursday", "Workday"),
    FRIDAY("Friday", "Workday"),
    SATURDAY("Saturday", "Day off"),
    SUNDAY("Sunday", "Day off");

    private String name;
    private String description;

    Days_of_Week(String name, String description){
        this.name=name;
        this.description=description;
    }

    public void dayDescription(Days_of_Week dayOfWeek) {
        if (dayOfWeek.description.equals("Workday")) System.out.println(dayOfWeek.name + " is a workday");
        else System.out.println(dayOfWeek.name + " is a day off");
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
