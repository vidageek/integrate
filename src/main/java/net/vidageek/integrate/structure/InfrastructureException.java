package net.vidageek.integrate.structure;

final public class InfrastructureException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InfrastructureException(final String message, final Throwable e) {
        super(message, e);
    }

}
