package wildtornado.scocalc;

import wildtornado.scocalc.companies.Company;
import wildtornado.scocalc.companies.GenericCompany;
import wildtornado.scocalc.companies.JenkyCompany;
import wildtornado.scocalc.companies.MinimumCompany;
import wildtornado.scocalc.constants.Constants;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class Calc {

    private Company company;

    public Calc(DataInput dp, DataInput comparison) {
        this.company = determineCompany(dp, comparison);
    }

    private Company determineCompany(DataInput dp, DataInput comp) {
        switch (dp.getCompanyID()) {
            case Constants.GENERIC_COMPANY:
                return new GenericCompany(dp, comp);
            case Constants.JENKY_COMPANY:
                return new JenkyCompany(dp, comp);
            case Constants.MINIMUM_COMPANY:
                return new MinimumCompany(dp, comp);
            default:
                return new GenericCompany(dp, comp);
        }
    }

    public Score generateScore() {
        return this.company.generateScore();
    }
}