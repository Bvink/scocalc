package wildtornado.scocalc;

import wildtornado.scocalc.companycalculators.CompanyCalculations;
import wildtornado.scocalc.companycalculators.companyCalculationsFactory;
import wildtornado.scocalc.constants.Constants;
import wildtornado.scocalc.enums.CompanyId;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class Calc {

    private CompanyCalculations companyCalculations;

    private final companyCalculationsFactory CC_FACTORY = new companyCalculationsFactory();

    public Calc(DataInput dp, DataInput comparison) {
        this.companyCalculations = determineCompany(dp, comparison);
    }

    private CompanyCalculations determineCompany(DataInput dp, DataInput comp) {

        switch (determineCompanyID(dp.getCompanyID())) {
            case GENERIC_COMPANY:
                return obtainCompanyCalculations(Constants.GENERIC_COMPANY, dp, comp);
            case JENKY_COMPANY:
                return obtainCompanyCalculations(Constants.JENKY_COMPANY, dp, comp);
            case MINIMUM_COMPANY:
                return obtainCompanyCalculations(Constants.MINIMUM_COMPANY, dp, comp);
            default:
                return obtainCompanyCalculations(Constants.GENERIC_COMPANY, dp, comp);
        }
    }

    public Score generateScore() {
        return this.companyCalculations.generateScore();
    }

    private CompanyId determineCompanyID(int id) {
        for (CompanyId cID : CompanyId.values()) {
            if (cID.getCompanyID() == id) {
                return cID;
            }
        }
        return null;
    }

    private CompanyCalculations obtainCompanyCalculations(String s, DataInput dp, DataInput comp) {
        return CC_FACTORY.newInstance(s, dp, comp);
    }
}