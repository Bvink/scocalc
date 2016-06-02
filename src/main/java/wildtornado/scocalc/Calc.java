package wildtornado.scocalc;

import wildtornado.scocalc.companies.Company;
import wildtornado.scocalc.companies.comps.*;
import wildtornado.scocalc.constants.Companies;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class Calc {

    private Company company;

    public Calc(DataInput dp, DataInput comparison) {
        this.company = determineCompany(dp, comparison);
    }

    private Company determineCompany(DataInput dp, DataInput comp) {
        switch (dp.getCompanyID()) {
            case Companies.GENERIC_COMPANY:
                return new GenericCompany(dp, comp);
            case Companies.JENKY_COMPANY:
                return new JenkyCompany(dp, comp);
            case Companies.MINIMUM_COMPANY:
                return new MinimumCompany(dp, comp);
            default:
                return new GenericCompany(dp, comp);
        }
    }

    public Score generateScore() {
        return this.company.generateScore();
    }
}