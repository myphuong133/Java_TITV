package java59_Enum;

public enum java59_enum_month {

    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(30),
    September(31),
    October(30),
    November(31),
    December(30);
    private final int day;

    java59_enum_month(int day) {
        this.day = day;
    }
    public int day(){
        return this.day;
    }
}
