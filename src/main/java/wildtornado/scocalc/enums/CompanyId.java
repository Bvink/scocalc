package wildtornado.scocalc.enums;

import wildtornado.scocalc.constants.Constants;

public enum CompanyId {

    GENERIC_COMPANY(Constants.GENERIC_COMPANY, 0),
    JENKY_COMPANY(Constants.JENKY_COMPANY, 1),
    MINIMUM_COMPANY(Constants.MINIMUM_COMPANY, 2);

    private String name;
    private int id;

    CompanyId(final String s, final int id) {
        this.name = s;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getCompanyID() {
        return id;
    }

}
