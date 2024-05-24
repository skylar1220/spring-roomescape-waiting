package roomescape.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservationWithWaitingTest {

    @DisplayName("예약과 예약 대기 목록을 통해 통합된 목록을 생성한다.")
    @Test
    void of() {
        Member member = new Member("learner", "learnerDeok@email.com", "learnerDeok", Role.USER);
        LocalDate date = LocalDate.of(2099, 12, 31);
        ReservationTime time = new ReservationTime(LocalTime.of(10, 0));
        Theme theme = new Theme("happy", "hi", "abcd.html");

        List<Reservation> reservations = List.of(new Reservation(member, date, time, theme));
        List<WaitingWithRank> waitingWithRanks = List.of(new WaitingWithRank(new Waiting(member, date, time, theme), 1L));
        List<ReservationWithWaiting> reservationWithWaitings = ReservationWithWaiting.of(reservations, waitingWithRanks);

        ReservationWithWaiting reservation = reservationWithWaitings.get(0);
        ReservationWithWaiting waiting = reservationWithWaitings.get(1);

        assertAll(
                () -> assertThat(reservation.getStatus()).isEqualTo(ReservationStatus.RESERVATION),
                () -> assertThat(waiting.getStatus()).isEqualTo(ReservationStatus.WAITING),
                () -> assertThat(waiting.getRank()).isEqualTo(1L)
        );
    }
}
