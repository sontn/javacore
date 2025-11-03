package EnumLesson;

public enum Day {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURDAY(true), FRIDAY(true), STATURDAY(false), SUNDAY(false);

    private final boolean isWorkingDay;

    Day(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }
}
