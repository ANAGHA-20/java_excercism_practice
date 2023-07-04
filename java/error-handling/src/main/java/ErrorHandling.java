import java.util.Optional;


class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) throws IllegalArgumentException {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws ClassNotFoundException {
        throw new ClassNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() throws NullPointerException {
       throw new NullPointerException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) throws RuntimeException {
        throw new RuntimeException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() throws CustomUncheckedException {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) throws CustomUncheckedException {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
        Integer value = Integer.parseInt(integer);
        return Optional.of(value);
    } catch (NumberFormatException e) {
        return Optional.empty();
    }
    }

}
