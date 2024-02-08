package creational_patterns.builder;

import java.time.LocalDate;

public class TourDirector {
    // 반복되는 building을 디렉터를 통해 같은 것을 반환할 수 있음.

    private TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan cancunTrip() {
        return builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 30))
                .whereToStay("리조트")
                .addPlan(0, "체크인 및 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return builder.title("롱비치")
                .nightsAndDays(8, 9)
                .getPlan();
    }

}
