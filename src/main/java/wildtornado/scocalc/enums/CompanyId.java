package wildtornado.scocalc.enums;

public enum CompanyId {

    GENERIC_COMPANY(0),
    JENKY_COMPANY(1),
    MINIMUM_COMPANY(2);

    private int id;

    CompanyId(final int id) {
        this.id = id;
    }

    public int getCompanyID() {
        return id;
    }

}
