package mrs.domain.service.reservation;

public class AlreadyReservedExceprion extends RuntimeException {
    public AlreadyReservedExceprion(String message) {
        super(message);
    }
}
