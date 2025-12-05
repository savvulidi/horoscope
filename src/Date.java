class Date {
    private int day;
    private int month;

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public String getFortune() {
        if (month < 1 || month > 12) {
            return "Неверный месяц!";
        }
        if (day < 1 || day > 31) {
            return "Неверный день!";
        }

        String sign;

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            sign = "Водолей";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            sign = "Рыбы";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            sign = "Овен";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            sign = "Телец";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            sign = "Близнецы";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            sign = "Рак";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            sign = "Лев";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            sign = "Дева";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            sign = "Весы";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            sign = "Скорпион";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            sign = "Стрелец";
        } else { // последний случай
            sign = "Козерог";
        }

        return sign + ": Всё будет хорошо!"; //
    }
}
