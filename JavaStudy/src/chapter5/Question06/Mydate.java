package chapter5.Question06;

public class Mydate {
    private int day;
    private int month;
    private int year;

    public Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("오류입니다.");
            } else {
                this.day = day;
            }
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        // 1. 월(month) 범위 체크 (1~12월)
        if (month < 1 || month > 12) {
            System.out.println("유효하지 않은 날짜입니다.");
            return false;
        }

        // 2. 각 월(month)에 따라 일(day) 범위 체크
        int maxDays; // 해당 월의 최대 일 수
        if (month == 2) {
            maxDays = 28; // 윤년 고려 X (고려하려면 추가 수정 필요)
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30; // 30일까지 있는 달
        } else {
            maxDays = 31; // 31일까지 있는 달
        }

        // 3. 일(day)이 1~maxDays 범위에 있는지 확인
        if (day < 1 || day > maxDays) {
            System.out.println("유효하지 않은 날짜입니다.");
            return false;
        }

        // 4. 연도(year)가 1 이상인지 확인
        if (year < 1) {
            System.out.println("유효하지 않은 날짜입니다.");
            return false;
        }

        System.out.println("유효한 날짜입니다.");
        return true;
    }
}


