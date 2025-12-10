import java.util.Scanner;

public class Main {

    // day, hour, minute -> 전체를 "분"으로 변환해주는 유틸 메서드
    private static long toMinutes(int day, int hour, int minute) {
        return minute + hour * 60L + (day - 1L) * 24 * 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();    // A
        int hour = sc.nextInt();   // B
        int minute = sc.nextInt(); // C

        // 기준 시각: 11일 11시 11분
        final int BASE_DAY = 11;
        final int BASE_HOUR = 11;
        final int BASE_MINUTE = 11;

        long baseTotal = toMinutes(BASE_DAY, BASE_HOUR, BASE_MINUTE);
        long targetTotal = toMinutes(day, hour, minute);

        if (targetTotal < baseTotal) {
            System.out.println(-1);
        } else {
            System.out.println(targetTotal - baseTotal);
        }

        sc.close();
    }
}
